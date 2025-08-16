package inc.sims.hustles.SpringBootDemo.service;

import inc.sims.hustles.SpringBootDemo.models.Programmer;
import inc.sims.hustles.SpringBootDemo.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrammerService {

    @Autowired
    ProgrammerRepository programmerRepository;

    public void addProgrammer(Programmer programmer){
        programmerRepository.saveProgrammer(programmer);
    }

    public void removeProgrammer(Programmer programmer){
        System.out.println(programmerRepository.deleteProgrammer(programmer));
    }
}
