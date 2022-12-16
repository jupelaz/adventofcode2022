import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class day4 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("./resources/day4.input");
        Scanner myReader = new Scanner(myObj);
        boolean part1 = false;
        int result = part1?part1(myReader):part2(myReader);
        System.out.println(result);
        myReader.close();
    }

    private static int part1(Scanner myReader) {
        int result = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            int[] intData = Arrays.stream(data.split("[,-]")).mapToInt(Integer::parseInt).toArray();
            if ((intData[0] <= intData[2] && intData[1] >= intData[3]) || (intData[0] >= intData[2] && intData[1] <= intData[3])){
                System.out.println("OVERLAP!!!");
                result = result + 1;
            }
        }
        return result;
    }

    private static int part2(Scanner myReader) {
        int result = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            int[] intData = Arrays.stream(data.split("[,-]")).mapToInt(Integer::parseInt).toArray();
            if (intData[0] < intData[2] && intData[1] >= intData[2]) {
                System.out.println("OVERLAP");
                result = result + 1;
            }
            if (intData[0] >= intData[2] && (intData[0] <= intData[3] || intData[1] < intData[3])) {
                System.out.println("OVERLAP");
                result = result + 1;
            }
        }
        return result;
    }
}
