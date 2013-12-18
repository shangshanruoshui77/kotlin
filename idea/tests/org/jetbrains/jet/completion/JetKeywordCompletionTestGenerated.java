/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.completion;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.completion.AbstractKeywordCompletionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/keywords")
public class JetKeywordCompletionTestGenerated extends AbstractKeywordCompletionTest {
    @TestMetadata("AfterClassProperty.kt")
    public void testAfterClassProperty() throws Exception {
        doTest("idea/testData/completion/keywords/AfterClassProperty.kt");
    }
    
    @TestMetadata("AfterDot.kt")
    public void testAfterDot() throws Exception {
        doTest("idea/testData/completion/keywords/AfterDot.kt");
    }
    
    @TestMetadata("AfterSpaceAndDot.kt")
    public void testAfterSpaceAndDot() throws Exception {
        doTest("idea/testData/completion/keywords/AfterSpaceAndDot.kt");
    }
    
    public void testAllFilesPresentInKeywords() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/completion/keywords"), Pattern.compile("^(.+)\\.kt$"), false);
    }
    
    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        doTest("idea/testData/completion/keywords/classObject.kt");
    }
    
    @TestMetadata("InBlockComment.kt")
    public void testInBlockComment() throws Exception {
        doTest("idea/testData/completion/keywords/InBlockComment.kt");
    }
    
    @TestMetadata("InChar.kt")
    public void testInChar() throws Exception {
        doTest("idea/testData/completion/keywords/InChar.kt");
    }
    
    @TestMetadata("InClassBeforeFun.kt")
    public void testInClassBeforeFun() throws Exception {
        doTest("idea/testData/completion/keywords/InClassBeforeFun.kt");
    }
    
    @TestMetadata("InClassProperty.kt")
    public void testInClassProperty() throws Exception {
        doTest("idea/testData/completion/keywords/InClassProperty.kt");
    }
    
    @TestMetadata("InClassScope.kt")
    public void testInClassScope() throws Exception {
        doTest("idea/testData/completion/keywords/InClassScope.kt");
    }
    
    @TestMetadata("InClassTypeParameters.kt")
    public void testInClassTypeParameters() throws Exception {
        doTest("idea/testData/completion/keywords/InClassTypeParameters.kt");
    }
    
    @TestMetadata("InFunctionName.kt")
    public void testInFunctionName() throws Exception {
        doTest("idea/testData/completion/keywords/InFunctionName.kt");
    }
    
    @TestMetadata("InFunctionScope.kt")
    public void testInFunctionScope() throws Exception {
        doTest("idea/testData/completion/keywords/InFunctionScope.kt");
    }
    
    @TestMetadata("InFunctionTypeReference.kt")
    public void testInFunctionTypeReference() throws Exception {
        doTest("idea/testData/completion/keywords/InFunctionTypeReference.kt");
    }
    
    @TestMetadata("InMethodParametersList.kt")
    public void testInMethodParametersList() throws Exception {
        doTest("idea/testData/completion/keywords/InMethodParametersList.kt");
    }
    
    @TestMetadata("InModifierListInsideClass.kt")
    public void testInModifierListInsideClass() throws Exception {
        doTest("idea/testData/completion/keywords/InModifierListInsideClass.kt");
    }
    
    @TestMetadata("InNotFinishedGenericWithFunAfter.kt")
    public void testInNotFinishedGenericWithFunAfter() throws Exception {
        doTest("idea/testData/completion/keywords/InNotFinishedGenericWithFunAfter.kt");
    }
    
    @TestMetadata("InParametersList.kt")
    public void testInParametersList() throws Exception {
        doTest("idea/testData/completion/keywords/InParametersList.kt");
    }
    
    @TestMetadata("InPropertyTypeReference.kt")
    public void testInPropertyTypeReference() throws Exception {
        doTest("idea/testData/completion/keywords/InPropertyTypeReference.kt");
    }
    
    @TestMetadata("InString.kt")
    public void testInString() throws Exception {
        doTest("idea/testData/completion/keywords/InString.kt");
    }
    
    @TestMetadata("InTopProperty.kt")
    public void testInTopProperty() throws Exception {
        doTest("idea/testData/completion/keywords/InTopProperty.kt");
    }
    
    @TestMetadata("InTopScopeAfterPackage.kt")
    public void testInTopScopeAfterPackage() throws Exception {
        doTest("idea/testData/completion/keywords/InTopScopeAfterPackage.kt");
    }
    
    @TestMetadata("InTypeScope.kt")
    public void testInTypeScope() throws Exception {
        doTest("idea/testData/completion/keywords/InTypeScope.kt");
    }
    
    @TestMetadata("LineComment.kt")
    public void testLineComment() throws Exception {
        doTest("idea/testData/completion/keywords/LineComment.kt");
    }
    
    @TestMetadata("NoCompletionForCapitalPrefix.kt")
    public void testNoCompletionForCapitalPrefix() throws Exception {
        doTest("idea/testData/completion/keywords/NoCompletionForCapitalPrefix.kt");
    }
    
    @TestMetadata("PropertySetterGetter.kt")
    public void testPropertySetterGetter() throws Exception {
        doTest("idea/testData/completion/keywords/PropertySetterGetter.kt");
    }
    
    @TestMetadata("TopScope.kt")
    public void testTopScope() throws Exception {
        doTest("idea/testData/completion/keywords/TopScope.kt");
    }
    
}
