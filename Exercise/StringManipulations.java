class StringManipulations{
  public static void main(String[] args) {

    String str = "http://www.academiadecodigo.org";
    String replacement = "< Academia de Codigo_ >";
    String search ="w";
    int possi = str.indexOf(search);
      String sub = str.substring(possi);
    str = str.replace(str, replacement);

    String domain = sub; // www.academiadecodigo.org
    String name = "";   // < Academia de Codigo_ >

    System.out.println(sub);
    System.out.println(str);
    // print the following message at the end
    // I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org

  }
}
