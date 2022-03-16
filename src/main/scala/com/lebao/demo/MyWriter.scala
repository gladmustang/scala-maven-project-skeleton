package com.lebao.demo

abstract class MyWriter {
  var message: String = "null"
  def setMessage(message:String):Unit
  def printMessage(): Unit
}
