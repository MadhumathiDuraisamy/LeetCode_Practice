class Solution {
    public boolean squareIsWhite(String coordinates) {
        int res=coordinates.charAt(0)+coordinates.charAt(1);
        return (res%2==0)?false:true;
    }
}