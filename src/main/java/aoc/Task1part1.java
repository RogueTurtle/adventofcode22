package src.main.java.aoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task1part1 {
    ArrayList<Integer> calories = new ArrayList<>();
    String line = "";
    Integer lineInt = 0;
    Integer elf = 0;
    public static void main(String[] args) {
        Task1part1 t1p1 = new Task1part1();
        t1p1.part1();
    }

    public void part1() {
        try (FileReader fr = new FileReader("input/task1part1.csv");
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
        System.out.println(calories.get(0));
}}
