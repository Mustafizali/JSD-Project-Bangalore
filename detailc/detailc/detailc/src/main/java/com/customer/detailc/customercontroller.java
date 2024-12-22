package com.customer.detailc;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detailc")
public class customercontroller {
    customerservice service;
        

    public customercontroller(customerservice service) {
        this.service = service;
    }
    @GetMapping("{customerId}")
    public customerdetails getdetails(@PathVariable("customerId") String customerId){
        return service.getdetails(customerId);
       
    }
    @PostMapping
    public String createcustomerdetails(@RequestBody customerdetails det){
        //this.det=det;
        service.createcustomerdetails(det);
        return "created successfully";
    }
    @PutMapping
     public String updatecustomerdetails(@RequestBody customerdetails det){
        //this.det=det;
        service.updatecustomerdetails(det);
        return "updated successfully";
     }
    @DeleteMapping("{customerId}")
         public String deletecustomerdetails(@PathVariable("customerId") String customerId){
        //this.det=det;
        service.deletecustomerdetails("customerId");
        return "deleted successfully";
     }
     @GetMapping()
     public List<customerdetails> getalldetails(){
      return service.getalldetails();
      
     }
    }

