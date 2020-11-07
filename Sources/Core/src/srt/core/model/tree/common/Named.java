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
 * This interface describes methods for nodes which provide an individual name and a name which depicts the
 * underlying tree structure.
 *
 * @author Kristian Kutin
 */
public interface Named {

    /**
     * Returns the package name (i.e. directory name which represents this package).
     *
     * @return a package name
     */
    String getName();

    /**
     * Returns the canonical package name (i.e. a concatenation of all package names).
     *
     * @return a canonical package name
     */
    String getCanonicalName();

}
