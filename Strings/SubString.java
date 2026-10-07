package Strings;

 public class SubString{
    public static void main(String[] args) {
        String aa = "12345";
        int sum = 0;
        for(int i=0;i<aa.length();i++){
            for(int j=i+1;j<aa.length();j++){
                System.out.println(aa.substring(i,j));
                 sum = sum +Integer.parseInt(aa);
                System.out.println(sum);
            }
        }
    
 }

 }
// public class SubString {
    // public static void main(String[] args) {
    //     // String aa = "Ankit ";
        // System.out.print(aa);
        
        // aa ="yadavji";
        // System.out.print(aa);
        // String a = "JaiShreeRam" ;
        // // System.out.println(a.substring(8));
        // // System.out.print(a.substring(3, 11) );
        // for(char j = 0; j <a.length();j++ ){
        // for(char i =j; i <=a.length();i++){
        

        //         System.out.println(a.substring(j ,i+1));
        //     }
        //     System.out.println();

//         }


//     }
    
// }

