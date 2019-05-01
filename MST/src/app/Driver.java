package app;


import structures.Graph;
import structures.PartialTree;

import java.io.IOException;
import java.util.ArrayList;
public class Driver{
	public static void main(String[] args){
        Graph graph = null;
        try {
            graph = new Graph("test4.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        PartialTreeList mst = new PartialTreeList();
        mst = mst.initialize(graph);
        System.out.println(mst.execute(mst));
    }
}

