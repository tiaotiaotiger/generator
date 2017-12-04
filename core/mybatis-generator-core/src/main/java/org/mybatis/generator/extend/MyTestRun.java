package org.mybatis.generator.extend;

/**
 * ClassName:test
 * Function: 
 * Date:     2017年10月21日下午3:00:14
 * @author   chenzz
 * @since    JDK 1.7
 */

import org.mybatis.generator.api.ShellRunner;

public class MyTestRun {

	public static void main(String[] args) {
		String config = MyTestRun.class.getClassLoader().getResource("generatorConfig.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

}

