// public class removeduplicate
// {
//     public static void main(String[] args)
//     {
//         int[] arr = {1,2,2,4,3,4};

//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<i;j++)
//             {
//                 if(arr[j]==arr[i])
//                 {
//                     arr[i]=-1;
//                 }
//             }
//         }
//         int count = 0;
//         for(int k=0;k<arr.length;k++)
//         {
//             if(arr[k]==-1)
//             {
//                 count++;
//             }
//             else{
//                 System.out.println(arr[k]+" ");
//             }
//         }
//         int[] arr1 = new int[arr.length-count];
//         int idx = 0;
//         for(int c = 0;c<arr.length;c++)
//         {
//             if(arr[c]!=-1)
//             {
//                 arr1[idx] = arr[c];
//                 idx++;
//             }
//         }
//         for(int i=0;i<arr1.length;i++)
//         {
//             System.out.print(arr1[i]+" ");
//         }
//     }
// }