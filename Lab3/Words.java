import java.util.HashMap;
import java.util.Map;

public class Words {

    public static void main(String[] args) {

        String text = "Tomorrow everyone will be banned from Brawl Stars!!1 This is not a drill!!1!1 I repeat, not a drill!!1";

        String lowerCaseText = text.toLowerCase();

        String noPunctuationText = lowerCaseText.replaceAll("[^a-z\\s]", "");

        String[] words = noPunctuationText.split("\\s+");

        Map<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words) {
            if (wordFrequencies.containsKey(word)) {
                int currentCount = wordFrequencies.get(word);
                currentCount++;
                wordFrequencies.put(word, currentCount);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        System.out.println("Частота встречаемости слов в тексте:");

        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " раз(а)");
        }
    }
}