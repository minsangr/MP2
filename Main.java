public class Main {
    public static int streak(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                if (str.substring(i, i + 1).equals(str.substring(i - count, i - count + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(streak("aaa"));
        System.out.println(streak("aaabb"));
        System.out.println(streak("aabbb"));
        System.out.println(streak("aaabaaaa"));
    }
}

