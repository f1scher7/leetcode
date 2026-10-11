public class E58 {

    public static int lengthOfLastWord(String s) {
        char[] charArr = s.toCharArray();
        boolean isWordStarts = false;
        int inc = charArr.length - 1;
        int res = 0;

        while (inc >= 0) {
            if (charArr[inc] != ' ') {
                res++;
                isWordStarts = true;
            } else if (charArr[inc] == ' ' && isWordStarts) {
                return res;
            }

            inc--;
        }

        return res;
    }

}
