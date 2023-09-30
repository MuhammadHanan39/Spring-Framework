package com.RestApi;



import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentDept;
	@Column
	@OneToOne
	@JsonManagedReference
	private Department dept;
	
	
}
