package dive.dev.primary.migration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimaryDatabaseMigration {
	
	@Autowired
	@Qualifier("primaryDbDataSource")
	private DataSource primaryDatasource;
	
	@Value("${spring.flyway.primary.locations}")
    private String primaryLocations;
	
	@PostConstruct
	public void migratePrimaryDatabase() {
		Flyway.configure()
		.dataSource(primaryDatasource)
		.locations(primaryLocations)
		.load()
		.migrate();
	}

}
