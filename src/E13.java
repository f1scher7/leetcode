import java.util.Map;
import java.util.HashMap;

public class E13 {

    public static final Map<Character, Integer> romanSymbolsAndValues = new HashMap<>();

    static {
        romanSymbolsAndValues.put('I', 1);
        romanSymbolsAndValues.put('V', 5);
        romanSymbolsAndValues.put('X', 10);
        romanSymbolsAndValues.put('L', 50);
        romanSymbolsAndValues.put('C', 100);
        romanSymbolsAndValues.put('D', 500);
        romanSymbolsAndValues.put('M', 1000);
    }


    public static int romanToInt(String s) {
        char[] charArr = s.toCharArray();
        int res = 0;
        int i = 0;

        while (i < charArr.length) {
            if (i != charArr.length - 1) {
                if (charArr[i] == 'I') {
                    if (charArr[i + 1] == 'V') {
                        res += 4;
                        i += 2;
                    } else if (charArr[i + 1] == 'X') {
                        res += 9;
                        i += 2;
                    } else {
                        res++;
                        i++;
                    }
                } else if (charArr[i] == 'X') {
                    if (charArr[i + 1] == 'L') {
                        res += 40;
                        i += 2;
                    } else if (charArr[i + 1] == 'C') {
                        res += 90;
                        i += 2;
                    } else {
                        res += 10;
                        i++;
                    }
                } else if (charArr[i] == 'C') {
                    if (charArr[i + 1] == 'D') {
                        res += 400;
                        i += 2;
                    } else if (charArr[i + 1] == 'M') {
                        res += 900;
                        i += 2;
                    } else {
                        res += 100;
                        i++;
                    }
                } else {
                    res += E13.romanSymbolsAndValues.get(charArr[i]);
                    i++;
                }
            } else {
                res += E13.romanSymbolsAndValues.get(charArr[i]);
                i++;
            }
        }

        return res;
    }

}
