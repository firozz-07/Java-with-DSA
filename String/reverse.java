package String;
public class reverse {
    public static void main(String[] args) {
        String str = "firoz";
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        System.out.println(new String(chars));
    }
}