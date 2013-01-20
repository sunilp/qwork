package controllers;

import java.util.ArrayList;
import java.util.List;

import play.*;
import play.mvc.*;

import views.html.*;

import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;

import play.data.Form;
import play.db.DB;
import play.libs.Json;

public class TaskController extends Controller {
  
  public static Result taskList() {
ArrayNode arnode = Json.newObject().arrayNode();

  for(int i=101; i<910 ;i++){

	  ObjectNode result = Json.newObject();
  result.put("id", i);
  result.put("task", "tskdsfsdjfksgdjfsjfajsgfakjgfewfwef wefkjefkjwf wfkjwfkjwef wekjbfkjwef wekjfbqwekjflkqw wjbfjkwbf kjbwfekhfk kjwebfkjwefkj kjwebfokjwehfkj jqwefwhefkjl f jhwgfkj sdfijhqgkfw jfwj fjhgfjfg figfjwfgijqw fjwh g"+i);
  result.put("due", "du"+i);
  result.put("details","dtl"+ i);
  
  arnode.add(result);
  }
  System.out.println("NAAA"+arnode);
  
    return ok(arnode);
  }
  
}