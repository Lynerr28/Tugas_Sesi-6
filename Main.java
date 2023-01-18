//Feby Alfaraby
//NIM 20210040133

package sesi6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gunakan Laptop");
        Laptop ideapad = new Lenovo();
        LaptopUser feby = new LaptopUser(ideapad);
        
        while(true){
            System.out.println("Masukan unput ON/OFF/UP/DOWN/OUT? ");
            String input = in.next();
            gunakanlaptop(feby, input);
            if(input.equals("OUT")){
                System.out.println("Keluar");
                break;
            }
        }
    }
    
    public static void gunakanlaptop(LaptopUser user, String input) {
        switch (input) {
            case "ON" -> user.turnOnLaptop();
            case "OFF" -> user.turnOffLaptop();
            case "UP" -> user.makeLaptopLouder();
            case "DOWN" -> user.makeLaptopSilence();
            default -> {
            }
        }
    }
}
