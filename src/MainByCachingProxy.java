import CachingProxy.CachingDatabaseProxy;
import CachingProxy.DatabaseService;

public class MainByCachingProxy {
    public static void main(String[] args) {
        DatabaseService service = new CachingDatabaseProxy();

        // First call - result is not cached
        System.out.println(service.queryDatabase("SELECT * FROM users"));

        // Second call - result should be cached
        System.out.println(service.queryDatabase("SELECT name FROM users"));

        // Third call - different query, result is not cached
        System.out.println(service.queryDatabase("SELECT type FROM orders"));

    }
}
