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

WebUI.navigateToUrl('https://webasesorenlineaqa.azurewebsites.net/Affiliate/LoginAffiliate#!/')

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/select_Seleccione el Tipo de A'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/select_Seleccione el Tipo de D'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/input_CONTINUE_NumeroIdentific'), 
    '71388459')

WebUI.click(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/input_CONTINUE_Email'))

WebUI.setText(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/input_CONTINUE_Email'), 
    'pruebas.callejas.asesor.en.linea.afiliado@gmail.com')

WebUI.click(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/button_CONTINUE'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/select_Seleccione la EmpresaIG'), 
    'N900693655', true)

WebUI.click(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/button_INGRESE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AfiliadoBasic/Page_AsesorEnLineaQA/Page_AsesorEnLineaQA/select_Seleccione la EmpresaIG'), 
    '0', true)

WebUI.closeBrowser()

