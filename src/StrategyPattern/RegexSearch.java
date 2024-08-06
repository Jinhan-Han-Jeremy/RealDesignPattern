package StrategyPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// RegexSearch 클래스: 정규 표현식을 이용한 검색 전략 구현
public class RegexSearch implements SearchStrategy {
    @Override
    public int search(String text, String pattern) {
        // Pattern과 Matcher 클래스를 사용하여 정규 표현식 검색 수행
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.find()) {
            // 패턴이 발견되면 시작 인덱스 반환
            return m.start();
        }
        // 패턴이 발견되지 않으면 -1 반환
        return -1;
    }
}