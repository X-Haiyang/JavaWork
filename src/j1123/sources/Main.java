package j1123.sources;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

//以下是一个简单的Java程序，它使用正则表达式来匹配并打印出.txt文件中所有AABB和ABAB类型的四字成语。
//AABB
//(.)\1(.)\2
//ABAB
//(.)(.)\1\2
public class Main {

    public static void main(String[] args) {

        String sql = "SELECT name FROM chengyu";
        try {
            Connection connection = UtilsJDBC.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            match.matchAABB(resultSet);

            resultSet = statement.executeQuery(sql);

            match.matchABAB(resultSet);

            UtilsJDBC.connectClose(connection, statement, resultSet);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}