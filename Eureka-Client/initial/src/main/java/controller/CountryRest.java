package controller;

import hello.CountryServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prrram on 3/29/17.
 */
@RestController

public class CountryRest {

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

}
