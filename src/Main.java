import java.util.*;

public class Main {
    public static final String[] dictionary = new String[]{
            "word", "asd",
            "as2", "misha", "rick", "java", "tank"
    };

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Словарь\n" + Arrays.toString(dictionary));

        Random random = new Random();
        String[] words = new String[20];
        for (int i = 0; i < words.length; i++) {
            words[i] = dictionary[random.nextInt(dictionary.length)];
        }
        System.out.println("Массив из 20 рандомных слов\n" + Arrays.toString(words));

        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));
        System.out.print("Слова без повторов\n" + uniqueWords);

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("\nСлова и их кол-во\n" + wordsCount);

    }

    public static void task2() {
        Phonebook<Integer, String> phonebook = new Phonebook<>();
        phonebook.add(123, "фамилия1");
        phonebook.add(124, "фамилия2");
        phonebook.add(1234, "фамилия2");
        phonebook.add(1234, "фамилия23");
        System.out.println(phonebook);
    }
}