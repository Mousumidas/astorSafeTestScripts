import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/astoriaweb/AddViewEmployeeMaster.aspx')

WebUI.maximizeWindow()

not_run: WebUI.click(findTestObject('Page_Training Program/input_AddView Employee Master_'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_Training Program/input_EmployeeID_ctl00ContentP'), 'emp90')

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Page_Training Program/input_First Name_ctl00ContentP'), 'mres')

not_run: WebUI.setText(findTestObject('Page_Training Program/input_Last Name_ctl00ContentPl'), 'das')

not_run: WebUI.selectOptionByValue(findTestObject('Page_Training Program/select_--Select--Astoria Techn'), '1', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Training Program/select_--Select--DirectorTeam'), '2', true)

not_run: WebUI.click(findTestObject('Page_Training Program/input_Male_ctl00ContentPlaceHo'))

not_run: WebUI.delay(2)

