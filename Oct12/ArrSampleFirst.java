package Oct12;

public class ArrSampleFirst {

    public static void main(String[] args) {

        functionsOfArray creator=new functionsOfArray();
        int [] arr=creator.createArray();// creating array
        System.out.println(creator.findMinimumElement(arr));//Finding minimum element
        System.out.println(creator.findMaximumElement(arr));//Finding maximum element
        if (arr!=null && arr.length>0){
         int [] reverseArr=creator.reverseOfArray(arr); //reversing array
         creator.printArray(reverseArr);//printing array
        }

    }
}
