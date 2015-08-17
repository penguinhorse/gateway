/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.kaazing.gateway.management.monitoring.entity.manager;

import org.kaazing.gateway.management.Utils.ManagementSessionType;

/**
 * Interface for a ServiceCounterManager responsible with holding the service session counter data and
 * performing the needed operations on its respective counters
 *
 */
public interface ServiceCounterManager {

    /**
     * Method initializing the service session counters
     * @return
     */
    void initializeSessionCounters();

    /**
     * Method incrementing the service session counters
     * @param managementSessionType - session type used to determine whether session is native or not
     */
    void incrementSessionCounters(ManagementSessionType managementSessionType);

    /**
     * Method decrementing the service session counters
     * @param managementSessionType - session type used to determine whether session is native or not
     */
    void decrementSessionCounters(ManagementSessionType managementSessionType);
}