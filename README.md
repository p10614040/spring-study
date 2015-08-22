# spring-入门
    最近开始学习Spring，虽然项目中一直在使用，但是对它的原理、特点、使用等处于一知半解的状态。这个工程作为Spring学习的案例，希望在学习的过程能充分理解Spring。
<h2>关于Spring</h2>
<h3>对于Spring的理解</h3>
<p>Spring是一种轻量级的Java开源框架，充分实现了OOP面向接口编程的思想，实现了企业应用开发中低耦合高内聚的目的。</p>
<h3>什么是IOC</h3>
<p>通过注入的方式实现对象的创建使用。……</p>
<h3>什么是AOP</h3>
<p>面向接口编程。……</p>
<h3>如何理解OOP</h3>
<p>……</p>
<h3>为什么使用Spring</h3>
<p>Spring作为一个bean容器充分解放了开发过程中对象管理的过程，使模块之间低耦合可插拔，提高开发效率降低维护成本。</p>

<h2>增加maven工程</h2>
<p>添加maven依赖</p>
<code>
org.springframework.spring-context.3.2.2.RELEASE
</code>
<p><code>spring-context</code>依赖会自动添加<code>spring-core</code>、<code>spring-beans</code>等核心依赖，也会添加<code>commons-logging</code>依赖。</p>

<h2>bean配置</h2>
<p>关于<code>lazy-init</code>配置，默认是default，初始化的时候就会载入并实例化，如果改为<code>lazy-init="true"</code>会变为在调用的时候才装载并初始化，但是这种方式明显在第一次调用时有性能损耗，所以一般不建议配置。</p>
<p>关于<code>scope</code>配置，默认bean都是单例模式，如果需要设置成每次调用都实例化则需改成<code>scope="prototype"</code>。</p>

<h2>bean的注入方式之一：构造器注入的四种方式</h2>
第一种方法：根据索引赋值，索引都是以0开头的：
<pre>        &lt;constructor-arg index="0" value="刘晓刚" /&gt;
         &lt;constructor-arg index="1" value="3500" /&gt;
         &lt;constructor-arg index="2" ref="dept"/&gt;
         &lt;constructor-arg index="3" value="男" /&gt;</pre> 
第二种方法是根据所属类型传值：
这种方法基本上不怎么适用，因为一个类里可以有好几个相同基本类型的变量，很容易就混淆值传给哪一个参数了所以做好不要使用这种方法：
<pre>         &lt;constructor-arg type="java.lang.String" value="刘晓刚" 
         &lt;constructor-arg type="java.lang.Double" value="3500" /&gt;
         &lt;constructor-arg type="www.csdn.spring01.constructor.Dept" ref="dept"/&gt;
         &lt;constructor-arg type="java.lang.String" value="男" /&gt; </pre> 
第三种方法：根据参数的名字传值：（推荐用法）
在这几种方法里我感觉这种方法是最实用的，他是根据名字来传值的，所以基本上只要名字对了，这个值就可以获取到  
<pre>         &lt;constructor-arg name="name" value="刘晓刚" /&gt;
         &lt;constructor-arg name="salary" value="3500" /&gt;
         &lt;constructor-arg name="dept" ref="dept"/&gt;
         &lt;constructor-arg name="sex" value="男" /&gt;</pre> 
第四种方法：直接传值：
直接给参数赋值，这种方法也是根据顺序排的，所以一旦调换位置的话，就会出现bug，这种方法已经很原始了
<pre>         &lt;constructor-arg  value="刘晓刚" /&gt;
         &lt;constructor-arg  value="3500" /&gt;
         &lt;constructor-arg  ref="dept"/&gt;
         &lt;constructor-arg  value="男" /&gt;</pre> 

<h2>bean的注入方式之二：setter方法注入</h2>
在bean方法中定义property name对应的setter进行注入。
setter方法：
<pre>
	private InjectionDao injectionDao;
	
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}
</pre>
bean配置：
<pre>
	&lt;bean id="injectionService" class="com.iceblock.springstudy.injection.InjectionServiceImpl"&gt;
		&lt;property name="injectionDao" ref="injectionDao"&gt;&lt;/property&gt;
	&lt;/bean&gt;
</pre>
