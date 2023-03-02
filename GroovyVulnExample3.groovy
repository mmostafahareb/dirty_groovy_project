public class GroovyVulnExample3 {
   public static void main(String[] args) {
      def filename = args[0]
      def file = new File("/home/user/documents/" + filename)
      // perform file operations on the file
   }
}
