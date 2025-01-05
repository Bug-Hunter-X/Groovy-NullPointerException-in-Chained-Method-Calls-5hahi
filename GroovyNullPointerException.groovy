def myMethod(param) {
  if (param == null) {
    return null //this will cause unexpected behavior if used in a chained method call
  }
  // ... rest of the method
}