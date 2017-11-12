package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

class AppSummary {
    private String content;

    AppSummary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {

    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Java Play Angular Seed"));
        return ok(jsonNode).as("application/json");
    }
}
