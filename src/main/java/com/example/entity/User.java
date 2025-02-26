package com.example.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Schema(description = "用户实体")
@Entity
@Data
@Table(name = "users")
public class User {
    @Schema(description = "用户ID", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Schema(description = "用户名", example = "张三")
    private String name;
    
    @Schema(description = "电子邮箱", example = "zhangsan@example.com")
    private String email;
    
    @Schema(description = "年龄", example = "25")
    private Integer age;
} 