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

			

			def libary1= new Libary
				(location: 'Sheffield',
				openingHours: '9-5',
				book: 'sci fi',
				student: 'Barry Allen',
				librarian: 'Jessica Jones').save()

			def libary2= new Libary
				(location: 'Manchester',
				openingHours: '9-5',
				book: 'fantasy',
				student: 'Oliver Queen',
				librarian: 'James write').save()

			def libary3= new Libary
				(location: 'Liverpool',
				openingHours: '9-5',
				book: 'romantic',
				student: 'Wally West',
				librarian: 'bob tank').save()


			def book1= new Book
				(title: 'Space man',
				author: 'Robbie Amelle',
				isbn: '1541098531',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Barry Allen').save()

			def book2= new Book
				(title: 'Open world',
				author: 'Feleicty Smoke',
				isbn: '9712308523',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Oliver Queen').save()

			def book3= new Book
				(title: 'The lonley one',
				author: 'Harrison Wells',
				isbn: '3014297412',
				dateBorrowed: '21/03/2016',
				returnDate: '04/04/2016',
				student: 'Wally West').save()


			def student1= new Student
				(name: 'Barry Allen',
				email: 'BarryA@localuni.com',
				studentId: 'B1209623',
				course: 'Forensic science').save()

			def student2= new Student
				(name: 'Oliver Queen',
				email: 'OliverQ@localuni.com',
				studentId: 'B7091365',
				course: 'Physical Education').save()

			def student3= new Student
				(name: 'Wally West',
				email: 'WallyW@localuni.com',
				studentId: 'B6098755',
				course: 'Motor Mechanics').save()


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
				


    }
    def destroy = {
    }
}
