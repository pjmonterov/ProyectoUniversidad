/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author kpiedra
 */
public class Connection {
   public MongoClient mongo;
    private final String db;
    public MongoDatabase database;
    private static Connection instance;

    public Connection() {
       db = "Universidad";
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        mongo = new MongoClient( new MongoClientURI("mongodb://admin:admin@pmontero-mongo-shard-00-00-gvuoa.mongodb.net:27017,pmontero-mongo-shard-00-01-gvuoa.mongodb.net:27017,pmontero-mongo-shard-00-02-gvuoa.mongodb.net:27017/test?ssl=true&replicaSet=pmontero-mongo-shard-0&authSource=admin&retryWrites=true&w=majority"));
        database = mongo.getDatabase(db);
      
    }

    public Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
            return instance;
        } else {
            return instance;
        }
    }
}

