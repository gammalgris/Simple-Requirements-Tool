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

package srt.core.model.tree.common;


/**
 * This interface describes a generic node.
 *
 * @author Kristian Kutin
 */
public interface Node extends Named {

    /**
     * Calculates the depth of the tree or subtree as seen by this node.
     *
     * @return a depth
     */
    int getDepth();

    /**
     * Checks if this node has a parent node.
     *
     * @return <code>true</code> if this node has a parent node, else <code>false</code>
     */
    boolean hasParent();

    /**
     * Returns the parent node of this node.
     *
     * @return a parent node or <code>null</code> if no parent exists
     */
    Node getParent();

    /**
     * Returns the number of children this node has.
     *
     * @return the number of children
     */
    int children();

    /**
     * Returns the child node at the specified index.
     *
     * @param anIndex
     *
     * @return a child node
     */
    Node getChild(int anIndex);

    /**
     * Checks if this node has child nodes.
     *
     * @return <code>true</code> if this node has child nodes, else <code>false</code>
     */
    boolean hasChildren();

}
