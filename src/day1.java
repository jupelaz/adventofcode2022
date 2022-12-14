import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day1 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("./resources/day1.input");
        Scanner myReader = new Scanner(myObj);
        int current = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if ("".equals(data)) {
                list.add(current);
                current = 0;
            }
            else {
                current += Integer.parseInt(data);
            }
        }
        list.sort(Collections.reverseOrder());
        System.out.println(list.get(0) + list.get(1) + list.get(2));
        myReader.close();
    }
}
