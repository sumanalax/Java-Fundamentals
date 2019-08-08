import java.util.ArrayList;

public class BasicsDemo{

public void odd(){
for(int i=1; i<256; i++){
    if(i%2==1){
        System.out.println(i);
    }
    }
}
        
    
    public void printSum(){
        int sum = 0;
    for(int i=0; i<256; i++){
        int  numbers = i;
        // System.out.println("new numbers are:"+numbers);
        int sum1 = sum+numbers;
        System.out.println("new numbers are: "+numbers + " sum: "+sum1);
    }
}

    public void iterate(){
            ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(3);
        myArray.add(5);
        myArray.add(7);
        myArray.add(9);
        myArray.add(13);

    for(int i = 0; i<myArray.size(); i++){
        System.out.println(myArray);
    }
    }

    
    public void average(){
        int sum = 0;
        int [] num1 = {1,5,10,2};
        for(int i =0;i<num1.length; i++){
            sum = sum+num1[i];
        }
            double average = sum/num1.length;
                System.out.println("average is:" +average) ;
    }
    
    public void oddNumbers(){
    int [] y = new int[256];
    for(int i = 1; i<256; i++){
        if(i%2==1){
        y[i] = i;
            System.out.println(y[i]);
        }
    }
}
    

    public void greaterThany(){
        int [] arr = {2,8,5,5,7};
        int y = 3;
        int count= 0;
    for(int i =0; i<arr.length; i++){
        if(arr[i]>y){
        count = count+1;
        }
    }
        System.out.println(count);
    }

    // public void squaresValues(){
    //     int [] arr = {1,3,5,4};
    //     for(int i =0; i<arr.length; i++){
    //         arr[i] = arr[i]*arr[i];
    //         System.out.println(arr[i]);
    //     }
            
    // }

    // public void eliminateNegatives(){
    //     ArrayList<Integer> value = new ArrayList<Integer>();
    //     value.add(1);
    //     value.add(-2);
    //     value.add(3);
    //     value.add(-4);

    //     for(int i=0; i<value.size(); i++){
    //         if(value.get(i)<0){
    //             value.i= 0;
    //         }
            
    //         System.out.println(value.get(i));
    //     }

    // }

    // public void maxMinavg(){
    //     int[] val = {1,5,10,-2};
    //     int max = val[0];
    //     int min = val[0];
    //     int sum = 0;

    // for(int i=1; i<val.length; i++){
    //     if(val[i]>max){
    //         max = val[i];
    //     }
    //     if (val[i]<min){
    //         min = val[i];
    //     }
    //         sum = sum+val[i];
    // }
    //     double average = sum/val.length;
    //         System.out.println("max value is:" +max);
    //         System.out.println("min value is:" +min);
    //         System.out.println("average value is:"+average);
    // }


 public void shiftValues(){
        int [] array ={1,5,10,-2};
    for(int i =0; i<array.length-1; i++){
        array[i] = array[i+1];
        array[array.length-1] = 0;
            System.out.println(array[i]);
    }

}




    

}