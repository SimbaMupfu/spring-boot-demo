package inc.sims.hustles.SpringBootDemo.repository;

import inc.sims.hustles.SpringBootDemo.models.Programmer;
import org.springframework.stereotype.Repository;

@Repository
public class ProgrammerRepository {

    public void saveProgrammer(Programmer programmer){
        System.out.println("Programmer save!");
    }

    public boolean deleteProgrammer(Programmer programmer){
        return false;
    }
}
