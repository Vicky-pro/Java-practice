void main(){
    whole_data m=new whole_data();
    Company company=new Company(m);
    Employee emp = new Employee("vikas",21,234,company);
    Employee emp2 = new Employee("vikas",21,235,company);
    Employee emp3 = new Employee("vikas",21,236,company);


    Company company1=new Company(m);
    Employee emp4 = new Employee("vilas",21,234,company1);
    Employee emp5= new Employee("vilas",21,235,company1);
    Employee emp6 = new Employee("vilas",21,236,company1);
    company.fireEmployee(company,235);
    company.display();
    System.out.println("------");
    company.hireEmployee("Ashish",20,235,company,emp2);
    company.display();
    System.out.println("______");
}


