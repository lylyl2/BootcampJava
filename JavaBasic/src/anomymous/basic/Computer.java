package anomymous.basic;

public class Computer {
   
   private int sound;
   private RemoteControl remote;
   
   public Computer() {
      
      remote = new RemoteControl() {

         @Override
         public void turnOn() {
            sound++;
            System.out.println("컴퓨터 볼륨:" + sound);
         }

         @Override
         public void turnOff() {
            sound--;
            System.out.println("컴퓨터 볼륨 : " + sound);
            
         }

         @Override
         public void volumeup() {
            // TODO Auto-generated method stub
            
         }

         @Override
         public void volumedown() {
            // TODO Auto-generated method stub
            
         }
         
      };

   }
}
