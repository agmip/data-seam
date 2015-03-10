import sbt._

object Dependencies {

  val aceCore = "org.agmip.ace" % "ace-core" % "2.0-SNAPSHOT"
  val tika    = "org.apache.tika"% "tika-core"  % "1.6"
  val dome    = "org.agmip"      % "dome"       % "1.4.7"

  val allDeps = Seq(aceCore, tika, dome)
}
