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

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Login Page - Bayeue/div_Email_v-input__slot'))

WebUI.setText(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Login Page - Bayeue/input_Email_input-13'), 'gozza15bdg@gmail.com')

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Login Page - Bayeue/div_Email_v-input__slot'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Login Page - Bayeue/input_Password_input-16'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Login Page - Bayeue/button_Login'))

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Dashboard Page - Bayeue/div_Products'))

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Products Page - Bayeue/div_Categories_v-responsive__content'))

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Products Page - Bayeue/div_Pulsa_v-card v-card--link v-sheet theme_478cdd'))

WebUI.click(findTestObject('Object Repository/TC 2 Product Pulsa/Page_Bayeue - Bayeue/li_Pulsa Telkomsel 100rb'))

WebUI.closeBrowser()

