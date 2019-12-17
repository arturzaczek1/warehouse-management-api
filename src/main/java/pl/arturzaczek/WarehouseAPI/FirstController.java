package pl.arturzaczek.WarehouseAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("home")
public class FirstController {
    static final String test = "default test";
    static final Logger logger = LoggerFactory.getLogger(FirstRestController.class);


    @GetMapping
    public String getHome(){
        logger.info("info logger from home {}", test);
        logger.debug("debug logger from home{}", test);
        logger.error("error logger from home{}", test);
        logger.warn("warn logger from home{}", test);
        return "<b>home</b>";
    }
}
