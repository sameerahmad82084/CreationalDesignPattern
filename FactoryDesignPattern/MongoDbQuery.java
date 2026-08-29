
public class MongoDbQuery implements DbQuery{
    @Override
    public String get(String id) {
        return "MongoDb Get Query Executed with id: "+id;
    }

    @Override
    public String insert(String data) {
        return "MongoDb Insert Query Executed with data: "+data;
    }

    @Override
    public String delete(String id) {
        return "MongoDb Delete Query Executed with id: "+id;
    }

    @Override
    public String update(String data) {
        return "MongoDb Update Query Executed with data: "+data;
    }
}
