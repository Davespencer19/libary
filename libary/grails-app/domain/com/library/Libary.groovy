package com.library

class Libary {
	
	String location

	String openingHours

	static hasMany = [librarians: Librarian, books: Book, students: Student]

		String toString(){

			"$location, $openingHours"
	}

    static constraints = {

	location()

	openingHours() 

    }
}
