# springboot结合swagger2构建Restful API


<a name="overview"></a>
## 概览
这是一个swagger2小型demo


### 版本信息
*版本* : 0.0.1


### 联系方式
*名字* : bacyang


### 许可信息
*服务条款* : www.baidu.com


### URI scheme
*域名* : localhost:8080  
*基础路径* : /


### 标签

* user-controller : User Controller




<a name="paths"></a>
## 资源

<a name="user-controller_resource"></a>
### User-controller
User Controller


<a name="postuserusingpost"></a>
#### 创建用户
```
POST /users
```


##### 说明
根据user对象创建用户


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**user**  <br>*必填*|用户详情实体类|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/users
```


###### 请求 body
```
json :
{
  "age" : 0,
  "id" : 0,
  "name" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="getlistusingget"></a>
#### 获取用户列表
```
GET /users
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [User](#user) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/users
```


##### HTTP响应示例

###### 响应 200
```
json :
[ {
  "age" : 0,
  "id" : 0,
  "name" : "string"
} ]
```


<a name="getuserbyidusingget"></a>
#### 获取用户详情
```
GET /users/{id}
```


##### 说明
根据url的id来获取用户基本信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|用户id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/users/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "age" : 0,
  "id" : 0,
  "name" : "string"
}
```


<a name="putuserusingput"></a>
#### 更新用户信息
```
PUT /users/{id}
```


##### 说明
根据url的id来指定对象，并且根据传过来的user进行用户基本信息更新


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|用户id|integer (int64)|
|**Body**|**user**  <br>*必填*|用户详情实体类user|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/users/0
```


###### 请求 body
```
json :
{
  "age" : 0,
  "id" : 0,
  "name" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="deluserusingdelete"></a>
#### 删除用户
```
DELETE /users/{id}
```


##### 说明
根据url的id来指定对象，进行用户信息删除


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|用户id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/users/0
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```




<a name="definitions"></a>
## 定义

<a name="user"></a>
### User

|名称|说明|类型|
|---|---|---|
|**age**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int64)|
|**name**  <br>*可选*|**样例** : `"string"`|string|





