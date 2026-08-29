
public interface DbConnection {
    String connectDb(String username,String password,String url);
    DbQuery executeQuery();
}
