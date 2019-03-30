class Main {
  public static void main(String[] args) {

    QuickSorting obj = new QuickSorting(); //creating an object of the main 
    int [] arr = {5, 6, 2, 9,7,1}; // assigning integers to array
    for(int i: arr)
    {
      System.out.print(i+" "); //prints out the array
    }
    int start = 0; //start will be 0 since, the array first index is 0
    int end = arr.length-1; //the last element index in the array 
    obj.quickSort(arr,start, end); //calling the quick sort method from object of QuickSorting Class
    System.out.println();
    for(int i : arr)
    {
      System.out.print(i+ " "); //prints out the sorted array
    }
    
  }
}

class QuickSorting{

// quickSort will use recursive function to complete the sorting process
//it takes the array , the start, and the end index
  public void quickSort(int[] arr,int start,int end){
    if(start<end) //condition to check if sorting needs to be done
    { 
      //the return of the partition function will be assigned to partitionIndex
     int partitionIndex = partition(arr, start, end); 
     //using recursion quickSort will sort the array from the start index till the new partitionIndex -1 b/c partitionIndex is already in the correct index
      quickSort(arr,start,partitionIndex-1);
      //and it will sort the other half from the partitionIndex till the end of the array
      quickSort(arr,partitionIndex+1,end);
    }
  }
  public int partition(int [] arr,int start,int end){
    //pivot signifies that after the partition method, the left side of the pivot will always be less than pivot
    int pivot = arr[end];  //the last element in the array will be assigned to x
    //the index of the parition will be assigned to start
    int partitionIndex = start; 
    
    //i will have the first element which will loop until the last element
    for(int i = start;i<end;i++){
          //if the array in the element is less than the pivot 
          if(arr[i]<=pivot){
              
              //swapping the array elemnts
              int temp = arr[i];
              arr[i]= arr[partitionIndex];
              arr[partitionIndex]=temp;
              partitionIndex++; //increment paritionIndex by 1
          }
    }
    //swapping the first element to the last element in the array
    int temp = arr[partitionIndex];
    arr[partitionIndex] = arr[end];
    arr[end] = temp;

    return partitionIndex; //returns the index of the pivot
  }
 
}
