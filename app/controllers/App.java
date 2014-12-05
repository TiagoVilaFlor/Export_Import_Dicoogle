package controllers;

import akka.actor.IO;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.Logger;
import play.api.mvc.Rendering;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

//import play.db.DB;

//import static play.data.Form.form;

/**
 * Created by tiago on 06-11-2014.
 */
public class App extends Controller {

    public static Result index(){
        return ok(index.render());
    }


}
