package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {

   public static void main(String[] args) {
      
      /*
       * 채팅
       * 클라이언트와 서버간의 대화(연결)
       * 서버(컴퓨터)는 클라이언트의 채팅글을 전달하고,
       * 여러 클라이언트를 서로 연결할 수 있게 합니다.
       */
      
      //클라이언트
      
      try {
//         Socket clientSoket = new Socket("연결할아이피", 포트번호);
         Socket clientSocket = new Socket("172.30.1.72", 8181);
         //"172.30.1.74"


         
         //메세지를 받는 클래스
         Receive receive = new Receive(clientSocket);
         
         //데이터를 보내는 클래스
         Sender sender = new Sender(clientSocket);
         
         receive.start(); //쓰레드 시작
         sender.start(); //쓰레드 시작
         
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
         System.out.println("호스트주소 에러");
      } catch (IOException e) {
         e.printStackTrace();
         System.out.println("스트림 에러");
      }
            
   }
}