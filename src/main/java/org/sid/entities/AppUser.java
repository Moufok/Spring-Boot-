package org.sid.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AppUser {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column(unique=true)
private String username;
private String password;
private boolean actived;
@ManyToMany(fetch=FetchType.EAGER)
private Collection<AppRole>roles=new ArrayList<>();
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isActived() {
	return actived;
}
public void setActived(boolean actived) {
	this.actived = actived;
}
public Collection<AppRole> getRoles() {
	return roles;
}
public void setRoles(Collection<AppRole> roles) {
	this.roles = roles;
}
public AppUser(Long id, String username, String password, boolean actived, Collection<AppRole> roles) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.actived = actived;
	this.roles = roles;
}
public AppUser() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "AppUser [id=" + id + ", username=" + username + ", password=" + password + ", actived=" + actived
			+ ", roles=" + roles + "]";
}



}
