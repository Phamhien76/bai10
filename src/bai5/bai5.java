package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai5 {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi (câu hoặc đoạn văn)
        String text = "Học java khó quá, làm sao để nhớ hết đây thầy ơi";

        // Bước 2: Chuyển chuỗi thành một danh sách các từ (sử dụng khoảng trắng làm dấu phân cách)
        List<String> wordList= Arrays.asList(text.split(" "));

        // Bước 3: Tạo một danh sách mới để lưu trữ các từ ngắn nhất
        List<String> testWords =new ArrayList<>();

        // Bước 4: Duyệt danh sách để tìm từ ngắn nhất
        int minLength = Integer.MAX_VALUE;
        for (String word : wordList) {
            if (word.length() < minLength) {
                testWords.clear(); // Xóa danh sách các từ ngắn nhất trước đó
                testWords.add(word);
                minLength = word.length();
            } else if (word.length() == minLength) {
                testWords.add(word);
            }
        }

        // Bước 5: In ra từ ngắn nhất (hoặc các từ ngắn nhất nếu có nhiều từ có cùng độ dài ngắn nhất)
        System.out.println("Từ ngắn nhất trong câu:");
        for (String shortestWord : testWords) {
            System.out.println(shortestWord);
        }
    }
}
