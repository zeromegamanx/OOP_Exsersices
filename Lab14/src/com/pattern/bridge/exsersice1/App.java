package com.pattern.bridge.exsersice1;

public class App {
    public static void main(String[] args) {
        OperatingSystem window = new WindowOS();  //tạo hệ điều hành
        OperatingSystem mac = new MacOS();

        Computer laptop1 = new Laptop(window);  //tạo máy tính sử dụng hệ điều hành gì
        laptop1.startUp();
        laptop1.browswInternet("facebook.com");
        System.out.println();

        Computer laptop2 = new Laptop(mac);
        laptop2.startUp();
        laptop2.browswInternet("facebook.com");
        System.out.println();


        PC pc1 = new PC(mac);
        pc1.startUp();
        pc1.browswInternet("facebook.com");
        System.out.println();


        PC pc2 = new PC(window);
        pc2.startUp();
        pc2.browswInternet("facebook.com");
        System.out.println();
    }
}
