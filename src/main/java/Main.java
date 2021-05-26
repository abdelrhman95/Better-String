
public class Main {

    
    public static void main(String args[]) {
        
         //First way  
        lambdaInterface i1 = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };
        System.out.println(i1.betterString("abdo", "ahmed "));
        
        
        //Second way
        String str1 = "small";
        String str2 = "the bigger";
        String longer_test = test.betterString(str1,str2,(s1,s2)->s1.length()>s2.length());
        String first_test = test.betterString(str1, str2, (s1, s2) -> true);
        
        System.out.printf(longer_test+"\n");
        System.out.printf(first_test+"\n");
        
        
    }
}
