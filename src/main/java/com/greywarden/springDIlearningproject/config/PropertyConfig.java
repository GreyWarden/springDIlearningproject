package com.greywarden.springDIlearningproject.config;

import com.greywarden.springDIlearningproject.examplebeans.FakeDataSource;
import com.greywarden.springDIlearningproject.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {
    @Value("${agora.username}")
    String user;
    @Value("${agora.password}")
    String password;
    @Value("${agora.url}")
    String url;

    @Value("${agora.jms.username}")
    String jmsUser;
    @Value("${agora.jms.password}")
    String jmsPassword;
    @Value("${agora.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties () {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
