import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class day3 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("./resources/day3.input");
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
            final int mid = data.length() / 2; //get the middle of the String
            String[] parts = {data.substring(0, mid),data.substring(mid)};

            Set<Integer> s1 = parts[0].chars().boxed().collect(Collectors.toSet());
            Set<Integer> s2 = parts[1].chars().boxed().collect(Collectors.toSet());

            s1.retainAll(s2);

            int ascii = s1.stream().findFirst().orElse(0);
            if (ascii > 90) ascii -= 96;
            else ascii = ascii - 64 + 26;
            result += ascii;
        }
        return result;
    }

    private static int part2(Scanner myReader) {
        int result = 0;
        while (myReader.hasNextLine()) {
            String elf1 = myReader.nextLine();
            String elf2 = myReader.nextLine();
            String elf3 = myReader.nextLine();
            Set<Integer> s1 = elf1.chars().boxed().collect(Collectors.toSet());
            Set<Integer> s2 = elf2.chars().boxed().collect(Collectors.toSet());
            Set<Integer> s3 = elf3.chars().boxed().collect(Collectors.toSet());

            s1.retainAll(s2);
            s1.retainAll(s3);

            int ascii = s1.stream().findFirst().orElse(0);
            if (ascii > 90) ascii -= 96;
            else ascii = ascii - 64 + 26;
            result += ascii;
        }
        return result;
    }
}
