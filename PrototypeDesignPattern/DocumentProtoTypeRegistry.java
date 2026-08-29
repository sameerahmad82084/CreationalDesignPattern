import java.util.HashMap;

public class DocumentProtoTypeRegistry {
    private HashMap<String,Document> registry;
    public DocumentProtoTypeRegistry(HashMap<String,Document> registry){
        this.registry=registry;
    }
    public void register(String key,Document value){
        registry.put(key,value);
    }
    public Document getPrototypeObj(String key){
        if(registry.containsKey(key)&&registry.get(key)!=null){
            return registry.get(key).copy();
        }
        throw new IllegalArgumentException("Invalid prototype");
    }

}
