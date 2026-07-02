import java.io.FileWriter;
import java.util.Scanner;
void main() throws IOException {
    LocalDateTime date=LocalDateTime.now();
    DateTimeFormatter obj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
    String dt=date.format(obj);

    s j=new s();
    Students s1=new Students(101,"Ajay",89,j);
    Students s2=new Students(102,"Vijay",79,j);
    Students s3=new Students(103,"Ajay",39,j);
    Students s4=new Students(104,"Jay",88,j);
    Students s5=new Students(105,"Arun",89,j);

    boolean isAppend=false;
    int x=1;
    String filepath="/Users/vikasbm/Library/Mobile Documents/com~apple~CloudDocs/user1.txt";
    ArrayList<String> lines=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

//    try (BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/vikasbm/Library/Mobile Documents/com~apple~CloudDocs/user1.txt"))){
//        for(Students stu: j.students){
//            writer.write("ID: "+stu.getID()+" | Name: "+stu.getName()+" | Marks: "+stu.getMarks());
//            writer.newLine();
//        }
//        writer.write("this file is written on "+dt);
//        writer.newLine();
//    }catch (FileNotFoundException e){
//        System.out.println("File not found!");
//    }catch (IOException e){
//        System.out.println("Something went wrong");
//    }
    System.out.print("enter the ID: " );
    String id=sc.next();
    System.out.print("Enter the marks you want to edit: ");
    String mark=sc.next();
    String[] words;
    String newLine="";
    try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
        String line;
        while ((line=reader.readLine())!=null){

            if(line.contains("ID: "+id+" ")){
                if(line.contains("Marks: ")){
                    words=line.split("\\s+");
                    words[words.length-1]=mark;
                    for (String word:words){
                        newLine+=word+" ";
                    }
                    lines.add(newLine);
                }

            }else {
                lines.add(line);
            }
        }

    }catch (FileNotFoundException e){
        System.out.println("File not found!");
    }catch (IOException e){
        System.out.println("Something went wrong");
    }
    try(BufferedWriter writer=new BufferedWriter(new FileWriter(filepath,false))){
        for (String lin:lines){
            writer.write(lin);
            writer.newLine();
        }
        writer.write("this file is edited on "+ dt);
    }catch (FileNotFoundException e){
        System.out.println("File not found!");
    }catch (IOException e){
        System.out.println("Something went wrong");
    }
}