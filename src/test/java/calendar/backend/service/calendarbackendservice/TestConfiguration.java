package calendar.backend.service.calendarbackendservice;

import calendar.backend.service.calendarbackendservice.user.repository.UserRepository;
import calendar.backend.service.calendarbackendservice.user.service.UserService;
import com.github.fakemongo.Fongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = {UserRepository.class, UserService.class})
public class TestConfiguration {

    @Primary
    @Bean
    public MongoClient mongoClient() {
        return new Fongo("userData").getMongo();
    }

    @Primary
    @Bean
    public MongoTemplate mongoTemplate(final MongoClient mongoClient, final MongoMappingContext context) {
        SimpleMongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClient, "userData");
        MongoConverter mongoConverter = customMongoConverter(mongoDbFactory, context);

        return new MongoTemplate(mongoDbFactory, mongoConverter);
    }

    private MongoConverter customMongoConverter(SimpleMongoDbFactory mongoDbFactory, MongoMappingContext context) {
        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
        converter.afterPropertiesSet();

        return converter;
    }
}
