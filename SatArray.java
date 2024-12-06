import java.io.*;
import java.util.Scanner; 
public class SatArray{ 
    public static void main(String[] args) throws IOException{
        int[] math, reading, total; 
        int x; 

        Scanner inputFile = new Scanner(new File("list.txt")); 
        x = inputFile.nextInt(); 
        math = new int[x]; 
        reading = new int[x]; 
        total = new int[x];
        readSatscores(inputFile, math, reading, x); 
        inputFile.close(); 
        sumScores(math, reading, total); 
        PrintWriter outputFile = new PrintWriter("output.txt"); 
        printOutput(outputFile, math, reading, total); 
        outputFile.close(); 
    } 
    public static void readSatscores(Scanner inputFile, int[] math, int[] reading, int i){ 
        for (int x = 0; i < x; i++){ 
            math[i] = inputFile.nextInt(); 
            reading[i] = inputFile.nextInt(); 



        }
    } 
    public static void sumScores(int[] math, int[] reading, int[] total) {
        for (int i = 0; i < math.length; i++){ 
            total[i] = math[i] + reading[i];
        }
    } 
    public static void printOutput(PrintWriter outputFile, int[] mathScores, int[] readingScores, int[] totalScores) {
        outputFile.println("Math      Reading   Total     MaxArea");
        for( int i = 0; i < math.length; i++){ 
            String area; 
            if (math[i] > reading[i]){ 
                area = "math"; 
            } else if (reading[i] > math[i]){ 
                area = "reading"; 
            }else { 
                area = "math/reading"; 
            } 
            String line = mathScores[i] + "      " + 
            readingScores[i] + "      " + 
            totalScores[i] + "      " + 
            area; 
            outputFile.println(line); 
            }
            } 
            
        } 
        public static void print(int [] arr){ 
            for( int value : arr){ 
                System.out.println(value);
            }
        }

        
    }