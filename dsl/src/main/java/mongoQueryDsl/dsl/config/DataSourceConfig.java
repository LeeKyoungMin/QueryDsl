package mongoQueryDsl.dsl.config;

import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableJpaAuditing 
@EnableConfigurationProperties()
public class DataSourceConfig {

    @Autowired
    private Environment env;

    // @Value("${emailTemplate.apiAmddelOk}")
    // private String emailAmdDelOk;

    // @Autowired
    // private PriJpaProperties priJpaProperties;

    // @Autowired
    // private SecJpaProperties secJpaProperties;

    
    // @Bean(name = "dataSource")
    // @ConfigurationProperties("spring.datasource")
    // public DataSource dataSource(){
    //     return DataSourceBuilder.create()
    //             .url(null)
    //             .type(HikariDataSource.class)
    //             .build();
    // }
    
    @Bean(name="DataSource") 
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("org.postgresql.Driver");
        hikariConfig.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
        hikariConfig.setUsername("postgres");
        hikariConfig.setPassword("new1234!");
        hikariConfig.setMaximumPoolSize(10);
        hikariConfig.setConnectionTimeout(5000);
        hikariConfig.setValidationTimeout(4000);
        hikariConfig.setMaxLifetime(600000);
        DataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource;
    }
    
}
