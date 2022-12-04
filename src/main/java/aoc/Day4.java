package aoc;

import java.io.BufferedReader;
import java.io.FileReader;

public class Day4 {
    public static void main(String[] args) {
        Day4 d4 = new Day4();
        System.out.println(d4.part1());
    }

    public Integer part1() {
        String line = "";
        String half1 = "";
        String half2 = "";
        String elf1half1 = "";
        String elf1half2 = "";
        String elf2half1 = "";
        String elf2half2 = "";
        Integer output = 0;
        try (FileReader fr = new FileReader("input/Day4.csv"); 
        BufferedReader br = new BufferedReader(fr)) {
            while (br.ready()) {
                line = br.readLine();
                half1 = line.split(",")[0];
                half2 = line.split(",")[1];
                elf1half1 = half1.split("-")[0];
                elf1half2 = half1.split("-")[1];
                elf2half1 = half2.split("-")[0];
                elf2half2 = half2.split("-")[1];
                if (Integer.parseInt(elf1half1)<= Integer.parseInt(elf2half1) && Integer.parseInt(elf1half2) >= Integer.parseInt(elf2half2)) {
                    output += 1;
                } else if (Integer.parseInt(elf1half1)>= Integer.parseInt(elf2half1) && Integer.parseInt(elf1half2) <= Integer.parseInt(elf2half2)) {
                    output += 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
}
