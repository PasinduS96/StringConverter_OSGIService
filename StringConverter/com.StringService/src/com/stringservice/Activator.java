package com.stringservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

//	private static BundleContext context;
//
//	static BundleContext getContext() {
//		return context;
//	}

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Publisher Start");
		ServicePublish publishService = new ServicePublishImpl();
		publishServiceRegistration = bundleContext.registerService(ServicePublish.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();	}

}
