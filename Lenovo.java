
package sesi6;


public class Lenovo implements Laptop{
    
    private int volume;
    boolean is_power_on;
    
    public Lenovo(){
        this.volume = 50;
    }
    
    public void powerOn(){
        is_power_on = true;
        System.out.println("Laptop menyala");
        System.out.println("Lenovo Ideapad");
    }
    
    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown is process ...");
    }
    
    public void volumeUp(){
        if(is_power_on){
            if(this.volume==MAX_VOL){
                System.out.println("Volume is Full");
            }
            else{
                this.volume += 10;
                System.out.println("Volume is :"+ this.getVolume());
            }
        }
    }
    public void volumeDown(){
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("Volume is 0%");
            }
            else{
                this.volume -= 10;
                System.out.println("Volume is :"+ this.getVolume());
            }
        }
    }
    
    public int getvolume(){
        return this.volume;
    }

    private String getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
