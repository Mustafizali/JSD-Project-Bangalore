package com.customer.detailc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerdetails")
public class customerdetails {
    @Id
   private String customerId;
   private String customerName;
   private String age;
   private String location;
   private String gender;
public customerdetails() {
}
public customerdetails(String customerId, String customerName, String age, String location, String gender) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.age = age;
    this.location = location;
    this.gender = gender;
}
public String getCustomerId() {
    return customerId;
}
public void setCustomerId(String customerId) {
    this.customerId = customerId;
}
public String getCustomerName() {
    return customerName;
}
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}
public String getAge() {
    return age;
}
public void setAge(String age) {
    this.age = age;
}
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
}