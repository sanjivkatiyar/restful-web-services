package com.in28minutes.rest.webservices.restfulwebservices.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getPersonVersion1ByURI(){
        return new PersonV1("Sanjiv Katiyar");
    }

    @GetMapping("/v2/person")
    public PersonV2 getPersonVersion2ByURI(){
        return new PersonV2(new Name("Sanjiv", "Katiyar"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getPersonVersion1ByRequestParam(){
        return new PersonV1("Sanjiv Katiyar");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getPersonVersion2ByRequestParam(){
        return new PersonV2(new Name("Sanjiv", "Katiyar"));
    }

    @GetMapping(path = "/person", headers = "X-API-VERSION=1")
    public PersonV1 getPersonVersion1ByRequestHeader(){
        return new PersonV1("Sanjiv Katiyar");
    }

    @GetMapping(path = "/person", headers = "X-API-VERSION=2")
    public PersonV2 getPersonVersion2ByRequestHeader(){
        return new PersonV2(new Name("Sanjiv", "Katiyar"));
    }
}
