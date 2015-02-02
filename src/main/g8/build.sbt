name := "$name$"

version := "$version$"

organization := "$groupId$"

scalaVersion := "2.10.4" //define the exact scala version you want to use, otherwise use system's default

//-------------------------------------------------------------------------

crossPaths := false //disable using the Scala version in output paths and artifacts

publishTo := Some(Resolver.file("file", new File((Path.userHome / ".m2" / "repository").absolutePath))) //local mvn

resolvers ++= Seq(
  "Local Maven Repository" at "file://"+(Path.userHome / ".m2" / "repository").absolutePath)

libraryDependencies ++= Seq(
  /* Test */
  "org.scalatest" % "scalatest" %% "2.2.1" % "test"
  /* Main */
  //...
)

//-------------------------------------------------------------------------

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource //sbteclipse: include resources in classpath

EclipseKeys.withSource := true //sbteclipse: download dependency packages' sources if available
