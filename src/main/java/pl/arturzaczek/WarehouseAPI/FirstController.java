package pl.arturzaczek.WarehouseAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("home")
public class FirstController {
    @GetMapping
    public String getHome(){
        return "<b>home</b>";
    }
}
