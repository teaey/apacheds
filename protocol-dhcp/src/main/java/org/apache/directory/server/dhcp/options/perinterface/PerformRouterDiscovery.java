/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */

package org.apache.directory.server.dhcp.options.perinterface;


import org.apache.directory.server.dhcp.options.DhcpOption;


/**
 * This option specifies whether or not the client should solicit
 * routers using the Router Discovery mechanism defined in RFC 1256.
 * A value of 0 indicates that the client should not perform router
 * discovery.  A value of 1 means that the client should perform
 * router discovery.
 * 
 * The code for this option is 31, and its length is 1.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev: 638228 $, $Date: 2008-03-18 07:12:41 +0100 (Mar, 18 mar 2008) $
 */
public class PerformRouterDiscovery extends DhcpOption
{
    /*
     * @see org.apache.directory.server.dhcp.options.DhcpOption#getTag()
     */
    public byte getTag()
    {
        return 31;
    }
}
