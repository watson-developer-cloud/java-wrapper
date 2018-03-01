/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.developer_cloud.discovery.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * WordStyle.
 */
public class WordStyle extends GenericModel {

  private Long level;
  private List<String> names;

  /**
   * Builder.
   */
  public static class Builder {
    private Long level;
    private List<String> names;

    private Builder(WordStyle wordStyle) {
      level = wordStyle.level;
      names = wordStyle.names;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WordStyle.
     *
     * @return the wordStyle
     */
    public WordStyle build() {
      return new WordStyle(this);
    }

    /**
     * Adds an names to names.
     *
     * @param names the new names
     * @return the WordStyle builder
     */
    public Builder addNames(String names) {
      Validator.notNull(names, "names cannot be null");
      if (this.names == null) {
        this.names = new ArrayList<String>();
      }
      this.names.add(names);
      return this;
    }

    /**
     * Set the level.
     *
     * @param level the level
     * @return the WordStyle builder
     */
    public Builder level(long level) {
      this.level = level;
      return this;
    }

    /**
     * Set the names.
     * Existing names will be replaced.
     *
     * @param names the names
     * @return the WordStyle builder
     */
    public Builder names(List<String> names) {
      this.names = names;
      return this;
    }
  }

  private WordStyle(Builder builder) {
    level = builder.level;
    names = builder.names;
  }

  /**
   * New builder.
   *
   * @return a WordStyle builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the level.
   *
   * @return the level
   */
  public Long level() {
    return level;
  }

  /**
   * Gets the names.
   *
   * @return the names
   */
  public List<String> names() {
    return names;
  }
}
