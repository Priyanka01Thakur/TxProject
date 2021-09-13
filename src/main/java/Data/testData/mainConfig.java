package Data.testData;

import java.util.List;

public class mainConfig {

	private List<Credentials> credentials;
	String URL;

	
	public List<Credentials> getCredentials() {
		
		return credentials;
		
	}
	
	public void setCredentials(List<Credentials> credentials) {
		
		this.credentials= credentials;
		
	}
	
	public String getURL() {
		
		return URL;
	}
	
	public void setURL(String URL){
		
		this.URL = URL;
	}
	
	
}
