import java.util.*; 
import java.util.Scanner;



public class BCS345hw2 {
    
    static HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>(); 
  
    static int getNumOccurrences(int x) 
    { 
        if (hm.containsKey(x)) 
            return hm.get(x); 
        return 0; 
    } 
    
    public static void main(String[] args) 
    {
        int SIDES = 6;
        Scanner s = new Scanner(System.in);
        
        System.out.print("How many times would you like to roll: ");
        int numRolls = s.nextInt();
        int [] allRolls = new int[numRolls];
        int [] numOccurrences = new int[SIDES];
        double [] frequencyOfNums = new double[SIDES];
        
        for(int i=0;i<numRolls;i++)
        {
            int roll = (int)(Math.random() * SIDES)+1;
            allRolls[i] = roll;
            if (hm.containsKey(allRolls[i]) ) 
                hm.put(allRolls[i], hm.get(allRolls[i]) + 1); 
            else hm.put(allRolls[i] , 1); 
        }
        
        System.out.printf("%-13s%-24s%s\n","Face Value","Number Of Occurrences","Frequency");
        for(int i=0; i < SIDES;i++)
        {
            numOccurrences[i] = getNumOccurrences(i+1);
            frequencyOfNums[i] = ((double)numOccurrences[i])/(int)numRolls;
            String freq = String.format("%.6f", frequencyOfNums[i]);
            System.out.printf("%5d%18d%22s\n",(i+1),numOccurrences[i],freq);
        
        }
        
    }
    
}
