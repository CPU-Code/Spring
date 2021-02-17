package cpucode.config;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 20:33
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * 标志该类是Spring的核心配置类
 * */
@Configuration
/**
 * <context:component-scan base-package="com.cpucode"/>
 * */
@ComponentScan("com.cpucode")
/**
 * <import resource=""/>
 * */
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
