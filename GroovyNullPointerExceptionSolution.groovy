def myMethod(param) {
  return param?.someMethod() ?: defaultValue //Using the Elvis operator
}
def defaultValue = 0

// Example usage in a chained call:
//the below expression will not cause NPE due to use of Elvis Operator
println myMethod(null)?.someProperty ?: "defaultString"

//Example without elvis operator
//println myMethod(null)?.someProperty //This line may throw NullPointerException if someMethod() or someProperty returns null