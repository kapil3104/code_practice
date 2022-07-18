import java.util.*;

public class KthRowOfPascalTriangle {
    public ArrayList<Integer> getRow(int A) {
        if(A == 0) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            return list1;
        } else if(A == 1) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(1);
            return list1;
        } else if(A == 2) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(1);
            return list1;
        } else if(A == 3) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(3);
            list1.add(3);
            list1.add(1);
            return list1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(1);
        A -= 3;
        ArrayList<Integer> newList = new ArrayList<>();
        while(A-- > 0) {
            newList.add(1);
            for(int i=1;i<list.size();i++) {
                newList.add(list.get(i) + list.get(i-1));
            }
            newList.add(1);
            list = newList;
            newList = new ArrayList<>();
        }
        return list;
    }
}
