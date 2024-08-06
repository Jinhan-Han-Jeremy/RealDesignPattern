package SngletonLog;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {

    // 유일한 인스턴스를 저장하기 위한 정적 필드
    private static SingletonLogger instance;

    // 로그 파일을 기록할 PrintWriter 객체
    private PrintWriter writer;

    // private 생성자: 외부에서 인스턴스를 생성하지 못하도록 함
    private SingletonLogger() {
        try {
            FileWriter fileWriter = new FileWriter("app.log", true);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 인스턴스를 반환하는 정적 메서드
    //synchronized로 여러스레드에 의해 동시에 인스턴스들을 호출하는 경우를 예방
    // 싱글톤은 여런 인스턴스가 생성되는 것을 예방
    public static synchronized SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    // 로그 메시지를 기록하는 메서드
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        writer.println(timestamp + " - " + message);
    }
}