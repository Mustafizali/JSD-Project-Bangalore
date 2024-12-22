package com.customer.detailc;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class customerimle implements customerservice {
    public customerrepo repo;

public customerimle(customerrepo repo) {
    this.repo = repo;
    }
    
    @Override
    public String createcustomerdetails(customerdetails det) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'createstudentdetails'");
         repo.save(det);
         return "success";
    }
    
    @Override
    public String updatecustomerdetails(customerdetails det) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updatestudentdetails'");
         repo.save(det);
         return "updated";
    }
    
    @Override
    public String deletecustomerdetails(String customerId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deletestudentdetails'");
         repo.deleteById(customerId);
         return "deleted";
    }
    
    @Override
    public customerdetails getdetails(String customerId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getstudentdetails'");
        return repo.findById(customerId).get();
    }
    
    @Override
    public List<customerdetails> getalldetails() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getalldetails'");
        return repo.findAll();
    
    }

    @Override
    public List<customerdetails> getalldetails(String customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getalldetails'");
    }

    


}