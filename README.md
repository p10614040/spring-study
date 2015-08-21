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
