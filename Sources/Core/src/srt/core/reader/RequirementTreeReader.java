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

package srt.core.reader;


import java.io.File;

import srt.core.model.tree.RequirementTree;


/**
 * This interface describes an entity which reads a requirement tree from a directory.
 *
 * @author Kristian Kutin
 */
public interface RequirementTreeReader {

    /**
     * Reads a requirement tree from a directory.
     *
     * @param aDirectoryPath
     *        a directory path
     *
     * @return a requirement tree
     */
    RequirementTree readFrom(String aDirectoryPath);

    /**
     * Reads a requirement tree from a directory.
     *
     * @param aDirectory
     *        a directory
     *
     * @return a requirement tree
     */
    RequirementTree readFrom(File aDirectory);

}
