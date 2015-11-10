/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ibm.watson.developer_cloud.tone_analyzer.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The Class ToneDimension.
 */
public class ToneDimension extends GenericModel {

  /** The children. */
  private List<ToneTrait> children;

  /** The id. */
  private String id;

  /** The name. */
  private String name;

  /**
   * Gets the children.
   * 
   * @return The children
   */
  public List<ToneTrait> getChildren() {
    return children;
  }

  /**
   * Gets the id.
   * 
   * @return The id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   * 
   * @return The name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the children.
   * 
   * @param children The children
   */
  public void setChildren(List<ToneTrait> children) {
    this.children = children;
  }

  /**
   * Sets the id.
   * 
   * @param id The id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the name.
   * 
   * @param name The name
   */
  public void setName(String name) {
    this.name = name;
  }
}
