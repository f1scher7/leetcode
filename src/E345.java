import java.util.*;

public class E345 {

    private final Set<Character> VOWELS = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
    );

    public String reverseVowels(String s) {
        char[] sCharArr = s.toCharArray();
        int left = 0;
        int right = sCharArr.length - 1;

        while (left < right) {
            while (left < right && !VOWELS.contains(sCharArr[left])) left++;
            while (left < right && !VOWELS.contains(sCharArr[right])) right--;

            char temp = sCharArr[left];
            sCharArr[left] = sCharArr[right];
            sCharArr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(sCharArr);
    }

//    public String reverseVowels(String s) {
//        Deque<Character> reversedVowels = new ArrayDeque<>();
//        List<Character> characterList = new ArrayList<>();
//
//        for (char c : s.toCharArray()) characterList.add(c);
//
//        for (int i = 0; i < s.length(); i++) {
//            if (isVowel(s.charAt(i))) {
//                reversedVowels.push(s.charAt(i));
//                characterList.set(i, null);
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (characterList.get(i) == null) {
//                characterList.set(i, reversedVowels.pop());
//            }
//        }
//
//        return characterList.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//    }

}
