# 使用 OpenJDK 17 作为基础镜像
FROM openjdk:17-slim

# 设置工作目录
WORKDIR /app

# 复制 Maven 构建的 jar 文件到容器中
COPY target/*.jar app.jar

# 暴露应用端口
EXPOSE 8080

# 设置容器启动命令
ENTRYPOINT ["java","-jar","app.jar"] 