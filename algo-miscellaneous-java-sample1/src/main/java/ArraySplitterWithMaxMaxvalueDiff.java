public class ArraySplitterWithMaxMaxvalueDiff {

    // This method will split the array into 2 blocks such that abs. diff of max values is highest
    // Question link -
    //  https://drive.google.com/file/d/1Dvn0C_ezoycCBeDsk6nP00VUXCpY7sTJ/view?usp=sharing
    //  https://drive.google.com/file/d/1aynkLcKAOHHc5cffNPTgVzTejnhY2-FD/view?usp=sharing
    //  https://drive.google.com/file/d/1oVtPLPhPnk8SATFOoX3jW0hC0kYpmHDE/view?usp=sharing

    public int getMaxMaxValueDiff(int[] A){
        int max = A[0];

        for (int i =0; i < A.length; i++){
            if(max < A[i])
                max = A[i];

        }
        return max - Math.min(A[0], A[A.length -1]);
    }
}
