package com.servicesubscriber;

import com.stringservice.ServicePublish;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

//	private static BundleContext context;
//
//	static BundleContext getContext() {
//		return context;
//	}
	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Start Subscriber Service");
		serviceReference = bundleContext.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish) bundleContext.getService(serviceReference);
		servicePublish.publishService();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Stop Subscriber Service");
		bundleContext.ungetService(serviceReference);	}

}
