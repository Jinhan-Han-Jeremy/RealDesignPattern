package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherAPI implements Subject{
    float temp; // 온도
    float humidity; // 습도
    float pressure; // 기압

    // 구독자들을 담아 관리하는 리스트
    List<Observer> subscribers = new ArrayList<>();

    public void measurementsChanged() {
        // 현재의 온습도 데이터를 랜덤값으로 얻는 것으로 비유하였다.
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        notifyObservers(); // 온습도 값이 변화하면 바로 옵저버들에게 발행
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    // 이벤트 전파
    @Override
    public void notifyObservers() {
        for(Observer o: subscribers) {
            o.display(this); // 자신의 객체를 매개변수로 줘서 현재 자신의 상태를 구독자에게 알림
        }
    }
}