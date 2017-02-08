package com.enrol

class Student {

	
	String name
	
	String studentID

	Boolean isFundingAvalible
	
	Date dob
	
	String email
	
	String username

	String password
	
	Course course


	static hasMany=[modules:Module]
	

    static constraints = {
		name blank:false, nullable:false

		studentID blank:false, nullable:false

		dob blank:false, nullable:false

		email blank:false, nullable:false, email:true

		username blank:false, nullable:false, unique:true

		password blank:false, nullable:false

		isFundingAvalible blank:false, nullable:false

		course blank:false, nullable:false

    }
}
