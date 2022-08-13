package Leetcode.Array;

/*
You are given an array points representing integer coordinates of some points on a 2D-plane,
where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance
between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if
there is exactly one simple path between any two points.
 */


import java.util.*;

class UnionFind{
    public int[] group;
    public int[] rank;

    public UnionFind(int size){
        group = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; ++i){
            group[i] = i;
        }
    }

    public int find(int node){
        if (group[node] != node){
            group[node] = find(group[node]);
        }
        return group[node];
    }

    public boolean union(int node1, int node2){
        int gr1 = find(node1);
        int gr2 = find(node2);

        if (gr1 == gr2){
            return false;
        }

        if (rank[gr1] > rank[gr2]){
            group[gr2] = gr1;
        }
        else if (rank[gr1] < rank[gr2]){
            group[gr1] = gr2;
        }
        else{
            group[gr1] = gr2;
            rank[gr2]++;
        }
        return true;
    }

}

public class _1584_min_cost_to_connect_all_points {

    public int minCostConnectPoints(int[][] points){
        int n = points.length;
        ArrayList<int[]> allEdges = new ArrayList<>();

        for (int currNext = 0; currNext < n; ++currNext){
            for (int nextNext = currNext + 1; nextNext < n; ++nextNext){
                int weight = Math.abs(points[currNext][0] - points[nextNext][0]) + Math.abs(points[currNext][1] - points[nextNext][1]);
                int[] currEdge = {weight, currNext, nextNext};
                allEdges.add(currEdge);
            }
        }
        allEdges.sort(Comparator.comparingInt(a -> a[0]));
        UnionFind uf = new UnionFind(n);
        int mstCost = 0;
        int edgesUsed = 0;
        for (int i = 0; i < allEdges.size() && edgesUsed < n - 1; ++i) {
            int node1 = allEdges.get(i)[1];
            int node2 = allEdges.get(i)[2];
            int weight = allEdges.get(i)[0];

            if (uf.union(node1, node2)) {
                mstCost += weight;
                edgesUsed++;
            }
        }

        return mstCost;
    }

    public void main(String[] args) {
        int[][] points = {{0,0}, {2,2}, {3,10},{5,2},{7,0}};
        System.out.println(minCostConnectPoints(points));
    }

}
