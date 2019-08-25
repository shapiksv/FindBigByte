import java.io.FileInputStream;
import java.util.*;

public class FindBigByte {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> i = new ArrayList<>();
        Set<Integer> wot = new HashSet<>();
        FileInputStream inputStream = new FileInputStream(s);
        while (inputStream.available() > 0){
            i.add( inputStream.read());
        }
        inputStream.close();
        int p = 0;
        for(Integer f: i){
            int g = 0;
            int z = 0;
            for (Integer h: i){
                if(f.equals(h)){
                    g +=1;
                }
            }
            if(z<=g){
                z = g;
            }
            p = z;
        }
        for(Integer f: i){
            int g = 0;
            for (Integer h: i){
                if(f.equals(h)){
                    g +=1;
                }
            }
            if (p == g){
                wot.add(f);
            }
        }
        for (Integer w : wot) {
            System.out.print(w + " ");
        }
    }
}
