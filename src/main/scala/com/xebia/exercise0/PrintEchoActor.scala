package com.xebia
package exercise0

import akka.actor.{Actor, Props}

object PrintEchoActor {
  //TODO define a PrintEcho message
  case class PrintEcho(text: String)

  //TODO define props and name for PrintActor here
  val props = Props(new PrintEchoActor)
  val name = "print-echo-actor"
}

class PrintEchoActor extends Actor {
  import PrintEchoActor._

  // Create an EchoActor as a child of this actor using the context.actorOf method
  val echo = context.actorOf(EchoActor.props, EchoActor.name)

  def receive = {
    //TODO handle the Print message here by sending the text string in it to the EchoActor
    case PrintEcho(text) => echo ! text
    //print the String that was received from the EchoActor
    case text: String => println(s"PrintViaEcho: $text")
  }
}
