package com.enrol

class Lecturer {

	
	String fullName
	
	String post

	String subject
	
	String lecturerEmail

	String office
	
	String bio

	String userName

	String password


	static hasMany=[courses:Course,modules:Module]

	static belongsTo=Course
	

    static constraints = {
		fullName blank:false, nullable:false

		post blank:false, nullable:false

		subject blank:false, nullable:false

		lecturerEmail blank:false, nullable:false, email:true

		office blank:false, nullable:false, unique:true

		bio blank:false, nullable:false, maxSize: 5000, widget:'textarea'

		userName blank:false, nullable:false, unique:true

		password blank:false, nullable:false, password:true

    }
}
