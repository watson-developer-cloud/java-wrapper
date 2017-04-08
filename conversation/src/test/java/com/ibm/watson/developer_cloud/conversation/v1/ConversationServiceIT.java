/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.developer_cloud.conversation.v1;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ibm.watson.developer_cloud.WatsonServiceTest;
import com.ibm.watson.developer_cloud.conversation.v1.model.Intent;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;
import com.ibm.watson.developer_cloud.util.RetryRunner;

/**
 * Integration test for the {@link ConversationService}.
 */
@RunWith(RetryRunner.class)
public class ConversationServiceIT extends WatsonServiceTest {

  private ConversationService service;
  private String workspaceId;

  /*
   * (non-Javadoc)
   *
   * @see com.ibm.watson.developer_cloud.WatsonServiceTest#setUp()
   */
  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
    String username = getProperty("conversation.v1.username");
    String password = getProperty("conversation.v1.password");
    workspaceId = getProperty("conversation.v1.workspace_id");

    Assume.assumeFalse("config.properties doesn't have valid credentials.",
        (username == null) || username.equals(PLACEHOLDER));

    service = new ConversationService(ConversationService.VERSION_DATE_2016_09_20);
    service.setEndPoint(getProperty("conversation.v1.url"));
    service.setUsernameAndPassword(username, password);
    service.setDefaultHeaders(getDefaultHeaders());
  }

  /**
   * Test start a conversation without message.
   */
  @Test()
  public void testStartAConversationWithoutMessage() {
    service.message(workspaceId, null).execute();
  }

  /**
   * Test send messages.
   *
   * @throws InterruptedException the interrupted exception
   */
  @Test
  public void testSendMessages() throws InterruptedException {
    final String[] messages = new String[] { "turn ac on", "turn right", "no", "yes" };
    Map<String, Object> context = null;
    for (final String message : messages) {
      MessageRequest request =
          new MessageRequest.Builder().inputText(message).alternateIntents(true).context(context).build();

      if (message.equals("yes")) {
        request = request.newBuilder().intent(new Intent("off_topic", 1.0)).build();
      }
      MessageResponse response = service.message(workspaceId, request).execute();

      assertMessageFromService(response);
      context = response.getContext();
      Thread.sleep(500);
    }
  }

  /**
   * Assert {@link MessageResponse} from service.
   *
   * @param message the message from the {@link ConversationService}
   */
  private void assertMessageFromService(MessageResponse message) {
    assertNotNull(message);
    assertNotNull(message.getEntities());
    assertNotNull(message.getIntents());
  }

  /**
   * Test message with nulls.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testMessageWithNulls() {
    service.message(null, null).execute();
  }

  /**
   * Test to string.
   */
  @Test
  public void testToString() {
    assertNotNull(service.toString());
  }
  
  /**
   * Test createCounterexample.
   */
  @Test
  public void testCreateCounterexample() {
    // TODO: make test
    fail("Test for createCounterexample not yet implemented");
  }

  /**
   * Test deleteCounterexample.
   */
  @Test
  public void testDeleteCounterexample() {
    // TODO: make test
    fail("Test for deleteCounterexample not yet implemented");
  }

  /**
   * Test getCounterexample.
   */
  @Test
  public void testGetCounterexample() {
    // TODO: make test
    fail("Test for getCounterexample not yet implemented");
  }

  /**
   * Test listCounterexamples.
   */
  @Test
  public void testListCounterexamples() {
    // TODO: make test
    fail("Test for listCounterexamples not yet implemented");
  }

  /**
   * Test updateCounterexample.
   */
  @Test
  public void testUpdateCounterexample() {
    // TODO: make test
    fail("Test for updateCounterexample not yet implemented");
  }

  /**
   * Test createExample.
   */
  @Test
  public void testCreateExample() {
    // TODO: make test
    fail("Test for createExample not yet implemented");
  }

  /**
   * Test deleteExample.
   */
  @Test
  public void testDeleteExample() {
    // TODO: make test
    fail("Test for deleteExample not yet implemented");
  }

  /**
   * Test getExample.
   */
  @Test
  public void testGetExample() {
    // TODO: make test
    fail("Test for getExample not yet implemented");
  }

  /**
   * Test listExamples.
   */
  @Test
  public void testListExamples() {
    // TODO: make test
    fail("Test for listExamples not yet implemented");
  }

  /**
   * Test updateExample.
   */
  @Test
  public void testUpdateExample() {
    // TODO: make test
    fail("Test for updateExample not yet implemented");
  }

  /**
   * Test createIntent.
   */
  @Test
  public void testCreateIntent() {
    // TODO: make test
    fail("Test for createIntent not yet implemented");
  }

  /**
   * Test deleteIntent.
   */
  @Test
  public void testDeleteIntent() {
    // TODO: make test
    fail("Test for deleteIntent not yet implemented");
  }

  /**
   * Test getIntent.
   */
  @Test
  public void testGetIntent() {
    // TODO: make test
    fail("Test for getIntent not yet implemented");
  }

  /**
   * Test listIntents.
   */
  @Test
  public void testListIntents() {
    // TODO: make test
    fail("Test for listIntents not yet implemented");
  }

  /**
   * Test updateIntent.
   */
  @Test
  public void testUpdateIntent() {
    // TODO: make test
    fail("Test for updateIntent not yet implemented");
  }

  /**
   * Test createWorkspace.
   */
  @Test
  public void testCreateWorkspace() {
    // TODO: make test
    fail("Test for createWorkspace not yet implemented");
  }

  /**
   * Test deleteWorkspace.
   */
  @Test
  public void testDeleteWorkspace() {
    // TODO: make test
    fail("Test for deleteWorkspace not yet implemented");
  }

  /**
   * Test getWorkspace.
   */
  @Test
  public void testGetWorkspace() {
    // TODO: make test
    fail("Test for getWorkspace not yet implemented");
  }

  /**
   * Test listWorkspaces.
   */
  @Test
  public void testListWorkspaces() {
    // TODO: make test
    fail("Test for listWorkspaces not yet implemented");
  }

  /**
   * Test updateWorkspace.
   */
  @Test
  public void testUpdateWorkspace() {
    // TODO: make test
    fail("Test for updateWorkspace not yet implemented");
  }
}
