# framework-springboot-demo

## 介绍
本demo使用SpringBoot初始化的独立项目，可作为纯服务端独立使用，亦可注册到注册中心作为服务提供者(provider)。内置两套数据源示例，使用mybatis中间件。  
数据层与服务层已基类处理，数据操作接口已封装，满足日常业务需求。

## 模块
本demo分为四个模块，common公共模块，dao数据模块，service服务模块，web控制模块，需使用Maven初始化。

## 业务demo
用户的增删改查和部门的增删改查均已实现，带分页功能，入参校验需自行实现。

## 运行
本demo可运行，启动web服务后，即可使用postman或其他方式测试接口。

## 端口
服务端口默认：8080

## 免责声明
本demo开源，共学习、交流、初始化项目使用，若使用后造成各种损失，与本demo和开发者无关。

## 附录-表结构

### 用户表
CREATE TABLE `demo_user` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID，自增主键',
  `time_create` datetime NOT NULL COMMENT '创建时间',
  `time_update` datetime NOT NULL COMMENT '更新时间',
  `admin_id` varchar(20) DEFAULT NULL COMMENT '操作人ID',
  `admin_name` varchar(20) DEFAULT NULL COMMENT '操作人',
  `name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `age` tinyint unsigned DEFAULT NULL COMMENT '年龄',
  `sex` tinyint DEFAULT NULL COMMENT '性别，-1女，1男',
  `mobile_phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `remark` longtext COMMENT '备注',
  `freeze` tinyint NOT NULL COMMENT '是否冻结，0正常，1冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

### 部门表
CREATE TABLE `demo_department` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '部门ID，自增主键',
  `time_create` datetime NOT NULL COMMENT '创建时间',
  `time_update` datetime NOT NULL COMMENT '更新时间',
  `admin_id` varchar(20) DEFAULT NULL COMMENT '操作人ID',
  `admin_name` varchar(20) DEFAULT NULL COMMENT '操作人',
  `up_id` bigint unsigned DEFAULT NULL COMMENT '上级部门ID',
  `name` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `remark` longtext COMMENT '部门备注',
  `freeze` tinyint NOT NULL COMMENT '是否冻结，0正常，1冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

