package PRACTICEPERF

class Test extends munit.FunSuite {

  test("PRACTICEPERF :: #1 :: def :: process :: normal case"){
    assertEquals(Main.process(Array("12", "15", "8", "10")), 3)
  }

  test("PRACTICEPERF :: #2 :: def :: process :: normal case"){
    assertEquals(Main.process(Array("2", "3", "1", "10")), 1)
  }

  test("PRACTICEPERF :: #3 :: def :: process :: normal case"){
    assertEquals(Main.process(Array("12", "100", "99", "11")), 4)
  }

}