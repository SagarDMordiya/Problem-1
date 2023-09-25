
import java.util.HashSet;

public class Problem {
    
    public static void main(String[] args){

        int[] input = new int[] {1, 9, 3, 10, 4, 20, 2};

        System.out.println(findLongestConsecutiveSequence(input));

    }

    private static int findLongestConsecutiveSequence(int[] input) {
        int len = input.length;
        if(len == 0) return 0;
        else if(len == 1) return 1;
        HashSet<Integer> inputHash = new HashSet<Integer>();
        
        for(int i : input){
            inputHash.add(i);
        }
        int result = 0;
        for(int i = 0; i < len; i ++){
            if(inputHash.contains(input[i] - 1) == false){
                int currElement = input[i];
                int currResult = 1;

                while(inputHash.contains(currElement + 1)){
                    currResult++;
                    currElement = currElement + 1;
                }
                result = Math.max(result, currResult);
            }
            
        }
        return result;
    }

    
    
    
}
