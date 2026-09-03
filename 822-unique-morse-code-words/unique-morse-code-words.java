import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            String transformation = "";

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                transformation += morse[index];
            }

            set.add(transformation);
        }

        return set.size();
    }
}