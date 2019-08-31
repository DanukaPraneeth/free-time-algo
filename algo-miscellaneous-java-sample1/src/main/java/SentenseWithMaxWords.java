public class SentenseWithMaxWords {

    public int getMaxWordCountInSentense(String input) {

        // This method will return the count of maximum words of a sentence in a given set of sentences

        // Split the string into sentences by . ? !
        String[] strs = input.split("[.\\?\\!]");

        int count = 0;

        System.out.println("Number of sentences:"+strs.length);

        for (int i=0; i < strs.length; i++) {

            System.out.println("Sub sentence["+i+"]:"+strs[i]);

            int c = strs[i].trim().split("\\s+").length;

            if(c > count)
                count = c;

        }

        return count;
    }

}
