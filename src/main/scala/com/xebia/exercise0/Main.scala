package com.xebia
package exercise0

import scala.concurrent.duration._

import akka.actor.ActorSystem
import akka.pattern.ask
import akka.util.Timeout

object Main extends App {
  implicit val system = ActorSystem("exercise-0")
  import system.dispatcher

  implicit val timeout = Timeout(2.seconds)

  println("Press Enter to terminate.")

  val print = system.actorOf(PrintActor.props, PrintActor.name)
  //TODO: Send a Print message to the print actor
  print ! PrintActor.Print("Actors rock!")
  println("This is from main.")

  val echo = system.actorOf(EchoActor.props, EchoActor.name) //TODO: Create the EchoActor similar to the print actor
  //TODO: Send an echo message to the echo actor and print the response using the ask pattern
  echo.ask("Echooooo").foreach(echo => println(echo))

  val forward = system.actorOf(ForwardActor.props(print), ForwardActor.name) //TODO: Create the forward actor with the print actor as its parameter
  //TODO: Send the forward actor a Print message
  forward ! PrintActor.Print("Via the forward actor!")

  val printEcho = system.actorOf(PrintEchoActor.props, PrintEchoActor.name) //TODO: Create the PrintEcho actor
  printEcho ! PrintEchoActor.PrintEcho("Wow, printed echos!")

  System.console.readLine()
  system.shutdown()
}
