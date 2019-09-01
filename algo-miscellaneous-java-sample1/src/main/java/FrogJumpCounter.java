public class FrogJumpCounter {

    // This method will return the minimum number of jumps for a frog starting from X to Y with jump distance D
    // Question link -         https://codility.com/demo/take-sample-test/frog_jmp


    public int getMinJumps(int X, int Y, int D){
        if (X > Y || D == 0)
            throw new IllegalArgumentException("Invalid inputs");

        int result = (Y - X) % D;
        return result == 0 ? (Y - X) / D :(Y - X - result) / D + 1 ;
    }
}
