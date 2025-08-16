package inc.sims.hustles.SpringBootDemo.repository;

import inc.sims.hustles.SpringBootDemo.models.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void saveLaptop(Laptop laptop){
        System.out.println("Save laptop to database!");
    }

    public boolean deleteLaptop(Laptop laptop){
        return true;
    }
}
