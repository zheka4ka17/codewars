public class ex3 {
    /*        When given a string of space separated words,
    return the word with the longest length.
    If there are multiple words with the longest length,
    return the last instance of the word with the longest length.
     */
    public static void main(String[] args) {
        String str = "Добрый день, дорогой друг ";
        String str2="";
        String  maxString="";
        String strLowerCase= str.toLowerCase();
        for(int i = 0; i<str.length(); i++ ) {
            boolean b = (int) strLowerCase.charAt(i)>=(int) 'а' &&(int) strLowerCase.charAt(i) <= (int) 'я'  ;
            if (b) {
              str2+= strLowerCase.charAt(i);
            if (str2.length()>maxString.length())
               maxString = str2;}
           else if (!b)
               str2="";
        }
        System.out.println(maxString);
    }
}
