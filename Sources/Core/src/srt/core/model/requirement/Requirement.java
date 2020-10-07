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


import java.util.List;

import srt.core.id.RequirementID;


/**
 * This interface describes a requirement. A requirement is divided into sections which
 * describe various aspects of the requirement.
 *
 * @author Kristian Kutin
 */
public interface Requirement extends Iterable<Section> {

    /**
     * Returns all section names.
     *
     * @return all section names
     */
    List<String> getSectionNames();

    /**
     * Returns the name of the section at the specified index position.
     *
     * @param anIndex
     *        an index
     *
     * @return a section name
     */
    String getSectionName(int anIndex);

    /**
     * Returns the section at the specified index position.
     *
     * @param anIndex
     *        an index
     *
     * @return a section
     */
    Section getSection(int anIndex);

    /**
     * Returns the number of sections.
     *
     * @return a section count
     */
    int sections();

    /**
     * Returns the ID of this requirement.
     *
     * @return an ID or <code>null</code> if no ID was assigned yet
     */
    RequirementID getID();

}
