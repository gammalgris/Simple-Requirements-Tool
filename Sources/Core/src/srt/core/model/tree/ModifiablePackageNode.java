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


/**
 * This interface describes a modifiable package node.
 *
 * @author Kristian Kutin
 */
public interface ModifiablePackageNode extends PackageNode {

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

    /**
     * Adds the specified requirement node at the end.
     *
     * @param newRequirementNode
     *        a new requirement node
     */
    void addRequirementNode(RequirementNode newRequirementNode);

    /**
     * Inserts the specified requirement node at the specified index.
     *
     * @param anIndex
     *        an index (i.e. a number equal to zero or higher)
     * @param newRequirementNode
     *        a new requirement node
     */
    void insertRequirementNode(int anIndex, RequirementNode newRequirementNode);

    /**
     * Removes the requirement node at the specified index
     *
     * @param anIndex
     *        an index (i.e. a number equal to zero or higher)
     *
     * @return the removed requirement node
     */
    RequirementNode removeRequirementNode(int anIndex);

}
