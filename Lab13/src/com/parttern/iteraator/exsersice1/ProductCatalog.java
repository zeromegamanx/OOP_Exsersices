package com.parttern.iteraator.exsersice1;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;
    private final int size = 100; //kích thước mảng
    private int length;  //kích thước mảng mà ta sử dụng, phần sau sẽ là null

    public ProductCatalog() { //khởi tạo
        productCatalog = new String[size];
        length = -1;
    }

    @Override
    public Iterator iterator() {
        return new ProductIterator();
    }

    public class ProductIterator implements Iterator {
        private int currentPosition;

        public ProductIterator() {
            this.currentPosition = 0;

        }
        @Override
        public boolean hasNext() {
            return (this.currentPosition <= length - 1)
                    && (this.currentPosition < productCatalog.length - 1);
        }

        @Override
        public Object next() {
            String currentProduct = productCatalog[currentPosition];
            currentPosition++;
            return currentProduct;  //trả về currentProduct, currentPosition tăng lên 1
        }

        @Override
        public void remove() {
            if (currentPosition >= length) { //nếu lớn hơn length, k làm gì cả
                return;
            }
            if (length == productCatalog.length) {
                for (int i = currentPosition; i < length - 1; i++) {
                    productCatalog[i] = productCatalog[i + 1];
                }
                productCatalog[length - 1] = null;
            } else {
                for (int i = currentPosition; i < length; i++) {
                    productCatalog[i] = productCatalog[i + 1];
                }

            }
            length--;
            this.currentPosition = this.currentPosition - 1;
        }

    }
    public ProductCatalog add(String product) {
        if (this.length == this.productCatalog.length) {
            return this;
        }
        this.productCatalog[this.length + 1] = product; // sau khi add có thể lớn hơn kích thước mảng lưu trữ
        this.length++;
        return this;
    }

    public void remove(int index) {
        if (index >= this.length) { //nếu lớn hơn length, k làm gì cả
            return;
        }
        if (this.length == this.productCatalog.length) {
            for (int i = index; i < this.length - 1; i++) {
                this.productCatalog[i] = this.productCatalog[i + 1];
            }
            this.productCatalog[this.length - 1] = null;
        } else {
            for (int i = index; i < this.length; i++) {
                this.productCatalog[i] = this.productCatalog[i + 1];
            }
        }
    }
}
