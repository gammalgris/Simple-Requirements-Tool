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

package srt.core;


import java.nio.charset.Charset;

import java.util.ResourceBundle;


/**
 * This utility class provides access to confiugrable requirement file properties.
 *
 * @author Kristian Kutin
 */
public class RequirementFileProperties {

    /**
     * A property key.
     */
    private static final String LINE_SEPARATOR_KEY;

    /**
     * A property key.
     */
    private static final String CHARSET_KEY;

    /*
     * The static initializer.
     */
    static {

        LINE_SEPARATOR_KEY = "line.separator";
        CHARSET_KEY = "charset";
    }

    /**
     * The default constructor.
     */
    private RequirementFileProperties() {

        throw new UnsupportedOperationException();
    }

    /**
     * Returns a resource bundle.
     *
     * @return a resource bundle
     */
    private static ResourceBundle getBundle() {

        return ResourceBundle.getBundle(RequirementFileProperties.class.getName());
    }

    /**
     * Returns the line separator used in requirements files.
     *
     * @return a line seaparator
     */
    public static String getLineSeparator() {

        return getBundle().getString(LINE_SEPARATOR_KEY);
    }

    /**
     * Returns the charset name used in requirements files.
     *
     * @return a charset name
     */
    public static String getCharsetName() {

        return getBundle().getString(CHARSET_KEY);
    }

    /**
     * Returns the charset used in requirements files.
     *
     * @return a charset
     */
    public static Charset getCharset() {

        return Charset.forName(getCharsetName());
    }

}
