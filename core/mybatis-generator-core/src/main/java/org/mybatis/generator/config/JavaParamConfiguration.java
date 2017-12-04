/**
 *    Copyright 2006-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.config;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.List;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * @author Jeff Butler
 */
public class JavaParamConfiguration extends TypedPropertyHolder {
	private String genericDao;
	private String genericService;
	private String buildType;
	private String mapperSuffix;

	/**
	 *  
	 */
	public JavaParamConfiguration() {
		super();
	}

	public XmlElement toXmlElement() {
		XmlElement answer = new XmlElement("javaParam"); //$NON-NLS-1$
		if (getConfigurationType() != null) {
			answer.addAttribute(new Attribute("type", getConfigurationType())); //$NON-NLS-1$
		}

		if (genericDao != null) {
			answer.addAttribute(new Attribute("genericDao", genericDao)); //$NON-NLS-1$
		}

		if (genericService != null) {
			answer.addAttribute(new Attribute("genericService", genericService)); //$NON-NLS-1$
		}

		if (buildType != null) {
			answer.addAttribute(new Attribute("buildType", buildType)); //$NON-NLS-1$
		}
		
		if (mapperSuffix != null) {
			answer.addAttribute(new Attribute("mapperSuffix", mapperSuffix)); //$NON-NLS-1$
		}

		addPropertyXmlElements(answer);

		return answer;
	}

	public void validate(List<String> errors, String contextId) {
		if (!stringHasValue(genericDao)) {
			errors.add(getString("ValidationError.2", contextId)); //$NON-NLS-1$
		}

		if (!stringHasValue(genericService)) {
			errors.add(getString("ValidationError.12", //$NON-NLS-1$
					"javaClientGenerator", contextId)); //$NON-NLS-1$
		}

		if (!stringHasValue(buildType)) {
			errors.add(getString("ValidationError.20", //$NON-NLS-1$
					contextId));
		}
		if (!stringHasValue(mapperSuffix)) {
			errors.add(getString("ValidationError.20", //$NON-NLS-1$
					contextId));
		}
	}

	public String getGenericDao() {
		return genericDao;
	}

	public void setGenericDao(String genericDao) {
		this.genericDao = genericDao;
	}

	public String getGenericService() {
		return genericService;
	}

	public void setGenericService(String genericService) {
		this.genericService = genericService;
	}

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public String getMapperSuffix() {
		return mapperSuffix;
	}

	public void setMapperSuffix(String mapperSuffix) {
		this.mapperSuffix = mapperSuffix;
	}

}
