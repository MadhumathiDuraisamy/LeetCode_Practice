class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }

        int[] visit = new int[numCourses]; // 0 = unvisited, 1 = visiting, 2 = visited

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, visit, graph)) {
                return false; // found a cycle
            }
        }

        return true;
    }

    private boolean hasCycle(int node, int[] visit, List<List<Integer>> graph) {
        if (visit[node] == 1) return true;  // node is in current path → cycle
        if (visit[node] == 2) return false; // already processed → no cycle

        visit[node] = 1; // mark as visiting

        for (int neighbor : graph.get(node)) {
            if (hasCycle(neighbor, visit, graph)) return true;
        }

        visit[node] = 2; // mark as fully visited
        return false;
    }
}