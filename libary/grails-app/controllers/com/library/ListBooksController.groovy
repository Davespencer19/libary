package com.library

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import grails.converters.*

@Transactional(readOnly = true)
class ListBooksController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ListBooks.list(params), model:[listBooksCount: ListBooks.count()]
    }

    def show(ListBooks listBooks) {
        respond listBooks
    }

def listAssign(Librarian librarian){
if(params.id && Librarian.exists(params.id)){
 render Librarian.findById(params.id) as JSON
 }else{
 render Librarian.list() as JSON
 }
}

    def create() {
        respond new ListBooks(params)
    }

    @Transactional
    def save(ListBooks listBooks) {
        if (listBooks == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (listBooks.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond listBooks.errors, view:'create'
            return
        }

        listBooks.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'listBooks.label', default: 'ListBooks'), listBooks.id])
                redirect listBooks
            }
            '*' { respond listBooks, [status: CREATED] }
        }
    }

    def edit(ListBooks listBooks) {
        respond listBooks
    }

    @Transactional
    def update(ListBooks listBooks) {
        if (listBooks == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (listBooks.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond listBooks.errors, view:'edit'
            return
        }

        listBooks.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'listBooks.label', default: 'ListBooks'), listBooks.id])
                redirect listBooks
            }
            '*'{ respond listBooks, [status: OK] }
        }
    }

    @Transactional
    def delete(ListBooks listBooks) {

        if (listBooks == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        listBooks.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'listBooks.label', default: 'ListBooks'), listBooks.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'listBooks.label', default: 'ListBooks'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
