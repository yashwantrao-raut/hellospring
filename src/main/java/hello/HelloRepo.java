package hello;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloRepo {

    DB db ;

    @Autowired
    public  HelloRepo( MongoClient mongoClient) {
            db =mongoClient.getDB("hello");
    }

    DBObject getHello(){
         return db.getCollection("hello").findOne();
    }

}
