package com.xebia
package exercise0

import akka.actor.{Actor, Props, ActorRef}

object ForwardActor {
  //TODO define props and name for PrintActor here.  use the following Props syntax: Props(new ForwardActor, param1)
  def props(to: ActorRef) = Props(new ForwardActor(to))
  val name = "forward-actor"
}

class ForwardActor(to: ActorRef) extends Actor {

  //TODO write your receive method here, forward any received message to the `'to' actor with the forward method on the ActorRef
  def receive = {
    case message => to.forward(message)
  }
}
