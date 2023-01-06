package mylist;

import mylist.MyList;

public abstract class MyAbstractList implements MyList {  //cấu trúc k có thật, minh họa dùng abtractList
    void checkBoundaries(int index, int limit){
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {  // chuyển list thành format nào đó
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]", get(i).toString()));
        }
        return sb.toString();
    }
}
