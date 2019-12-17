package pl.arturzaczek.WarehouseAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class FirstRestController {

    static final Logger logger = LoggerFactory.getLogger(FirstRestController.class);

    @GetMapping
    public String getJson2() {
        logger.info("getJson2");
        return "<p>json</p>";
    }

    @GetMapping("/user")
    public String greetingDefault() {
        logger.info("greetingDefault()");
        return "<>greetings</p>";
    }

    @GetMapping("/user/{name}")
    public String withNameGreeting(@PathVariable String name) {
        logger.info("withNameGreeting(@PathVariable String name)");
        String result = "<p>dupa: " + name + " </p>";
        return result;
    }

    @GetMapping("/user2")
    public String greetings2(@RequestParam String name) {
        logger.info("greetings2(@RequestParam String name)");
        String result = "<p>greetings2: " + name + " </p>";
        return result;
    }

}
