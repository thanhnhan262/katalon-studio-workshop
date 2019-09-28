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

WebUI.navigateToUrl('http://192.168.1.8:8000/en/')

WebUI.click(findTestObject('Object Repository/Page_Saleor e-commerce/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Log in  Saleor e-commerce/input_Email_username'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in  Saleor e-commerce/input_Password_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Log in  Saleor e-commerce/button_Log in'))

WebUI.closeBrowser()

