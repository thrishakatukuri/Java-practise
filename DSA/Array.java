package DSA;
public class Array {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.frequency(new int[]{10,2,2, 11, 1, 2, 3, 4, 2, 2, 3});
        }
        void frequency(int[] a){
            for(int i=0; i<a.length;i++){
            int count = 0;
                if(a[i]==-1){
                    continue;
                }
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=-1;
                    }
                }
            System.out.println(a[i]+" occurs : "+count+" times");
            }
        }
    }