public class GroovyVulnExample2 {
   public static void main(String[] args) {
      def username = "admin"
      def password = "password123"
      def db = new Sql("jdbc:mysql://localhost:3306/mydb", username, password)
      // perform database operations
   }
}
