package com.lebao.demo

import com.lebao.demo.Animal;
import com.lebao.demo.A;

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    case class Boy (name: String, age: Integer)
    var boy =  Boy("sjl", 16)

    println(boy)
     case class Girl() {
      var name:String  = "abc"
      var age :String = "bcd"
    }
    var g1 = Girl();
    var g2  = Girl();
//    g2.name="fff"
    println(g1.name);
    println(g2.name);
    println(g1==g2)

    val printer:ConsolePrinter = new ConsolePrinter();
    printer.setMessage("Hello ! world")
    printer.printMessage()
  }


}
