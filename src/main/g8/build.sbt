/** Your awesome project! */

name := "$name$"

version := "$version$"

organization := "$organization$"

crossPaths := false

//scalaVersion := "2.9.1"


/** Publish **/

// locally
publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath+"/.m2/repository")))


/** Repositories */
resolvers += "Local Maven Repository" at "file://" + (Path.userHome / ".m2" / "repository").absolutePath


/** Dependencies */
