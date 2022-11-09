package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(name2);//default is visible outside the package only if in a subclass
     //   System.out.println(name1); default is not visible outside the package

     //    AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();

    }
}
