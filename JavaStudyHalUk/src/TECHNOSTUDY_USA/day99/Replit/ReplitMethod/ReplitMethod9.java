package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod9 {
    /*
            Create one method name is findTheDifference ***
        Accepts two Strings ***
        Returns the char ***

        Given two strings s and t which consist of only lowercase letters.
        String t is generated by random shuffling string s and then add one more letter at a random position.
        Find the letter that was added in t.
        Example:
        Input:
        s = "abcde"
        t = "abcd"
        Output:
        e
        Explanation:
        'e' is the letter that was added.
        s = "qawer"
        t = "rewq"
        Output:
        a
        Explanation:
        'a' is the letter that was added.
     */
    /*
    public static char findTheDifference(String s,String t){
        char x=' ';
        for(int i=0; i<s.length();i++){
            if(!(t.contains(""+s.charAt(i)))){ // ""+ string methodlarini kullanmak icin
                x=s.charAt(i);
            }
        }
        return x;
    }
    */
    public static char findTheDifference(String s, String t) {
        char tmp = ' ';
        int count=0;
        x:  for (int i = 0; i < s.length(); i++) {
            count=0;
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(i) != t.charAt(j)) {
                        tmp = s.charAt(i);
                        count++;
                }
                    else {
                        tmp = ' ';
                }
                    if(count==t.length())
                        break x;
            }
        }
        return tmp;
    }
}
