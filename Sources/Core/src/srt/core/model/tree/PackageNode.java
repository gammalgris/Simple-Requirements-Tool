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


import srt.core.id.RequirementID;
import srt.core.model.tree.common.Named;


/**
 * This interface describes a special node which represents a package node.
 *
 * @author Kristian Kutin
 */
public interface PackageNode extends Named {

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

    /**
     * Returns all requirement nodes directly known to this package node.
     *
     * @return all requirement nodes
     */
    RequirementNode[] getRequirementNodes();

    /**
     * Returns the number of all requirement nodes directly known to this package node.
     *
     * @return the number of all requirement nodes
     */
    int requirementNodes();

    /**
     * Returns the requirement node at the specified index.
     *
     * @param anIndex
     *        an index (i.e. a number equal to zero or higher)
     *
     * @return a requirement node
     */
    RequirementNode getRequirementNode(int anIndex);

    /**
     * Returns the IDs of all requirement nodes directly known to this package node.
     *
     * @return the IDs of all requirement nodes
     */
    RequirementID[] getRequirementNodeIds();

    /**
     * Returns the requirement node with the specified ID.
     *
     * @param anId
     *        an ID
     *
     * @return a requirement node
     */
    RequirementNode getRequirementNode(RequirementID anId);

    /**
     * Returns the file names of all requirement nodes directly known to this package node.
     *
     * @return the file names of all requirement nodes
     */
    String[] getRequirementNodeFiles();

    /**
     * Returns the requirement node with the specified ID.
     *
     * @param aFile
     *        an file name (without directories)
     *
     * @return a requirement node
     */
    RequirementNode getRequirementNode(String aFile);

}
