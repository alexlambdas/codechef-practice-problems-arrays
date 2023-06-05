package LTIME108

class Test extends munit.FunSuite{

  test("LTIME108 :: #1 :: def :: removeProblems :: normal case"){
    assertEquals(Main.removeProblems("800 1200 900"), 1)
  }

  test("LTIME108 :: #2 :: def :: removeProblems :: normal case"){
    assertEquals(Main.removeProblems("999 1000 1001 1002"), 3)
  }

  test("LTIME108 :: #3 :: def :: removeProblems :: normal case"){
    assertEquals(Main.removeProblems("1 2 2 2 5000"), 1)
  }

  test("LTIME108 :: #4 :: def :: removeProblems :: normal case"){
    assertEquals(Main.removeProblems("1000 1000 1000 1000 1000"), 5)
  }

  test("LTIME108 :: #5 :: def :: removeProblems :: normal case"){
    assertEquals(Main.removeProblems("900 700 800"), 0)
  }

}