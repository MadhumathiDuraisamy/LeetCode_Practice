class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] res=new String[score.length];
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<score.length;i++){
            q.add(score[i]);
        }
        int l=score.length;
        while(!q.isEmpty()){
            int val=q.poll();
            int ind=-1;
            for(int i=0;i<score.length;i++){
                if(val==score[i]){
                    ind=i;
                }
            }
            
            if(l==3){
                res[ind]="Bronze Medal";
            }
            else if(l==2){
                res[ind]="Silver Medal";
            }
            else if(l==1){
                res[ind]="Gold Medal";
            }
            else{
                res[ind]=Integer.toString(l);
            }
            l--;
        }
        return res;
    }
}