resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"
resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.hanhuy.sbt" % "android-sdk-plugin" % "1.3.16")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.4")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.0.4")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.6.0")