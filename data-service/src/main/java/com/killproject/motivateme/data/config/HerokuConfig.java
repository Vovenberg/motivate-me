package com.killproject.motivateme.data.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
//@Profile("heroku")
public class HerokuConfig {
    private static String urlHardcode = "postgres://ucvuctumtlcfpv:929159d89fe24e09806662e4222679d79dc194ac31937a83c20abce38d88cad0@ec2-54-228-243-238.eu-west-1.compute.amazonaws.com:5432/d586c5l38ner3u";

    @Bean
    public DataSource dataSourceHeroku() throws URISyntaxException {
        String database_url = System.getenv("DATABASE_URL");
        URI dbUri = new URI(urlHardcode);

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        config.setUsername(username);
        config.setPassword(password);

        return new HikariDataSource(config);
    }

}