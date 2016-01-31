name := "play-and-jpa-hibernate-in-java"

version := "1.0"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.hibernate" % "hibernate-entitymanager" % "5.0.7.Final",
  "org.hibernate" % "hibernate-hikaricp" % "5.0.7.Final", 
  "com.google.inject" % "guice" % "3.0"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)
