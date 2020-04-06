import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('page_login/TC3_login_berhasil'), [('password') : 'password', ('email') : 'admin@admin.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)

WebUI.navigateToUrl(GlobalVariable.urlFormSingle)

WebUI.click(findTestObject('Object_SingleMatch/button_Submit'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object_CounterSingle/button_plus_A'))

WebUI.delay(3)

WebUI.click(findTestObject('Object_CounterSingle/button_plus_B'))

WebUI.delay(3)

WebUI.click(findTestObject('Object_CounterSingle/button_Reset Score'))

WebUI.delay(3)

for (def index : (1..10)) {
    WebUI.click(findTestObject('Object_CounterSingle/button_plus_B'))
}

WebUI.waitForElementPresent(findTestObject('Object_CounterSingle/button_plus_A'), GlobalVariable.waitPresentTimeout)

for (def index : (1..20)) {
    WebUI.click(findTestObject('Object_CounterSingle/button_plus_A'))
}

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object_CounterSingle/button_plus_A'))

