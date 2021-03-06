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


/**
 * This interface describes a requirement tree. Requirements are arranged in a
 * tree structure which consists of package nodes and requirements nodes.
 *
 * @author Kristian Kutin
 */
public interface RequirementTree extends Identifiable {

    /**
     * Returns the root node.
     *
     * @return a root node
     */
    PackageNode getRootNode();

    /**
     * Returns the maximum depth of the tree.
     *
     * @return a tree depth
     */
    int getMaxDepth();

}
