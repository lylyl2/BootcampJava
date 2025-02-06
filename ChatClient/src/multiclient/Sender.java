package multiclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender extends Thread{

   private Socket socket;
   
   public Sender(Socket socket) {
      this.socket = socket;
   }
   
   @Override
   public void run() {
      
      try {

         //사용자에게 입력받아서, 서버로 output 함
         BufferedReader br = new BufferedReader( new InputStreamReader(System.in, "UTF-8"));
         
         //서버로 전송할 output
         PrintWriter out = new PrintWriter(socket.getOutputStream());

         
         while(true) {
            
            String message = br.readLine(); //입력
            
            if(message.equals("exit")) {
               break; //종료
            }
            
            out.println(message); //소켓에 메세지 전송
            out.flush();
            
         }
         
         //close 를 안하면 프로그램이 종료되지 않음
         br.close();
         out.close();
         socket.close();
         
         
         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      
      
   }
}