# spring-入门

Spring 学习入门
<h2>增加maven工程</h2>
<p>添加maven依赖</p>
<code>
org.springframework.spring-context.3.2.2.RELEASE
</code>
<p><code>spring-context</code>依赖会自动添加<code>spring-core</code>、<code>spring-beans</code>等核心依赖，也会添加<code>commons-logging</code>依赖。</p>

<h2>bean配置</h2>
<p>关于<code>lazy-init</code>配置，默认是default，初始化的时候就会载入并实例化，如果改为<code>lazy-init="true"</code>会变为在调用的时候才装载并初始化，但是这种方式明显在第一次调用时有性能损耗，所以一般不建议配置。</p>
<p>关于<code>scope</code>配置，默认bean都是单例模式，如果需要设置成每次调用都实例化则需改成<code>scope="prototype"</code>。</p>
