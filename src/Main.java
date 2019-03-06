public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Hello World!");
            System.out.println("HAHAHAA");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
