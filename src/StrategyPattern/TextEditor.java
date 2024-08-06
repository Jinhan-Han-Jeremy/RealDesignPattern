package StrategyPattern;

// TextEditor 클래스: 검색 전략을 사용하는 텍스트 편집기
public class TextEditor {
    // 현재 검색 전략을 저장하는 필드
    private SearchStrategy searchStrategy;

    // 검색 전략을 설정하는 메서드
    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    // 설정된 검색 전략을 사용하여 텍스트에서 패턴을 검색하는 메서드
    public int performSearch(String text, String pattern) {
        if (searchStrategy == null) {
            // 검색 전략이 설정되지 않은 경우 예외 발생
            throw new IllegalStateException("Search strategy not set");
        }
        // 설정된 검색 전략을 사용하여 검색 수행
        return searchStrategy.search(text, pattern);
    }

}
