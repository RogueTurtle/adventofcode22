package aoc;

import java.io.BufferedReader;
import java.io.FileReader;

public class Day2 {
    public static void main(String[] args) {
        Day2 d2 = new Day2();
        System.out.println(d2.part1());
    }

    public Integer part1() {
        /*
         * A = X = Rock = 1
         * B = Y = Paper = 2
         * C = Z = Scissors = 3
         * Win = 6
         * Draw = 3
         * Loss = 0
         */
        String line = "";
        String[] input;
        String opp = "";
        String friend = "";
        Integer score = 0;
        try (FileReader fr = new FileReader("input/Day2.csv");
        BufferedReader br =new BufferedReader(fr)) {
            while (br.ready()) {
                line = br.readLine();
                input = line.split(" ");
                opp = input[0];
                friend = input[1];

                if (opp.equals("A")) { //Rock
                    if (friend.equals("X")) { //Rock
                        score += 4;
                    } else if (friend.equals("Y")) { //Paper
                        score += 8;
                    } else if (friend.equals("Z")) {//Scissors
                        score += 3;
                    }
                } else if (opp.equals("B")) { //Paper
                    if (friend.equals("X")) {//Rock
                        score += 1;
                    } else if (friend.equals("Y")) {//Paper
                        score += 5;
                    } else if (friend.equals("Z")) {//Scissors
                        score += 9;
                    } 
                } else if (opp.equals("C")) {//Scissors
                    if (friend.equals("X")) {//Rock
                        score += 7;
                    } else if (friend.equals("Y")) {//Paper
                        score += 2;
                    } else if (friend.equals("Z")) {//Scissors
                        score += 6;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return score;
    }
}
