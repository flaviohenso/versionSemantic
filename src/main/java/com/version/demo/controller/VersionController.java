package com.version.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VersionController {

    @GetMapping("/version")
    public String getVersion() {

        String version = "Semantic Versioning App - Version 1.0.0";

        return version;
    }

}
