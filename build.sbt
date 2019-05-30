name := """BulletinBoardApp"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "com.h2database" % "h2" % "1.4.199"

// https://mvnrepository.com/artifact/org.projectlombok/lombok
libraryDependencies += "org.projectlombok" % "lombok" % "1.18.8" % "provided"

// https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api
libraryDependencies += "org.hibernate.javax.persistence" % "hibernate-jpa-2.1-api" % "1.0.2.Final"

// https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.0"

// LESS compile setting
includeFilter in (Assets, LessKeys.less) := "*.less"
excludeFilter in (Assets, LessKeys.less) := "_*.less"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)
EclipseKeys.preTasks := Seq(compile in Compile)
