package domain;

/**user实体类，在此简单的设置了3个属性loginname,password,username**/

public class User {
    private String loginname;
    private String password;
    private String username;

    public User(){

    }

    public String getLoginname(){
        return loginname;
    }
    public void setLoginname(String loginname){
        this.loginname=loginname;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

	public User(String loginname, String password, String username) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.username = username;
	}

    
    
}
