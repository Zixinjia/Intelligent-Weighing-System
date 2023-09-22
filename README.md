组织结构

```
backend
  └─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─open
    │  │          └─harmony
    │  │              ├─common
    │  │              ├─config
    │  │              ├─controller
    │  │              ├─entity
    │  │              │  └─dto
    │  │              ├─mapper
    │  │              └─service
    │  │                  └─serviceImpl
    │  └─resources
    │      ├─com.open.harmony.mapper
    │      ├─static
    │      └─templates
    └─exportToHTML



## 开发环境安装

### 开发环境

| 工具              | 描述                                                   |
| ----------------- | ------------------------------------------------------ |
| IDEA              | 开发Java程序                                           |
| JDK 1.8           | Java开发工具包，用于编译、运行Java程序                 |
| MySQL 5.7+        | 关系型数据库管理系统，用于存储和管理数据               |
| Git               | 版本控制工具，用于管理和跟踪代码的变更                 |
| Jenkins           | 持续集成和持续交付工具，用于自动化构建、测试和部署软件 |
| DataGrip          | 数据库集成开发环境，用于管理和操作多种数据库系统       |
| Navicat           | 数据库管理和开发工具，用于连接和管理多种数据库         |
| Postman           | API开发和测试工具，用于发送和验证HTTP请求              |
| Alibaba Cloud ECS | 阿里云的云服务器实例，用于托管应用程序和服务           |
| Maven             | 项目构建工具，用于管理和构建Java项目的依赖和构建过程   |
| Typora            | Markdown编辑器                                         |
| X-shell           | Linux远程连接工具                                      |

### 启动

- 推荐使用idea，安装lombok插件后，使用idea导入maven项目
- 将harmony.sql导入到mysql中，修改`application.yml`更改 datasource.url、user、password
- 修改`api.properties` 修改当前接口所在域名
- 启动redis，端口6379
- 通过`WebApplication`启动项目后台接口，`ApiApplication` 启动项目前端接口
- xxl-job定时任务，通过github或者gitee下载xxl-job的已经打包好的源码，把`XxlJobConfig.class`这个文件的代码注释打开，配置yml文件中相关xxl-job配置即可使用

## 技术选型

| 技术             | 说明                | 官网                                           |
| ---------------- | ------------------- | ---------------------------------------------- |
| SpringBoot       | Web应用开发框架     | https://spring.io/projects/spring-boo          |
| MyBatis          | ORM框架             | http://www.mybatis.org/mybatis-3/zh/index.html |
| MyBatisGenerator | 数据层代码生成器    | http://www.mybatis.org/generator/index.html    |
| MyBatis-Plus     | 增强版的MyBatis框架 | https://baomidou.com/                          |
| Jenkins          | 自动化部署工具      | https://github.com/jenkinsci/jenkins           |
| Druid            | 数据库连接池        | https://github.com/alibaba/druid               |
| hikari           | 数据库连接池        | https://github.com/brettwooldridge/HikariCP    |
| OSS              | 对象存储            | https://github.com/aliyun/aliyun-oss-java-sdk  |
| Lombok           | Java语言增强库      | https://github.com/rzwitserloot/lombok         |
| Hutool           | Java工具类库        | https://github.com/looly/hutool                |
| PageHelper       | MyBatis物理分页插件 | http://git.oschina.net/free/Mybatis_PageHelper |
| Swagger-UI       | API文档生成工具     | https://github.com/swagger-api/swagger-ui      |
| Log4j            | 日志管理工具        | https://logging.apache.org/log4j/2.x/          |
| JUnit            | 单元测试框架        | https://junit.org/junit5/                      |
| Fastjson         | JSON处理工具        | https://github.com/alibaba/fastjson            |
| Maven            | 项目构建工具        | https://maven.apache.org/                      |


## 功能模块

在这里列出项目后端的主要功能模块，并对每个功能模块进行简要说明。例如：

1. 用户管理模块：实现用户的注册、登录和权限管理等功能。
2. 商品管理模块：实现商品的增删改查操作，包括商品的添加、修改和查询等功能。
3. 订单管理模块：实现订单的创建、支付和查询等功能。

## 快速开始

在这里提供项目的快速开始指南，包括如何下载、配置和运行项目的步骤。例如：

1. 克隆项目代码到本地：

   Copy

   ```
   git clone git@atomgit.com:so_love_bang/backend.git
   ```

2. 配置数据库连接信息：

   在`application.yml`文件中配置数据库连接信息，包括数据库URL、用户名和密码等。

3. 运行项目：

   使用开发工具导入项目，并运行主类（如`Application.java`），启动Spring Boot应用。

4. 测试接口：

   使用API调试工具（如Postman）测试项目的接口，验证功能是否正常。

## 接口文档

访问路径 http://jiazixin.xyz/swagger-ui/#/

![image-20230922182227640](C:\Users\honor\AppData\Roaming\Typora\typora-user-images\image-20230922182227640.png)

