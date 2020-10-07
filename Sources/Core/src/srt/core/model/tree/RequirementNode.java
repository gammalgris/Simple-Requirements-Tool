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
 * This interface describes a requirement node.
 *
 * @author Kristian Kutin
 */
public interface RequirementNode {

    /**
     * Checks if this node has a parent node.
     *
     * @return <code>true</code> if this node has a parent node, else <code>false</code>
     */
    boolean hasParent();

    /**
     * Checks if this node has child nodes.
     *
     * @return <code>true</code> if this node has child nodes, else <code>false</code>
     */
    boolean hasChildren();

    /**
     * Returns the parent node of this node.
     *
     * @return the parent node or <code>null</code> if this node has no parent
     */
    RequirementNode getParent();

    /**
     * Returns the child node at the specified index.
     *
     * @param anIndex
     *        an index
     *
     * @return a child node
     */
    RequirementNode getChild(int anIndex);

    /**
     * Returns the number of children this node has.
     *
     * @return a child count
     */
    int children();

    /**
     * Returns the requirement associated with this node.
     *
     * @return a requirement
     */
    Requirement getRequirement();

}
