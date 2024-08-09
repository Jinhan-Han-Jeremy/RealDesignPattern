package CachingProxy;

class RealDatabaseService implements DatabaseService{
    @Override
    public String queryDatabase(String query) {
        // Simulate a costly database query
        try {
            Thread.sleep(3000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Result for query: " + query;
    }
}
