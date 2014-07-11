If you don't have a working Scala developemtn setup yet, please see the [setup instructions](SETUP.md)

Exercise 0
==========

In this exercise you will learn about the basics of programming with actors.

###Objective

The objective of this exercise is to get familiar with the ActorSystem and the Actors of Akka.

You will learn the following:
- Creating an Actor System and multiple Actors
- How to handle messages received by the actor
- Sending messages to actors
- Asking actors for a response and handling the Future that wraps the response
- Create child actors

###What is already prepared

A **Main** App which starts an ActorSystem and only stops the ActorSystem when you press Enter. Templates for the different
actors are implemented and the **Main** App contains a hints on what to do next.

###The Exercise

Look for the TODO's in the project and follow the instructions.
The following tasks will need to be completed (works best if done in this order):

- implement the PrintActor and send a message to it from Main (run the application)
- implement the EchoActor and ask it for a response that is printed to the console (run the application)
- implement the test in EchoActorSpec (run the tests)
- implement the ForwardActor and send it the PrintActor.Print message (run the application)
- implement the PrintEchoActor by creating a child actor (the EchoActor) and send the PrintEchoActor a PrintEcho message.
  Notice that the message contents is first relayed via the EchoActor before it is printed. (run the application)

###Next Exercise
Now that you are familiar with the actor basics we'll have a look at Spray (the actor based Http implementation). Spray makes it
easy to add an HTTP REST interface to your application. Go to [Exercise 1](https://github.com/RayRoestenburg/scala-io-exercise-1)
