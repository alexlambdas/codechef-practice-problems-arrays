package TLG

class Test extends munit.FunSuite{

  test("TLG :: #1 :: def :: process :: normal case"){
    assertEquals(Main.process(List("88 90", "112 106", "90 110", "89 134", "140 82")), List(1,58))
  }

  test("TLG :: #2 :: def :: process :: normal case"){
    assertEquals(Main.process(List("115 30", "116 110", "50 90")), List(1, 85))
  }

}