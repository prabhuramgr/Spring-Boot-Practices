package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    private CountryServiceClient countryServiceClient;

    public String allCountries()
    {
        String countries = countryServiceClient.getCountries();

        return countries;
    }

    @RequestMapping(value="/chumma2")
    public String feignSuccess() {
        return allCountries();
    }
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/chumma")
    public String index2() {
        return "Greetings from chumma!";
    }
    
}
