
public class SumOfArray {


    public static int sumOfNumbersInArray(int[] array) {
        int index = 0;
        int indexSum = 0;
        while (index < array.length) {
            indexSum = array[index] + indexSum;
            index++;
        }
        return indexSum;
    }

    // public static int sumOfNumbersInArray(int[] array) {
    //     int sum = 0;
    //     for (int number : array) {
    //         sum = number + sum;
    //     }
    //     return sum;
    // }

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }


}

//while index < length of array
//take each number from each index and add them
//return the total
