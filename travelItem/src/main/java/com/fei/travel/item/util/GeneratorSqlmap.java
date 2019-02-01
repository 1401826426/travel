package com.fei.travel.item.util ; 
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;

import com.fei.common.util.generator.MyShellCallback;

public class GeneratorSqlmap {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		//指定 逆向工程配置文件
//		File configFile = new File("generatorConfig.xml");
//		File file = new ClassPa
		ConfigurationParser cp = new ConfigurationParser(warnings);
//		InputStream is = GeneratorSqlmap.class.getResourceAsStream("generatorConfig.xml") ; 
		InputStream is = ClassLoader.getSystemResourceAsStream("generatorConfig.xml") ; 
//		System.err.println("is" + is);
		Configuration config = cp.parseConfiguration(is);
		ShellCallback callback = new MyShellCallback();
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	
	
	public static void main(String[] args) throws Exception {
//		System.err.println(System.getProperty("user.home")) ;
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
