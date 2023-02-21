public class LongestWord {
    public static String findLongestWord(String[] words) {
        int longestLength = 0;
        int longestIndex = -1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordLength = word.length();
            if (wordLength > longestLength) {
                longestLength = wordLength;
                longestIndex = i;
            }
        }
        if (longestIndex >= 0) {
            return words[longestIndex];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] words = {"cat", "banana", "dog", "nana", "walk", "walker", "dogwalker"};
        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);
    }
}