
配置多数据源：
### 1. pom:
#### 1.1
spring-boot-starter-web
mybatis-plus-boot-starter
dynamic-datasource-spring-boot-starter # 配置动态数据源
druid-spring-boot-starter # 阿里的数据库连接池
mysql-connector-java/postgre #数据库类型
lombok
#### 1.2
<resources>
    <resource>
        <directory>src/main/java</directory>
        <includes>
            <include>**/*.xml</include>
        </includes>
        <filtering>true</filtering>
    </resource>
</resources>

### 2. yml
#### 2.1
spring:
  datasource:
    dynamic:
      primary: db1
      datasource:
        db1:
          driver-class-name: org.postgresql.Driver
          url: jdbc:postgresql://172.17.172.160:5432/portal?currentSchema=public
          username: postgres
          password: 123456
        db2:
          driver-class-name: org.postgresql.Driver
          url: jdbc:postgresql://172.17.172.160:5432/npi-pss?currentSchema=public
          username: postgres
          password: 123456
      durid:
        initial-size: 1
        max-active: 20
        min-idle: 1
        max-wait: 60000
  autoconfigure:
    exclude:  com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure # 去除druid配置
#### 2.2
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
### 3.Application
@MapperScan({"com.lei.min.**.mapper"})
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)

### 4. repository
@DS("db1") # 在repository api 或 方法上添加;

    
    
    
    
参考：
https://www.cnblogs.com/aizen-sousuke/p/11756279.html