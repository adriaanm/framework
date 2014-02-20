import sbt._

object PluginDef extends Build {
  lazy val root              = Project("plugins", file(".")) dependsOn(buildPlugin)
  lazy val buildPlugin       = uri("git://github.com/gkossakowski/sbt-lift-build.git#646445c")
}
