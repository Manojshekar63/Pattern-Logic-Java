import java.util.*;
public class nearestcarparking {
    static  class park implements Comparable <park>{
        int x;
        int y;
        int distsq;
        int idx;
        public park(int x, int y ,int distsq, int idx)
        {
            this.x=x;;
            this.y=y;
            this.distsq=distsq;
            this.idx=idx;
        }
        @Override
        public  int compareTo(park p2){
            return this.distsq -p2.distsq;
        }
    }
    public static void main(String args[]){
        int pnts[][]= {{3,3} ,{5,-1} ,{-2,4}};
        int k=2;
        PriorityQueue<park> pq = new PriorityQueue<>();
        for(int i=0;i<pnts.length;i++){
            int distsq=pnts[i][0] * pnts[i][0] + pnts[i][1] * pnts[i][1];
            pq.add(new park (pnts[i][0] , pnts[i][1] ,distsq ,i));
        }
        // ...existing code...
for(int i = 0; i < k; i++) {
    park nearest = pq.remove();
    System.out.println("C" + nearest.idx + " Distance: " + nearest.distsq);
}
// ...existing code...
    }

    
}
