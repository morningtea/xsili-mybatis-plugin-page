#### Overview
插件主要实现基于Mybatis分页和查询指定数目数据的方法
项目采用jar形式，坐标如下：
<groupId>com.xsili.mybatis.plugin.page</groupId>
<artifactId>xsili-mybatis-plugin-page</artifactId>
<version>0.0.1</version>

#### 集成步骤：
1、在你的项目中引入本插件的maven地址

2、在Mybatis主配置文件中入引插件，代码如下：
<plugins>
	<plugin interceptor="org.mybatis.plugin.PagePlugin">
		<!-- 数据方言，目前仅支持MySQL(MYSQL)、Oracle(ORACLE) -->
		<property name="dialect" value="MYSQL" />
		<!-- 拦截的statement 以下配置会拦截 selectByExample、list* -->
		<property name="pageSqlId" value=".*.selectByExample|.*.list.*" />
	</plugin>
</plugins>

3、查询条件类继承QueryParam

4、给查询条件QueryParam设定分页参数

5、调用Mapper.selectByExample  Mapper.list* ...
