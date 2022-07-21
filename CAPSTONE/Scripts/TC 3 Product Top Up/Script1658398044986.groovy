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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bayeue.vercel.app/login')

WebUI.click(findTestObject('Object Repository/Page_Login Page - Bayeue/div_Email_v-input__slot'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page - Bayeue/input_Email_input-13'), 'gozza15bdg@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - Bayeue/input_Password_input-16'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - Bayeue/div_Password_v-input__control'))

WebUI.click(findTestObject('Object Repository/Page_Login Page - Bayeue/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard Page - Bayeue/div_Products'))

WebUI.click(findTestObject('Object Repository/Page_Products Page - Bayeue/div_Top Up'))

WebUI.click(findTestObject('Object Repository/Page_Products Page - Bayeue/div_Top Up_v-card v-card--link v-sheet them_e544c4'))

WebUI.click(findTestObject('Object Repository/Page_Bayeue - Bayeue/li_Pulsa Dana 70rb'))

WebUI.closeBrowser()
