import java.util.*;
public class Sort_2 {
    public static void main(String[] args) {
        String[] k = new String[] { "1,44","3,4","5,63","5,6","3,2","4,3"};
        System.out.println(Arrays.toString(k));
        String[] o1 = new String[k.length*2];
        List<Integer> Container = new ArrayList<Integer>();
        for (int i = 0; i < k.length; i++) {
            o1 = k[i].split(",");
            Container.add(Integer.parseInt(o1[0]));
            Container.add(Integer.parseInt(o1[1]));
            // System.out.println(o1[0]);
            // System.out.println(o1[1]);
        }
        System.out.println(Arrays.toString(o1));
        System.out.println(Container);
        for (int i = 0, j = i+1 ; i < Container.size(); i++, j++) {
            if(j==Container.size()){
                break;
            }else{
                System.out.println(Container.get(i));
                System.out.println(Container.get(j));
            }
        }

    }
}
