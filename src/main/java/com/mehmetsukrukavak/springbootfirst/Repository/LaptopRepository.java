package com.mehmetsukrukavak.springbootfirst.Repository;

import com.mehmetsukrukavak.springbootfirst.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Laptop saved");
    }
}
