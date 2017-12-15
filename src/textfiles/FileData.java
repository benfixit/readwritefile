package textfiles;

import java.io.IOException;

public class FileData {
    public static void main(String[] args) throws IOException {
        //READ FROM A FILE
        String fileName = "/var/www/html/opensource/file/free.txt";

        try {
            ReadFile file = new ReadFile(fileName);
            String[] arLines = file.openFile();

            int i;
            for ( i=0; i < arLines.length; i++ ) {
                System.out.println( arLines[ i ] ) ;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //WRITE TO A FILE
        try {
            WriteFile data = new WriteFile(fileName, true);
            data.writeToFile("This is another line of text");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
