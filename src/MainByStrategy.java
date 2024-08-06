import StrategyPattern.RegexSearch;
import StrategyPattern.SimpleSearch;
import StrategyPattern.TextEditor;

public class MainByStrategy {

    // 메인 메서드: 예제 실행
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // 예제 텍스트
        String text = "Hello, this is a simple text editor.";

        // 단순 검색 전략 사용
        editor.setSearchStrategy(new SimpleSearch());
        int index = editor.performSearch(text, "simple");
        System.out.println("Simple Search: 'simple' found at index " + index);

        // 정규 표현식 검색 전략 사용
        editor.setSearchStrategy(new RegexSearch());
        index = editor.performSearch(text, "\\bsimple\\b");
        System.out.println("Regex Search: '\\bsimple\\b' found at index " + index);
    }

}
