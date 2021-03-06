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

package srt.core.model.tree;


import srt.core.model.requirement.Requirement;


/**
 * This interface describes a modifiable requirement node.
 *
 * @author Kristian Kutin
 */
public interface ModifiableRequirementNode extends RequirementNode {

    /**
     * Replaces the requirement with the specified requirement.
     *
     * @param newRequirement
     *        a new requirement
     *
     * @return the replaced Requirement
     */
    Requirement replaceRequirement(Requirement newRequirement);

    /**
     * Adds the specified package node at the end.
     *
     * @param newPackageNode
     *        a new package node
     */
    void addPackageNode(PackageNode newPackageNode);

    /**
     * Inserts the specified package node at the specified index.
     *
     * @param anIndex
     *        an index (i.e. a number equal to zero or higher)
     * @param newPackageNode
     *        a new package node
     */
    void insertPackageNode(int anIndex, PackageNode newPackageNode);

    /**
     * Removes the package node at the specified index
     *
     * @param anIndex
     *        an index (i.e. a number equal to zero or higher)
     *
     * @return the removed package node
     */
    PackageNode removePackageNode(int anIndex);

}
