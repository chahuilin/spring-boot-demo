package com.zhexinit.taobaocrbt.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.zhexinit.taobaocrbt.mapper.xingbook_user", sqlSessionTemplateRef = "xingbookUserSqlSessionTemplate")
public class XingbookUserDataSourceConfig {

    @Bean(name = "xingbookUserDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.xingbookuser")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "xingbookUserSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("xingbookUserDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "xingbookUserTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("xingbookUserDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "xingbookUserSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(
            @Qualifier("xingbookUserSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}