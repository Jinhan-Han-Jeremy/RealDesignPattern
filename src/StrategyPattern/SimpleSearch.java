package StrategyPattern;

// SimpleSearch 클래스: 단순 문자열 검색 전략 구현
public class SimpleSearch implements SearchStrategy {
    @Override
    public int search(String text, String pattern) {
        // Java의 indexOf 메서드를 사용하여 단순 검색 수행
        return text.indexOf(pattern);
    }
}