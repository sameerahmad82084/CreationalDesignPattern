public class MySqlDb implements DbConnection {
    @Override
    public String connectDb(String username, String password, String url) {
        return "Connected to MySql Database:Username "+username+" Password "+password+" Url "+url;
    }

    @Override
    public MySqlQuery executeQuery() {
        return new MySqlQuery();
    }
}
