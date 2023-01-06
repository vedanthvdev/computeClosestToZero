public class ZeroCompute{
    public static int computeToZero(int[] ts){
        int temp = 10000;
        if(ts.toString().isEmpty() == true){
            return 0;
        }
        int[] newTs;
        newTs = new int[ts.length];
        for(int i =0; i<ts.length;i++){
            if(ts[i]<0){
                newTs[i] = ts[i] * (-1);
            }else{
                newTs[i] = ts[i];
            }
            if(newTs[i]<temp){
                temp = newTs[i];
            }
        }
        for(int i =0; i<ts.length;i++){
            if(temp*(-1)==ts[i]){
                temp = ts[i];
            }
        }
        return temp;

    }
// public static void main(String[] args) {
// int[] a = new int[]{-22, 22}; 
// // int[] a ;
// // a = new int[];
// // a = (1, 2, 3, 4);
//  ZeroCompute solution = new ZeroCompute();
// int soul = solution.computeToZero(a);
// System.out.println(soul);

// }

}