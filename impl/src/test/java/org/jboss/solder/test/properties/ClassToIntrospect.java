/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.solder.test.properties;

import java.net.URL;

public class ClassToIntrospect {
    private String name;

    private String p;

    private URL URL;
	
	public long primitiveProperty = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getTitle() {
        return "Hero";
    }

    public String get() {
        return null;
    }

    public boolean is() {
        return false;
    }

    public void getFooBar() {
    }

    public void setSalary(Double base, Double bonus) {
    }

    public URL getURL() {
        return URL;
    }

    public void setURL(URL URL) {
        this.URL = URL;
    }

    public Boolean isValid() {
        return false;
    }

    public boolean isValidPrimitiveBoolean() {
        return false;
    }

	
	public long getPrimitiveProperty()
	{
		return 0l;
	}
}
