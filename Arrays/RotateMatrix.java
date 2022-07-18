public class RotateMatrix {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        int i = 0;
        int j = a.size() - 1;
        while(i < j) {
            int k = 0;
            int l = 0;
            while((i + k) < a.size() - i && (j + l) >= a.size() - j) {
                int temp = a.get(j + l).get(i);
                int temp1 = a.get(i).get(i + k);
                a.get(i).set(i + k, temp);
                temp = temp1;
                
                temp1 = a.get(i + k).get(j);
                a.get(i + k).set(j, temp);
                temp = temp1;
                
                temp1 = a.get(j).get(j + l);
                a.get(j).set(j + l, temp);
                temp = temp1;
                
                a.get(j + l).set(i, temp);
                k++;
                l--;
            }
            i++;
            j--;
        }
	}
}
