package com.xebia
package exercise0

import akka.actor.{Actor, Props, ActorRef}

object ForwardActor {
  //TODO define props and name for PrintActor here.  use the following Props syntax: Props(classOf[ForwardActor], param1)
  def props(to: ActorRef) = Props(classOf[ForwardActor], to)
  val name = "forward-actor"
}

class ForwardActor(forwardTo: ActorRef) extends Actor {
  import ForwardActor._

  //TODO write your receive method here, forward any received message to the forwardTo actor with the forward method on the ActorRef
  def receive = {
    case message => forwardTo.forward(message)
  }
}
