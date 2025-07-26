class Solution {
    public int findJudge(int n, int[][] trust) {
        // if(n<1) return -1;
        // if(n==1) return 1;
        // ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        // for(int i=0;i<=n;i++) list.add(new ArrayList<>());
        // for(int i=0;i<trust.length;i++){
        //     int u=trust[i][0];
        //     int v=trust[i][1];
        //     list.get(u).add(v);
        // }
        // for(int i=1;i<=n;i++){
        //     if(list.get(i).size()==0){
        //         int cnt=0;
        //         for(int j=1;j<=n;j++){
        //             if(list.get(j).contains(i)) cnt++;
        //         }
        //         if(cnt==n-1) return i;
        //     }
        // }
        // return -1; 
        if(n==1) return 1;
        int judge[]=new int[n+1];
        for(int[]a:trust)
        { 
            judge[a[0]]--;
            judge[a[1]]++;
        }
        for(int i=0;i<=n;i++)
        {
             if(judge[i]==n-1)
             { 
                return i;
             }
        }
        return -1; 
    }
}