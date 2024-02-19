package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 01_bfs
 */
public class I_bfs {
    public static class Edges{
        //create  class Edges which contain our source node destination node and weight of that edge
        int src;
        int des;
        int wt;

        public Edges(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }
    public static void creategraph(ArrayList<Edges> graph[]){
        for (int i = 0; i <graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edges(0,1,1));
        graph[0].add(new Edges(0,2,1));

        graph[1].add(new Edges(1,1,1));
        graph[1].add(new Edges(1,3,1));

        graph[2].add(new Edges(2,0,1));
        graph[2].add(new Edges(2,4,1));

        graph[3].add(new Edges(3,1,1));
        graph[3].add(new Edges(3,4,1));
        graph[3].add(new Edges(3,5,1));

        graph[4].add(new Edges(4,2,1));
        graph[4].add(new Edges(4,3,1));
        graph[4].add(new Edges(4,5,1));

        graph[5].add(new Edges(5,3,1));
        graph[5].add(new Edges(5,4,1));
        graph[5].add(new Edges(5,6,1));
    }

    public static void bfs(ArrayList<Edges>[] graph){   //O(V+E)
        Queue<Integer> q =new LinkedList<>();
        //  this line of code creates a new queue (q) that can store integers,
        //  and it is implemented using a LinkedList.
        boolean []visited =new boolean[graph.length]; //to check whether the node is visited or not
        q.add(0);

        while(!q.isEmpty()){
            int current=q.remove(); //remove element from queue

            if (!visited[current]){
                //if the element is not visited the print that element and mark that element to visited
                System.out.print(current+" ");
                visited[current]=true;
                for (int i = 0; i <graph[current].size() ; i++) {
                    Edges e=graph[current].get(i); //get that current edge

                    q.add(e.des);
                    //add the distinction edge to queue that is connected to that current edge
                }

            }
        }
    }

    
public static void main(String[]args){
    int v=7;
    ArrayList<Edges> graph[]=new ArrayList[v];
    creategraph(graph);
    bfs(graph);
    System.out.println();
}
 

    
}