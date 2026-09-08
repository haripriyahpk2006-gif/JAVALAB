public class ArrayDemo{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        int sum =0;
        for (int i =0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Array elements:");
        for(int num:numbers){
            System.out.println(num+=" ");
        }
        System.out.prinln("\nSum="+sum);
        if (sum > 100){
            System.out.println("Sum is grater that 100");
        }else{
            System.out.println("sum is less that or equal to 100");

        }
        }
}

