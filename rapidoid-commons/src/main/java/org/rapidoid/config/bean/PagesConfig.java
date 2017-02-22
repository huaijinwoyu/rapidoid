package org.rapidoid.config.bean;

/*
 * #%L
 * rapidoid-commons
 * %%
 * Copyright (C) 2014 - 2017 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.rapidoid.RapidoidThing;
import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;

@Authors("Nikolche Mihajlovski")
@Since("5.3.0")
public class PagesConfig extends RapidoidThing {

	public volatile String sql;

	public volatile String[] roles;

	public PagesConfig() {
	}

	public PagesConfig(String sql) {
		this.sql = sql;
	}

	public String[] roles() {
		return roles;
	}

	public PagesConfig roles(String[] roles) {
		this.roles = roles;
		return this;
	}
}