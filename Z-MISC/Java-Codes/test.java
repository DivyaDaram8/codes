public class test {
    public static void main(String[] args) {
        String text = "A3B3C5D2";
         for( int i = 0; i < text.length(); i = i +2){
            int repeat = text.charAt(i+1) - '0';
            for( int j = 0; j <repeat;j++){ 
               System.out.print(text.charAt(i));
            }
        }
    }
}


















// In Java, characters are internally represented by their ASCII values. When you do `text.charAt(i + 1) - '0'`, you’re converting a digit character (like `'3'`) into its corresponding integer value (in this case, `3`). Here’s how it works:

// ### Understanding ASCII Values

// Every character in Java (and in most programming languages) has a corresponding ASCII value:
// - `'0'` has an ASCII value of `48`.
// - `'1'` has an ASCII value of `49`.
// - `'2'` has an ASCII value of `50`.
// - ...
// - `'9'` has an ASCII value of `57`.

// When you do `text.charAt(i + 1)`, you’re getting a character like `'3'`. To convert this character to the integer `3`, you subtract the ASCII value of `'0'` (which is `48`) from the ASCII value of the character:

// - For example, if `text.charAt(i + 1)` is `'3'`, its ASCII value is `51`.
// - `'3'` (ASCII value `51`) - `'0'` (ASCII value `48`) = `3`.

// So, by doing `text.charAt(i + 1) - '0'`, you’re converting the character digit to its numeric value.

// ### Example Breakdown:
// If `text = "A3B9C5"`, when `i = 0`:
// - `text.charAt(1)` is `'3'`.
// - `'3'` has an ASCII value of `51`.
// - `'0'` has an ASCII value of `48`.
// - `51 - 48 = 3`.

// This allows you to use the numeric value of the digit (`3`) for repeating the character `'A'`.


// ***** very very important point 


// ### Why Subtract `'0'`?
// In essence, subtracting `'0'` from a character digit shifts its ASCII value to the correct integer value. This is a common and efficient way to convert character digits into integers in Java and many other languages.
