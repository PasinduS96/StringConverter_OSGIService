import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Translator extends StringConverter {

	private final String CLIENT_ID = "FREE_TRIAL_ACCOUNT";
	private final String CLIENT_SECRET = "PUBLIC_SECRET";
	private final String ENDPOINT = "http://api.whatsmate.net/v1/translation/translate";
	  
	@Override
	public String convertString(String str) {

		return null;
	}

	@Override
	public void convertASCII(String str) {		
	}

	@Override
	public void translate(String inputLanguage, String outputLanguage, String inputString) throws Exception {

		String requestBody = new StringBuilder()
			      .append("{")
			      .append("\"fromLang\":\"")
			      .append(inputLanguage)
			      .append("\",")
			      .append("\"toLang\":\"")
			      .append(outputLanguage)
			      .append("\",")
			      .append("\"text\":\"")
			      .append(inputString)
			      .append("\"")
			      .append("}")
			      .toString();

			    URL httpApiUrl = new URL(ENDPOINT);
			    HttpURLConnection connection = (HttpURLConnection) httpApiUrl.openConnection(); //building connection
			    connection.setDoOutput(true); // send a request body
			    connection.setRequestMethod("POST");
			    connection.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
			    connection.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
			    connection.setRequestProperty("Content-Type", "application/json");

			    OutputStream outputStream = connection.getOutputStream();
			    outputStream.write(requestBody.getBytes()); //method encodes a given translate request body into a sequence of bytes and returns an array of bytes
			    outputStream.flush();
			    outputStream.close();

			    int returnStatusCode = connection.getResponseCode();
			    
			    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(
			        (returnStatusCode == 200) ? connection.getInputStream() : connection.getErrorStream()
			      ));
			    String output;
			    while ((output = bufferReader.readLine()) != null) {
			        System.out.println(output);
			    }
			    connection.disconnect();
	}

}
