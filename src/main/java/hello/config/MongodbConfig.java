package hello.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by hongpf on 16/4/15.
 */
@Configuration
//@EnableMongoRepositories
public class MongodbConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "springdata";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }
}
