package mylist;

import mylist.MyAbstractList;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList(){
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1){
            enlarge();
        }
        elements[size++] = 0;
    }

    @Override
    public void add(Object o, int index) {
        System.arraycopy(elements, index + 1, elements, index, elements.length + 1);
        ++size;
    }

    @Override
    public void remove(int index) { // xóa 1 phần tử
        checkBoundaries(index, size - 1);  // đối với mảng là từ 0 đến size-1, check xem index có nằm trong khoảng có hợp lệ hay k
        System.arraycopy(elements, index + 1, elements, index, elements.length - 1); //dịch chuyển các phần tử từ vị trí bên phải index chuyển sang bên trái
        elements[size] = null; //gắn thằng cuối cùng đã xóa là null
        --size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() { // lấy kích thước của size
        return size;
    }
    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp,0, elements.length);
        elements = tmp;
    }
}
