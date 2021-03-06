package lists

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalaListsTest extends FunSuite {
  val lists = new ScalaLists

  test("sum") {
    val list = List(1, 2, 3, 4)
    assert(lists.sum(list) == 10)
  }

  test("max") {
    val list = List(1, 2, 3)
    assert(lists.max(list) == 3)
  }

  test("exists_True") {
    val strings = List("a", "b")
    assert(lists.exists(strings, "a"))
  }

  test("exists_False") {
    val strings = List("a", "b")
    assert(lists.exists(strings, "c") == false)
  }

  test("indexOf_Found") {
    val strings = List("a", "b")
    assert(lists.indexOf(strings, "b") == 1)
  }

  test("indexOf_NotFound") {
    val list = List(1, 2, 3)
    assert(lists.indexOf(list, 4) == -1)
  }
}
