package com.cst499.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cst499.model.Product;

// jparep exposes database screen methods like find by id and delete by id
// param are entity and PK type 


@Repository 
public interface ProductRepository extends JpaRepository <Product, Long > {

	@Query("select p from Product p where p.sellerId=:sellerId")
    public List<Product> findProductBySellerId(@Param("sellerId") long sellerId);
	
	
}


/*2022-11-18 01:28:00.267  INFO 33168 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL5InnoDBDialect
2022-11-18 01:28:00.296  INFO 33168 --- [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-11-18 01:28:00.296  INFO 33168 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-11-18 01:28:00.330  WARN 33168 --- [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'productController': Unsatisfied dependency expressed through field 'productRepository'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'productRepository' defined in com.cst499.repository.ProductRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Invocation of init method failed; nested exception is org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long); Reason: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!; nested exception is java.lang.IllegalArgumentException: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!
2022-11-18 01:28:00.330  INFO 33168 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2022-11-18 01:28:00.330  INFO 33168 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-13 - Shutdown initiated...
2022-11-18 01:28:00.331  INFO 33168 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-13 - Shutdown completed.
2022-11-18 01:28:00.331  INFO 33168 --- [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2022-11-18 01:28:00.335  INFO 33168 --- [  restartedMain] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2022-11-18 01:28:00.338 ERROR 33168 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'productController': Unsatisfied dependency expressed through field 'productRepository'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'productRepository' defined in com.cst499.repository.ProductRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Invocation of init method failed; nested exception is org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long); Reason: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!; nested exception is java.lang.IllegalArgumentException: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:659) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:639) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918) ~[spring-context-5.3.23.jar:5.3.23]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.23.jar:5.3.23]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[spring-boot-2.7.5.jar:2.7.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-2.7.5.jar:2.7.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.5.jar:2.7.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[spring-boot-2.7.5.jar:2.7.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-2.7.5.jar:2.7.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-2.7.5.jar:2.7.5]
	at com.cst499.Kidz101Application.main(Kidz101Application.java:10) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) ~[spring-boot-devtools-2.7.5.jar:2.7.5]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'productRepository' defined in com.cst499.repository.ProductRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Invocation of init method failed; nested exception is org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long); Reason: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!; nested exception is java.lang.IllegalArgumentException: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:656) ~[spring-beans-5.3.23.jar:5.3.23]
	... 25 common frames omitted
Caused by: org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long); Reason: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!; nested exception is java.lang.IllegalArgumentException: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!
	at org.springframework.data.repository.query.QueryCreationException.create(QueryCreationException.java:101) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:107) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$mapMethodsToQuery$1(QueryExecutorMethodInterceptor.java:95) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
	at java.base/java.util.Iterator.forEachRemaining(Iterator.java:133) ~[na:na]
	at java.base/java.util.Collections$UnmodifiableCollection$1.forEachRemaining(Collections.java:1061) ~[na:na]
	at java.base/java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1845) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682) ~[na:na]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:97) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:87) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at java.base/java.util.Optional.map(Optional.java:260) ~[na:na]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:87) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:365) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$5(RepositoryFactoryBeanSupport.java:323) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.util.Lazy.getNullable(Lazy.java:231) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.util.Lazy.get(Lazy.java:115) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:329) ~[spring-data-commons-2.7.5.jar:2.7.5]
	at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:144) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1863) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800) ~[spring-beans-5.3.23.jar:5.3.23]
	... 35 common frames omitted
Caused by: java.lang.IllegalArgumentException: Validation failed for query for method public abstract java.util.List com.cst499.repository.ProductRepository.findProductBySellerId(long)!
	at org.springframework.data.jpa.repository.query.SimpleJpaQuery.validateQuery(SimpleJpaQuery.java:96) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.data.jpa.repository.query.SimpleJpaQuery.<init>(SimpleJpaQuery.java:66) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.data.jpa.repository.query.JpaQueryFactory.fromMethodWithQueryString(JpaQueryFactory.java:51) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$DeclaredQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:169) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:253) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:93) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:103) ~[spring-data-commons-2.7.5.jar:2.7.5]
	... 57 common frames omitted
Caused by: java.lang.IllegalArgumentException: org.hibernate.QueryException: could not resolve property: sellerId of: com.cst499.model.Product [select p from com.cst499.model.Product p where p.sellerId=:sellerId]
	at org.hibernate.internal.ExceptionConverterImpl.convert(ExceptionConverterImpl.java:138) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.internal.ExceptionConverterImpl.convert(ExceptionConverterImpl.java:181) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.internal.ExceptionConverterImpl.convert(ExceptionConverterImpl.java:188) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:757) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:114) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.orm.jpa.ExtendedEntityManagerCreator$ExtendedEntityManagerInvocationHandler.invoke(ExtendedEntityManagerCreator.java:362) ~[spring-orm-5.3.23.jar:5.3.23]
	at jdk.proxy16/jdk.proxy16.$Proxy169.createQuery(Unknown Source) ~[na:na]
	at org.springframework.data.jpa.repository.query.SimpleJpaQuery.validateQuery(SimpleJpaQuery.java:90) ~[spring-data-jpa-2.7.5.jar:2.7.5]
	... 63 common frames omitted
Caused by: org.hibernate.QueryException: could not resolve property: sellerId of: com.cst499.model.Product [select p from com.cst499.model.Product p where p.sellerId=:sellerId]
	at org.hibernate.QueryException.generateQueryException(QueryException.java:120) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.QueryException.wrapWithQueryString(QueryException.java:103) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.QueryTranslatorImpl.doCompile(QueryTranslatorImpl.java:220) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.QueryTranslatorImpl.compile(QueryTranslatorImpl.java:144) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.engine.query.spi.HQLQueryPlan.<init>(HQLQueryPlan.java:113) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.engine.query.spi.HQLQueryPlan.<init>(HQLQueryPlan.java:73) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.engine.query.spi.QueryPlanCache.getHQLQueryPlan(QueryPlanCache.java:162) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.getQueryPlan(AbstractSharedSessionContract.java:636) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:748) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	... 71 common frames omitted
Caused by: org.hibernate.QueryException: could not resolve property: sellerId of: com.cst499.model.Product
	at org.hibernate.persister.entity.AbstractPropertyMapping.propertyException(AbstractPropertyMapping.java:78) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.persister.entity.AbstractPropertyMapping.toType(AbstractPropertyMapping.java:72) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.persister.entity.AbstractEntityPersister.toType(AbstractEntityPersister.java:2053) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.tree.FromElementType.getPropertyType(FromElementType.java:412) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.tree.FromElement.getPropertyType(FromElement.java:524) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.tree.DotNode.getDataType(DotNode.java:723) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.tree.DotNode.prepareLhs(DotNode.java:268) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.tree.DotNode.resolve(DotNode.java:208) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.HqlSqlWalker.resolve(HqlSqlWalker.java:1066) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.expr(HqlSqlBaseWalker.java:1319) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.exprOrSubquery(HqlSqlBaseWalker.java:4797) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.comparisonExpr(HqlSqlBaseWalker.java:4261) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.logicalExpr(HqlSqlBaseWalker.java:2180) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.whereClause(HqlSqlBaseWalker.java:841) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.query(HqlSqlBaseWalker.java:635) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.selectStatement(HqlSqlBaseWalker.java:339) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.antlr.HqlSqlBaseWalker.statement(HqlSqlBaseWalker.java:287) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.QueryTranslatorImpl.analyze(QueryTranslatorImpl.java:276) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	at org.hibernate.hql.internal.ast.QueryTranslatorImpl.doCompile(QueryTranslatorImpl.java:192) ~[hibernate-core-5.6.12.Final.jar:5.6.12.Final]
	... 77 common frames omitted

*/