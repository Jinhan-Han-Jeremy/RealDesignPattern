package StrategyPattern;

// SearchStrategy 인터페이스: 다양한 검색 전략을 위한 공통 인터페이스 정의
public interface SearchStrategy {
    // 텍스트에서 패턴을 검색하는 메서드
    // 검색된 패턴의 시작 인덱스를 반환, 패턴이 없으면 -1 반환
    int search(String text, String pattern);
}