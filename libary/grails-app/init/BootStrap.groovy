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
				book: 'Book1',
				student: 'Barry Allen',
				librarian: 'Jessica Jones').save()

			def libary2= new Libary
				(location: 'Manchester',
				openingHours: '9-5',
				book: 'Book2',
				student: 'Oliver Queen',
				librarian: 'James write').save()

			def libary3= new Libary
				(location: 'Liverpool',
				openingHours: '9-5',
				book: 'Book3',
				student: 'Laurel Lance',
				librarian: 'bob tank').save()

    }
    def destroy = {
    }
}
