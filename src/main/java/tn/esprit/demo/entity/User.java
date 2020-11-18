package tn.esprit.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public long id;

@Column(name="firstName")
public String prenom;

@Column(name="lastName")
public String nom;
@Enumerated(EnumType.STRING)
public Role role;

@Temporal(TemporalType.DATE)
public Date date;

public long getId() {
	return id;
}


@Override
public String toString() {
	return "User [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", role=" + role + ", date=" + date + "]";
}


public void setId(long id) {
	this.id = id;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public User( String prenom, String nom, Role role, Date date) {

	this.prenom = prenom;
	this.nom = nom;
	this.role = role;
	this.date = date;
}

public User() {
	super();
}


public User(long id) {
	super();
	this.id = id;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
	result = prime * result + ((role == null) ? 0 : role.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (id != other.id)
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (prenom == null) {
		if (other.prenom != null)
			return false;
	} else if (!prenom.equals(other.prenom))
		return false;
	if (role != other.role)
		return false;
	return true;
}


}
