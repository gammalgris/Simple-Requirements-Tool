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

package srt.core.model.requirement;


import jmul.misc.text.Text;

import jmul.checks.ParameterCheckHelper;


/**
 * An implementation of a requirement section.
 *
 * @author Kristian Kutin
 */
public class SectionImpl implements Section {

    /**
     * Contains the section name.
     */
    private final String sectionName;

    /**
     * Contains the section text.
     */
    private final Text sectionText;

    /**
     * Creates a new section according to the specified parameters.
     *
     * @param aSectionName
     *        a section name
     * @param aSectionText
     *        a section text
     */
    public SectionImpl(String aSectionName, Text aSectionText) {

        super();

        ParameterCheckHelper.checkStringParameter(aSectionName);
        ParameterCheckHelper.checkObjectParameter(aSectionText);

        sectionName = aSectionName;
        sectionText = aSectionText;
    }

    /**
     * Returns the section name.
     *
     * @return a section name
     */
    @Override
    public String getSectionName() {

        return sectionName;
    }

    /**
     * Returns the description text.
     *
     * @return a text
     */
    @Override
    public Text getSectionText() {

        return sectionText;
    }

}
