public class CityAppealCalculator {

    public int getCityAppeal(int[] A) {

        // This method will return the highest possible appeal of a trip to different cities depending on the score of the city and distance between cities
        //
        // Question link -
        // https://drive.google.com/file/d/1RsRpjdr0H7qBhjyy117bs2MgZf8ZvJmP/view?usp=sharing
        // https://drive.google.com/file/d/1QjkiDta3aN_tRKZT0piiGpkiRCnpxZbU/view?usp=sharing
        // https://drive.google.com/file/d/1NdQsyiG2gBSj7akfYXaHeIfQ1DMfPR3I/view?usp=sharing


        // Solution link -
        // https://drive.google.com/file/d/1rOcFawafCcnJyIf-zWlqWPT5ZPjIDekQ/view?usp=sharing
        // https://drive.google.com/file/d/1y4KjSeTo3AYQ-QLtaL4EoRpDxNbkYjQu/view?usp=sharing
        // https://drive.google.com/file/d/1CUPaElhIuK4AeMzGYstn74M1zInjEmZT/view?usp=sharing

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < A.length; i ++){
            max1 = Math.max(max1, (A[i] + i) );
            max2 = Math.max(max2, (A[i] - i) );
        }

        return max1 + max2;

    }

}
