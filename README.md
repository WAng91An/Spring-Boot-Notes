# Spring Boot
Spring Boot 学习记录

## 一、Hello World
#### 起步
1. 点击[此链接](https://spring.io/projects/spring-boot)点击Quick start，选择对应版本，下载Demo。
2. IDEA导入项目
3. 建立controller包，以及类

```
package com.wrq.boot.controller;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
```
4. 在于controller包同级有一个主程序类

```
package com.wrq.boot;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		//应用启动起来
		SpringApplication.run(BootApplication.class, args);
	}

}
```
- @SpringBootApplication 来标注一个主程序，说明这是一个Sping Boot项目
5. 运行这个main方法，控制台打印启动成功。

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v1.5.19.BUILD-SNAPSHOT)

2019-01-14 00:35:00.020  INFO 18196 --- [           main] com.wrq.boot.BootApplication             : Starting BootApplication on DESKTOP-IJ41H0K with PID 18196 (D:\Java\Project\Spring-Boot-Notes\boot\target\classes started by wangqian in D:\Java\Project\Spring-Boot-Notes\boot)
2019-01-14 00:35:00.026  INFO 18196 --- [           main] com.wrq.boot.BootApplication             : No active profile set, falling back to default profiles: default
2019-01-14 00:35:00.203  INFO 18196 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@e50a6f6: startup date [Mon Jan 14 00:35:00 CST 2019]; root of context hierarchy
2019-01-14 00:35:04.984  INFO 18196 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8081 (http)
2019-01-14 00:35:05.048  INFO 18196 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-01-14 00:35:05.048  INFO 18196 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.37
2019-01-14 00:35:05.396  INFO 18196 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-01-14 00:35:05.396  INFO 18196 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 5205 ms
2019-01-14 00:35:05.880  INFO 18196 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
2019-01-14 00:35:05.890  INFO 18196 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2019-01-14 00:35:05.891  INFO 18196 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2019-01-14 00:35:05.891  INFO 18196 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2019-01-14 00:35:05.892  INFO 18196 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2019-01-14 00:35:06.666  INFO 18196 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@e50a6f6: startup date [Mon Jan 14 00:35:00 CST 2019]; root of context hierarchy
2019-01-14 00:35:06.854  INFO 18196 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/hello]}" onto public java.lang.String com.wrq.boot.controller.HelloController.hello()
2019-01-14 00:35:06.863  INFO 18196 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2019-01-14 00:35:06.865  INFO 18196 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2019-01-14 00:35:06.946  INFO 18196 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2019-01-14 00:35:06.946  INFO 18196 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2019-01-14 00:35:07.009  INFO 18196 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2019-01-14 00:35:07.278  INFO 18196 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2019-01-14 00:35:07.347  INFO 18196 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080(http)
2019-01-14 00:35:07.357  INFO 18196 --- [           main] com.wrq.boot.BootApplication             : Started BootApplication in 8.343 seconds (JVM running for 9.312)
```
启动成功：访问 http://localhost:8081/hello 即可打印 hello world!

上方日志显示服务器端口等信息，默认是8080，可以在application.properties配置文件中修改默认端口号：

```
#修改端口
server.port=8081
```
可以修改HelloController:

```
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}

```
上方Controller等于下方的：

```
@ResponseBody
@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
```
#### 注解区别？
@Controller和@RestController的区别

@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
1. 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
2. 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
    如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。

例如：

1.使用@Controller 注解
- 在对应的方法上，视图解析器可以解析return 的jsp,html页面，并且跳转到相应页面
- 若返回json等内容到页面，则需要加@ResponseBody注解

2.@RestController注解
- 相当于@Controller+@ResponseBody两个注解的结合。
- 返回json数据不需要在方法前面加@ResponseBody注解了
- 使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
#### 依赖讲解 

1. 父项目（版本仲裁）
```
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>1.5.19.BUILD-SNAPSHOT</version>
	<relativePath/> <!-- lookup parent from repository -->
</parent>
```
- 你可以 spring-boot-starter-parent 点进去，就会发现它还有父项目。
- 它可以看成一个版本的仲裁中心，我们所配置的依赖不需要说明版本，因为仲裁中心已经说明了
- 如果中心没有声明的，必须说明版本
2. 基础依赖
```
<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter</artifactId>
</dependency>
```
- spring-boot-starter：spring boot场景启动器
- Spring把每个场景都抽取出来，做成了一个个starts
- 如我们需要那个场景只需要把对应的启动器来导入进来就可以，不用担心版本。 
- 用什么功能(Web、缓存、kafka等等)导入相关启动器即可

3. 、Web模块相关依赖

```
<!--添加这个依赖，@ResponseBody @RequestMapping-->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
4. 配置文件处理器

```
<!--绑定配置文件处理器，配置文件进行绑定的时候就会有提示-->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-configuration-processor</artifactId>
	<optional>true</optional>
</dependency>
```
5. 打包插件

```
<!-- 将应用打包成一个可执行Jar包，直接使用java -jar xxxx的命令来执行  -->
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
```

## 二、配置文件
GitHub对应项目：boot-config 
### 1. 配置文件
Spring Boot使用一个全局的配置文件 
- application.properties
- application.yml

配置文件的作用：修改Spring Boot自动配置的默认值，SpringBoot在底层都给我们自动配置好。有什么配置项，可以移步[官方文档](https://docs.spring.io/spring-boot/docs/1.5.19.BUILD-SNAPSHOT/reference/htmlsingle/#common-application-properties)

配置文件一般放在src/main/resources目录或者类路径/config下，当然还有很多位置可以放，它们会有不同优先级，后面会讲到。
#### [YAML](http://www.yaml.org/) （YAML Ain't Markup Language）
##### 简单介绍
- 以前的配置文件：大多是xml
- .yml是YAML语言的文件，以数据为中 心，比json、xml等更适合做配置文件 
- 全局配置文件的可以对一些默认配置值进行修改
##### 配置实例

xml：
```
<server>
  <port>8081</port>
</server>
```
yml:

```
server:
  port: 8081
```
### 2. YAML语法

#### 基本语法
- K:(空格)V 标识一对键值对
- 以空格的缩进来控制层级关系
- 只要是左对齐的一列数据，都是同一层级的
- 属性和值也是大小写敏感

实例： 
```
server:
  port: 8081
  path: /hello // 冒号后面的空格不要拉下
```
#### 值的写法
##### 普通的值
k: v 字面量直接来写，字符串默认不用添加单引号

- " " 双引号 不会转义字符串里面的特殊字符；
    
```
name: "wang \n qian" // 输出：wang 换行 qian
```

- ' ' 单引号 会转义字符，特殊字符最终是一个普通的字符串
##### 对象
普通写法：

```
frends:
    lastName: zhang
    age: 20
```
行内写法
```
frends:{ lastName: zhang,age: 18 }
```


##### Map
示例：

```
maps: {k1: v1,k2: v2}
```

##### 数组
普通写法：

```
pets: // var onj = {pets: ['cat','pig','dog']}
 - cat
 - pig
 - dog
```
行内写法

```
pets:[cat, pig, dog]
```
#### 配置文件获取

将配置文件中的每一个值映射到此组件中

1. Persion
```
package com.wrq.boot.bean;

@Component
@ConfigurationProperties(prefix = "persion")
public class Persion {

    private String name;
    private int age;
    private double weight;
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;
    
    此处，这个bean的getter、setter和tostring方法已经省略，千万不能忽略！
    
}

```
- @ConfigurationProperties 意思是:我们类里面的属性和配置文件中的属性做绑定
    -  不使用此注解，可以在bean的属性添加@value()注解，如下：
```
@Component
// @ConfigurationProperties(prefix = "persion")
public class Persion {

    @value("${persion.name}") // $()读取配置文件、环境变量中的值
    private String name;
    @value("#{11*2}") // #{SpEL} 采用表达式
    private int age;
    @value("true") // 直接赋值
    private boolean boos;
}
```
此处采用@ConfigurationProperties的方式，@value()和@ConfigurationProperties的区别见下方表格。

- prefix = "persion" 配置文件中那个下面的属性来一一映射
- @Component 如果想要这个注解起作用，必须放到容器里面

2. Dog
```
package com.wrq.boot.bean; 

public class Dog { // 用作Persion中的属性

    private String name;
    private int age;

    此处，这个bean的getter、setter和tostring方法已经省略，千万不能忽略！
}

```
3. 配置文件
- 方式一: application.yml
```
persion:
    name: 王大锤
    age: 18
    weight: 125
    boss: false
    birth: 2018/5/5
    maps: {k1: v1,k2: v2}
    list:
      - wangli
      - wangbai
    dog:
      name: xiaogou
      age: 2

```
- 方式二: application.properties
```
persion.name = 王大锤
persion.age = 18
persion.weight = 125
persion.boss = false
persion.birth = 2018/5/5
persion.maps.k1 = v1
persion.maps.k2 = v2
persion.dog.name = xiaogou
persion.dog.age = 15

```
4. 测试类：BootApplicationTests

```
package com.wrq.boot;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	Persion persion;

	@Test
	public void contextLoads() {
		System.out.print(persion);
	}

}
```
5. 运行 BootApplicationTests方法

```
控制台打印：

application.yml的结果：
Persion{name='王大锤', age=18, weight=125.0, boss=false, birth=Sat May 05 00:00:00 CST 2018, maps={k1=v1, k2=v2}, list=[wangli, wangbai], dog=Dog{name='xiaogou', age=2}}

application.properties的结果：
Persion{name='ï¿½ï¿½Ç¬', age=18, weight=125.0, boss=false, birth=Sat May 05 00:00:00 CST 2018, maps={k2=v2, k1=v1}, list=[wangli, wangbai], dog=Dog{name='xiaogou', age=15}}
```
把Bean中的属性和配置文件绑定，通过yml文件和properties都可以做到,但是properties文件出现乱码。

properties中文读取乱码：File->Settings->File Encodings最底部选utf-8、Tranparent打上勾

#### 注解比较

@value和@ConfigurationProperties获取值比较

header 1 |@ConfigurationProperties|@value
---|---|---
功能 | 批量注入配置文件中的属性 | 一个个指定
松散绑定 | 支持 | 不支持
JSR303数据校验 | 支持 | 不支持
SpEL | 支持 | 不支持
复杂类型封装 | 支持 | 不支持

名词解释:
- 松散绑定

last-name和lastName都可以获取导致，则代表支持松散绑定

- JSR303
```
@Component
@ConfigurationProperties(prefix = "persion") // 如果使用的是@value注入值时，无法使用校验
@Validated // 添加此注解
public class Persion {
    
    @Email // 配置文件书写的属性必须是邮箱格式，不符合报错！
    private String name;
    
}
```
- 复杂类型封装

如果获取配置文件中map的值时,@value是获取不到值的

```
@value("${persion.maps}") // 由于使用的是@value，无法获取配置文件中的map
private Map<String,Object> maps;
```
#### @PropertySource

@PropertySource：加载指定配置文件

@ConfigurationProperties()默认是从全局配置文件中获取值，也就是application.properties这个文件中获取值。

如果做的配置很多，全局的配置文件就会特别大，为了方便管理。我会创建不同的配置文件定向管理不同的配置。

如创建persion.properties文件单独存放persion需要的配置

@PropertySource就是用来导入创建的配置文件

示例：

1. persion.properties

同时把两个全局的配置中关于Persion的配置都注释掉
```
persion.name = 王弟弟
persion.age = 18
persion.weight = 125
persion.boss = false
persion.birth = 2018/5/5
persion.maps.k1 = v1
persion.maps.k2 = v2
persion.dog.name = xiaogou
persion.dog.age = 15

```

2. Persion
```
package com.wrq.boot.bean;

@Component
@PropertySource(value = {"classpath:persion.properties"})
@ConfigurationProperties(prefix = "persion")
public class Persion {

    private String name;
    private int age;
    private double weight;
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;
    
    此处，这个bean的getter、setter和tostring方法已经省略，千万不能忽略！
}

```
这样运行测试类，控制台就可以打印persion.properties中的数据。

通过下面的注解，把类路径下的persion.properties加载进来。并且把persion开头的数据进行绑定。
- @PropertySource(value = {"classpath:persion.properties"})
- @ConfigurationProperties(prefix = "persion")

#### @ImportResource
@ImportResource：导入Spring的配置文件，让配置文件生效。

示例：
1. com.wrq.boot.service

```
package com.wrq.boot.service;

/**
 * Created by wangqian on 2019/1/12.
 */
public class HelloService {
}

```
2. resources目录手动建立bean.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="helloService" class="com.wrq.boot.service.HelloService"></bean>
</beans>
```
3. 测试类

```
package com.wrq.boot;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testConfig() {
		boolean b = ioc.containsBean("helloService");
		System.out.print(b);
	}

}
```
试图通过添加一个Spring的配置文件bean.xml来把HelloService注入进去。

运行测试类结果：false 

结果表明IoC容器中并不包含HelloService，即：配置文件bean.xml没有生效

**解决方式**

方式一： 主程序中进行配置@ImportResouece注解

```
package com.wrq.boot;

@ImportResource(locations = {"classpath:bean.xml"}) // 通过此配置是bean.xml生效
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		//应用启动起来
		SpringApplication.run(BootApplication.class, args);
	}

}


```

方法二：通过配置类实现，这种方式也是Spring Boot推荐的

1. com.wrq.boot.config

```
package com.wrq.boot.config;

/**
 * Created by wangqian on 2019/1/12.
 */
@Configuration
public class MyConfig {

    // 将方法的返回值添加到容器之中,并且容器中这个组件的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.print("通过@Bean给容器添加组件了..");
        return new HelloService();
    }
}

```
- @Configuration标注这是一个配置类
- 通过@Bean注解，将方法的返回值添加到容器之中,并且容器中这个组件的id就是方法名

2. 把主程序类中@ImportResource()配置注释掉
3. 测试成功，添加了HelloService()组件

### 3. 配置文件占位符
#### 随机数
RandomValuePropertySource：配置文件中可以使用随机数 

```
${random.value}
${random.int}
${random.long} 
${random.uuid} 
${random.int(10)}
${random.int[1024,65536]}
```
#### 属性配置占位符

- 可以在配置文件中引用前面配置过的属性（优先级前面配置过的这里都能用）
- ${app.name:默认值}来指定找不到属性时的默认值

```
persion.name = 王弟弟${random.uuid}
persion.age = ${random.int}
persion.dog.name = ${persion.name}_dog
```

### 4. Profile 多环境支持
Profile是Spring对不同环境提供不同配置功能的支持，可以通过激活、 指定参数等方式快速切换环境
#### 1. 多Profile的方式
格式：application-{profile}.properties/yml
- application-dev.properties
- application-prod.properties 

默认采用application.properties配置文件，如果使用别的，需要激活：

1. application.properties中配置：
```
# 激活application-dev.properties配置文件
spring.profiles.active=dev
```
2. application-dev.properties:

```
server.port=8082
```
3. 运行BootApplication主程序:

```
2019-01-12 20:46:09.345  INFO 14404 --- [main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8082 (http)
```

#### 2. 多文档块的方式
除了上方多Profile的方式来切换环境，也可以通过YAML多文档块的方式。

示例:

application.yml:
```
server:
  port: 8081
spring:
  profiles:
    active: dev 
---
spring: 
  profiles: dev
server:
  port: 8083
---
spring:
  profiles: prod
server:
  port: 8084
```

#### 3. 激活指定Profile
1. application.properties中配置：
```
# 激活application-dev.properties配置文件
spring.profiles.active=dev
```
2. application.yml中配置
```
server:
  port: 8081
spring:
  profiles:
    active: dev 
---
spring: 
  profiles: dev
server:
  port: 8083

```
3. 启动配置-参数

在IDE中，类似于配置tomcat的地方，按下方配置：

```
Program arguments:--spring.profiles.active=dev
```
4. 启动配置-虚拟机

在IDE中，类似于配置tomcat的地方，按下方配置：

```
VM options:-Dspring-profiles-active=dev
```
5. 命令行
使用Maven的package命令打包，移动到jar的目录。
```
java -jar spring-boot-project-config.jar --spring.profiles.active=dev
```
### 5. 配置文件优先级
GitHub对应项目：boot-config-position
#### 优先级
Spring Boot 启动会扫描以下位置的application.properties或者 application.yml文件作为Spring boot的默认配置文件 

- file:./config/ (项目根目录config文件夹下的配置文件)
- file:./  (项目根目下的配置文件)
- classpath:/config/ (resources目录config文件夹下的配置文件)
-  classpath:/ (resources目下的配置文件)

以上是按照优先级从高到低的顺序，**所有位置**的文件都会被加载，高优先级配置内容会覆盖低优先级配置内容,形成**互补配置**。
#### 默认配置
我们也可以通过配置spring.config.location来改变默认配置。

项目打包后以后，我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置；指定配置文件和默认加载的这些配置文件共同起作用，形成**互补配置**。

1. Maven->package对项目打包
2. 把待使用的配置文件放在本地文件夹中，如：D:/application.properties
3. 命令行执行命令

```
java -jar boot-config-position-xxxxxx.jar --spring.config.location=D:/application.properties
```
这样即使项目上线了，我们也可以通过修改本地的配置文件，使用一行命令即可，极大方便了运维人员。

### 5. 外部配置加载顺序

Spring Boot 支持多种外部配置方式

可以从以下位置加载配置，优先级从高到低，高优先级配置覆盖低优先级的，所以配置形成互补配置。
1. 命令行参数 

```
java -jar boot-config-position-xxxxxx.jar --server.port // 多个配置用空格隔开
```

2. 来自java:comp/env的JNDI属性
3. Java系统属性（System.getProperties()） 
4. 操作系统环境变量
5. RandomValuePropertySource配置的random.*属性值 
6. jar包外部的application-{profile}.properties或application.yml(带spring.profile)配置文件 
7. jar包内部的application-{profile}.properties或application.yml(带spring.profile)配置文件 
8. jar包外部的application.properties或application.yml(不带spring.profile)配置文件 
9. jar包内部的application.properties或application.yml(不带spring.profile)配置文件 
10. @Configuration注解类上的@PropertySource 
11. 通过SpringApplication.setDefaultProperties指定的默认属性

注意：从jar包外向jar包内寻找，优先加载profile最后加载不带profile，更多参考[官方文档](https://docs.spring.io/spring-boot/docs/1.5.19.BUILD-SNAPSHOT/reference/htmlsingle/)

### 6. 自动配置原理
GitHub对应项目：boot-config-autoconfig
1. 配置文件写什么？
- 配置文件可配置属性[查阅](https://docs.spring.io/spring-boot/docs/1.5.19.RELEASE/reference/htmlsingle/#common-application-properties)
2. [什么是注解，如何实现一个注解？](https://blog.csdn.net/wangyangzhizhou/article/details/51698638)
- 关于注解的机制和相关原理可以[移步此篇博客](https://blog.csdn.net/wangyangzhizhou/article/details/51698638)
3. 配置原理解析

我们运行Spring Boot应用是从main方法启动，在主程序类上有一个@SpringBootApplication注解。

@SpringBootApplication是一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration。

- @SpringBootConfiguration继承自@Configuration，二者功能也一致，标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到srping容器中，并且实例名就是方法名。

- @EnableAutoConfiguration的作用启动自动的配置，@EnableAutoConfiguration注解的意思就是SpringBoot根据你添加的jar包来配置你项目的默认配置，比如根据spring-boot-starter-web ，来判断你的项目是否需要添加了webmvc和tomcat，就会自动的帮你配置web项目中所需要的默认配置

- @ComponentScan，扫描当前包及其子包下被@Component，@Controller，@Service，@Repository注解标记的类并纳入到spring容器中进行管理。是以前的<context:component-scan>（以前使用在xml中使用的标签，用来扫描包配置的平行支持）。

[@SpringBootApplication注解分析](https://www.jianshu.com/p/4e1cab2d8431)

[配置原理视频讲解](https://www.bilibili.com/video/av36291265/?p=19)

4. 自动配置类判断

在配置文件properties中设置：debug=true 来让控制台打印自动配置报告，方便的得知那些配置类生效。

```
=========================
AUTO-CONFIGURATION REPORT
=========================


Positive matches:
-----------------

   DispatcherServletAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
Negative matches:
-----------------

   ActiveMQAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'javax.jms.ConnectionFactory', 'org.apache.activemq.ActiveMQConnectionFactory' (OnClassCondition)

```



## 三、日志处理

GitHub对应项目：boot-logging

### 1. 日志框架
- JUL
- JCL
- Jboss-logging
- logback
- log4j
- log4j2
- slf4j

分类
日志门面 | 日志实现
---|---
JCL SLF4J Jboos-logging | Log4j JUL Log4j2 Logback
左边选一个门面（抽象层）、右边选一个实现。

日志门面：SLF4J

日志实现：Logback

Spring Boot底层是Spring框架，Spring框架默认是使用的 Commons Logging，而Spring Boot选用的是SLF4J和Logback.

spring-boot-starter-logging采用了 slf4j+logback的形式，Spring Boot也能自动适配（jul、log4j2、logback） 并 简化配置

### 2. [SLF4j](https://www.slf4j.org/manual.html)的使用

#### 框架使用
1. 导入SLF4j和Logback的Jar(Spring Boot的基础依赖已经包含)
2. 安装下面方式调用
```
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    logger.info("Hello World");
  }
}
```

我们调用方法的时候需要使用日志来记录方法的调用，但是我们不应该调用实现了logback的接口，应该是日志门面（抽象层）SLF4j的接口。

SLF4j是一个抽象层，实现层选用什么都可以，我们此处选用Logback。我们应该面向SLF4j的接口编程，调用SLF4j的接口来做日志记录，但是最后实现日志功能的是Logback。具体SLF4j和其他日志实现层的关系查看此图片：

![SLF4j与实现日志框架关系](https://www.slf4j.org/images/concrete-bindings.png)

当然log4j的实现和SLF4j一起使用时候，中间会有一层Adaptation layer适配层，是因为log4j出现的比较早，而SLF4j比较晚。为了和log4j适配，SLF4j开发提供的Adaptation layer层。


每一个日志的实现框架都有自己的配置文件，使用了slf4j以后，配置文件还是做成日志**实现框架**的配置文件，slf4j只是抽象层，你使用什么框架实现的就写哪个实现框架的配置文件。

#### 遗留问题

如果我们在开发A系统的时候使用SLF4j和Logback框架来做日志处理，同时此系统使用了Spring、Hibernate、MyBatis等框架，Sping框架是使用commons-logging做日志处理，Hibernate使用Jboss-logging做日志处理。

如何统一做日志记录，即使是别的框架和我一起统一使用SLF4j进行输出？

查看此图：

![日志统一处理](https://www.slf4j.org/images/legacy.png)

注意：如果你使用Commons logging的接口，可以使用jcl-over-slf4j.jar替换commons-logging.jar实现日志的统一处理。

**理解了图片，如何让系统中所有日志统一到SLF4j？**
1. 将系统中其他日志框架排除出去
2. 用中间包来替换原有的日志框架
3. 导入SLF4j以及相应实现。

### 3. Sping Boot日志关系

**查看依赖关系**: IDEA->pom.xml->右键->Diagrams->show Dependencies

基本依赖：
```
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
</dependency>
```
Spring Boot使用下方依赖做日志功能
```
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-logging</artifactId>
</dependency>
```
我们观察日志依赖的关系图：
```
graph LR
spring-boot-starter-logging-->logback-classic
logback-classic-->logback-core
spring-boot-starter-logging-->jul-to-slf4j
jul-to-slf4j-->slf4j-api
spring-boot-starter-logging-->log4j-over-slf4j
log4j-over-slf4j-->slf4j-api
spring-boot-starter-logging-->jcl-over-slf4j
jcl-over-slf4j-->slf4j-api
```
其中logback是日志的实现，jul-to-slf4j、log4j-over-slf4j、jcl-over-slf4j的作用是将其他日志框架转为slf4j的。最后他们都指向了slf4j的抽象层。

总结：
1. Spring Boot选用的是SLF4J和Logback进行日志记录
2. Spring Boot也把其他的的日志都替换成了slf4j。可以查看替换包的源码，偷梁换柱！
3. 如果我们要引入其他框架，一定要把这个框架的日志包移除掉，如下Spring Boot框架依赖中就把Sping框架依赖的commons-logging依赖排除掉了。

```
<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<exclusions>
			    <exclusion>
                  <groupId>commons-logging</groupId>
                  <artifactId>commons-logging</artifactId>
			    </exclusion>
			</exclusions>
</dependency>
```
### 4. 日志使用
#### 默认配置
其实Spring Boot默认帮我们配置了日志，比如启动主程序时打印的日志。

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v1.5.19.BUILD-SNAPSHOT)

2019-01-13 22:50:22.392  INFO 2364 --- [           main] com.wrq.boot.BootApplication             : Starting BootApplication on DESKTOP-IJ41H0K with PID 2364 (D:\Java\Project\Spring-Boot-Notes\boot-logging\target\classes started by wangqian in D:\Java\Project\Spring-Boot-Notes\boot-logging)
2019-01-13 22:50:22.393  INFO 2364 --- [           main] com.wrq.boot.BootApplication             : No active profile set, falling back to default profiles: default
2019-01-13 22:50:22.394 DEBUG 2364 --- [           main] o.s.boot.SpringApplication               : Loading source class com.wrq.boot.BootApplication
```
#### 使用与级别

测试类中使用日志：

```
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootLoggingApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {

		logger.trace("trace追踪信息");
		logger.debug("debug调试信息");
		logger.info("info日志信息");
		logger.warn("warn警告信息");
		logger.error("error报错信息");
		
	}

}
```
日志的级别：trace < debug < info < warn < error

Spring Boot默认的日志级别是：info，故运行结果：

```
2019-01-13 23:17:56.731  INFO 2624 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : info日志信息
2019-01-13 23:17:56.732  WARN 2624 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : warn警告信息
2019-01-13 23:17:56.745 ERROR 2624 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : error报错信息
```


可以调整输出日志的级别，项目上线了我们不想要debug、trace的信息，我们可以调高日志级别，只会打印调整后级别及高级别生效。

#### 修改级别

application.properties配置文件:

```
logging.level.com.wrq=trace // 把com.wrq包下面类的日志都设成trace级别
```
运行结果：

```
2019-01-13 23:24:06.449 TRACE 18136 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : trace追踪信息
2019-01-13 23:24:06.449 DEBUG 18136 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : debug调试信息
2019-01-13 23:24:06.449  INFO 18136 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : info日志信息
2019-01-13 23:24:06.749  WARN 18136 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : warn警告信息
2019-01-13 23:24:06.749 ERROR 18136 --- [           main] c.wrq.boot.BootLoggingApplicationTests   : error报错信息
```

#### 修改日志输出方式
logging.file | logging.path | Example |Description
---|---|---|---
none| none | | 只在控制台输出
指定文件名 | none | my.log | 输出日志到my.log文件
none | 指定目录 | /var/log | 输出到指定目录的spring.log文件中

配置文件中：

```
logging.level.com.wrq = trace

# 不指定路径，当前项目下生成springboot.log日志
#logging.file=springboot.log

# 当D盘下生成springboot.log日志
#logging.file=D:/springboot.log

# 在当前磁盘的根路径下创建spring文件夹和里面的log文件夹，使用spring.log作为默认的日志文件名
logging.path=/spring/log

# 在控制台输出的日志的格式
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n

# 在指定文件中输出的日志的格式
logging.pattern.file=%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n

# 日志输出格式： %d表示日期时间， %thread表示线程名， %-5level：级别从左显示5个字符宽度 %logger{50} 表示logger名字最长50个字符，否则按照句点分割。 %msg：日志消息， %n是换行符
```
#### 指定日志文件

具体方式参考官方文档[日志章节](https://docs.spring.io/spring-boot/docs/1.5.19.BUILD-SNAPSHOT/reference/htmlsingle/#boot-features-custom-log-configuration)

给类路径下放上每个日志框架自己的配置文件即可，加载配置时会判断，如我们使用自己的配置文件，Spring Boot就不会使用它自己的默认配置：

日志框架 | 命名
---|---
Logback | logback-spring.xml, logback-spring.groovy, logback.xml or logback.groovy
Log4j2 | log4j2-spring.xml or log4j2.xml
Logback | logging.properties

官方推荐 logback-spring.xml的命名配置文件。
- logback-spring.xml 可以使用springProfile的高级特性

```
<!-- logback-spring.xml配置文件中：-->

<layout class="ch.qos.logback.classic.PatternLayout">
    <springProfile name="dev"> <!-- dev环境下采用下方输出方式 -->
        <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} --- [%thread] %-5level %logger{50} - %msg%n</pattern>
    </springProfile>
    <springProfile name="!dev"> <!-- 非dev环境下采用下方输出方式 -->
        <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} ---- [%thread] %-5level %logger{50} - %msg%n</pattern>
    </springProfile>
</layout>
```

- logback.xml：直接被识别为日志配置文件

#### 切换日志
根据此图进行移除包和导入包即可，可以通过IDEA的依赖图方便的移除依赖。

![日志统一处理](https://www.slf4j.org/images/legacy.png)

参考文献：

[注解机制及其原理](https://blog.csdn.net/wangyangzhizhou/article/details/51698638)

[springboot快速入门及@SpringBootApplication注解分析](https://www.jianshu.com/p/4e1cab2d8431)