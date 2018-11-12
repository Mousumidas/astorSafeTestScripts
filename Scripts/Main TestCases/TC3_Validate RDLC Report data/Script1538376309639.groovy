import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://astoria-qa.astorsafe.com/Login.aspx?ReturnUrl=%2f')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Reports/input_Username_loginCtrlUserNa'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Reports/input_Password_loginCtrlPasswo'), 'r9FrzYZWA3s=')

WebUI.click(findTestObject('Object Repository/Reports/input__loginCtrlLoginButton'))

WebUI.click(findTestObject('Object Repository/Reports/span_Reports'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Reports/span_Zone'))

WebUI.delay(2)

WebUI.click(findTestObject('Reports/span_Workforce Zone ClockTime'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Reports/input_RadDatePicker_ctl00Conte'), '08/01/2018')

WebUI.setText(findTestObject('Object Repository/Reports/input_To Date_ctl00ContentPlac'), '2018-08-10')

WebUI.setText(findTestObject('Object Repository/Reports/input_Employee_ctl00ContentPla'), '')

WebUI.click(findTestObject('Object Repository/Reports/input_Export to XSLX_ctl00Cont'))

WebUI.click(findTestObject('Object Repository/Reports/div_Employee ID'))

WebUI.click(findTestObject('Object Repository/Reports/div_Employee Name'))

WebUI.click(findTestObject('Object Repository/Reports/div_Company'))

WebUI.click(findTestObject('Object Repository/Reports/div_Department'))

WebUI.click(findTestObject('Object Repository/Reports/div_Trade'))

WebUI.click(findTestObject('Object Repository/Reports/div_Clock Date'))

WebUI.click(findTestObject('Object Repository/Reports/div_Zone'))

WebUI.click(findTestObject('Object Repository/Reports/div_Time-In'))

WebUI.click(findTestObject('Object Repository/Reports/div_Time-Out'))

WebUI.click(findTestObject('Object Repository/Reports/div_Time-In Gangway'))

WebUI.click(findTestObject('Object Repository/Reports/div_Time-Out Gangway'))

WebUI.click(findTestObject('Object Repository/Reports/div_SS53'))

WebUI.click(findTestObject('Object Repository/Reports/div_Devi 53'))

WebUI.click(findTestObject('Object Repository/Reports/div_AV Ship Building Corporati'))

WebUI.click(findTestObject('Object Repository/Reports/div_QAQC'))

WebUI.click(findTestObject('Object Repository/Reports/div_QC'))

WebUI.click(findTestObject('Object Repository/Reports/td_8102018'))

WebUI.click(findTestObject('Object Repository/Reports/td_Z11'))

WebUI.click(findTestObject('Object Repository/Reports/div_8102018 122639 PM'))

WebUI.click(findTestObject('Object Repository/Reports/div_Workforce Zone ClockTime R'))

WebUI.closeBrowser()

