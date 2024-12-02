// class ninjaTrainingDP7{
//     public static solve(int day,int lastDay,int task[][]){
//         if(day==0){
//             int maxi=Integer.MAX_VALUE;
//             for(int i=0;i<3;i++){
//                 maxi=Math.max(maxi,task[day][i])
//             }
//             return maxi;
//         }
//         for(int i=0;i<3;i++){
//             int maxi= solve(day-1,maxi);
//         }
//     }
//     public static void main(String[] args) {
//         int points[][]={{},{}};
//         int n=points.length;

//         //for(int)
//         solve(n-1,3,points);

//     }
// }