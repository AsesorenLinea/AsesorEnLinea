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

WebUI.navigateToUrl('https://webasesorenlineaqa.azurewebsites.net/Account/Login#!/')

WebUI.setText(findTestObject('Object Repository/LoginAdminstrador/Page_AsesorEnLineaQA/input_INGRESE_UserName'), 'admin@intergrupo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginAdminstrador/Page_AsesorEnLineaQA/input_INGRESE_Password'), 
    'b+8P+9F4CC4=')

WebUI.click(findTestObject('Object Repository/LoginAdminstrador/Page_AsesorEnLineaQA/button_INGRESE'))

WebUI.verifyElementPresent(findTestObject('Page_AsesorEnLineaQA - Administrado/a_Usuarios'), 0)

WebUI.click(findTestObject('Object Repository/LoginAdminstrador/Page_AsesorEnLineaQA - Administrado/i_Toggle navigation_fa fa-care'))

WebUI.click(findTestObject('Object Repository/LoginAdminstrador/Page_AsesorEnLineaQA - Administrado/i_Salir_fa fa-sign-out fa-fw'))

