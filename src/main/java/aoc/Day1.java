package src.main.java.aoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Day1 {
    public static void main(String[] args) {
        Day1 d1 = new Day1();
        System.out.println(d1.part1());
        System.out.println(d1.part2());
    }

    public Integer part1() {
        ArrayList<Integer> calories = new ArrayList<>();
        String line = "";
        Integer lineInt = 0;
        Integer elf = 0;
        try (FileReader fr = new FileReader("input/Day1.csv");
            BufferedReader br = new BufferedReader(fr)) {
            while (br.ready()) {
                line = br.readLine();
                line.trim();
                if (line.isEmpty()) {
                    calories.add(elf);
                    elf = 0;
                    
                } else {
                    lineInt = Integer.valueOf(line);
                    elf += lineInt;
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(calories,Collections.reverseOrder());
        return calories.get(0);
}

    public Integer part2() {
        ArrayList<Integer> calories = new ArrayList<>();
        String line = "";
        Integer lineInt = 0;
        Integer elf = 0;
        Integer topCalories = 0;
        try (FileReader fr = new FileReader("input/Day1.csv");
        BufferedReader br = new BufferedReader(fr)) {
        while (br.ready()) {
            line = br.readLine();
            line.trim();
            if (line.isEmpty()) {
                calories.add(elf);
                elf = 0;
                
            } else {
                lineInt = Integer.valueOf(line);
                elf += lineInt;
            }
            
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    Collections.sort(calories,Collections.reverseOrder());
    topCalories = calories.get(0) + calories.get(1) + calories.get(2);
    return topCalories;
    }
}
