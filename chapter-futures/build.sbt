name := "futures"

version := "1.0"

organization := "com.goticks"

resolvers ++=
  Seq(Resolver.typesafeRepo("releases"),
      "Spray Repository"    at "http://repo.spray.io")

libraryDependencies ++= {
  val akkaVersion = "2.4.12"
  Seq(
    "com.typesafe.akka"       %%  "akka-actor"                     % akkaVersion,
    "com.typesafe.akka"       %%  "akka-slf4j"                     % akkaVersion,
    "com.typesafe.akka"       %%  "akka-testkit"                   % akkaVersion   % "test",
    "org.scalatest"           %% "scalatest"                       % "3.0.0"       % "test",
    "com.github.nscala-time"  %%  "nscala-time"                    % "1.8.0"
  )
}
