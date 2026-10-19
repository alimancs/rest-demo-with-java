package com.cloudvendor.rest_demo_with_java.controller;

import com.cloudvender.rest_demo_with_java.model.CloudVendor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class CloudApiService {
    
    CloudVendor vendor;

    @GetMapping("{id}")
    public CloudVendor getVendor(String id) {
        return vendor;
    }

    @PostMapping
    public String createVendor(@RequestBody CloudVendor newVendor) {
        this.vendor = newVendor;
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateVendor(@RequestBody CloudVendor updateVendor) {
        this.vendor = updateVendor;
         return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteVendor(String id) {
        this.vendor = null;
        return "Cloud vendor deleted successfully";
    }
}