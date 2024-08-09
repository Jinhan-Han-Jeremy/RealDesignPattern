package CachingProxy;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements DatabaseService{
    private RealDatabaseService realService = new RealDatabaseService();
    private Map<String, String> cache = new HashMap<>();

    @Override
    public String queryDatabase(String query) {
        if (!cache.containsKey(query)){
            // 실제 서비스에서 쿼리 결과를 가져와 캐시에 저장
            String result = realService.queryDatabase(query);
            cache.put(query, result);
        }
        else{
            // 캐시에 저장된 결과 반환
            System.out.println("Returning cached result for query: " + query);
        }
        return cache.get(query);
    }
}
