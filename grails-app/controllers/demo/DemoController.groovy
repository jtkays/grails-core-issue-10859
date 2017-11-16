package demo

import grails.validation.Validateable

class DemoController {

    def index() {
        DemoCommand cmd = new DemoCommand(demoAmount: 'foo')
        render cmd.validate() ? "Validation successful" : "Validation failed, errors: ${cmd.errors}"
    }
}

class DemoCommand implements Validateable {
    String demoAmount

    static constraints = {
        demoAmount nullable: false
    }

    Long getDemoAmountAsLong() {
        demoAmount?.isNumber() ? demoAmount as Long : null
    }
}

