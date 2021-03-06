/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
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
package org.wso2.carbon.message.store.service;

/**
 * Instances of this class represents the MetaData of a Message Store
 */

public class MessageStoreMetaData {

    private String name;
    private String artifactContainerName;
    private boolean isEdited;

    /**
     * Get the name of the store
     * @return store name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the store name as a metadata
     * @param name store name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Check whether the store is deployed from artifact container
     * @return true if store deployed from CApp, else false
     */
    public String getArtifactContainerName() {
        return artifactContainerName;
    }

    /**
     * Set whether the store is deployed from artifact container
     * @param artifactContainerName true if store deployed from artifact container, else false
     */
    public void setArtifactContainerName(String artifactContainerName) {
        this.artifactContainerName = artifactContainerName;
    }

    /**
     * Check whether the store deployed from artifact container is edited through management console
     * @return true if the store is edited, else false
     */
    public boolean getIsEdited() {
        return isEdited;
    }

    /**
     * Set whether the store deployed from artifact container is edited through management console
     * @param isEdited true if the store is edited, else false
     */
    public void setIsEdited(boolean isEdited) {
        this.isEdited = isEdited;
    }
}