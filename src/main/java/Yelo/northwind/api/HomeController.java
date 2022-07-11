package Yelo.northwind.api;

import Yelo.northwind.core.utilities.results.DataResult;
import Yelo.northwind.core.utilities.results.SuccessDataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
    @GetMapping("/")
    public DataResult<String> getHome() {
        return new SuccessDataResult<>("Successfully signed in", "Welcome to Home Page");
    }
}
