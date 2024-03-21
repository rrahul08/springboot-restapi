package com.rahul.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    //uri
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionofPerson(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //requestparams
    @GetMapping(path = "/person",params = "version=1")
    public PersonV1 getFirstVersionofPersonRequestParams(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person",params = "version=2")
    public PersonV2 getSecondVersionofPersonRequestParams(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //headers
    @GetMapping(path = "/person/header",headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionofPersonHeadersv1(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping(path = "/person/header",headers = "X-API-VERSION=2")
    public PersonV2 getFirstVersionofPersonHeadersv2(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //media type
    @GetMapping(path = "/person/accept",produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionofPersonproducesv1(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/accept",produces = "application/vnd.company.app-v2+json")
    public PersonV2 getFirstVersionofPersonproducesv2(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }


}
