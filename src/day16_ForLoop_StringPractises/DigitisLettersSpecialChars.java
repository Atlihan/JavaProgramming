package day16_ForLoop_StringPractises;

public class DigitisLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#%WoodenSpoon";

        String letters = "";// 12345
        String digits = "";// CydeoSchoolWoodenSpoon
        String specialChars = "";// // @ # %

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);// each character that we have in Str

            if(ch >= '0' && ch<= '9') {// if the character is between 0 to 9 then it is digit
                digits += ch;
            }else if(ch>='A' && ch <='Z') {// if the character is between A to Z then it is letter
                letters += ch;
            }else if(ch>= 'a' && ch <= 'z') {
                letters += ch;
            }else{
                specialChars += ch;
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

        
    }
}
