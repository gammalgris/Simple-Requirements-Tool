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

package srt.core.writer;


import java.io.File;
import java.io.IOException;

import srt.core.model.requirement.Requirement;


/**
 * This interface describes an entity that writes a requirement to a file.
 *
 * @author Kristian Kutin
 */
public interface RequirementWriter {

    /**
     * Writes the specified requirement to the specified file.
     *
     * @param aFilename
     *        the name of the output file
     * @param aRequirement
     *        a requirement
     *
     * @throws IOException
     *         is thrown if an error occurrs while trying to write to the file
     */
    void writeTo(String aFilename, Requirement aRequirement) throws IOException;

    /**
     * Writes the specified requirement to the specified file.
     *
     * @param aFile
     *        the output file
     * @param aRequirement
     *        a requirement
     *
     * @throws IOException
     *         is thrown if an error occurrs while trying to write to the file
     */
    void writeTo(File aFile, Requirement aRequirement) throws IOException;

}
