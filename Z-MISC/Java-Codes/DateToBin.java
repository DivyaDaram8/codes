public class DateToBin {

    // Approach 1: Using Integer.parseInt and Integer.toBinaryString
    /*
    public String convertDateToBinary(String date) {
        String parts[] = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String y = Integer.toBinaryString(year);
        String m = Integer.toBinaryString(month);
        String d = Integer.toBinaryString(day);

        return y + "-" + m + "-" + d;
    }
    */

    // Approach 2: Manual Conversion to Binary
    public String bin(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (char ch : s.toCharArray()) {
            num = num * 10 + (ch - '0');
        }
        while (num > 0) {
            sb.insert(0, (num % 2 == 0 ? "0" : "1"));
            num /= 2;
        }
        return sb.toString();
    }

    public String convertDateToBinary(String date) {
        return bin(date.substring(0, 4)) + "-" + bin(date.substring(5, 7)) + "-" + bin(date.substring(8, 10));
    }

    // Main method for testing
    public static void main(String[] args) {
        DateToBin solution = new DateToBin();

        // Test with a sample date
        String date = "2025-01-19";
        String binaryDate = solution.convertDateToBinary(date);
        System.out.println("Binary Date: " + binaryDate);
    }
}

