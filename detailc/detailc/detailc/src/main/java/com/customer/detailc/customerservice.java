package com.customer.detailc;

import java.util.List;

public interface customerservice {
    public String createcustomerdetails(customerdetails det);
    public String updatecustomerdetails(customerdetails det);
    public String deletecustomerdetails(String customerId);
    public customerdetails getdetails(String customerId);
    public List<customerdetails> getalldetails();
    public List<customerdetails> getalldetails(String customerId);
    // public studentdetails getstudentdetails(String id);
    
}
