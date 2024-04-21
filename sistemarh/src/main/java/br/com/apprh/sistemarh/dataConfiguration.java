package br.com.apprh.sistemarh;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class dataConfiguration {
    
    @Bean
    public DataSource dataSource() {
        
        //verificar a criacao real de um db no linux
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/apprh?useTimezone=true&serverTimezone=UTC");
        dataSource.getUsername("root");
        dataSource.getPassword("xxxxxxxxx");
        return (DataSource) dataSource();
    }
}
