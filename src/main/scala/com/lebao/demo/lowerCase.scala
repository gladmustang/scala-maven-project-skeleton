package com.lebao.demo

trait lowerCase extends MyWriter {
  override def setMessage(message: String): Unit = printMessage()
}
