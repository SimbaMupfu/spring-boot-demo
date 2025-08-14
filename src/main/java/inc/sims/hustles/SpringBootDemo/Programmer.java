package inc.sims.hustles.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Autowired
    Laptop laptop;

    public void code(){
        System.out.println("Writing code!");
        laptop.compileCode();
    }
}
