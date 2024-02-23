package co.in.srdt.demo.resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoResource {

    @GetMapping("/getHelloWorld")
    public String getHelloWorld(){
        return "Hello World";
    }
}
