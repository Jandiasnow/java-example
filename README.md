# Spring Boot REST API Demo

这是一个基于 Spring Boot 的 RESTful API 示例项目，实现了基本的用户管理 CRUD 操作。

## 项目结构

```
src/
  ├── main/
  │   ├── java/
  │   │   └── com/example/
  │   │       ├── config/       # 配置类
  │   │       ├── controller/   # REST API 控制器
  │   │       ├── entity/       # 数据实体类
  │   │       ├── repository/   # 数据访问层
  │   │       ├── service/      # 业务逻辑层
  │   │       └── Main.java     # 应用入口
  │   └── resources/
  │       └── application.yml   # 应用配置文件
  └── test/                     # 测试代码目录
```

## 技术栈

- Spring Boot 3.1.5
- Spring Data JPA
- H2 Database
- SpringDoc OpenAPI 3
- Maven
- Java 17
- Docker

## 本地构建和运行

1. 构建项目：
```bash
mvn clean package
```

2. 运行项目：
```bash
mvn spring-boot:run
```

## Docker 部署

1. 构建 Docker 镜像：
```bash
docker build -t spring-demo .
```

2. 使用 Docker Compose 启动服务：
```bash
docker-compose up -d
```

3. 停止服务：
```bash
docker-compose down
```

4. 查看服务日志：
```bash
docker-compose logs -f
```

## API 文档

项目集成了 Swagger UI，可以通过以下地址访问 API 文档：

- Swagger UI 界面：http://localhost:8080/swagger-ui.html
- OpenAPI 规范文档：http://localhost:8080/api-docs

## API 端点

### 用户管理 API

1. 创建用户
```
POST /api/users
Content-Type: application/json

{
    "name": "张三",
    "email": "zhangsan@example.com",
    "age": 25
}
```

2. 获取所有用户
```
GET /api/users
```

3. 获取指定用户
```
GET /api/users/{id}
```

4. 更新用户
```
PUT /api/users/{id}
Content-Type: application/json

{
    "name": "李四",
    "email": "lisi@example.com",
    "age": 30
}
```

5. 删除用户
```
DELETE /api/users/{id}
```

## 数据库访问

H2 数据库控制台访问地址：http://localhost:8080/h2-console

连接信息：
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: [空]

## 健康检查

应用健康状态可以通过以下端点查看：
- http://localhost:8080/actuator/health 