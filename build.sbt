organization := "me.lessis"

name := "base64"

version := "0.2.1"

licenses := Seq(
  ("MIT", url(s"https://github.com/softprops/${name.value}/blob/${version.value}/LICENSE")))

homepage := Some(url(s"https://github.com/softprops/${name.value}/#readme"))

scalacOptions += Opts.compile.deprecation

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.2")

scalaVersion := crossScalaVersions.value.last

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % "test",
  "commons-codec" % "commons-codec" % "1.10" % "test",
  "io.netty" % "netty-codec" % "4.1.12.Final" % "test")

bintrayPackageLabels in bintray := Seq("base64", "encoding", "rfc4648")

lsSettings

LsKeys.tags in LsKeys.lsync := (bintrayPackageLabels in bintray).value

externalResolvers in LsKeys.lsync := (resolvers in bintray).value

cappiSettings

pomExtra  := (
  <scm>
    <url>git@github.com:softprops/{name.value}.git</url>
    <connection>scm:git:git@github.com:softprops/{name.value}.git</connection>
  </scm>
  <developers>
    <developer>
      <id>softprops</id>
      <name>Doug Tangren</name>
      <url>https://github.com/softprops</url>
    </developer>
  </developers>)
