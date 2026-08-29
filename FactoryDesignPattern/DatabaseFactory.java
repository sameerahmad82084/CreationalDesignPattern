public class DatabaseFactory {
    public DbConnection create(String objType){
        if(objType.equals("MySql")){
            return new MySqlDb();
        }
        else if(objType.equals("MongoDb")){
            return new MongoDb();

        }
        throw new IllegalArgumentException("Enter valid database type");
    }
}
