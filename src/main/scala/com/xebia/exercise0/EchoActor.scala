package com.xebia
package exercise0

import akka.actor.{Actor, Props}

object EchoActor {
  //TODO define props and name for EchoActor here
}

class EchoActor extends Actor {

  def receive = {
    //TODO reply with the same message you received. The ActorRef of the sender can be accesses via the sender() method:
    case m => ???
  }
}
