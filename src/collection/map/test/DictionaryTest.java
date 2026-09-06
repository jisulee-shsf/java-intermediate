package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("단어 입력 단계");
        while (true) {
            System.out.print("영어 단어를 입력하세요. (종료는 'q'): ");
            String englishWord = scanner.nextLine();

            if (englishWord.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요. (종료는 'q'): ");
            String koreanMeaning = scanner.nextLine();
            dictionary.put(englishWord, koreanMeaning);
        }
        /*
        단어 입력 단계
        영어 단어를 입력하세요. (종료는 'q'): apple
        한글 뜻을 입력하세요. (종료는 'q'): 사과
        영어 단어를 입력하세요. (종료는 'q'): banana
        한글 뜻을 입력하세요. (종료는 'q'): 바나나
        영어 단어를 입력하세요. (종료는 'q'): q
        */

        System.out.println("단어 검색 단계");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요. (종료는 'q'): ");
            String searchWord = scanner.nextLine();

            if (searchWord.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                System.out.println(searchWord + "의 뜻: " + dictionary.get(searchWord));
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
        /*
        단어 검색 단계
        찾을 영어 단어를 입력하세요. (종료는 'q'): apple
        apple의 뜻: 사과
        찾을 영어 단어를 입력하세요. (종료는 'q'): banana
        banana의 뜻: 바나나
        찾을 영어 단어를 입력하세요. (종료는 'q'): hello
        hello은(는) 사전에 없는 단어입니다.
        찾을 영어 단어를 입력하세요. (종료는 'q'): q
        */
    }
}
