package dive.dev.secondary.migration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondaryDatabaseMigration {
	
	@Autowired
	@Qualifier("secondaryDbDataSource")
	private DataSource secondaryDatasource;
	
	@Value("${spring.flyway.secondary.locations}")
    private String secondaryLocations;
	
	@PostConstruct
	public void migrateSecondaryDatabase() {
		Flyway.configure()
		.dataSource(secondaryDatasource)
		.locations(secondaryLocations)
		.load()
		.migrate();
	}

}
