
public class Employee {
    String name;
    int age;
    int company_Id;


    Employee(String name,int age,int company_id,Company company){
        this.name=name;
        this.age=age;
        this.company_Id=company_id;

        company.employees.add(this);
    }


}
