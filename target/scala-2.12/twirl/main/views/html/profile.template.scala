
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main("Profile - " + user.getFName, loginForm, user)/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""
  """),format.raw/*4.3*/("""<h2>Welcome """),_display_(/*4.16*/user/*4.20*/.getFName),format.raw/*4.29*/("""</h2>

  """),_display_(/*6.4*/if(user.getRole=="admin")/*6.29*/{_display_(Seq[Any](format.raw/*6.30*/("""
    """),format.raw/*7.5*/("""<a href="/">
      <button type="button" class="btn genreBtn">Add Employee to system</button>    <!--admin button !-->  
    </a>
  """)))}),format.raw/*10.4*/("""
""")))}),format.raw/*11.2*/("""
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
                  DATE: Wed Feb 28 15:07:30 GMT 2018
                  SOURCE: /home/wdd/webapps/workersOnline/app/views/profile.scala.html
                  HASH: deb925f8d4f5c8e88bac15ab9f9f1e5dbcf4e3a9
                  MATRIX: 990->1|1151->67|1179->70|1238->121|1277->123|1306->126|1345->139|1357->143|1386->152|1421->162|1454->187|1492->188|1523->193|1686->326|1718->328
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|38->6|38->6|38->6|39->7|42->10|43->11
                  -- GENERATED --
              */
          