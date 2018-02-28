
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main("About us", loginForm, user)/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
    """),format.raw/*4.5*/("""<h2>about us<h2>

        
""")))}),format.raw/*7.2*/("""

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
                  DATE: Wed Feb 28 14:38:11 GMT 2018
                  SOURCE: /home/wdd/webapps/workersOnline/app/views/about.scala.html
                  HASH: d336cef5c2b0896dab57eb0cb0eea726eb6ebac6
                  MATRIX: 988->1|1149->67|1177->70|1218->103|1257->105|1288->110|1345->138
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|39->7
                  -- GENERATED --
              */
          