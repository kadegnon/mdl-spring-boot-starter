package be.unamur.info.mdl.groggy.dal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;



	public Integer id() {
		return id;
	}

	public void id(Integer id) {
		this.id = id;
	}

	public String name() {
		return name;
	}

	public void name(String name) {
		this.name = name;
	}

	public String email() {
		return email;
	}

	public void email(String email) {
		this.email = email;
	}


}
