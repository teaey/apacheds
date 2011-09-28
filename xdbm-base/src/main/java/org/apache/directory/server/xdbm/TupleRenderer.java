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
package org.apache.directory.server.xdbm;


/**
 * A table key/value String renderer for the display or logging of
 * human readable potentially binary data.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev: 640657 $
 */
public interface TupleRenderer
{
    /**
     * Gets the key Object rendered as a String.
     *
     * @param key the key Object
     * @return the String representation of the key Object
     */
    String getKeyString( Object key );


    /**
     * Gets the value Object rendered as a String.
     *
     * @param value the value Object
     * @return the String representation of the value Object
     */
    String getValueString( Object value );
}
