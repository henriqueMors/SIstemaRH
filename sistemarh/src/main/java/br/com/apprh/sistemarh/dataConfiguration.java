package br.com.apprh.sistemarh;

import javax.sql.DataSource;

import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.JpaVendorAdapter;

@SuppressWarnings("unused")
@Configuration
public class dataConfiguration {
    
    @Bean
    public DataSource dataSource() {
        
        //verificar a criacao real de um db no linux
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/apprh?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        return dataSource;
        
    }
    
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MariaDBDialect");
        adapter.setPrepareConnection(true);
        return adapter;
    }
}

