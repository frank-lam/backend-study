2. 模型管理模块部分功能实现（例如：四分类等）

3. 前置学习：基于 Docker 环境的 Jar 包部署



## 实战任务

### 目标

- 技术点
  - SpringBoot
  - CentOS / Ubuntu
  - Docker
  - MySQL
  - Redis
  - Jar 包部署



- 用户登录（账号密码）

  - POSTMAN，后台 SpringBoot 接收参数，处理请求【SpringBoot】
  - 去 MySQL 中验证账号密码是否正确，users(id, username, password)【了解 MySQL，安装 Navicat】

```shell
[POST]
username
password

{code,msg}
```

- 登录成功，生成一个 6 位的随机数，保存到 redis 【了解 Redis，Java 如何操作 Redis】
- 将代码通过 maven 打包生成  jar 包【了解 maven，了解 jar 如何启动】
- 将 jar 包上传到 Linux 服务器，通过 Docker 方式启动【Docker 基础】
- 浏览器访问：`http://localhost/ecg/user/login`



1. 安装 Linux 系统
2. 在 Linux 上安装 MySQL 数据库（先通过命令行方式去安装 MySQL，后再通过 Docker 快速安装）
3. 通过 Navicat 连接 MySQL，创建表（users 表）和数据
4. 写代码（连接 MySQL 数据库验证密码是否正确）
5. 通过 mvn 将代码打包 jar 包
6. 上传到 Linux 文件，sftp
7. 通过 Docker 启动 jar 包
8. 用户浏览器访问