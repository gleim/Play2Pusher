import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Play2Pusher-sample"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
	  "tindr" % "play2pusher_2.9.1" % "1.0.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      resolvers += Resolver.url("Tindr's Play module repository",
        url("http://github.com/boldradius/tindr.github.com/blob/master/releases/"))
        (Resolver.ivyStylePatterns)
      )
    )

}
