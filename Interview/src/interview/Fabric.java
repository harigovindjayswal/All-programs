
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




public class Fabric {

    String c;
    Integer d;
    Integer u;

    public Fabric() {

    }
    public static Comparator<Fabric> color = new Comparator<Fabric>() {
        public int compare(Fabric f1, Fabric f2) {
            return f1.c.compareTo(f2.c);
        }
    };
    public static Comparator<Fabric> durability = new Comparator<Fabric>() {
        public int compare(Fabric f1, Fabric f2) {
            return f1.d.compareTo(f2.d);
        }
    };
    public static Comparator<Fabric> identity = new Comparator<Fabric>() {
        public int compare(Fabric f1, Fabric f2) {
            return f1.u.compareTo(f2.u);
        }
    };

    @Override
    public String toString() {
        return "Fabric{" + "c=" + c + ", d=" + d + ", u=" + u + '}';
    }

    public static void main(String args[]) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());

        int cas = 1;
        while (cas <= n) {

            int q = Integer.parseInt(rd.readLine());

            ArrayList<Fabric> al = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                String str[] = (rd.readLine()).split(" ");
                Fabric f = new Fabric();
                f.c = str[0];
                f.d = Integer.parseInt(str[1]);
                f.u = Integer.parseInt(str[2]);
                al.add(f);
            }
            Collections.sort(al, color);

            ArrayList<Fabric> ada = new ArrayList<Fabric>(al);
            Collections.sort(al, durability);

            ArrayList<Fabric> charles = new ArrayList<Fabric>(al);
            Collections.sort(al, identity);

            int count = 0;
            for (int i = 0; i < al.size(); i++) {
                if(al.size()>2){
                if ((al.get(i).u == ada.get(i).u || al.get(i).u == charles.get(i).u) && (ada.get(i).c==charles.get(i).c || ada.get(i).d==charles.get(i).d ) ) {
                    count++;
                }
                else{
                     
                }
            }

            System.out.println("Case #" + cas + ": " + count);
            cas++;

        }

    }
    }
}
