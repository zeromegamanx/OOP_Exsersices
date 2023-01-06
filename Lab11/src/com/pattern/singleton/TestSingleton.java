package com.pattern.singleton;

public class TestSingleton {
    public static void main(String[] args) { // khi chưa có đối tượng nào đc tạo ra, hàm main đc gọi đầu tiên nên phải dùng static
        //Database database1 = new Database();  //gọi hàm dựng để khởi tạo cho đối tượng database
        Database database1 = Database.getInstance();
        System.out.println(database1);

        //Database database2 = new Database();
        Database database2 = Database.getInstance();
        System.out.println(database2);
    }
}
