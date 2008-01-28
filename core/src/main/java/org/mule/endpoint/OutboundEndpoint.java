/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.endpoint;

public class OutboundEndpoint extends MuleEndpoint
{

    private static final long serialVersionUID = 8860985949279708638L;

    public OutboundEndpoint()
    {
        super();
    }

    public boolean isOutbound()
    {
        return true;
    }

    public boolean isInbound()
    {
        return false;
    }
}
