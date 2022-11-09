package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("cydeo", "project"); //function

        System.out.println("==================");

        domain("Cydeo.School@amazon.com");

        System.out.println("===================");


        String[] emails = {"Josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com" };
        // the fastest way to get each element in an array is  to use For Each Loop
        // otherwise we have to use every index of emails in the array domain(email[0])
        for (String email : emails) {
            domain(email);
            /* result:
            domain : gmail
            domain : yahoo
            domain : cydeo
             */
        }
        System.out.println("=========================");
        nameOfMonth(15);

        System.out.println("========================");

        nameOfDay(3);

        System.out.println("=========================");
        daysInMonth(2);

        System.out.println("==========================");
        ageGroup(90);




    }


    //1. Create a method that can display the initials of the person: first char of the 1st and last names
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);// to call 1st and last char of the names
        initial = initial.toUpperCase();// to ignore the capital or small letters

        System.out.println("initial : " + initial);// code fragment

    }

    // 2. Create a method that can display the domain of the email: domain(String email)
    // We need an email as a parameter\ because without the email as an argument the method does not function or
    // we can not get the domain

    public static void domain(String email) {// Cydeo.School@amazon.com
        // in order to get any portion of a word we need substring.
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain : " + domain);// domain : amazon

    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number ){

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

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        String name;
        if(number>=1 && number<=7){
            name=(number==1)? "Mon" :(number==2)?"Tue" :(number==3)?"Wed" :(number==4)?"Thu" :(number==5)?"Fri"
                    :(number==6)?"Sat" : "Sun";
        }else{
            name ="Invalid";
        }
        System.out.println("The day is: "+name);


    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;
        if(has28Days){
            System.out.println("28 Days ");
        }
        if(has30Days){
            System.out.println("30 days");
        }
        if(has31Days){
            System.out.println("31 days");
        }

    }
    //age groups: Infant(1-2), Toddler (3-5), Kid (6-9), Pre-Teen(10-12), Teenager(3-17),
    // Young Adult(18-20), Adult (21-39), Young-MiddleAge Adult (40-49), Middle Aged Adult(50-54)
    // very young Senior Citizen(55-64), young Senior Citizen(65-74), Senior Citizen(75-84)
    //Old Senior Citizen(85+)
    public static void ageGroup(int age){
        String ageGroup ="";

        if (age>=1){

            ageGroup= (age==1 || age==2)?"Infant" : (age>=3 && age<=5)? "Toddler" :(age>=6 && age<=9)?"Kid" :(age>=10 && age<= 12)?"Pre-Teen"
            :(age>=13 && age<=17)?"Teenager" :(age>=18 && age<=20)?"Young Adult" :(age>=21 && age<=39)?"Adult" :(age>=40 && age<=49)?"Young Middle Adult"
            :(age>=50 && age<=54)?"Middle Aged Adult" :(age>=55 && age<=64)?"Very Young Sen Citizen" :(age>=65 && age<=74)?"Young Sen Citizen"
                    :(age>=75 && age<=84)?"Senior Citizen" :"Old Senior Citizen";
        }else{
            ageGroup="Invalid";
        }
        System.out.println(" Age group is : "+ageGroup);

    }


}


/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */