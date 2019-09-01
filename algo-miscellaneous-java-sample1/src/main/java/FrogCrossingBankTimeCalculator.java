import java.util.HashMap;
import java.util.Map;

public class FrogCrossingBankTimeCalculator {

    // Frog needs to cross the rivers. Input array gives the position of leaves falling in consecutive times in an array.
    // It is required to find the minimum time consumed to cross the river of length "N"
    // Question link - https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/start/

    public int getMinTimeToCrossRiver(int riverLength, int[] leafPositions){

        Map<Integer, Boolean> leafAvailabilityByPosition = new HashMap<>();

        int count = 0;

        for (int i = 0; i < leafPositions.length; i++) {
            if (leafAvailabilityByPosition.get(leafPositions[i]) == null) {
                leafAvailabilityByPosition.put(leafPositions[i], true);
                count++;
            }

            if (count == riverLength) return i;
        }
        System.out.println(leafAvailabilityByPosition.size());
        return -1;

    }
}
