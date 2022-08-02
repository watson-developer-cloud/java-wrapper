/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.watson.assistant.v2.model;

/** MessageOutputDebugTurnEventTurnEventStepAnswered. */
public class MessageOutputDebugTurnEventTurnEventStepAnswered extends MessageOutputDebugTurnEvent {

  /** The type of condition (if any) that is defined for the action. */
  public interface ConditionType {
    /** user_defined. */
    String USER_DEFINED = "user_defined";
    /** welcome. */
    String WELCOME = "welcome";
    /** anything_else. */
    String ANYTHING_ELSE = "anything_else";
  }
}
