package valueobject;

public class ValueObject {
	private String search=null;
	private int id=0;
	private String delete=null;
	private String firstname=null;
	private String lastname=null;

	
	
	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSearch() {
		// TODO Auto-generated method stub
		return this.search;
	}

	public int getId() {
		return id;
	}

	public void setId(int id2) {
		this.id = id2;
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
