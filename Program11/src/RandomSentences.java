//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/22/2024 02:34 pm
//      Assignment Completion : 05/22/2024 11:14 pm
// Total Hours for Assignment : 3 hours
//                   Comments : One thing I would do different in this program is to use the method concat from String
//                              class to concatenate the words from the article, noun, verb, preposition arrays in
//                              sentences array.

import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time
import java.security.SecureRandom;         //Import SecureRandom class

public class RandomSentences {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();    //Create SecureRandom object randomNumbers

        //String arrays initializing to serve as words on the sentences
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        String[] sentences = new String[20];    //Create an array of Strings to serve as sentences

        //Loop 20 times to concatenate randomly words from the arrays initialized to each String in the array sentences
        for(int i = 0; i < 20; i++){
            sentences[i] = article[randomNumbers.nextInt(article.length)] + " " +
                           noun[randomNumbers.nextInt(noun.length)] + " " + verb[randomNumbers.nextInt(verb.length)] +
                           " " + preposition[randomNumbers.nextInt(preposition.length)] + " " +
                           article[randomNumbers.nextInt(article.length)] + " " +
                           noun[randomNumbers.nextInt(noun.length)] + ".";

            //Print sentence by capitalizing the first character of the String
            System.out.println(sentences[i].substring(0, 1).toUpperCase() + sentences[i].substring(1));
        }

        //Goodbye message
        System.out.println("\nThank you for using the Random Sentences application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0);
    }
}