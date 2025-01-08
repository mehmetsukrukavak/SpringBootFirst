package com.mehmetsukrukavak.springbootfirst.service;

import com.mehmetsukrukavak.springbootfirst.Repository.LaptopRepository;
import com.mehmetsukrukavak.springbootfirst.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop) {
        System.out.println("Method Called addLaptop");
        laptopRepository.save(laptop);

    }

    public boolean isGoodForProgrammer(Laptop laptop) { return true; }
}
