class Computer {
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    public String getMePen(int cost) {

        if(cost >= 10)
            return "pen"; 
        
        return "Sorry";
    }
}


public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        
        obj.playMusic();

        String str = obj.getMePen(2);
        System.out.println(str);
    }
}
