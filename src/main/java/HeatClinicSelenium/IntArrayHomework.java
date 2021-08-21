package HeatClinicSelenium;

public class IntArrayHomework {

    public static void main(String [] args) {

    //find the largest number in an intArray

        int [] myArray = {15,10,5,20,3};

        int largestNumber = myArray[0];

        for(int i=0; i < myArray.length; i++) {

            if(myArray[i] > largestNumber ) {
                largestNumber = myArray[i];
            }
        }
        System.out.println(largestNumber);
    }
}