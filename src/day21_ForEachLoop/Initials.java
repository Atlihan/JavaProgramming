package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String [] names = { "Ali Atlihan", "Fatma Atlihan", "Hande Atlihan"};

        for ( String each : names){
            String initial = each.charAt(0)+ "."+ each.charAt( each.indexOf(" ")+1 );// First character of Second name begins after the space
            System.out.println(initial);
        }
    }
}
