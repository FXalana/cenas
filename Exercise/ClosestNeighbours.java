class ClosestNeighbours{
  public static void main(String[] args) {

    int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
    int[] result = findClosest(myArray);
    // print the elements of the resulting array
    System.out.println(result[0]);
    System.out.println(result[1]);

  }
  private static int[] findClosest(int[] numbers) {
    // hint: remember Math.abs();
    int[] array = new int[2];
    int comp = Math.abs(numbers[0]-numbers[1]);
    array[0]=numbers[0];
    array[1]=numbers[1];
    for(int i = 0; i< numbers.length-1; i++){
      int cont = Math.abs( numbers[i] - numbers[i+1]);
      if (cont < comp){
        comp = cont;
        array[0] = numbers[i];
        array[1] = numbers[i+1];
      }
    }
    return array;  // de un array de int's

  }
}
