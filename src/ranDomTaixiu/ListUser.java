package ranDomTaixiu;

import java.io.IOException;

public class ListUser {
	
	

	

	private String id;
	public String ten;
	private String password;
	public int money;
public ListUser(String id, String ten, String password, int money) {
	this.id = id;
	this.ten = ten;
	this.password = password;
	this.money=money;
	}

public ListUser() {
	super();
}

public String getId() {
return id;
}

public void setId(String id) {
this.id =id;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}



@Override
public String toString() {
	return this.id + ","+this.ten + ","+this.password+ ","+ this.money;
}

public Object getseri() {
	// TODO Auto-generated method stub
	return null;
}

}
