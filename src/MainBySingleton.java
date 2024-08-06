import SngletonLog.SingletonLogger;

import java.util.Scanner;

public class MainBySingleton {

    public static String LevelAccess(int lv)
    {
        String LevelState;
        if(lv <= 10){
            LevelState = "Low level is accessed";
        }
        else {
            LevelState = "High level is accessed";
        }

        return LevelState;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 싱글톤 인스턴스를 가져옴
        //아래처럼 부르는건 스테이트레스로 인스턴스의 상태를 변경하지 않으며, 외부로부터 주어진 데이터를 처리하는 역할
        SingletonLogger singletonLogger = SingletonLogger.getInstance();

        // 로그 메시지를 기록
        try {
            // 애플리케이션 시작 로그
            singletonLogger.log("Application started.");

            // 첫 번째 질문을 출력하고 사용자로부터 입력을 받음
            System.out.print("What is your name? ");
            String name = scanner.nextLine();
            singletonLogger.log(name);

            // 두 번째 질문을 출력하고 사용자로부터 입력을 받음
            System.out.print("What is your lv? ");
            int lv = scanner.nextInt();

            // 버퍼를 비워 다음 입력을 받을 준비를 함
            scanner.nextLine(); // nextInt 후에 남아있는 newline 문자를 제거하기 위해 nextLine() 호출

            // 레벨에 따른 접근 로그 생성
            String accessLog = LevelAccess(lv);
            singletonLogger.log(accessLog);

        } catch (Exception e) {
            // 예외 발생 시 로그에 기록
            singletonLogger.log("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Scanner 객체를 닫음
            scanner.close();

            // 애플리케이션 종료 로그
            singletonLogger.log("Application finished.");

        }

    }

}