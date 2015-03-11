addSbtPlugin("uk.gov.hmrc" % "sbt-utils" % "2.2.0")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

resolvers += Resolver.bintrayRepo("hmrc", "releases-maven")

addSbtPlugin("uk.gov.hmrc" % "sbt-bintray-publish" % "0.2.0")
