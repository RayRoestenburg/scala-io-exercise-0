package com.xebia
package exercise0

import akka.actor.{Actor, Props}

object PrintActor {
  //TODO define messages for print actor here (Print)
  case class Print(text: String)
  //TODO define props and name for PrintActor here
  val props = Props[PrintActor]
  val name = "print-actor"
}

class PrintActor extends Actor {
  import PrintActor._

  def receive = {
    //TODO handle the Print message here by println'ing the text in the Print message
    case Print(text) => println(s"PrintActor: $text")
  }

}
