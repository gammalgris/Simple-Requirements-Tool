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


import srt.core.id.Identifiable;
import srt.core.model.requirement.Requirement;
import srt.core.model.tree.common.Named;


/**
 * This interface describes a requirement node.
 *
 * @author Kristian Kutin
 */
public interface RequirementNode extends Named, Identifiable {

    /**
     * Returns the requirement associated with this node.
     *
     * @return a requirement
     */
    Requirement getRequirement();

    /**
     * Returns all package nodes directly known to this package node.
     *
     * @return all package nodes
     */
    PackageNode[] getPackageNodes();

    /**
     * Returns the number of all package nodes directly known to this package node.
     *
     * @return the number of all package nodes
     */
    int packageNodes();

    /**
     * Returns the package node at the specified index.
     *
     * @param anIndex
     *        an index (i.e. a number equal to zero or higher)
     *
     * @return a package node
     */
    PackageNode getPackageNode(int anIndex);

    /**
     * Returns the names of all package nodes directly known to this package node.
     *
     * @return the names of all package nodes
     */
    String[] getPackageNodeNames();

    /**
     * Returns the package node with the specified name.
     *
     * @param aName
     *        a name
     *
     * @return a package name
     */
    PackageNode getPackageNode(String aName);

}
