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

'Открыть браузер\r\n'
WebUI.openBrowser('')

'Перейти по ссылке'
WebUI.navigateToUrl('https://dev.nurse.hsworld.ru/')

'Нажать кнопку "Выбрать язык"'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/i_KZ_v-icon notranslate mdi mdi-chevron-dow_2844bd'))

'Выбрать русский язык'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/div_RU'))

'Нажать кнопку "Войти"'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/button_'))

'Ввести в поле "Телефон" все 0\r\n'
WebUI.setText(findTestObject('Object Repository/KZMED/Page_/input__input-35'), '+7 700 000 00 00')

'Нажать кнопку "Получить код"'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/button__1'))

'Нажать кнопку "Просмотр пароля"'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/button__v-icon notranslate v-icon--link mdi_b27904'))

'Ввести в поле код 0070'
WebUI.setText(findTestObject('Object Repository/KZMED/Page_/input__input-42'), '0070')

'Нажать кнопку "Войти"'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/button__1_2'))

'Нажать кнопку "Нет" модального окна "Хотите использовать пин-код"'
WebUI.click(findTestObject('Object Repository/KZMED/Page_/button__1_2_3'))

'Закрыть браузер'
WebUI.closeBrowser()

