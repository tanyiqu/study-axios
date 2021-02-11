# Axios学习 API文档

## 1 接口说明

- 基准地址：`http://127.0.0.1:8866`
- 返回类型为json

## 2 API

### 获取所有用户（get）

- 请求路径：user/allUsers

- 请求方法：get

- 请求参数：无

- 响应数据

  ```json
  {
      "msg": "请求成功",
      "code": 200,
      "data": [
          {
              "id": 1,
              "name": "张三",
              "age": 18,
              "sex": "男"
          },
          {
              "id": 2,
              "name": "张四",
              "age": 19,
              "sex": "女"
          },
          {
              "id": 3,
              "name": "张五",
              "age": 20,
              "sex": "男"
          },
          {
              "id": 4,
              "name": "张六",
              "age": 21,
              "sex": "女"
          },
          {
              "id": 5,
              "name": "张七",
              "age": 17,
              "sex": "男"
          }
      ]
  }
  ```

  <br>

### 获取所有用户（post）

- 请求路径：user/allUsersPost

- 请求方法：post

- 请求参数：无 

- 响应数据

  ```json
  {
      "msg": "请求成功",
      "code": 200,
      "data": [
          {
              "id": 1,
              "name": "张三",
              "age": 18,
              "sex": "男"
          },
          {
              "id": 2,
              "name": "张四",
              "age": 19,
              "sex": "女"
          },
          {
              "id": 3,
              "name": "张五",
              "age": 20,
              "sex": "男"
          },
          {
              "id": 4,
              "name": "张六",
              "age": 21,
              "sex": "女"
          },
          {
              "id": 5,
              "name": "张七",
              "age": 17,
              "sex": "男"
          }
      ]
  }
  ```

  <br>

### 根据ID查找用户（get）

- 请求路径：user/findById

- 请求方法：get

- 请求参数：

  | 参数 | 描述 |
  | ---- | ---- |
  | id   | 编号 |

  响应数据

- 响应数据

  ```json
  {
      "code": 200,
      "data": {
          "id": 1,
          "name": "张三",
          "age": 18,
          "sex": "男"
      }
  }
  ```

  <br>

### 根据ID查找用户（post）

- 请求路径：user/findByIdPost

- 请求方法：post

- 请求参数：

  | 参数 | 描述 |
  | ---- | ---- |
  | id   | 编号 |

- 响应数据

  ```json
  {
      "code": 200,
      "data": {
          "id": 1,
          "name": "张三",
          "age": 18,
          "sex": "男"
      }
  }
  ```

  <br>