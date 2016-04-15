package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
       
	when: "A Course has title, tutor and department"
	def course=new Course(title: 'Forensic science',
	tutor: 'Katie Snow',
	department: 'Sciences')
	then: "the to String method will merge them. "
	course.toString()== 'Forensic science, Katie Snow, Sciences'

    }
}
