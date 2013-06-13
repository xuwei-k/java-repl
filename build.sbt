assemblySettings

resolvers += "bodar" at "http://repo.bodar.com/"

libraryDependencies ++= Seq(
  "com.googlecode.utterlyidle" % "utterlyidle" % "633",
  "jline" % "jline" % "2.11"
)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.10-M4",
  "junit" % "junit-dep" % "4.8.2",
  "org.hamcrest" % "hamcrest-core" % "1.3",
  "org.hamcrest" % "hamcrest-library" % "1.3"
).map(_ % "test")

{
val m = Some("javarepl.Main")
//val m = Some("javarepl.web.WebConsoleServer")
seq(
  mainClass in run := m,
  mainClass in AssemblyKeys.assembly := m
)
}

name := "javarepl"

autoScalaLibrary := false

