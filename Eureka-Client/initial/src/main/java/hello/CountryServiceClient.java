package hello;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by prrram on 3/29/17.
 */
@FeignClient(name = "country-service-client", url = "http://country.io")
public interface CountryServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/names.json")
    String getCountries();
}