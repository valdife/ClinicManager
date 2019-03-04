package com.webndb;

import com.webndb.wb.Patient;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;

@Configuration
@PropertySource({"classpath:application.properties"})
@EnableJpaRepositories(
        entityManagerFactoryRef = "patientEntityManagerFactory",
        transactionManagerRef = "patientTransactionManager",
        basePackages = {"com.webndb.wb"}
)
public class PatientConfig {

    @Primary
    @Bean
    @ConfigurationProperties("pat.datasource")
    public DataSourceProperties patientDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    @ConfigurationProperties("pat.datasource.configuration")
    public HikariDataSource patientDataSource() {
        return patientDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name = "patientEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean patientEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(patientDataSource())
                .packages(Patient.class)
                .persistenceUnit("pat")
                .build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager patientTransactionManager(
            @Qualifier("patientEntityManagerFactory") EntityManagerFactory patientEntityManagerFactory) {
        return new JpaTransactionManager(patientEntityManagerFactory);
    }
}