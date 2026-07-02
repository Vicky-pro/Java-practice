Scanner sc=new Scanner(System.in);
void main() throws IOException{
ArrayList<String>Buffer=new ArrayList<>();
//  setting username and password
    String userName;
    String password;
//    System.out.print("Enter the user name: ");
//    userName=sc.next();
//    System.out.print("Enter the password: ");
//    password=sc.next();

//    try (BufferedWriter writer= new BufferedWriter(new FileWriter(filepath,true))) {
//        writer.write(userName+" ");
//        writer.write(password);
//        writer.newLine();
//        System.out.println("Deployed the security");
//    }catch (FileNotFoundException e){
//        System.out.println("File not found");
//    }catch (IOException e){
//        System.out.println("something went wrong");
//    }
    String filepath="/Users/vikasbm/Library/Mobile Documents/com~apple~CloudDocs/text1.txt";

    //copying file content
    try (BufferedReader reader=new BufferedReader(new FileReader(filepath))){
        String line;
        while ((line=reader.readLine())!=null){
            Buffer.add(line);
        }
    }catch (FileNotFoundException e){
        System.out.println("File not found");
    }catch (IOException e){
        System.out.println("something went wrong");
    }

    //pasting content line in reverse order
    try(BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/vikasbm/Library/Mobile Documents/com~apple~CloudDocs/copy.txt"))){
        for (int i=Buffer.size()-1;i>=0;i--){
            writer.write(Buffer.get(i));
            writer.newLine();
        }
        System.out.println("Content copied successfully");
    }catch (FileNotFoundException e){
        System.out.println("File not found");
    }catch (IOException e){
        System.out.println("something went wrong");
    }
}
