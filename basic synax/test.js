 let value = 1
 function test () {
  console.log(value)

  function overide() {
    console.log(value)
    // value = 2
    console.log(value)
  }
  overide()
 }

test()