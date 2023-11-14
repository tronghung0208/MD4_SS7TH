package com.example.ss7_th.service;
import com.example.ss7_th.model.Customers;
import java.util.List;
public interface ICustomersService {
    List<Customers> findAll();
    void save(Customers customers);
    Customers findById(int id) ;
    void update(int id , Customers customers);
    void remove(int id) ;
}

