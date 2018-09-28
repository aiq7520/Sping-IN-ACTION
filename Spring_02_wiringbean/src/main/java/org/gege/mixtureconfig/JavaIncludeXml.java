package org.gege.mixtureconfig;

import org.gege.forjava.CDPlayerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 在javaConfig中引入Xml配置
 * 在javaConfig中引入JavaConfig配置
 */
@Configuration
@Import(CDPlayerConfig.class)//在javaConfig中引入JavaConfig配置
public class JavaIncludeXml {

}
