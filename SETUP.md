Setting up the environment
-----------------------------------

 * Install git
 * Clone example project:
```
git clone https://github.com/RayRoestenburg/scala-io-exercise-0.git
git clone https://github.com/RayRoestenburg/scala-io-exercise-1.git
git clone https://github.com/RayRoestenburg/scala-io-exercise-2.git
git clone https://github.com/RayRoestenburg/scala-io-exercise-3.git
git clone https://github.com/RayRoestenburg/scala-io-exercise-4.git
git clone https://github.com/RayRoestenburg/scala-io-exercise-5.git
```

 * Install sbt. Please use version 0.13.5, this project uses a plugin for generating idea project files compatible with sbt 0.13.5. See http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html
 * Configure SBT, which runs on the JVM, to have some more memory than the default 64Mb:
```
export SBT_OPTS = "-Dfile.encoding=UTF8 -Xmx2048M -XX:MaxPermSize=1024m -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled "
```

 * Install IntelliJ or your IDE/editor of choice
     * (download from https://www.jetbrains.com/idea/download/)
     * Open the `build.sbt` file in Intellij
 * Start `sbt` in the project directory
 * Run `test` in sbt to get started
 * Verify that the tests work
 * Run `run` to execute the main method
