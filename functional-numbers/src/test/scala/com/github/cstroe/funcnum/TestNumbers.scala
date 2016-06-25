package com.github.cstroe.funcnum

trait TestNumbers {
  val one = Zero.successor
  val negOne = Zero.predecessor

  val two = Zero.successor.successor
  val negTwo = Zero.predecessor.predecessor

  val ten = Zero
    .successor.successor.successor.successor.successor
    .successor.successor.successor.successor.successor

  val negTen = Zero
    .predecessor.predecessor.predecessor.predecessor.predecessor
    .predecessor.predecessor.predecessor.predecessor.predecessor
}
