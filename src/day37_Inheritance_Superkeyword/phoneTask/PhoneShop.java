package day37_Inheritance_Superkeyword.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 100, "Black");

        Samsung samsung = new Samsung("galaxy 19", "6 inches", 900, "white");

        Nokia nokia = new Nokia("Brick", "4 inches", 500, "Gray");

        System.out.println(iphone);//Phone{brand='Apple', model='Iphone 12', size='6.7 inches', price= $100.0, color='Black'}
        System.out.println(samsung);//Phone{brand='Samsung', model='galaxy 19', size='6 inches', price= $900.0, color='white'}
        System.out.println(nokia);//Phone{brand='Nokia', model='Brick', size='4 inches', price= $500.0, color='Gray'}

        iphone.call(911);
        iphone.text(123456);
        iphone.faceTime(567789);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-----------------");

        samsung.text(34566);
        samsung.freeze();

        System.out.println("--------------------");

        nokia.call(122345);
        nokia.selfDefense();

        System.out.println("---------------------");

        System.out.println( Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println( Nokia.hasBattery);

    }
}
