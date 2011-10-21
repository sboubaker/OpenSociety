package org.sb.os.et.ejb.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQueries({
@NamedQuery(name="User.findAll",query="select u from User u"),
@NamedQuery(name="User.getById",query="select u from User u where u.id = :id"),
@NamedQuery(name="User.getByUsername",query="select u from User u where u.username = :username"),
@NamedQuery(name="User.getByFirstname",query="select u from User u where u.firstname = :firstname"),
@NamedQuery(name="User.getByLastname",query="select u from User u where u.lastname = :lastname")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private Timestamp dtcreate;

	private Timestamp dtmodif;

	private String email;

	private String firstname;

	private int isactive;

	private String lastname;

	private int mobile;

	private String password;

	private int phone;

	private String username;

	//bi-directional many-to-one association to Role
    @ManyToOne
	@JoinColumn(name="id_Role")
	private Role role;

    public User() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDtcreate() {
		return this.dtcreate;
	}

	public void setDtcreate(Timestamp dtcreate) {
		this.dtcreate = dtcreate;
	}

	public Timestamp getDtmodif() {
		return this.dtmodif;
	}

	public void setDtmodif(Timestamp dtmodif) {
		this.dtmodif = dtmodif;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getIsactive() {
		return this.isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getMobile() {
		return this.mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}