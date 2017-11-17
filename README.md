# grails-core-issue-10859
Demonstrates issue with Grails 3.2 validation on command object getter method with no property

This is a similar or same bug as https://github.com/grails/grails-core/issues/9754, where command object getter methods are considered as constrained properties.

To test, run the app and go to http://localhost:8080/demo/index. If working correctly, it should display "Validation successful". But as this sample code demonstrates, you will get validation errors on the command object's getDemoAmountAsLong()'s method.

