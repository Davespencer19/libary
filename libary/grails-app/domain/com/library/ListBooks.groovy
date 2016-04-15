package com.library

class ListBooks {

	String title

	String type

	String startDate

	String enddate

	Librarian librarian

    static constraints = {

	title()

	type()

	startDate()

	enddate()
	
	librarian()
    }
}
