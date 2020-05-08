import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/leofirmeza";
        String user = "root";
        String password = "example";

        ResultSet resultSet = DriverManager
                .getConnection(url, user, password)
                .prepareStatement("select * from users")
                .executeQuery();

        while (resultSet.next()) {
            System.out.println("Nome: " + resultSet.getString("name"));
        }
    }
}
