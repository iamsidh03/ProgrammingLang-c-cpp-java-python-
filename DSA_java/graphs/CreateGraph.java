package graphs;

import java.util.ArrayList;

class Edgess {
    int src,dest,wt;
    Edgess(int s, int d, int w){
        this.src=s;
        this.dest=d;
        this.wt=w;

    }
}
public class CreateGraph {
    public static void main(String[] args) {
        int v=5;
            ArrayList<Edgess> []graph=new ArrayList[v];
            for(int i=0;i<v;i++){
                graph[i]=new ArrayList<>();
            }
            graph[0].add(new Edgess(0,1,1));
            graph[0].add(new Edgess(0,2,1));

            graph[1].add(new Edgess(1,1,1));
            graph[1].add(new Edgess(1,3,1));

            graph[2].add(new Edgess(2,0,1));
            graph[2].add(new Edgess(2,4,1));

            graph[3].add(new Edgess(3,1,1));
            graph[3].add(new Edgess(3,4,1));
            graph[3].add(new Edgess(3,5,1));

            graph[4].add(new Edgess(4,2,1));
            graph[4].add(new Edgess(4,3,1));
            graph[4].add(new Edgess(4,5,1));

            for (int i = 0; i < graph[2].size(); i++) {
                Edgess e= graph[2].get(i);
                System.out.println(i);
            }

        
    }
}
