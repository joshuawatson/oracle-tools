/*
 * File: JvmOption.java
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * The contents of this file are subject to the terms and conditions of 
 * the Common Development and Distribution License 1.0 (the "License").
 *
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the License by consulting the LICENSE.txt file
 * distributed with this file, or by consulting https://oss.oracle.com/licenses/CDDL
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file LICENSE.txt.
 *
 * MODIFICATIONS:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 */

package com.oracle.tools.runtime.java.options;

import com.oracle.tools.Option;

import com.oracle.tools.runtime.java.JavaApplicationBuilder;

/**
 * Represents one or more related Java Virtual Machine configuration options.
 * <p>
 * This is an internal interface is used by {@link JavaApplicationBuilder}s
 * to help identify {@link Option}s that are specific to Java Virtual Machine
 * configuration.  However it is not a requirement that implementations of
 * this interface also implement the {@link Option} interface.
 * <p>
 * <p>
 * Copyright (c) 2014. All Rights Reserved. Oracle Corporation.<br>
 * Oracle is a registered trademark of Oracle Corporation and/or its affiliates.
 *
 * @author Brian Oliver
 */
public interface JvmOption
{
    /**
     * Obtains the individual Java Virtual Machine option configuration
     * strings for the {@link JvmOption}.
     *
     * eg: The heap size option may return two strings; ["-Xms256m", "-Xmx512m"]
     *
     * @return an {@link Iterable} over the configuration strings
     */
    public Iterable<String> getOptions();
}
