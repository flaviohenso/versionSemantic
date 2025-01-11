package com.version.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * This class is a controller class that handles the request for the version of the application.
 */
@Controller
public class VersionController {

    @GetMapping("/version")
    public String getVersion() {
        String version = "Semantic Versioning App - Version 1.0.0";
        return version;
    }

}
