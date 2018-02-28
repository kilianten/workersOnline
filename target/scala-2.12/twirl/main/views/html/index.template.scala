
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main("Home", loginForm, user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
  
  """),format.raw/*5.3*/("""<div class="container">
    <div class="jumbotron">
      <h1>WorkersOnline</h1>
    </div>
  </div>

  """),_display_(/*11.4*/if(flash.containsKey("success"))/*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
    """),_display_(/*12.6*/flash/*12.11*/.get("success")),format.raw/*12.26*/("""
  """)))}/*13.5*/else/*13.10*/{_display_(Seq[Any](format.raw/*13.11*/("""
    """),format.raw/*14.5*/("""Welcome!
  """)))}),format.raw/*15.4*/("""
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 28 13:01:25 GMT 2018
                  SOURCE: /home/wdd/webapps/workersOnline/app/views/index.scala.html
                  HASH: c365dfcbfce0a7b00dea32ce1cec7d5ec1f6c564
                  MATRIX: 988->1|1149->67|1177->70|1214->99|1253->101|1285->107|1416->212|1457->244|1497->246|1529->252|1543->257|1579->272|1601->277|1614->282|1653->283|1685->288|1727->300|1759->302
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|48->16
                  -- GENERATED --
              */
          