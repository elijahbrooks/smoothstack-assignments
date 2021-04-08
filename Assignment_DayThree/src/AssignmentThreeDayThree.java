import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author elijahbrooks
 */
public class AssignmentThreeDayThree {
    public static void main(String[] args) {
        AssignmentThreeDayThree newObject = new AssignmentThreeDayThree();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a file to check for e's: ");
        File file = new File(scan.nextLine());

        newObject.readFromFile(file);
    }

    /**
     *
     * @param file File object made from user input
     */
    public void readFromFile(File file){
        char[] charsToFind = {'e', 'E'};
        FileReader reader = null;
        try{
            reader = new FileReader(file);
            int data = reader.read();
            int count = 0;
            while(data != -1){
                for(Character c : charsToFind)
                    if(data==(int)c)
                        count++;

                data = reader.read();
            }
            System.out.println("There were "+count+" e's in this file.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally{
            try {
                reader.close();
            } catch (Exception e) {
                // Ignore
            }
        }
    }
}
