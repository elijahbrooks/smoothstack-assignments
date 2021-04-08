import java.io.File;
import java.util.Scanner;

public class AssignmentOneDayThree {
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

    public void parseDirectory(File directory){
        File[] fileList = directory.listFiles();
        for (File file : fileList){
            System.out.println(file);
            if(file.listFiles() != null)
                parseDirectory(file);
        }
    }
}
