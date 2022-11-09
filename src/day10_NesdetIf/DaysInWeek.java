package day10_NesdetIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int num =  5;
        if(num==1){
            System.out.println("Mon");
        }else if(num == 2){
            System.out.println("Tue");
        }else if(num == 3){
            System.out.println("Wed");
        }else if(num == 4){
            System.out.println("Thr");
        }else if (num == 5){
            System.out.println("Fri");
        }else if(num == 6){
            System.out.println("Sat");
        }else{
            System.out.println("Sun");
        }
        System.out.println("=========================");
        String result = (num == 1)? "Mon" :(num == 2)? "Tue" :(num == 3)? "Wed" :(num==4)? "Thr" :(num == 5)? "Fri"
                :(num==6)? "Sat" : "Sat";
        System.out.println(result);
    }
}
