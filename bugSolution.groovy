```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or some other default value.  Avoid returning null 
  }
  return a + b
}

println myMethod(1, 2) // 3
println myMethod(null, 2) // 0
println myMethod(1, null) // 0
println myMethod(null, null) // 0
```