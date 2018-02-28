
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[models.users.Login],models.users.Employee,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, loginForm: Form[models.users.Login], user: models.users.Employee)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.98*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
    </head>
    <body>
            <!--- NAVBAR -->
            <div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
                    <div class="container-fluid">
                        <img id="logo" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.versioned("images/favicon.png")),format.raw/*17.91*/("""">
                        <div class="navbar-header"><a class="navbar-brand" href="#">WorkersOnline</a>
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                            </button>
                        </div>
                        <div class="collapse navbar-collapse navbar-menubuilder">
                            <ul class="nav navbar-nav navbar-left">
                                <li><a href="/">Home</a>
                                </li>
                                <li><a href="/about">About Us</a>
                                </li>
                                <li><a href="/projects">Projects</a>
                                </li>
                                <li><a href="/">Departments</a>
                                </li>
                                <li><a href="#">Employees</a>
                                </li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                              """),_display_(/*36.32*/if(user != null)/*36.48*/{_display_(Seq[Any](format.raw/*36.49*/("""
                                """),format.raw/*37.33*/("""<li><a href="/profile">"""),_display_(/*37.57*/user/*37.61*/.getFName()),format.raw/*37.72*/("""</a></li>
                                <li><a href="/logout" id="signUp"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                              """)))}/*39.33*/else/*39.38*/{_display_(Seq[Any](format.raw/*39.39*/("""
                                """),format.raw/*40.33*/("""<li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                              """)))}),format.raw/*41.32*/("""
                            """),format.raw/*42.29*/("""</ul>
                        </div>
                    </div>
                </div>
    <!-- The Modal -->
    <div id="myModal" class="modal">     
            <!-- Modal content -->
            <div class="modal-content">
                <span class="close">&times;</span>
 
                <h2>Login</h2>
        
                """),_display_(/*54.18*/if(loginForm.hasGlobalErrors)/*54.47*/{_display_(Seq[Any](format.raw/*54.48*/("""
                    """),format.raw/*55.21*/("""<script>
                        setTimeout(function()"""),format.raw/*56.46*/("""{"""),format.raw/*56.47*/("""
                                """),format.raw/*57.33*/("""document.getElementById('login').click();
                               """),format.raw/*58.32*/("""}"""),format.raw/*58.33*/(""",2);
                    </script>
                  <br>
                  <p class="alert alert-warning">
                    """),_display_(/*62.22*/loginForm/*62.31*/.globalError.message),format.raw/*62.51*/("""
                  """),format.raw/*63.19*/("""</p>
                """)))}),format.raw/*64.18*/("""
        
                """),_display_(/*66.18*/if(flash.containsKey("error"))/*66.48*/{_display_(Seq[Any](format.raw/*66.49*/("""
                  """),format.raw/*67.19*/("""<p class="alert alert-warning">
                    """),_display_(/*68.22*/flash/*68.27*/.get("loginRequired")),format.raw/*68.48*/("""
                  """),format.raw/*69.19*/("""</p>
                """)))}),format.raw/*70.18*/("""
        
                """),_display_(/*72.18*/helper/*72.24*/.form(action = controllers.routes.HomeController.loginSubmit())/*72.87*/{_display_(Seq[Any](format.raw/*72.88*/("""
                """),_display_(/*73.18*/CSRF/*73.22*/.formField),format.raw/*73.32*/("""
        
                """),format.raw/*75.17*/("""<div class="form-group">
                    """),_display_(/*76.22*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*76.132*/("""
                """),format.raw/*77.17*/("""</div>
        
                <div class="form-group">
                   """),_display_(/*80.21*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*80.135*/("""
                """),format.raw/*81.17*/("""</div>
        
                <div class="form-group">
                    <input type="submit" value="Sign in" class="btn btn-primary">
                </div>
              """)))}),format.raw/*86.16*/("""
              """),format.raw/*87.15*/("""</div>
    </div>
      <!-- jQuery library -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
      <!-- Latest compiled JavaScript -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

      """),_display_(/*94.8*/content),format.raw/*94.15*/("""

        """),format.raw/*96.9*/("""<script src=""""),_display_(/*96.23*/routes/*96.29*/.Assets.versioned("javascripts/main.js")),format.raw/*96.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,loginForm:Form[models.users.Login],user:models.users.Employee,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,loginForm,user)(content)

  def f:((String,Form[models.users.Login],models.users.Employee) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,loginForm,user) => (content) => apply(title,loginForm,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 28 15:10:22 GMT 2018
                  SOURCE: /home/wdd/webapps/workersOnline/app/views/main.scala.html
                  HASH: 37ae0a239d2a01af9b482518462a9be745a4ca29
                  MATRIX: 999->1|1168->99|1213->97|1240->115|1267->116|1346->221|1381->230|1415->238|1440->243|1638->414|1653->420|1716->461|1804->522|1819->528|1880->567|2151->811|2166->817|2226->856|3485->2088|3510->2104|3549->2105|3610->2138|3661->2162|3674->2166|3706->2177|3920->2373|3933->2378|3972->2379|4033->2412|4186->2534|4243->2563|4607->2900|4645->2929|4684->2930|4733->2951|4815->3005|4844->3006|4905->3039|5006->3112|5035->3113|5191->3242|5209->3251|5250->3271|5297->3290|5350->3312|5404->3339|5443->3369|5482->3370|5529->3389|5609->3442|5623->3447|5665->3468|5712->3487|5765->3509|5819->3536|5834->3542|5906->3605|5945->3606|5990->3624|6003->3628|6034->3638|6088->3664|6161->3710|6293->3820|6338->3837|6442->3914|6578->4028|6623->4045|6831->4222|6874->4237|7192->4529|7220->4536|7257->4546|7298->4560|7313->4566|7374->4606
                  LINES: 28->1|31->2|34->1|35->3|36->4|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|49->17|49->17|49->17|68->36|68->36|68->36|69->37|69->37|69->37|69->37|71->39|71->39|71->39|72->40|73->41|74->42|86->54|86->54|86->54|87->55|88->56|88->56|89->57|90->58|90->58|94->62|94->62|94->62|95->63|96->64|98->66|98->66|98->66|99->67|100->68|100->68|100->68|101->69|102->70|104->72|104->72|104->72|104->72|105->73|105->73|105->73|107->75|108->76|108->76|109->77|112->80|112->80|113->81|118->86|119->87|126->94|126->94|128->96|128->96|128->96|128->96
                  -- GENERATED --
              */
          