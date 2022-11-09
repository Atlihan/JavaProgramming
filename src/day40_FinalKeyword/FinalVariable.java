package day40_FinalKeyword;

public class FinalVariable {

    // instance variable:

    final String birthDay;

    final static String name;

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        final String name = "Ali";
        // final variables can not be reassigned

        System.out.println("--------------------");

        FinalVariable obj = new FinalVariable("may/01");
        System.out.println(obj.birthDay);//may/01

        System.out.println("-------------------");

        System.out.println(FinalVariable.name);//Batch 25


    }


}
