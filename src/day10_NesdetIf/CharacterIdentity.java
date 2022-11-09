package day10_NesdetIf;

import java.sql.SQLOutput;

public class CharacterIdentity {

    public static void main(String[] args) {
        char ch = '@';
        if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        } else if ((ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z')){
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special Character");
        }

    }
}
/* write a program that can identify if the given character is  a digit or alphabetic character,
or a special character
ch = '@'
output = Special Character
*/
