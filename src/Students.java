import java.util.ArrayList;

public class Students {
    int ID;
    String Name;
    int Marks;

    Students(int id,String name,int marks,s h){
        this.ID=id;
        this.Name=name;
        this.Marks=marks;
        h.students.add(this);
    }
    int getID(){
        return this.ID;
    }
    String getName(){
        return this.Name;
    }
    int getMarks(){
        return this.Marks;
    }

}
