# ----------创课-环境搭建-----------1
# ----------创课-环境搭建-----------
1. 使用技术：SpringMVC + Mybatis
2. 开发工具：Eclipse4.2 + Maven3 + Tomcat7

3. 环境搭建步骤：
  3.1 确定项目包结构 com.sy.chuangke 顶级包, 可按业务模块来划分包结构,方便维护和扩展
  3.2 使用Eclipse创建一个Maven-Web项目，在pom.xml文件中配置项目中使用的依赖
  3.3 集成Spring + Mybatis, 使用Junit进行测试
  3.4 对SpringMVC进行简单的封装,可以抽取  BaseController, 封装一些公用的功能(上传、下载、参数处理，分页处理，json处理)
  3.5 结合 Mybatis + SpringMVC 进行前后端测试

4. 参考资料：
  mybatis文档
    https://mybatis.github.io/mybatis-3/zh/getting-started.html
  mybatis-spring文档
    http://mybatis.github.io/spring/zh/
  mybatis通用Mapper
    https://github.com/abel533/Mapper
  mybatis通用分页
    https://github.com/pagehelper/Mybatis-PageHelper
  mybatis相关资料
    http://www.mybatis.tk/
