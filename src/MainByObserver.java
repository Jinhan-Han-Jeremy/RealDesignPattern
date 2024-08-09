import Observer.KoreanUser;
import Observer.WeatherAPI;

public class MainByObserver {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();

        KoreanUser user1 = new KoreanUser("홍길동");
        KoreanUser user2 = new KoreanUser("임꺽정");
        KoreanUser user3 =new KoreanUser("세종대왕");
        api.registerObserver(user1);
        api.registerObserver(user2);
        api.registerObserver(user3);

        // 온습도기에서 현재 상태의 온습도 정보가 갱신됨
        api.measurementsChanged();

        // 알아서 전파되어 출력
        api.measurementsChanged();

        System.out.println("임꺽정 구독 취소");
        api.removeObserver(user2);
        api.measurementsChanged();

        // ...
    }
}
