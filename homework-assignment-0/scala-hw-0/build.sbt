ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "scala-hw-0",
    idePackagePrefix := Some("org.rpatel.dsci553_assignments")
  )
