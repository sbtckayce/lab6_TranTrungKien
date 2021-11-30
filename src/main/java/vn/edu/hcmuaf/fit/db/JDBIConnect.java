package vn.edu.hcmuaf.fit.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jdbi.v3.core.Jdbi;

import java.sql.SQLException;

import static vn.edu.hcmuaf.fit.db.DBProperties.*;

public class JDBIConnect {
    private static Jdbi jdbi;

    private static void makeConnect() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://" + getDbHost() + ":" + getDbPort() + "/" + getDbDataBaseName());
 //       dataSource.setURL("jdbc:mysql://localhost:3306/user");
        dataSource.setUser(getUserName());
        dataSource.setPassword(getPassword());
        try {
            dataSource.setUseCompression(true);
            dataSource.setAutoReconnect(true);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        jdbi = Jdbi.create(dataSource);
    }

   private JDBIConnect(){

   }

    public static Jdbi get() {
        if (jdbi == null) makeConnect();
        return jdbi;

    }
}
