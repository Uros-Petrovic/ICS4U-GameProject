import java.util.concurrent.ThreadLocalRandom;

public class WordList {

    public static final String[] wordList = new String[] {

            "strin",
            "cooli",

    };

    public static String getRandomWord() {



        int index = ThreadLocalRandom.current().nextInt(0, wordList.length);

        System.out.println(wordList[index]);

        return wordList[index];

    }

}