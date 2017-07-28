<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
		http://www.springframework.org/schema/beans/spring-beans.xsd">



   
    

    <!--手工注入 resource和service中的beans-->
    <#list itemList as item>
	  	<bean id="${item?uncap_first}Resource" class="com.huitu.api.hnsl.resource.${item}Resource">
	        <property name="service">
	            <ref bean="${item?uncap_first}ServiceImpl"></ref>
	        </property>
	        <property name="redisTemplate">
	            <ref bean="redisTemplate"></ref>
	        </property>
	    </bean>
	    <bean id="${item?uncap_first}ServiceImpl" class="com.huitu.api.hnsl.service.impl.${item}ServiceImpl">
	        <property name="mapper">
	            <ref bean="${item?uncap_first}Mapper"></ref>
	        </property>
	    </bean>
	</#list>
</beans>