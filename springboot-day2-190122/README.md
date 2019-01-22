# SpringBoot 项目目录详解

> 时间：2019年1月22日

## 入门例子

短信验证登录



1. 通过手机号发送短信

```java
@api {post} /mango/login/sendLoginMsgCode 01 发送短信验证码
@apiDescription 发送短信验证码，验证码30分钟内有效
@apiParam {string} user_mobile 用户名（手机号）
```



控制反转

```java
@Autowired
private MessageServiceImpl messageService;
```



2. 手机号+验证码登录

```java
@api {post} /mango/login/loginByVerifyCode 02 短信验证登录
@apiDescription 手机&短信验证码 登录，测试期间不开通验证码功能，默认验证码为：`123123`
@apiName loginByVerifyCode
@apiParam {string} user_mobile 用户名（手机号）
@apiParam {string} verify_code 短信验证码	| 6位纯数字字符串
```





- controller（路由：/ecg/dp/classify4/v2，GET/POST）
- service（业务逻辑）
- dao（数据持久化层）
- entity（实体类，每个数据库表都需要生成一个实体类）





## 项目实践

1. 创建 MySQL 数据库表，能把数据保存到数据库

   SpringBoot 整合 MyBatis，保存到 MySQL

2. 文件下载实现



MySQL 安装：

- Navicat Premium 12 软件