package com.xebia
package exercise0

import akka.actor.{Actor, Props}

object EchoActor {
  //TODO define props and name for EchoActor here
  val props = Props(new EchoActor)
  val name = "echo-actor"
}

class EchoActor extends Actor { // TODO extend from Actor

  def receive = {
    //TODO write your receive method here, reply with the same message you received:
    case m => sender() ! m
  }
}
