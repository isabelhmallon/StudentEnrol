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
	double tutionFees
	String studyMode 

    static constraints = {
	department blank:false, nullable:false
	title blank:false, nullable:false
	leader blank:false, nullable:false
	code blank:false, nullable:false
	numberOfStudents blank:false, nullable:false, minSize:20, maxSize:60
	startDate blank:false, nullable:false	
	endDate blank:false, nullable:false
	studyMode blank:false, nullable:false, minSize:20, maxSize:20
	description blank:false, nullable:false, widget:'textarea', maxSize: 5000
	tutionFees blank:false, nullable:false, scale:2
    }
}
