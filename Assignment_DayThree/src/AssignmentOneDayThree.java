import java.io.File;
import java.util.Scanner;

/**
 * @author elijahbrooks
 */
public class AssignmentOneDayThree {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AssignmentOneDayThree newObject = new AssignmentOneDayThree();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a directory to parse: ");

        try {
            File directory = new File(scan.nextLine().trim());
            newObject.parseDirectory(directory);
        }catch(Exception e){
            System.out.println("Invalid directory.");
        }

    }

    /**
     *
     * @param directory File object made from user input. Assumed to be a directory
     */
    public void parseDirectory(File directory){
        File[] fileList = directory.listFiles();
        for (File file : fileList){
            System.out.println(file);
            if(file.listFiles() != null)
                parseDirectory(file);
        }
    }
}
