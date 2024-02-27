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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//parameterised variables
String username = 'fiko'

String password = 'fiko'

// call common test case
WebUI.callTestCase(findTestCase('Login With Variables'), [('userName') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

//cek tombol add account, stop jika gagal
WebUI.verifyElementPresent(findTestObject('Page_ACME demo app/a_Add Account'), 20, FailureHandling.STOP_ON_FAILURE)

//cek tombol make payment, stop jika gagal
WebUI.verifyElementPresent(findTestObject('Page_ACME demo app/a_Make Payment'), 20, FailureHandling.STOP_ON_FAILURE)

//cek text financial overview, stop jika gagal
WebUI.verifyElementText(findTestObject('Page_ACME demo app/h6_Financial Overview'), 'Financial Overview', FailureHandling.STOP_ON_FAILURE)

//cek text recent transactions, stop jika gagal
WebUI.verifyElementText(findTestObject('Page_ACME demo app/h6_Recent Transactions'), 'Recent Transactions', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

