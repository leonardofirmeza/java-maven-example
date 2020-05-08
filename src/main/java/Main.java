import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws Exception {

        ResultSet resultSet = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/leofirmeza", "root", "example")
                .prepareStatement("select * from users")
                .executeQuery();

        while (resultSet.next()) {
            System.out.println("Nome: " + resultSet.getString("name"));
        }
    }
}
