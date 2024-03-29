/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.chensheng.dddboot.nacos.spring.util;

/**
 * The user inherits the AbstraceConfigParse abstract class and adds the implementation
 * class in META-INF/com.alibaba.nacos.spring.util.ConfigParse to implement the addition
 * of custom parsing rules. If the dataId and group methods are not overridden, Will
 * override the original parsing rule implementation, otherwise the user-defined parsing
 * rules will only be applied to specific dataId and group
 *
 * @author <a href="mailto:liaochunyhm@live.com">liaochuntao</a>
 * @since 0.3.0
 */
public abstract class AbstractConfigParse implements ConfigParse {

	@Override
	public String dataId() {
		return "";
	}

	@Override
	public String group() {
		return "";
	}
}
