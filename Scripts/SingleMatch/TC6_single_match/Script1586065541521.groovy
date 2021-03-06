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

WebUI.callTestCase(findTestCase('page_login/TC3_login_berhasil'), [('email') : 'admin@admin.com', ('password') : 'password'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object_SingleMatch/button_Lets Play'))

WebUI.click(findTestObject('Object_SingleMatch/a_Single Match'))

WebUI.setText(findTestObject('Object_SingleMatch/input_Nama Tim_timA-input'), 'Indomie')

WebUI.click(findTestObject('Object_CounterSingle/NamaPemain_A'))

if (true) {
    WebUI.selectOptionByValue(findTestObject('Object_CounterSingle/span_Farhan'), 'Farhan', false)
}

WebUI.setText(findTestObject('Object_SingleMatch/input_Nama Tim_timB-input'), 'Sedap')

