import java.util.ArrayList;

public class sorting {
    static ArrayList<Double> myList = new ArrayList<>();

    public static void selectionSort(ArrayList<Double> list){
        int listSize = list.size();

        //one by one move boundary of unsorted array
        for(int i=0;i<listSize-1;i++){
            //find the minimum element in the unsorted array
            int minIndex = i;
            for(int j=i+1;j<listSize;j++){
                if(list.get(j)<list.get(minIndex)){
                    minIndex = j;
                }
            }

            //swap the found minimum element with the first element
            double temp = list.get(minIndex);
            list.set(minIndex,list.get(i));
            list.set(i,temp);
        }

        System.out.println(list);
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            myList.add(0,Math.random());
        }
        System.out.println(myList);
        selectionSort(myList);
    }
}
