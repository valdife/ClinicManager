
package com.webndb;

import com.webndb.address.Address;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;

@Configuration
@PropertySource({"classpath:application.properties"})
@EnableJpaRepositories(
        basePackages = "com.webndb.address",
        entityManagerFactoryRef = "addressEntityManagerFactory",
        transactionManagerRef = "addressTransactionManager"
)
public class AddressConfig {

    @Bean
    @ConfigurationProperties("addr.datasource")
    public DataSourceProperties addressDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("addr.datasource.configuration")
    public BasicDataSource addressDataSource() {
        return addressDataSourceProperties().initializeDataSourceBuilder()
                .type(BasicDataSource.class).build();
    }

    @Bean(name = "addressEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean addressEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(addressDataSource())
                .packages(Address.class)
                .persistenceUnit("addr")
                .build();
    }

    @Bean
    public PlatformTransactionManager addressTransactionManager(@Qualifier("addressEntityManagerFactory") EntityManagerFactory addressEntityManagerFactory) {
        return new JpaTransactionManager(addressEntityManagerFactory);
    }
}