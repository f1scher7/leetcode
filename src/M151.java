public class M151 {

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] stringArr = s.trim().split(" ");

        for (int i = stringArr.length - 1; i >= 0 ; i--) {
            if (!stringArr[i].isEmpty()) {
                stringBuilder.append(stringArr[i]);

                if (i != 0) {
                    stringBuilder.append(" ");
                }
            }
        }

        return stringBuilder.toString();
    }

}
