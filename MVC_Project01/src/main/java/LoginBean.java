
import java.io.Serializable;


public class LoginBean implements Serializable{
	
	private String name=null;
	private String password=null;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate()
	{
		if(password.equals("admin")==true)
		{
			
			
			
			
			
			return true;
			
			
			
		}
		else
		{
			return false;
		}
		
		
	}

}
