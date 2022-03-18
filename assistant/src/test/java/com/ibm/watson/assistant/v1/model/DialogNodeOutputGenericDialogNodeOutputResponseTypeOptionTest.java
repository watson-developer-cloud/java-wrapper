/*
 * (C) Copyright IBM Corp. 2020, 2022.
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

package com.ibm.watson.assistant.v1.model;

import static org.testng.Assert.*;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.assistant.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;

/** Unit test class for the DialogNodeOutputGenericDialogNodeOutputResponseTypeOption model. */
public class DialogNodeOutputGenericDialogNodeOutputResponseTypeOptionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata =
      TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDialogNodeOutputGenericDialogNodeOutputResponseTypeOption() throws Throwable {
    MessageInput messageInputModel =
        new MessageInput.Builder()
            .text("testString")
            .spellingSuggestions(false)
            .spellingAutoCorrect(false)
            .add("foo", "testString")
            .build();
    assertEquals(messageInputModel.getText(), "testString");
    assertEquals(messageInputModel.isSpellingSuggestions(), Boolean.valueOf(false));
    assertEquals(messageInputModel.isSpellingAutoCorrect(), Boolean.valueOf(false));
    assertEquals(messageInputModel.get("foo"), "testString");

    RuntimeIntent runtimeIntentModel =
        new RuntimeIntent.Builder().intent("testString").confidence(Double.valueOf("72.5")).build();
    assertEquals(runtimeIntentModel.intent(), "testString");
    assertEquals(runtimeIntentModel.confidence(), Double.valueOf("72.5"));

    CaptureGroup captureGroupModel =
        new CaptureGroup.Builder()
            .group("testString")
            .location(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
            .build();
    assertEquals(captureGroupModel.group(), "testString");
    assertEquals(
        captureGroupModel.location(),
        new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));

    RuntimeEntityInterpretation runtimeEntityInterpretationModel =
        new RuntimeEntityInterpretation.Builder()
            .calendarType("testString")
            .datetimeLink("testString")
            .festival("testString")
            .granularity("day")
            .rangeLink("testString")
            .rangeModifier("testString")
            .relativeDay(Double.valueOf("72.5"))
            .relativeMonth(Double.valueOf("72.5"))
            .relativeWeek(Double.valueOf("72.5"))
            .relativeWeekend(Double.valueOf("72.5"))
            .relativeYear(Double.valueOf("72.5"))
            .specificDay(Double.valueOf("72.5"))
            .specificDayOfWeek("testString")
            .specificMonth(Double.valueOf("72.5"))
            .specificQuarter(Double.valueOf("72.5"))
            .specificYear(Double.valueOf("72.5"))
            .numericValue(Double.valueOf("72.5"))
            .subtype("testString")
            .partOfDay("testString")
            .relativeHour(Double.valueOf("72.5"))
            .relativeMinute(Double.valueOf("72.5"))
            .relativeSecond(Double.valueOf("72.5"))
            .specificHour(Double.valueOf("72.5"))
            .specificMinute(Double.valueOf("72.5"))
            .specificSecond(Double.valueOf("72.5"))
            .timezone("testString")
            .build();
    assertEquals(runtimeEntityInterpretationModel.calendarType(), "testString");
    assertEquals(runtimeEntityInterpretationModel.datetimeLink(), "testString");
    assertEquals(runtimeEntityInterpretationModel.festival(), "testString");
    assertEquals(runtimeEntityInterpretationModel.granularity(), "day");
    assertEquals(runtimeEntityInterpretationModel.rangeLink(), "testString");
    assertEquals(runtimeEntityInterpretationModel.rangeModifier(), "testString");
    assertEquals(runtimeEntityInterpretationModel.relativeDay(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.relativeMonth(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.relativeWeek(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.relativeWeekend(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.relativeYear(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificDay(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificDayOfWeek(), "testString");
    assertEquals(runtimeEntityInterpretationModel.specificMonth(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificQuarter(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificYear(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.numericValue(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.subtype(), "testString");
    assertEquals(runtimeEntityInterpretationModel.partOfDay(), "testString");
    assertEquals(runtimeEntityInterpretationModel.relativeHour(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.relativeMinute(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.relativeSecond(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificHour(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificMinute(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.specificSecond(), Double.valueOf("72.5"));
    assertEquals(runtimeEntityInterpretationModel.timezone(), "testString");

    RuntimeEntityAlternative runtimeEntityAlternativeModel =
        new RuntimeEntityAlternative.Builder()
            .value("testString")
            .confidence(Double.valueOf("72.5"))
            .build();
    assertEquals(runtimeEntityAlternativeModel.value(), "testString");
    assertEquals(runtimeEntityAlternativeModel.confidence(), Double.valueOf("72.5"));

    RuntimeEntityRole runtimeEntityRoleModel =
        new RuntimeEntityRole.Builder().type("date_from").build();
    assertEquals(runtimeEntityRoleModel.type(), "date_from");

    RuntimeEntity runtimeEntityModel =
        new RuntimeEntity.Builder()
            .entity("testString")
            .location(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
            .value("testString")
            .confidence(Double.valueOf("72.5"))
            .groups(
                new java.util.ArrayList<CaptureGroup>(java.util.Arrays.asList(captureGroupModel)))
            .interpretation(runtimeEntityInterpretationModel)
            .alternatives(
                new java.util.ArrayList<RuntimeEntityAlternative>(
                    java.util.Arrays.asList(runtimeEntityAlternativeModel)))
            .role(runtimeEntityRoleModel)
            .build();
    assertEquals(runtimeEntityModel.entity(), "testString");
    assertEquals(
        runtimeEntityModel.location(),
        new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(runtimeEntityModel.value(), "testString");
    assertEquals(runtimeEntityModel.confidence(), Double.valueOf("72.5"));
    assertEquals(
        runtimeEntityModel.groups(),
        new java.util.ArrayList<CaptureGroup>(java.util.Arrays.asList(captureGroupModel)));
    assertEquals(runtimeEntityModel.interpretation(), runtimeEntityInterpretationModel);
    assertEquals(
        runtimeEntityModel.alternatives(),
        new java.util.ArrayList<RuntimeEntityAlternative>(
            java.util.Arrays.asList(runtimeEntityAlternativeModel)));
    assertEquals(runtimeEntityModel.role(), runtimeEntityRoleModel);

    DialogNodeOutputOptionsElementValue dialogNodeOutputOptionsElementValueModel =
        new DialogNodeOutputOptionsElementValue.Builder()
            .input(messageInputModel)
            .intents(
                new java.util.ArrayList<RuntimeIntent>(java.util.Arrays.asList(runtimeIntentModel)))
            .entities(
                new java.util.ArrayList<RuntimeEntity>(java.util.Arrays.asList(runtimeEntityModel)))
            .build();
    assertEquals(dialogNodeOutputOptionsElementValueModel.input(), messageInputModel);
    assertEquals(
        dialogNodeOutputOptionsElementValueModel.intents(),
        new java.util.ArrayList<RuntimeIntent>(java.util.Arrays.asList(runtimeIntentModel)));
    assertEquals(
        dialogNodeOutputOptionsElementValueModel.entities(),
        new java.util.ArrayList<RuntimeEntity>(java.util.Arrays.asList(runtimeEntityModel)));

    DialogNodeOutputOptionsElement dialogNodeOutputOptionsElementModel =
        new DialogNodeOutputOptionsElement.Builder()
            .label("testString")
            .value(dialogNodeOutputOptionsElementValueModel)
            .build();
    assertEquals(dialogNodeOutputOptionsElementModel.label(), "testString");
    assertEquals(
        dialogNodeOutputOptionsElementModel.value(), dialogNodeOutputOptionsElementValueModel);

    ResponseGenericChannel responseGenericChannelModel =
        new ResponseGenericChannel.Builder().channel("chat").build();
    assertEquals(responseGenericChannelModel.channel(), "chat");

    DialogNodeOutputGenericDialogNodeOutputResponseTypeOption
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel =
            new DialogNodeOutputGenericDialogNodeOutputResponseTypeOption.Builder()
                .responseType("option")
                .title("testString")
                .description("testString")
                .preference("dropdown")
                .options(
                    new java.util.ArrayList<DialogNodeOutputOptionsElement>(
                        java.util.Arrays.asList(dialogNodeOutputOptionsElementModel)))
                .channels(
                    new java.util.ArrayList<ResponseGenericChannel>(
                        java.util.Arrays.asList(responseGenericChannelModel)))
                .build();
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel.responseType(), "option");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel.title(), "testString");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel.description(), "testString");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel.preference(), "dropdown");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel.options(),
        new java.util.ArrayList<DialogNodeOutputOptionsElement>(
            java.util.Arrays.asList(dialogNodeOutputOptionsElementModel)));
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel.channels(),
        new java.util.ArrayList<ResponseGenericChannel>(
            java.util.Arrays.asList(responseGenericChannelModel)));

    String json =
        TestUtilities.serialize(dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModel);

    DialogNodeOutputGenericDialogNodeOutputResponseTypeOption
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModelNew =
            TestUtilities.deserialize(
                json, DialogNodeOutputGenericDialogNodeOutputResponseTypeOption.class);
    assertTrue(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModelNew
            instanceof DialogNodeOutputGenericDialogNodeOutputResponseTypeOption);
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModelNew.responseType(), "option");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModelNew.title(), "testString");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModelNew.description(),
        "testString");
    assertEquals(
        dialogNodeOutputGenericDialogNodeOutputResponseTypeOptionModelNew.preference(), "dropdown");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDialogNodeOutputGenericDialogNodeOutputResponseTypeOptionError()
      throws Throwable {
    new DialogNodeOutputGenericDialogNodeOutputResponseTypeOption.Builder().build();
  }
}
