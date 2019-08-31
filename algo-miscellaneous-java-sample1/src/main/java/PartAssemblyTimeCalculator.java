import java.util.Collections;
import java.util.List;

public class PartAssemblyTimeCalculator {

    public int getMinimumAssemblyTime (int numOfParts, List<Integer> parts){

        /**
         *
         * This is the sample problem.
         *      hours consumed for each of a per set of parts;   Sample input list = [6, 4, 8, 12]
         *      minimum time required = 10 + minTime[8, 10, 12] -> 10 + 18 + minTime[12, 18] -> 10 + 18 + 30 = 58
         *
         *  Solution :
         *      When I re-arraged minimumTime calculation in descending order= 30 + 18 +10
         *
         *      Sorted list = [4, 6, 8, 12]
         *      Sum of numbers in the list = 30
         *
         *      minimumTime = 30 + (30-12) + (30-12-8)
         *
         */

        // Sort the 'parts' list in ascending order
        Collections.sort(parts);

        int temporarySum =0;        // this is a temporary variable to store a intermediate integer value
        long minimumTime = 0;             // this is the variable to store the total minimum time

        // Get the sum of values in list
        for(Integer i: parts)
            temporarySum = temporarySum + i;


        minimumTime = minimumTime + temporarySum;

        // Iterate through the list to calculate minimum time

        for(int i=numOfParts-1; i > 1; i--){
            temporarySum -= parts.get(i);
            minimumTime += temporarySum;

        }

        return Math.toIntExact(minimumTime);
    }


}
