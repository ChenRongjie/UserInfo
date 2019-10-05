# UserInfo
基于Servlet的用户信息管理系统

------

##### 项目中遇到的问题

1. 开发添加功能时，添加到数据库的中文字段显示为问号("??")，经过debug，问题出现在数据库的编码格式，**解决办法：**数据库连接时加上`?characterEncoding=utf-8`,本项目中，在`druid.properties`文件中数据库链接为`url=jdbc:mysql:///User_Info?characterEncoding=utf-8`
2. 开发删除功能时，点击行末删除“删除”按钮，需弹出bootstarp模态框，js处理时删除按钮需要传id值。