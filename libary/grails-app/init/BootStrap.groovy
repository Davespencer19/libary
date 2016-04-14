import com.library.*

class BootStrap {

    def init = { servletContext ->

			def librarian1= new Librarian
				(name:'Jessica Jones',
				email: 'JJlibrarian@public1.com',
				userName: 'JessJon123',
				password: 'password',
				telephone: '01142390745').save()

			def librarian2= new Librarian
				(name:'James write',
				email: 'JWlibrarian@public1.com',
				userName: 'Jamwri123',
				password: 'password',
				telephone: '01142981375').save()

			def librarian3= new Librarian
				(name:'bob tank',
				email: 'BTlibrarian@public1.com',
				userName: 'bobtan123',
				password: 'password',
				telephone: '0114297456').save()

			def librarian4= new Librarian
				(name:'Thomas Gings',
				email: 'TGlibrarian@public1.com',
				userName: 'Tomgin123',
				password: 'password',
				telephone: '01142653198').save()

			def librarian5= new Librarian
				(name:'Sophie Cotton',
				email: 'SClibrarian@public1.com',
				userName: 'Sopcot123',
				password: 'password',
				telephone: '01142951233').save()

			def librarian6= new Librarian
				(name:'Tina Dents',
				email: 'TDlibrarian@public1.com',
				userName: 'Tinden123',
				password: 'password',
				telephone: '01142097511').save()

			def librarian7= new Librarian
				(name:'Ashley Moore',
				email: 'AMlibrarian@public1.com',
				userName: 'Ashmoo123',
				password: 'password',
				telephone: '01142987776').save()

			def librarian8= new Librarian
				(name:'Scott Wilson',
				email: 'SWlibrarian@public1.com',
				userName: 'Scowil123',
				password: 'password',
				telephone: '01142123409').save()

			def librarian9= new Librarian
				(name:'Connor Prescott',
				email: 'CPlibrarian@public1.com',
				userName: 'Conpresl123',
				password: 'password',
				telephone: '01142975312').save()




			

			def libary1= new Libary
				(location: 'Sheffield',
				openingHours: '9-5').save()

			def libary2= new Libary
				(location: 'Manchester',
				openingHours: '9-5').save()

			def libary3= new Libary
				(location: 'Liverpool',
				openingHours: '9-5').save()



			def book1= new Book
				(title: 'To Kill a Mockingbird',
				author: 'Harper Lee',
				isbn: '1541098531',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Barry Allen').save()

			def book2= new Book
				(title: 'Dune',
				author: 'Frank Herbert',
				isbn: '9712308523',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Oliver Queen').save()

			def book3= new Book
				(title: 'A Game Of Thrones',
				author: 'George rr Martin',
				isbn: '3014297412',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Wally West').save()

			def book4= new Book
				(title: 'Harry Potter',
				author: 'Jk Rowling',
				isbn: '9010951238',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Borris Johnson').save()

			def book5= new Book
				(title: 'Hunger Games',
				author: 'Suzanna Collins',
				isbn: '0098512398',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Susan Pots').save()

			def book6= new Book
				(title: '50 Shades of Grey',
				author: 'E.L James',
				isbn: '7765120945',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Chloe Fer').save()

			def book7= new Book
				(title: 'The Hobbit',
				author: 'J.R.r. Tolkien',
				isbn: '9612095323',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Daniel Stacy').save()

				

			def book8= new Book
				(title: 'Stormbreaker',
				author: 'Anthony Horowitz',
				isbn: '7120985312',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Amy Harris').save()

			def book9= new Book
				(title: 'Jurrassic Park',
				author: 'Michael Crichton',
				isbn: '1098765432',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Paul Garner').save()



			def course1= new Course
				(title: 'Forensic science',
				code: 'F123',
				tutor: 'Katie Snow',
				department: 'Sciences',
				description: '''Here we teach Forensic sciences. Here 					we teach Forensic sciences. Here we teach Forensic 					sciences. ''').save()

			def course2= new Course
				(title: 'Physical Education',
				code: 'P123',
				tutor: 'Cisco Ramon',
				department: 'Sports',
				description: '''Here we teach PE. Here 					we teach PE. Here we teach PE. ''').save()

			def course3= new Course
				(title: 'Motor Mechanics',
				code: 'M123',
				tutor: 'David Ramsey',
				department: 'Mechanics',
				description: '''Here we teach Motor Mechanics. Here 					we teach Motor Mechanics. Here we teach Motor 					Mechanics. ''').save()

			def course4= new Course
				(title: 'Polotics',
				code: 'Po123',
				tutor: 'Sarah Connor',
				department: 'Communications',
				description: '''Here we teach Polotics. Here 					we teach Polotics. Here we teach Polotics. ''').save()

			def course5= new Course
				(title: 'Web Design',
				code: 'W123',
				tutor: 'Jake Hart',
				department: 'Computing',
				description: '''Here we teach Web Design. Here 					we teach Web Design. Here we teach Web Design. 					''').save()

			def course6= new Course
				(title: 'Dance',
				code: 'D123',
				tutor: 'Melissa Hert',
				department: 'Sports',
				description: '''Here we teach Dance. Here 					we teach Dance. Here we teach Dance. 					''').save()
				
			def course7= new Course
				(title: 'Interactive Media',
				code: 'In123',
				tutor: 'Grayhem Cray',
				department: 'Computing',
				description: '''Here we teach Interactive Media. Here 					we teach Interactive Media. Here we teach Interactive 					Media.''').save()

			def course8= new Course
				(title: 'Mathmatics',
				code: 'Ma123',
				tutor: 'Max Yurnse',
				department: 'Core',
				description: '''Here we teach Mathmatics. Here 					we teach Mathmatics. Here we teach 					Mathmatics.''').save()

			def course9= new Course
				(title: 'English',
				code: 'En123',
				tutor: 'Fern Atkin',
				department: 'Core',
				description: '''Here we teach English. Here 					we teach English. Here we teach 				English.''').save()





			def student1= new Student
				(name: 'Barry Allen',
				email: 'BarryA@localuni.com',
				studentId: 'B1209623',
				course:course1).save()

			def student2= new Student
				(name: 'Oliver Queen',
				email: 'OliverQ@localuni.com',
				studentId: 'B7091365',
				course:course2).save()

			def student3= new Student
				(name: 'Wally West',
				email: 'WallyW@localuni.com',
				studentId: 'B6098755',
				course:course3).save()

			def student4= new Student
				(name: 'Borris Johnson',
				email: 'BorrisJ@localuni.com',
				studentId: 'B4026156',
				course:course4).save()

			def student5= new Student
				(name: 'Susan Pots',
				email: 'SusanP@localuni.com',
				studentId: 'B9063123',
				course:course5).save()

			def student6= new Student
				(name: 'Chloe Fer',
				email: 'ChloeF@localuni.com',
				studentId: 'B1236540',
				course:course6).save()

			def student7= new Student
				(name: 'Daniel Stacy',
				email: 'DanielS@localuni.com',
				studentId: 'B7610956',
				course:course7).save()

			def student8= new Student
				(name: 'Amy Harris',
				email: 'AmyH@localuni.com',
				studentId: 'B0964531',
				course:course8).save()

			def student9= new Student
				(name: 'Paul Garner',
				email: 'AmyH@localuni.com',
				studentId: 'B0964531',
				course:course9).save()



			
			libary1.addToLibrarians(librarian1)
			libary1.addToLibrarians(librarian2)
			libary1.addToLibrarians(librarian3)
			libary2.addToLibrarians(librarian4)
			libary2.addToLibrarians(librarian5)
			libary2.addToLibrarians(librarian6)
			libary3.addToLibrarians(librarian7)
			libary3.addToLibrarians(librarian8)
			libary3.addToLibrarians(librarian9)
	
			libary1.addToBooks(book1)
			libary1.addToBooks(book2)
			libary1.addToBooks(book3)
			libary2.addToBooks(book4)
			libary2.addToBooks(book5)
			libary2.addToBooks(book6)
			libary3.addToBooks(book7)
			libary3.addToBooks(book8)
			libary3.addToBooks(book9)

			libary1.addToStudents(student1)
			libary1.addToStudents(student2)
			libary1.addToStudents(student3)
			libary2.addToStudents(student4)
			libary2.addToStudents(student5)
			libary2.addToStudents(student6)
			libary3.addToStudents(student7)
			libary3.addToStudents(student8)
			libary3.addToStudents(student9)
			
			student1.addToBooks(book1)
			student1.addToBooks(book2)
			student3.addToBooks(book3)
			student4.addToBooks(book4)
			student5.addToBooks(book5)
			student5.addToBooks(book6)
			student7.addToBooks(book7)
			student8.addToBooks(book8)
			student9.addToBooks(book9)
			
			


    }
    def destroy = {
    }
}
