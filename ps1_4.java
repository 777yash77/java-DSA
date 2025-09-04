
public class ps1_4 {
     static int positive=0;
     static int negative=0;
     static int even=0;
     static int odd=0;
    public static void main(String[]args){
        int example[]={12,-3,55,24,37,13,-9};
        exaMine(example);
    }
    public static void exaMine(int[]arr){
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
                eveOdd(arr[i]);
            }else{
                negative++;
                eveOdd(arr[i]);
            }
        }
        display(positive,negative,odd,even);
    }
    public static void  eveOdd(int num){
        if(num%2==0){
            even++;
        }else{
            odd++;
        }
        }

        private static void display(int positive,int negative,int odd,int eve){
            System.out.println("Total poitive numbers: "+positive);
            System.out.println("Total negative numbers: "+negative);
            System.out.println("Total odd numbers are:"+odd);
            System.out.println("Total even numbers are: "+even);
        }
    }

