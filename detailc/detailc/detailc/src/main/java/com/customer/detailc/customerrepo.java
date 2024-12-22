package com.customer.detailc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface customerrepo extends JpaRepository<customerdetails,String> {
   
}
