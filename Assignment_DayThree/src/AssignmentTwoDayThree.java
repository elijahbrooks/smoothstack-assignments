import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author elijahbrooks
 */
public class AssignmentTwoDayThree {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AssignmentTwoDayThree newObject = new AssignmentTwoDayThree();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the file you wish to write to: ");
        File file = new File(scan.nextLine().trim());

        System.out.print("Input text to append: ");
        String text = scan.nextLine();

        try {
            newObject.appendToFile(file, text);
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    /**
     *
     * @param file File object made from user input
     * @param text text to be appended to file
     * @throws IOException
     */
    public void appendToFile(File file, String text) throws IOException {
        BufferedWriter writer = null;

        if (file.createNewFile())
            System.out.println("File not found, creating new one.");

        FileWriter fileWrite = new FileWriter(file, true);
        writer = new BufferedWriter(fileWrite);

        writer.write(text);
        writer.newLine();
        writer.flush();

        if(writer != null){
            writer.close();
        }

        System.out.println("Successfully appended text.");
    }
}
