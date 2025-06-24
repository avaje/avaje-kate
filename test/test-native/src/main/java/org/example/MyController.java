package org.example;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.Produces;
import io.avaje.jsonb.Json;

@Controller
public final class MyController {

    @Produces("text/plain")
    @Get
    String hello() {
        return "Hello World";
    }

    @Get("json")
    MyData helloJson() {
        return new MyData(45, "yo!!");
    }

    @Json
    public record MyData(long id, String name) {

    }
}
