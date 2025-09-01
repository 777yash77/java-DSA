

import java.util.Scanner;
public class arStr2 {
    
        public static void main(String[]args){
               
                       
                               Scanner sc=new Scanner(System.in);
                                       int size=sc.nextInt();
                                               int limiter=sc.nextInt();
                                                       int[]arr=new int[size];
                                                               int k=0;
                                                                    for(int i=limiter;i<size;i++){
                                                                                 arr[k]=i;
                                                                                              k++;
                                                                                                   }
                                                                                                        k=0;
                                                                                                                for(int i=(size-limiter);i<size;i++){
                                                                                                                            arr[i]=k;
                                                                                                                                        k++;
                                                                                                                                                }
                                                                                                                                                         for(int i=0;i<size;i++){
                                                                                                                                                                     System.out.print(arr[i]+" ");
                                                                                                                                                                             }
                                                                                                                                                                                 }
                                                                                                                                                                                 }
