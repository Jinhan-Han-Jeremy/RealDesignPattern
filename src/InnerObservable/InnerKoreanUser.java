package InnerObservable;
import java.util.Observable;
import java.util.Observer;

public class InnerKoreanUser implements Observer {
    String name;

    public InnerKoreanUser(String name) {
        this.name = name;
    }


    public void display(InnerWeatherAPI api) {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : %.2f°C %.2fg/m3 %.2fhPa\n", name, api.temp, api.humidity, api.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        // 발행자가 WeatherAPI 인 경우 (Observable을 상속한 모든 클래스에서 발행이 가능하니 구분해 주어야 한다)
        if(o instanceof InnerWeatherAPI) {
            InnerWeatherAPI w = (InnerWeatherAPI) o; // 다운 캐스팅
            display(w);
        }
    }
}