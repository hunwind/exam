package task.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
        public static void main(String[] args) {
            List<String> sentences = new ArrayList<>();
            sentences.add("Sqlin  en yaxsi database dillerden oldugunu bilirem");
            sentences.add("Java dunyada en yaxsi dillerden biridir");
            sentences.add("Collection ve collection ferqli anlayislardir");

            Map<String, Integer> wordCounts = getWordCounts(sentences);

            for (String sentence : sentences) {
                int count = wordCounts.get(sentence);
                System.out.println("my sentence: " + sentence);
                System.out.println("Word number: " + count);
                System.out.println();
            }
        }

        public static Map<String, Integer> getWordCounts(List<String> sentences) {
            Map<String, Integer> wordCounts = new HashMap<>();

            for (String s : sentences) {
                String[] words = s.split(" ");
                wordCounts.put(s, words.length);
            }

            return wordCounts;
        }
    }

