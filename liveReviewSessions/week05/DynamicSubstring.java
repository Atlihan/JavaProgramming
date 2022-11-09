package week05;

public class DynamicSubstring {

    public static void main(String[] args) {

        String searchResult= "result count : 34521";

        System.out.println(searchResult.length());//17

        //what if askong the numbers of only 34521:
        String numbers = searchResult.substring(13);
        System.out.println("numbers = " + numbers);

        //instead of static way,

        int columnIndex = searchResult.indexOf(':');
        String numbersNew =searchResult.substring(columnIndex+1);
        System.out.println(numbersNew.equals(numbers));

        System.out.println("================================");

        String searchResultNew = "User name: Oscar search result count : 12345 more column: more info";

        // we use overloaded method lets ask the index of first column (:)
        int firstColumnIndex = searchResultNew.indexOf(':');
        System.out.println("firstColumnIndex = " + firstColumnIndex);

        int secondColumnIndex = searchResultNew.indexOf(':', firstColumnIndex);
        String numbers3 = searchResultNew.substring(secondColumnIndex,firstColumnIndex);
        System.out.println("numbers3 = " + numbers3);







    }
}
