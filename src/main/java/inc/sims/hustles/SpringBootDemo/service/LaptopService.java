package inc.sims.hustles.SpringBootDemo.service;

import inc.sims.hustles.SpringBootDemo.models.Laptop;
import inc.sims.hustles.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop){
        laptopRepository.saveLaptop(laptop);
    }

    public void removeLaptop(Laptop laptop){
        System.out.println("Laptop deleted: " + laptopRepository.deleteLaptop(laptop));
    }
}
