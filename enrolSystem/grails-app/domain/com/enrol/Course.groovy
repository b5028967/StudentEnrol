package com.enrol

class Course {
	
	String department
	
	String title

	String leader

	String code
	
	Date startDate
	
	Date endDate
	
	String description

	int numberOfStudents
	
	Double tuitionFees

	String studyMode
	


	double calculateFees(){

	4*fees

	}



	static hasMany=[students:Student,lecturers:Lecturer,modules:Module]



    static constraints = {
		studyMode blank:false, nullable:false

		department blank:false, nullable:false

		leader blank:false, nullable:false

		code blank:false, nullable:false

		numberOfStudents blank:false, nullable:false, minSize: 20, maxSize: 60

		startDate blank:false, nullable:false

		endDate blank:false, nullable:false

		studyMode blank:false, nullable:false, size:1..20

		description blank:false, nullable:false, maxSize: 2000

		tuitionFees blank:false, nullable:false, scale: 2
    }
}
