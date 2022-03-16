package com.lebao.demo

class ConsolePrinter extends lowerCase {
  override def setMessage(contents: String): Unit = {
    this.message= contents;
  }
  def printMessage():Unit = {
    println(message)
  }
}
