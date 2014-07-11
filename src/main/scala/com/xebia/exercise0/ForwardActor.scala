package com.xebia
package exercise0

import akka.actor.{Actor, Props, ActorRef}

object ForwardActor {
  //TODO define props and name for PrintActor here.  use the following Props syntax: Props(classOf[ForwardActor], param1)
}

class ForwardActor(forwardTo: ActorRef) extends Actor {
  import ForwardActor._

  //TODO write your receive method here, forward any received message to the forwardTo actor with the forward method

}
