
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/workersOnline/conf/routes
// @DATE:Wed Feb 28 15:04:23 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
