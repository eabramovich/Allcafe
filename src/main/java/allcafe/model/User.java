package allcafe.model;

public enum User {
	SEO("1", "", "", "", "seo"),
	SEO_WRONG("1", "", "", "wrong", "seo");
	
	private String id;
	private String login;
	private String email;
	private String password;
	private String role;
	
	User(String id, String login, String email, String password, String role) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	public String getId() {
		return id;
	}
	public User setId(String id) {
		this.id = id;
		return this;
	}
	public String getLogin() {
		return login;
	}
	public User setLogin(String login) {
		this.login = login;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getRole() {
		return role;
	}
	public User setRole(String role) {
		this.role = role;
		return this;
	}
	
	
}
