public class KillCilantro {

   public static String killCilantro(String sentence){
      String find = "cilantro";
      String replace = "parsely";
      String output = sentence;
      int killLoc = sentence.indexOf(find);
      
      while (killLoc != -1) {
        String after = output.substring(killLoc + find.length(), output.length());
        output = output.substring(0, killLoc) + replace + after;
        killLoc = output.indexOf(find);
      }
      
      return output;
   }
   
   public static void main(String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
}
