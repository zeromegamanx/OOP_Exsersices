package com.parttern.iteraator.exsersice1;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana")
                .add("Orange")
                .add("Grape")
                .add("Melon");

        Iterator iterator = productCatalog.iterator(); //it lấy từ product
        while (iterator.hasNext()) {
            String currentProduct = (String)iterator.next(); // ép kiểu từ object sang string
            if (currentProduct.equals("Orange")) {
                iterator.remove();
            } else {
                System.out.println(currentProduct);
            }
        }
    }
}
