package VO;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="register_28")
public class RegisterVo {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		RegisterVo other = (RegisterVo) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id=0;
	
	@Column(name="firstname")
	private String firstname=null;
	
	@Column(name="lastname")
	private String lastname=null;
	
	@ManyToOne
	@JoinColumn(name="loginid")
	private LoginVo login_id;

	

	public LoginVo getLogin_id() {
		return login_id;
	}

	public void setLogin_id(LoginVo login_id) {
		this.login_id = login_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}