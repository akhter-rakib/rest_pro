import com.fasterxml.jackson.databind.ObjectMapper;
import model.Student;

import java.io.File;

public class DriverClass {
    public static void main(String[] args) {

        try {
            /*Create Object Mapper Class*/
            ObjectMapper objectMapper = new ObjectMapper();
            /*Read Json File And Convert To PoJo*/
            Student student = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);
            /*Print the Result*/
            System.out.println("Student Full Name : " + student.getFirstName() + " " + student.getLastName());
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }
}
