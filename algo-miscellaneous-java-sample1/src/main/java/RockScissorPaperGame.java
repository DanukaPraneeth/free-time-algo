public class RockScissorPaperGame {

    public int getMaximumScore(String input) {

        // This method will return the maximum posible score for a given input sample with the sample gesture for all inputs
        // 2 points per win, 1 point per draw, 0 points per loss
        // Question link - https://drive.google.com/file/d/1kkdqcKAxU2LZkKf_yg5t4EAxEr3b95JJ/view?usp=sharing
        //               - https://drive.google.com/file/d/16snTiZDAd3JPg2G30snwcBa43FhJzkkC/view?usp=sharing


        // first get the count of characters R, S, P  in the input string
        int nR = (int) input.chars().filter(num -> num == 'R').count();
        int nS = (int) input.chars().filter(num -> num == 'S').count();
        int nP = (int) input.chars().filter(num -> num == 'P').count();

        int scoreForConstantR, scoreForConstantS, scoreForConstantP;
        scoreForConstantR = 2 * nS + nR;
        scoreForConstantP = 2 * nR + nP;
        scoreForConstantS = 2 * nP + nS;

        return (Math.max(Math.max(scoreForConstantR, scoreForConstantP), scoreForConstantS));
    }
}
