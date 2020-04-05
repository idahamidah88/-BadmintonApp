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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://badminton-29wu35x47.now.sh/')

WebUI.click(findTestObject('Object_Absensi/button_absensi'))

WebUI.waitForElementPresent(findTestObject('Object_Absensi/select_FemaleMale'), 2)

WebUI.setText(findTestObject('Object_Absensi/input_Name_name-input'), 'Goreng')

WebUI.click(findTestObject('Object_Absensi/select_FemaleMale'))

if (true) {
    WebUI.selectOptionByLabel(findTestObject('Object_Absensi/select_FemaleMale'), 'Male', false)
}

WebUI.click(findTestObject('Object_Absensi/button_OK'))

WebUI.delay(2)

