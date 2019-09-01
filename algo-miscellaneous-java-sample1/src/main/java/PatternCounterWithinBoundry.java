public class PatternCounterWithinBoundry {

    // THis method will count the maximum number of matching pattern occurrence eg : !d, !w  within a boundary of two # in a given string
    // ##gh!jcsd#hb!d!bhs#gh!r   -> 2 matching patterns between #________#

    public int getNumberOfCharactersWithinEscaped(String expression) {

        int counter = 0;
        boolean isWithinBoundry = false;
        boolean isValidCount = false;


        for (Character c: expression.toCharArray()) {
            if (c.equals('#')) {
                isWithinBoundry = !isWithinBoundry;

                if(isWithinBoundry)
                    isValidCount = false;

                continue;
            }
            if(c.equals('!'))
                isValidCount = true;

            if(Character.isLowerCase(c) && isWithinBoundry && isValidCount){
                counter ++;
                isValidCount = false;
            }
        }

        return counter;


    }
}
