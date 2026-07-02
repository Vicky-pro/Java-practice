import java.io.FileInputStream;

void main() throws IOException {
    String filepath="";
    byte[] bytes=new byte[1024*8];

    FileInputStream fis=new FileInputStream(filepath);


    int data;
    while ((data= fis.read(bytes))!=-1){
        System.out.println((char)data);
    }
    fis.close();
}


