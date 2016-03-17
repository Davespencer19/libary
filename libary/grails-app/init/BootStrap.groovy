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

    }
    def destroy = {
    }
}
