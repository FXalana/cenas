class FrontBack {
  public static void main(String[] args) {

    frontBack("heisenberg");

    //receive command line argument if available
    if(args.length>0){
      frontBack(args[0]);
    }
  }

  private static void frontBack(String str) {
    char lether1 = str.charAt(0);
    char lether2 = str.charAt(str.length()-1);
    String sub = str.substring(1, str.length()-1);
    System.out.println(lether2 + sub + lether1);

    // print result here

  }
}
