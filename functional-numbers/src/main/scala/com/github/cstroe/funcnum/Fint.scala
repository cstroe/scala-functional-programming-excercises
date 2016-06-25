package com.github.cstroe.funcnum

/**
  * A functional model of the Integers: ... -2, -1, 0, 1, 2 ...
  */
abstract class Fint {
  def predecessor: Fint
  def successor: Fint

  /** The addition operation */
  def +(that: Fint): Fint = that match {
    case e: Fnext => this.successor + e.predecessor
    case e: Fprev => this.predecessor + e.successor
    case _ => this
  }

  /** The subtraction operation */
  def -(that: Fint): Fint = that match {
    case e: Fnext => this.predecessor - e.predecessor
    case e: Fprev => this.successor - e.successor
    case _ => this
  }

  override def toString: String = toStringInner(0)

  def toStringInner(count: Int): String = {
    this match {
      case c: Fnext => c.predecessor.toStringInner(count+1)
      case c: Fprev => c.successor.toStringInner(count-1)
      case _ => count.toString
    }
  }
}

/** The additive identity */
object Zero extends Fint {
  override def successor: Fint = new Fnext(this)
  override def predecessor: Fint = new Fprev(this)

  override def +(that: Fint): Fint = that

  override def -(that: Fint): Fint =
    if(this == that) this
    else predecessor - that.predecessor
}

/** The next integer after the current one */
class Fnext(current: Fint) extends Fint {
  override def successor: Fint = new Fnext(this)
  override def predecessor: Fint = current
}

/** The previous integer before the current one */
class Fprev(n: Fint) extends Fint {
  override def successor: Fint = n
  override def predecessor: Fint = new Fprev(this)
}