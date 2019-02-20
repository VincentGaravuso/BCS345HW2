import java.util.*;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.regex.Pattern;


public class BCS345hw2 {
    
    static HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>(); 
  
    static int getNumOccurrences(int x) 
    { 
        if (hm.containsKey(x)) 
            return hm.get(x); 
        return 0; 
    } 
    
    public static void main(String[] args) throws FileNotFoundException 
    {

        //Task 1
//        
//        int SIDES = 6;
//        Scanner s = new Scanner(System.in);
//        
//        System.out.print("How many times would you like to roll: ");
//        int numRolls = s.nextInt();
//        int [] allRolls = new int[numRolls];
//        int [] numOccurrences = new int[SIDES];
//        double [] frequencyOfNums = new double[SIDES];
//        
//        for(int i=0;i<numRolls;i++)
//        {
//            int roll = (int)(Math.random() * SIDES)+1;
//            allRolls[i] = roll;
//            if (hm.containsKey(allRolls[i]) ) 
//                hm.put(allRolls[i], hm.get(allRolls[i]) + 1); 
//            else hm.put(allRolls[i] , 1); 
//        }
//        
//        System.out.printf("%-13s%-24s%s\n","Face Value","Number Of Occurrences","Frequency");
//        for(int i=0; i < SIDES;i++)
//        {
//            numOccurrences[i] = getNumOccurrences(i+1);
//            frequencyOfNums[i] = ((double)numOccurrences[i])/(int)numRolls;
//            String freq = String.format("%.6f", frequencyOfNums[i]);
//            System.out.printf("%5d%18d%22s\n",(i+1),numOccurrences[i],freq);
//        
//        }
//        
        //Task 2
        
        double[][] multiArray = new double[5][4];
        File file = 
        new File("D:\\OneDrive - Farmingdale\\BCS345\\BCS345hw2\\hw2data.txt"); 
        Scanner sc = new Scanner(file);
        sc.useDelimiter(Pattern.compile("(\\n)| "));
        int row = 0;
        int column = 0;
        while (sc.hasNext())
        {
            multiArray[row][column] = Double.valueOf(sc.next());
            
            column++;
            if(column == 4)
            {
                row++;
                column = 0;
            }
        }
        printArray(multiArray);
        double total = getTotal(multiArray);
        double rowTotal = getRowTotal(multiArray, 2);
        double columnTotal = getColumnTotal(multiArray,2);
        double highestColNum = getHighestInColumn(multiArray, 2);
        double highestRowNum = getHighestInRow(multiArray,3);
        System.out.println(total);
        System.out.println(rowTotal);
        System.out.println(columnTotal);
        System.out.println(highestColNum);
        System.out.println(highestRowNum);
    }
    public static double getHighestInColumn(double[][] x, int column)
    {
        double highestNum = x[0][column];
        for (double[] y : x) {
            if (highestNum < y[column]) {
                highestNum = y[column];
            }
        }
        return highestNum;
    }
    public static double getHighestInRow(double[][] x, int row)
    {
        double highestNum = x[row][0];
        for(int i = 0; i < x[row].length;i++)
        {
            if(highestNum < x[row][i])
            {
                highestNum = x[row][i];
            }
        }
            
        return highestNum;
        
    }
    public static double getColumnTotal(double[][] x, int column)
    {
        double total = 0;
        for (double[] y : x) {
            total += y[column];
        }
        return total;
    }    
    public static double getRowTotal(double[][] x, int row)
    {
        double total = 0;
        for(int i = 0; i < x[row].length;i++)
        {
            total += x[row][i];
        }
            
        return total;
        
    }
    public static double getTotal(double[][] x)
    {
        double total = 0;
        for (double[] y : x) {
            for (int j = 0; j < y.length; j++) {
                total += y[j];
            }
        }
        return total;
    }
    public static void printArray(double[][] x)
    {
        for (double[] y : x) {
            for (int j = 0; j < y.length; j++) {
                System.out.printf("%.02f ", y[j]);
            }
            System.out.println();
        }
    }
    
}
