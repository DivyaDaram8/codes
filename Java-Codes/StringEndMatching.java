public class StringEndMatching {
    public static void main(String[] args) {
        String str = "xyzzabc";
        int cnt1 = -1, cnt2 = -1;
        char[] chars = str.toCharArray();
        int len = str.length();

        if(chars[0] == chars[len - 1]){
                cnt1 = 0;
                System.out.println(cnt1);
                return;
        }
        int min = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        for(int i  = 0; i < len - 1; i++){
            if(chars[i] == chars[i + 1]){
                cnt1 = i+1;
                cnt2 = len - (i + 1);
                min = Math.min(cnt1, cnt2);
                result = Math.min(result, min);
            }
        }
        
        System.out.println(result == Integer.MAX_VALUE ? -1 : result);
    }
}





// public class StringEndMatching {

//     public static int minRotationsToMatchEnds(String s) {
//         int n = s.length();
//         if (n == 1) return 0;

//         char[] ch = s.toCharArray();
//         if (ch[0] == ch[n - 1]) return 0;

//         int best = Integer.MAX_VALUE;

//         for (int i = 0; i < n; i++) {
//             int j = (i + 1) % n;
//             if (ch[i] == ch[j]) {
//                 int left = j;
//                 int rot = Math.min(left, n - left);
//                 if (rot < best) best = rot;
//             }
//         }

//         return best == Integer.MAX_VALUE ? -1 : best;
//     }

//     public static void main(String[] args) {
//         String[] tests = {
//             "a", "aa", "ab", "abc", "abca",
//             "xyyx", "bbadd", "xxy", "yxx",
//             "baaa", "xyzzabc", "aaaa"
//         };

//         for (String t : tests) {
//             System.out.println(t + " -> " + minRotationsToMatchEnds(t));
//         }
//     }
// }
