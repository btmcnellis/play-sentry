resolvers ++= Seq(
  "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snapshots repository" at "https://repo.typesafe.com/typesafe/snapshots/"
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.2")

addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "latest.release")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.4")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
