// Last updated: 7/11/2026, 2:03:09 PM
class Solution {
    public double average(int[] salary) {
        int max= salary[0];
        int n = salary.length;
        for(int i=0;i<n;i++){
            if(max<salary[i]){
                max = salary[i];
            }
        }
        int min = salary[0];
        for(int i =0;i<n;i++){
            if(min>salary[i]){
                min = salary[i];
            }
        }
        int total =0;
        for(int i=0;i<n;i++){
            total = total+salary[i];
        }
        return ((double)(total-max-min)/(double)(n-2)) ;
    }
}