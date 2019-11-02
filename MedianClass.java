import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // Import for collection class


public class MedianClass{

     public static void main(String []args){
         
        ArrayList<Integer> evenNums = getRandomList(20);
        ArrayList<Integer> oddNums =  getRandomList(19);
        
        System.out.println("Inputs");
        System.out.println("Even List: " + evenNums.toString());
        System.out.println("Odd List: " + oddNums.toString());
        
        System.out.println("");
        System.out.println("Outputs");
        System.out.println("median Even List: " + getMedianEvenList(evenNums));
        System.out.println("median Odd List: " + getMedianOddList(oddNums));
     }
     
     
     // Function that return a list of random numbers
     // elements is a total of element that you want in the lists
     public static  ArrayList<Integer>  getRandomList(int elements)
     {
        ArrayList<Integer>  list = new ArrayList<Integer>();
        for(int i = 0; i < elements ; i++)
        {
            list.add(getRandomIntNumber());
        }
        return list;
     }
     
     
     public static double getMedianEvenList(ArrayList<Integer> evenNums)
     {
         /*
          For example List: [8,4,9,1] (Size: 4 Elements)
          You must sort to the list: [1,4,8,9]
          Then Found the middle off array -> size/2 -> 4 / 2 = 2
          Then you must found middleUpper -> List[middle] -> List[2] = 8
          Then you must found middleLower-> List[middle-1] -> List[1] = 4
          Then you must found average of middles values -> (middleUpper + middleLower) / 2 -> (4+8) / 2 = 6
         */
         int middle = evenNums.size() / 2;
         
         // sort list
         Collections.sort(evenNums);
         System.out.println("Sort Even List: " + evenNums.toString());
         
         // Get miiddles values
         double middleUpper = evenNums.get(middle);
         double middleLower = evenNums.get(middle-1);

        // Get median 
        return (middleUpper + middleLower) / 2;
     }
     
     public static int getMedianOddList(ArrayList<Integer> oddNums)
     {
        /*
          For example List: [8,4,9,1,5] (Size: 5 Elements)
          You must sort list: [1, 4, 5, 8, 9]
          You found the middle: (int) list.size()/2  -> (int)5/2 = (int)2.5 = 2
          You must found the middle value = list.get(middle) = list.get(2) = 5
         */
          int middle = oddNums.size() / 2;
          
          Collections.sort(oddNums);
          System.out.println("Sort odd List: " + oddNums.toString());
          
          return oddNums.get(middle);
     }
     
    
     
     // Function that return random Integer number
     public static int getRandomIntNumber()
     {
         return (int)(Math.random()*100);
     }
}
