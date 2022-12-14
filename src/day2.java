import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("./resources/day2.input");
        Scanner myReader = new Scanner(myObj);
        int result = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            if ("A X".equals(data)){
                //Rock vs Scissors
                result = result + 3;
            }
            if ("A Y".equals(data)){
                //Rock vs Rock
                result = result + 1 + 3;
            }
            if ("A Z".equals(data)){
                //Rock vs Paper
                result = result + 2 + 6;
            }
            if ("B X".equals(data)){
                //Paper vs Rock
                result = result + 1;
            }
            if ("B Y".equals(data)){
                //Paper vs Paper
                result = result + 2 + 3;
            }
            if ("B Z".equals(data)){
                //Paper vs Scissors
                result = result + 3 + 6;
            }
            if ("C X".equals(data)){
                //Scissors vs Paper
                result = result + 2;
            }
            if ("C Y".equals(data)){
                //Scissors vs Scissors
                result = result + 3 + 3;
            }
            if ("C Z".equals(data)){
                //Scissors vs Rock
                result = result + 1 + 6;
            }
            System.out.println(result);
        }
        System.out.println(result);
        myReader.close();
    }
}
