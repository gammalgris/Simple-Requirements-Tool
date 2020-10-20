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

package test.srt.core.model.requirement;


import java.util.ArrayList;
import java.util.Collection;

import jmul.misc.text.Text;
import jmul.misc.text.TextImpl;

import jmul.test.classification.UnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import srt.core.model.requirement.Section;
import srt.core.model.requirement.SectionImpl;


/**
 * This class tests the instantiation of a section with valid parameters.
 *
 * @author Kristian Kutin
 */
@UnitTest
@RunWith(Parameterized.class)
public class SectionValidInstantiationTest {

    /**
     * A section name.
     */
    String sectionName;

    /**
     * A section test.
     */
    Text sectionText;

    /**
     * Creates a new test according to the specified parameters.
     *
     * @param aSectionName
     *        a section name
     * @param aSectionText
     *        a section text
     */
    public SectionValidInstantiationTest(String aSectionName, Text aSectionText) {

        super();

        sectionName = aSectionName;
        sectionText = aSectionText;
    }

    /**
     * Tests the actual instantiation.
     */
    @Test
    public void testInstantiation() {

        Section section = new SectionImpl(sectionName, sectionText);
        assertNotNull(section);
        assertEquals(sectionName, section.getSectionName());
        assertEquals(sectionText, section.getSectionText());
    }

    /**
     * Returns a matrix of input data.
     *
     * @return a matrix of input data
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Collection<Object[]> parameters = new ArrayList<Object[]>();

        parameters.add(new Object[] { "a", new TextImpl("a", "b") });
        parameters.add(new Object[] { "a", new TextImpl() });

        return parameters;
    }

}
