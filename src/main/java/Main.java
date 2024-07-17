import java.time.LocalDate;

import com.example.dio.app.Curso;
import com.example.dio.app.Mentoria;

public class Main {
    public static void main(String[] args) {
        Mentoria c1 = new Mentoria("Kaj", "ka", LocalDate.now());

        System.out.println(c1); 

        
    }
}
