package aoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Day3 {
    String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    public static void main(String[] args) {
        Day3 d3 = new Day3();
        System.out.println(d3.part1());
        System.out.println(d3.part2());
    }

    public Integer part1() {
        Integer output = 0;
        String line = "";
        String commonChar = "";
        
        try (FileReader fr = new FileReader("input/Day3.csv"); BufferedReader br = new BufferedReader(fr)) {
            while (br.ready()) {
                line = br.readLine();
                Integer length = line.length() /2;
                String[] halves = {line.substring(0,length), line.substring(length)};
                commonChar = findCommonChars(halves[0], halves[1]);
                output += Arrays.asList(chars).indexOf(commonChar) + 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
    public String findCommonChars(String a, String b) {
        StringBuilder resultBuilder = new StringBuilder();
        Set<Character> charsMap = new HashSet<Character>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i); //a and b are the two words given by the user
             if (b.indexOf(ch) != -1){
                 charsMap.add(Character.valueOf(ch));
             }
        }

        Iterator<Character> charsIterator = charsMap.iterator();
        while(charsIterator.hasNext()) {
            resultBuilder.append(charsIterator.next().charValue());
        }
        return resultBuilder.toString();
    }

    public String findCommonChars(String a, String b, String c) {
        StringBuilder resultBuilder = new StringBuilder();
        Set<Character> charsMap = new HashSet<Character>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i); //a and b are the two words given by the user
             if (b.indexOf(ch) != -1 && c.indexOf(ch) != -1){
                 charsMap.add(Character.valueOf(ch));
             }
        }

        Iterator<Character> charsIterator = charsMap.iterator();
        while(charsIterator.hasNext()) {
            resultBuilder.append(charsIterator.next().charValue());
        }
        return resultBuilder.toString();
    }

public Integer part2() {
    Integer output = 0;
    String line1 = "";
    String line2 = "";
    String line3 = "";
    String commonChar = "";
    
    try (FileReader fr = new FileReader("input/Day3.csv"); BufferedReader br = new BufferedReader(fr)) {
        while (br.ready()) {
            line1 = br.readLine();
            line2 = br.readLine();
            line3 = br.readLine();
            String[] lines = {line1,line2,line3};
            commonChar = findCommonChars(line1, line2, line3);
            output += Arrays.asList(chars).indexOf(commonChar) + 1;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return output;
}
}