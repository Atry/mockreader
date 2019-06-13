package mypackage
class MyTest extends org.scalatest.FreeSpec with org.scalamock.scalatest.MockFactory {
  "mock bufferedreader" in {
    mock[java.io.BufferedReader]
  }
}