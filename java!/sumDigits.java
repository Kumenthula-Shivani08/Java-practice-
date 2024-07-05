 class SumDigits {
    public static void main(String[] args) {
        String str = "A1B2C3D4";
        int sum = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Integer.parseInt(String.valueOf(ch));
                count++;

            }
        }
        System.out.println(count);
        System.out.println(sum);

    }
}
