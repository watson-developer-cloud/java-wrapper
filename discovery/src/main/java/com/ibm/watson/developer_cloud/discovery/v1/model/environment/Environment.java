/**
 * Copyright 2016 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.developer_cloud.discovery.v1.model.environment;

import static com.ibm.watson.developer_cloud.discovery.v1.model.environment.EnvironmentManager.*;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

import java.util.Date;

/**
 * Container where Collections and Configurations are stored.
 * An Environment gives information about the memory and storage space allocated
 */
public class Environment extends GenericModel {
    @SerializedName(ID)
    private String environmentId;
    @SerializedName(NAME)
    private String name;
    @SerializedName(DESCRIPTION)
    private String description;
    @SerializedName(CREATED)
    private Date created;
    @SerializedName(UPDATED)
    private Date updated;
    @SerializedName(STATUS)
    private String status;
    @SerializedName(READ_ONLY)
    private Boolean readOnly;
    @SerializedName(INDEX_CAPACITY)
    private IndexCapacity indexCapacity;

    public String getEnvironmentId() {
        return environmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    public String getStatus() {
        return status;
    }

    public Boolean isReadOnly() {
        return readOnly;
    }

    public IndexCapacity getIndexCapacity() {
        return indexCapacity;
    }
}
