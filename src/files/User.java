package files;

import java.io.Serializable;

public class User implements Serializable {
	String name;
	int id;
	transient String password;
	
	public User(String name, int id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + "]";
	}
}
