import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class WordCountReg {
    public static void main( String[] args) {
        try {
            wordCount();
        }
        catch (Exception e){
        }
    }
    public static void wordCount() throws Exception {
        Long start = System.currentTimeMillis();
        HashMap<String, Integer> map = new HashMap<>();
        String word;
        int count;
        String[] arr;

        File file1 = new File("/Users/ceh1214/Desktop/Fall 2019/Cloud Computing/HW 3/test1.txt");
        Scanner s = new Scanner(file1);

        while (s.hasNextLine()){
            word = s.nextLine();
            arr = word.split(" ");
            for (String a : arr) {
                if(map.containsKey(a)) {
                    count = map.get(a);
                    map.replace(a, count+1);
                }
                else {
                    map.put(a, 1);
                }
            }
        }
        s.close();

        File file2 = new File("/Users/ceh1214/Desktop/Fall 2019/Cloud Computing/HW 3/test2.txt");
        s = new Scanner(file2);

        while (s.hasNextLine()) {
            word = s.nextLine();
            arr = word.split(" ");
            for (String a : arr) {
                if(map.containsKey(a)) {
                    count = map.get(a);
                    map.replace(a, count+1);
                }
                else {
                    map.put(a, 1);
                }
            }
        }
        s.close();

        File file3 = new File("/Users/ceh1214/Desktop/Fall 2019/Cloud Computing/HW 3/test3.txt");
        s = new Scanner(file3);

        while (s.hasNextLine()) {
            word = s.nextLine();
            arr = word.split(" ");
            for (String a : arr) {
                if(map.containsKey(a)) {
                    count = map.get(a);
                    map.replace(a, count+1);
                }
                else {
                    map.put(a, 1);
                }
            }
        }
        s.close();
        Long end = System.currentTimeMillis();
        File f = new File("/Users/ceh1214/Desktop/Fall 2019/Cloud Computing/HW 3/output.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
//            System.out.println(key + "  " + value);
            String toWrite = key + "  " + value + "\n";
            bw.write(toWrite);
        }
        bw.write("Time in ms: "+ (end-start));
        bw.close();
        fw.close();
    }
}