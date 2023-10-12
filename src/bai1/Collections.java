package bai1;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    /*
    Mục tiêu: luyện tập sử dụng 1 số hàm có sẵn để thao tác với List trong java
Viết một chương trình Java tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử rồi in list số nguyên đó,
sau đó sử dụng phương thức Collections.max() của lớp Collections để tìm và in ra phần tử lớn nhất.
Hướng dẫn:
Sử dụng hàm Math.random() để lấy số lượng phần tử ngẫu nhiên của list
duyệt vòng lặp để gán giá trị ngẫu nhiên cho từng phần tử in ra List ngẫu nhiên đó.
tìm ra phần tử lớn nhất
in phần tử lớn nhất ra.
     */
    public static void main(String[] args) {
        // Số lượng phần tử ngẫu nhiên từ 1 đến 10
        int randomSize = (int) (Math.random() * 10) + 1;

        // Tạo một List để lưu trữ các số nguyên ngẫu nhiên
        List<Integer> randomList =new ArrayList<>();

        // Tạo và in ra List ngẫu nhiên
        System.out.println("List ngẫu nhiên:");
        for (int i = 0; i < randomSize; i++) {
            int randomNumber = (int) (Math.random() * 100); // Giới hạn số ngẫu nhiên trong khoảng 0-99
            randomList.add(randomNumber);
            System.out.print(randomNumber + " ");
        }

        // Tìm phần tử lớn nhất trong List sử dụng Collections.max()
        int maxnumber;
        maxnumber = Collections.max(randomList);

        // In ra phần tử lớn nhất
        System.out.println("\nPhần tử lớn nhất trong List: " + maxnumber);
    }

    }
