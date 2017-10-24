class notString{
public static void main(String[] args) {

    notString("semicolon");
    notString("not semicolon");

    //receive command line argument if available
    if(args.length>0){
      notString(args[1]);
    }

}

private static void notString(String str) {
  String not = "not";
  String substr = str.substring(0,3);

  if (substr.equals(not)) {
  System.out.println(str);

}else{
  System.out.println(not + " " + str);
}
}
}
