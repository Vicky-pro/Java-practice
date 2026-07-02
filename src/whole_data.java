import java.util.ArrayList;

public class whole_data {

    ArrayList<Company> companies= new ArrayList<>();

    void show(){
        for (Company company: companies){
            company.display();
            System.out.println("***********");
            System.out.println();
        }
    }
}
