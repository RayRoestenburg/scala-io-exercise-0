package com.xebia
package exercise0

import akka.actor.ActorSystem
import akka.pattern.ask

object Main extends App {
  implicit val system = ActorSystem("exercise-1")
  import system.dispatcher

  val print = system.actorOf(PrintActor.props, PrintActor.name)
  //TODO: Send a Print message to the print actor
  println("This is from main.")

  val echo = ??? //TODO: Create the EchoActor similar to the print actor
  //TODO: Send an echo message to the echo actor and handle the response using the ask pattern

  val forward = ??? //TODO: Create the forward actor with the print actor as its parameter
  //TODO: Send the forward actor a Print message


}
