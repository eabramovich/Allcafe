package allcafe.selenium;

public enum User {

	ADMIN("", ""),
	SEO("", "");
	
	private String login;
	private String password;
	
	 User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getPassword() {
		return this.password;
	}
}
