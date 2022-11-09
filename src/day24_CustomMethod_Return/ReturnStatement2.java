package day24_CustomMethod_Return;

public class ReturnStatement2 {

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void main(String[] args) {
        nameOfMonth(10);

    }
    public static void nameOfMonth(int number ){

        if(number<1||number>12){
            System.out.println("Invalid");
            return;// exits the nameOfMonth METHOD, and remaining code fragments of the method never gets executed
        }

        String name = "";

        if (number>=1 && number <=12){
            name = (number==1)?"Jan" :(number==2)?"FEb" :(number==3)? "Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)? "Jun" :(number==7)? "Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)? "Nov" :"Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("Name of the month: "+ name);
    }
}
