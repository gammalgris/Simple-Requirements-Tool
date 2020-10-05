/*
 * SPDX-License-Identifier: GPL-3.0
 *
 *
 * Simple Requirements Tool
 *
 * SRT is a tool for managing requirements.
 *
 * Copyright (C) 2020  Kristian Kutin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * e-mail: kristian.kutin@arcor.de
 */

/*
 * This section contains meta informations.
 *
 * $Id$
 */

package test.srt.core;


import java.nio.charset.Charset;

import jmul.test.classification.ConfigurationTest;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import srt.core.RequirementFileProperties;


/**
 * This class contains some configuration tests to test the requirement file properties.
 *
 * @author Kristian Kutin
 */
@ConfigurationTest
public class RequirementFilePropertiesTest {

    /**
     * Tests the line separator configuration.
     */
    @Test
    public void testLineSeparator() {

        String lineSeparator = RequirementFileProperties.getLineSeparator();
        assertNotNull(lineSeparator);
    }

    /**
     * Tests the charset name configuration.
     */
    @Test
    public void testCharsetName() {

        String charsetName = RequirementFileProperties.getCharsetName();
        assertNotNull(charsetName);
    }

    /**
     * Tests the charset configuration.
     */
    @Test
    public void testCharset() {

        Charset charset = RequirementFileProperties.getCharset();
        assertNotNull(charset);
    }

}
