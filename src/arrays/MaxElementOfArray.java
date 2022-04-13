package arrays;

public class MaxElementOfArray {



        public static void main(String[] args) {

            int [] array = {12, 23, 9, 34, 3, 29};

//        Arrays.sort(array);
//
//        System.out.println(Arrays.toString(array));
//
//        int max= array[array.length-1];
//
//        System.out.println("Maz element is: " +max);

            int max = array[0];//12
            for(int i=0; i< array.length; i++){
                // 12, 23,34      12, 23, 9, 34, 3, 29
                if(max < array[i]){
                    max = array[i];//23,34
                }

            }

            System.out.println("Max number is: "+max);



        }

    }
