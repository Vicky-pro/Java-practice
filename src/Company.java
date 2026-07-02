import java.util.ArrayList;

public class Company {

     ArrayList<Employee> employees;
    Company(whole_data data){
        employees = new ArrayList<>();
        data.companies.add(this);
    }
    void fireEmployee(Company company,int company_Id){
        for (Employee employee:employees){
            if(employee.company_Id==company_Id){
                company.employees.remove(employees.indexOf(employee));
                System.out.println(employee.name+" of company_id "+employee.company_Id+ " is fired!");
                break;
            }
        }

    }

    void hireEmployee(String name,int age,int company_Id,Company company,Employee emp){
        emp = new Employee(name,age,company_Id,company);
    }

    void display(){
        System.out.println("Number of employees :"+employees.size());
        for (Employee employee:employees){
            System.out.println(employee.name+" "+employee.company_Id+" "+employee.age);
        }
    }
}
