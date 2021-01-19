package socket;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[]allOut={56,3,5,7,56,8,32,98,6,123,56,875,56,56};
        int pw=56;
//        System.out.println(Arrays.toString(allOut));
//        for(int i=0;i<allOut.length;i++){
//            if (allOut[i]==pw){
//               allOut[i]=allOut[allOut.length-1];
//               allOut=Arrays.copyOf(allOut,allOut.length-1);
//               break;
//            }
//        }
        for(int i=0;i<allOut.length-1;i++){
            for(int j=0;j<allOut.length-1-i;j++){
                if(allOut[j]==pw){
                    int k=allOut[j];
                    allOut[j]=allOut[j+1];
                    allOut[j+1]=k;
                }
            }
            if(allOut[allOut.length-1]==pw){
                allOut=Arrays.copyOf(allOut,allOut.length-1);
            }
        }
        System.out.println(Arrays.toString(allOut));
//        System.out.println(Arrays.toString(allOut));

    }
}
