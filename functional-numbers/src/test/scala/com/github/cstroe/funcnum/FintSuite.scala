package com.github.cstroe.funcnum

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FintSuite extends FunSuite with TestNumbers {
  test("Zero: toString") {
    assert(Zero.toString === "0")
  }

  test("Zero: successor toString") {
    assert(one.toString === "1")
  }

  test("Zero: predecessor toString") {
    assert(negOne.toString === "-1")
  }

  test("Succ: toString") {
    assert(two.toString === "2")
  }

  test("Pred: toString") {
    assert(negTwo.toString === "-2")
  }

  test("Succ: larger number") {
      assert(ten.toString == "10")
  }

  test("Pred: larger number") {
      assert(negTen.toString == "-10")
  }

  test("0 + 0 = 0") {
    val result = Zero + Zero
    assert(result.toString == "0")
  }

  test("0 + 1 = 1") {
    val result = Zero + one
    assert(result.toString === "1")
  }

  test("1 + 0 = 1") {
    val result = one + Zero
    assert(result.toString == "1")
  }

  test("0 - 1 = -1") {
    val result = Zero - one
    assert(result.toString == "-1")
  }

  test("1 + 1 = 2") {
    val result = one + one
    assert(result.toString === "2")
  }

  test("1 - 1 = 0") {
    val result = one - one
    assert(result.toString === "0")
  }

  test("2 + 2 = 4") {
    val result = two + two
    assert(result.toString === "4")
  }

  test("2 - 1 = 1") {
    val result = two - one
    assert(result.toString === "1")
  }

  test("1 - 2 = -1") {
    val result = one - two
    assert(result.toString === "-1")
  }

  test("10 - -10 = 20") {
    val result = ten - negTen
    assert(result.toString === "20")
  }

  test("-10 - 10 = -20") {
    val result = negTen - ten
    assert(result.toString === "-20")
  }
}
