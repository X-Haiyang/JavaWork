package j1123.sources;

import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class match {

    public static void matchAABB(ResultSet resultSet) {
        try {
            while (resultSet.next()) {

                String line = resultSet.getString("name");
                Pattern p = Pattern.compile("(.)\\1(.)\\2");
                Matcher m = p.matcher(line);
                if (m.find()) {
                    System.out.print("AABB pattern: " + m.group() + " ");
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void matchABAB(ResultSet resultSet) {
        try {

            while (resultSet.next()) {

                String line = resultSet.getString("name");
                Pattern p = Pattern.compile("(.)(.)\\1\\2");
                Matcher m = p.matcher(line);
                if (m.find()) {
                    System.out.print("ABAB pattern: " + m.group() + " ");
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
