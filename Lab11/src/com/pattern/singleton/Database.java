package com.pattern.singleton;

public class Database {
    private static Database instance;
    // private
    // static vì tất cả đối tượng được tạo ra đều trỏ tới 1 đối tượng chung trong getInstance (các đối tượng chung nhau dữ liệu)
    // Database

    private Database(){  //hàm dựng chỉ có 1 đối tượng nên không thể đặt public

    }

    public static Database getInstance() {  // chỉ có phương thức này mới có thể gọi tới hàm dựng Database
        // public vì muốn tọa đối tượng từ bên ngoài Database
        // static vì ta sẽ gọi phương thức này khi chưa có đối tượng nào đc tạo ra (khác với instance method - gọi đối tượng khi đã dc tạo ra)
        if (instance == null){ // nếu chưa tạo ra bất kỳ instance nào thì tạo 1 cái instance mới
            instance = new Database();
        }
        return instance;  // nếu đã tạo ra bất kỳ instance nào thì trả về cái instance đã dc tạo
        // => Đây là singleton pattern
    }
}
