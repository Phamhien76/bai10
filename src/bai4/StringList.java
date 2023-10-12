package bai4;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi
        String inputString = "Rekkei Academy để nông dân biết code";

        // Bước 2: Tạo một danh sách List với kiểu dữ liệu là String
        List<String> stringList =new ArrayList<>();

        // Bước 3: Chuyển đổi chuỗi từ bước 1 thành danh sách (List) của chuỗi và gán vào danh sách từ bước 2
        String[] words = inputString.split("\\s+"); // Tách chuỗi thành các từ bằng khoảng trắng
        for (String word : words) {
            stringList.add(word);
        }

        // Bước 4: Duyệt danh sách và in ra các chuỗi có độ dài lớn hơn 3 ký tự
        System.out.println("Các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String word : stringList) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}
