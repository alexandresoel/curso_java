package controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class Api {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("https://api.msrc.microsoft.com/cvrf/v2.0/updates");
			URLConnection connection = url.openConnection();
			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String jsonEmString = Util.convertJsonEmString(br);
			
			//Gson gson = new Gson();
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
