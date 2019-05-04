/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH & Co. KG (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software GmbH & Co. KG, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.workplace.tools.galleryoverview;

import org.opencms.i18n.A_CmsMessageBundle;
import org.opencms.i18n.I_CmsMessageBundle;

/**
 * Convenience class to access the localized messages of this OpenCms package.<p>
 *
 * @since 6.0.0
 */
public final class Messages extends A_CmsMessageBundle {

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_ADMIN_TOOL_GROUP_0 = "GUI_GALLERIES_ADMIN_TOOL_GROUP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_ADMIN_TOOL_HELP_0 = "GUI_GALLERIES_ADMIN_TOOL_HELP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_ADMIN_TOOL_NAME_0 = "GUI_GALLERIES_ADMIN_TOOL_NAME_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_DOWNLOAD_ADMIN_TOOL_GROUP_0 = "GUI_GALLERIES_DOWNLOAD_ADMIN_TOOL_GROUP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_DOWNLOAD_ADMIN_TOOL_HELP_0 = "GUI_GALLERIES_DOWNLOAD_ADMIN_TOOL_HELP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_DOWNLOAD_ADMIN_TOOL_NAME_0 = "GUI_GALLERIES_DOWNLOAD_ADMIN_TOOL_NAME_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_HTML_ADMIN_TOOL_GROUP_0 = "GUI_GALLERIES_HTML_ADMIN_TOOL_GROUP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_HTML_ADMIN_TOOL_HELP_0 = "GUI_GALLERIES_HTML_ADMIN_TOOL_HELP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_HTML_ADMIN_TOOL_NAME_0 = "GUI_GALLERIES_HTML_ADMIN_TOOL_NAME_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_TABLE_ADMIN_TOOL_GROUP_0 = "GUI_GALLERIES_TABLE_ADMIN_TOOL_GROUP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_TABLE_ADMIN_TOOL_HELP_0 = "GUI_GALLERIES_TABLE_ADMIN_TOOL_HELP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_TABLE_ADMIN_TOOL_NAME_0 = "GUI_GALLERIES_TABLE_ADMIN_TOOL_NAME_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_IMAGE_ADMIN_TOOL_GROUP_0 = "GUI_GALLERIES_IMAGE_ADMIN_TOOL_GROUP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_IMAGE_ADMIN_TOOL_HELP_0 = "GUI_GALLERIES_IMAGE_ADMIN_TOOL_HELP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_IMAGE_ADMIN_TOOL_NAME_0 = "GUI_GALLERIES_IMAGE_ADMIN_TOOL_NAME_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_LINK_ADMIN_TOOL_GROUP_0 = "GUI_GALLERIES_LINK_ADMIN_TOOL_GROUP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_LINK_ADMIN_TOOL_HELP_0 = "GUI_GALLERIES_LINK_ADMIN_TOOL_HELP_0";

    /** Message constant for key in the resource bundle. */
    public static final String GUI_GALLERIES_LINK_ADMIN_TOOL_NAME_0 = "GUI_GALLERIES_LINK_ADMIN_TOOL_NAME_0";

    /** Name of the used resource bundle. */
    private static final String BUNDLE_NAME = "org.opencms.workplace.tools.galleryoverview.messages";

    /** Static instance member. */
    private static final I_CmsMessageBundle INSTANCE = new Messages();

    /**
     * Hides the public constructor for this utility class.<p>
     */
    private Messages() {

        // hide the constructor
    }

    /**
     * Returns an instance of this localized message accessor.<p>
     *
     * @return an instance of this localized message accessor
     */
    public static I_CmsMessageBundle get() {

        return INSTANCE;
    }

    /**
     * Returns the bundle name for this OpenCms package.<p>
     *
     * @return the bundle name for this OpenCms package
     */
    public String getBundleName() {

        return BUNDLE_NAME;
    }
}