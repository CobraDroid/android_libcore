/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
* @author Vera Y. Petrashkova
* @version $Revision$
*/

package org.apache.harmony.security.tests.java.security;

import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestTargets;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;

import java.security.NoSuchProviderException;

import junit.framework.TestCase;
@TestTargetClass(NoSuchProviderException.class)
/**
 * Tests for <code>NoSuchProviderException</code> class constructors and
 * methods.
 * 
 */
public class NoSuchProviderExceptionTest extends TestCase {

    public static void main(String[] args) {
    }

    /**
     * Constructor for NoSuchProviderExceptionTests.
     * 
     * @param arg0
     */
    public NoSuchProviderExceptionTest(String arg0) {
        super(arg0);
    }

    static String[] msgs = {
            "",
            "Check new message",
            "Check new message Check new message Check new message Check new message Check new message" };

    static Throwable tCause = new Throwable("Throwable for exception");

    /**
     * Test for <code>NoSuchProviderException()</code> constructor Assertion:
     * constructs NoSuchProviderException with no detail message
     */
    @TestTargetNew(
        level = TestLevel.COMPLETE,
        notes = "",
        method = "NoSuchProviderException",
        args = {}
    )
    public void testNoSuchProviderException01() {
        NoSuchProviderException tE = new NoSuchProviderException();
        assertNull("getMessage() must return null.", tE.getMessage());
        assertNull("getCause() must return null", tE.getCause());
    }

    /**
     * Test for <code>NoSuchProviderException(String)</code> constructor
     * Assertion: constructs NoSuchProviderException with detail message msg.
     * Parameter <code>msg</code> is not null.
     */
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "",
        method = "NoSuchProviderException",
        args = {java.lang.String.class}
    )
    public void testNoSuchProviderException02() {
        NoSuchProviderException tE;
        for (int i = 0; i < msgs.length; i++) {
            tE = new NoSuchProviderException(msgs[i]);
            assertEquals("getMessage() must return: ".concat(msgs[i]), tE
                    .getMessage(), msgs[i]);
            assertNull("getCause() must return null", tE.getCause());
        }
    }

    /**
     * Test for <code>NoSuchProviderException(String)</code> constructor
     * Assertion: constructs NoSuchProviderException when <code>msg</code> is
     * null
     */
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "",
        method = "NoSuchProviderException",
        args = {java.lang.String.class}
    )
    public void testNoSuchProviderException03() {
        String msg = null;
        NoSuchProviderException tE = new NoSuchProviderException(msg);
        assertNull("getMessage() must return null.", tE.getMessage());
        assertNull("getCause() must return null", tE.getCause());
    }
}
