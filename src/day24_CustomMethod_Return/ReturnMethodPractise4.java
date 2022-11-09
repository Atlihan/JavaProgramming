package day24_CustomMethod_Return;

public class ReturnMethodPractise4 {

    public static void main(String[] args) {

        String str="ccccccffffaaaaaabbb";
        // removeDuplicates(str);// the Return Type of this Method is String then this gives me the opportunity to reassign it to str.
       str =  removeDuplicates(str);// so the new str will not have duplicates
        System.out.println(str);
    }

    public static String removeDuplicates(String str){// by grouping this code fragments,
        // we create a method that can remove duplicates from any string (str)

        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }
}
