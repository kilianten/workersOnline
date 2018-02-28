
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Project],Form[models.users.Login],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Project],loginForm: Form[models.users.Login], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.99*/("""

"""),_display_(/*3.2*/main("Projects", loginForm, user)/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
  """),format.raw/*4.3*/("""<h1>Projects</h1>

  """),_display_(/*6.4*/for(p<-projects) yield /*6.20*/{_display_(Seq[Any](format.raw/*6.21*/("""
      """),format.raw/*7.7*/("""<h3>"""),_display_(/*7.12*/p/*7.13*/.getName),format.raw/*7.21*/("""</h3>
      <p>"""),_display_(/*8.11*/p/*8.12*/.getDescription),format.raw/*8.27*/("""</p>
  """)))}),format.raw/*9.4*/("""

""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(projects:List[models.Project],loginForm:Form[models.users.Login],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(projects,loginForm,user)

  def f:((List[models.Project],Form[models.users.Login],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (projects,loginForm,user) => apply(projects,loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 28 14:07:28 GMT 2018
                  SOURCE: /home/wdd/webapps/workersOnline/app/views/projects.scala.html
                  HASH: 12257f0777c327166c175135e8862d013f1918a8
                  MATRIX: 1012->1|1204->98|1232->101|1273->134|1312->136|1341->139|1388->161|1419->177|1457->178|1490->185|1521->190|1530->191|1558->199|1600->215|1609->216|1644->231|1681->239|1714->242
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|43->11
                  -- GENERATED --
              */
          