package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

//imported play.db.DB;

//imported static play.data.Form.form;

/**
 * Created by tiago on 06-11-2014.
 */
public class App extends Controller {

    public static Result index(){
        return ok(index.render());
    }

    public static Result imported(){
        return ok(imported.render());
    }

    public static Result upload(){
        return ok(upload.render());
    }

}
