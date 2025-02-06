package quize21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileQuiz03 {

    public static void main(String[] args) {
    	
		/*
		 * youjin choi가 입사한 회사에서는 매일 오전 7시에 연계사에서 
		 * 날짜유형의 csv파일을 전송을 해줍니다.
		 * 
		 * ex) 2025_01_24_data.csv 유형의 파일입니다
		 *
		 * 그래서 youjin choi는 *매일 아침*마다 csv파일을 읽어서 데이터베이스에 저장하는
		 * 프로그램 코드를 만들어야 합니다.
		 *
		 * 데이터베이스에 저장하려면, List<Data>클래스로 값을 저장해야 합니다.
		 * Data클래스는 getter, setter를 가지는 은닉 클래스입니다.
		 * 
		 * 1. buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요. 
		 * 2. 읽은 데이터를 ,기준으로 분리해서 데이터를 리스트에 잘 정리해서 저장해 주세요.
		 */

        // 오늘 날짜 생성 (yyyy_MM_dd 형식)
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));

        // 파일 경로 생성
        String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\bin\\quize21\\" + formattedDate + "_data.csv";

        List<Data> dataList = new ArrayList<>();

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                // 한 줄씩 출력
                System.out.println(line);

                // ',' 기준으로 데이터 분리
                String[] parts = line.split(",");

                // Data 객체에 저장
                if (parts.length == 3) {
                    Data data = new Data();
                    data.setColumn1(parts[0].trim());
                    data.setColumn2(parts[1].trim());
                    data.setColumn3(parts[2].trim());
                    dataList.add(data);
                }
            }
        } catch (Exception e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }

        // 데이터 출력 (확인용)
        System.out.println("데이터 리스트:");
        for (Data data : dataList) {
            System.out.println(data);
        }
    }
}
