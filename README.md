# Groovy NullPointerException in Chained Method Calls

This example demonstrates a common error in Groovy where not explicitly handling null parameter values in methods can lead to unexpected `NullPointerExceptions` when those methods are used in chained calls.

The `GroovyNullPointerException.groovy` file shows a method that returns `null` when its parameter is `null`. While this may seem harmless, it becomes problematic when this method is part of a chain of method calls where the caller isn't anticipating a `null` response.

`GroovyNullPointerExceptionSolution.groovy` illustrates how to address this by using the Groovy Elvis operator(?:) to provide a default value when the parameter or intermediate result is `null`, ensuring that the chain continues even in the event of a null parameter.