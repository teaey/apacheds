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

package org.apache.directory.server.dns.io.encoder;


/**
 * 3.3.2. HINFO RDATA format
 * 
 *     +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
 *     /                      CPU                      /
 *     +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
 *     /                       OS                      /
 *     +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
 * 
 * where:
 * 
 * CPU             A <character-string> which specifies the CPU type.
 * 
 * OS              A <character-string> which specifies the operating
 *                 system type.
 * 
 * Standard values for CPU and OS can be found in [RFC-1010].
 * 
 * HINFO records are used to acquire general information about a host.  The
 * main use is for protocols such as FTP that can use special procedures
 * when talking between machines or operating systems of the same type.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev: 501160 $, $Date: 2007-01-29 20:41:33 +0100 (Lun, 29 jan 2007) $
 */
public class HostInformationRecordEncoder
{
}