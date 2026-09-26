class Solution {
    public boolean checkRecord(String s) {
        int n=s.length();
        int absent=0;
        int late=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                absent++;
            }
            if(s.charAt(i)=='L'){
                late++;
                if(late>max){
                    max=late;
                }
            }
            else{
                late=0;
            }
        }
        if(absent>=2||max>=3){
            return false;
        }
        else{
            return true;
        }
    }
}