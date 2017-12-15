package textfiles;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;

    public ReadFile(String filePath){
        path = filePath;
    }

    public String[] openFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        for(int i = 0; i < numberOfLines; i++){
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }

    private int readLines() throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        String aLine;
        int numberOfLines = 0;

        while ((aLine = textReader.readLine()) != null){
            numberOfLines++;
        }

        textReader.close();
        return numberOfLines;
    }
}
