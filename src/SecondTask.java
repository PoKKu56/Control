import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SecondTask {
    public static void main(String[] args) {
        String fileName = ""; // Указать путь к файлу
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Collections.sort(lines);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}