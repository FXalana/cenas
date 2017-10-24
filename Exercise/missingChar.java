class missingChar{

  public static void main(String[] args){

  missingChar("Robocop", 3);


      if(args.length>=2){
	       missingChar(args[0], Integer.parseInt(args[1]));
       }
     }

private static void missingChar(String str, int n) {
    String a = str.substring(0, n);
    String b = str.substring(n+1);


    System.out.println(a + b);

  }
}
