package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class walmartAppointment {

    private WebDriver driver;


    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/driver/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();


    }

    public String generateRandomNumber(int length){

        return RandomStringUtils.randomNumeric(length);
    }



    @Given("i acces to walmart clinic website")
    public void i_acces_to_walmart_clinic_website() {

        driver.get("https://www.walmarthealth.com/");
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





    @When("i click to schedule now button")
    public void i_click_to_schedule_now_button() {
     /*   driver.findElement(By.id("next")).click();*/
        WebElement scheduleButton = driver.findElement(By.cssSelector("a[aria-label='Schedule now']"));
        scheduleButton.click();
        /* WebElement applyNowLink = driver.findElement(By.xpath("//a[text()='Apply Now!']"));
         */

        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("i search with zipcode {int}")
    public void i_search_with_zipcode(Integer int1) {

        WebElement element = driver.findElement(By.cssSelector("input[data-testid='search-input']"));
        element.sendKeys("30265");



        /*driver.findElement(By.cssSelector("input[data-testid='search-input']")).sendKeys("30265");*/

        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on Find Care Button")
    public void i_click_on_Find_Care_Button() {
        driver.findElement(By.cssSelector("3gZpw")).click();
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on medical care button")
    public void i_click_on_medical_care_button() {
        driver.findElement(By.cssSelector("div#medical")).click();
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on continue button")
    public void i_click_on_continue_button() {
        driver.findElement(By.cssSelector("button.Button-module_primary__3gZpw")).click();
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on continue button again")
    public void i_click_on_continue_button_again() {
        driver.findElement(By.cssSelector("button.Button-module_button__h0KNG.Button-module_primary__3gZpw.Button-module_large__tzQHe")).click();
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } }

    @And("i select on Annual Physical Exam")
    public void i_select_on_annual_physical_exam() {
        driver.findElement(By.cssSelector("div.flex-col p.Heading-module_heading__zecdK")).click();   try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } }
    @And("i click on continue button on care section")
    public void i_click_on_continue_button_on_care_section() {
        driver.findElement(By.cssSelector("button.Button-module_button__h0KNG.Button-module_primary__3gZpw.Button-module_large__tzQHe")).click();
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on closest date and hours")
    public void i_click_on_closest_date_and_hours() {

        try {
            // Sayfadaki ilk "AM" veya "PM" elementini bulun
            WebElement amPmElement = driver.findElement(By.xpath("//*[contains(text(),'AM') or contains(text(),'PM')]"));

            // "AM" veya "PM" elementine tıklayın
            amPmElement.click();

        } catch (Exception e) {
            e.printStackTrace();
        }



        /*  List<WebElement> appointmentButtons = driver.findElements(By.xpath("//button[contains(@aria-label, 'with Jodian White, APRN')]"));

        // İstediğiniz saatlere tıklama işlemini gerçekleştirin
        // Örneğin, ilk saatli butona tıklayabiliriz
        if (!appointmentButtons.isEmpty()) {
            appointmentButtons.get(0).click(); // İlk saatli butona tıkla
        }

*/

        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        }

    @And("i click on continue button on appointment date page")
    public void i_click_on_continue_button_on_appointment_date_page() {
        driver.findElement(By.cssSelector("button.Button-module_button__h0KNG.Button-module_primary__3gZpw")).click();
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @And("i select for Someoneelse")
    public void i_select_for_someoneelse() {
        /*driver.findElement(By.cssSelector("span.Radio-module_labelText__RDlSx")).click();
    */
        WebElement radioInput = driver.findElement(By.id("Someone Else"));

        radioInput.click();

    }
    @And("i enter unique first name")
    public void i_enter_unique_first_name() {
        driver.findElement(By.id("firstName")).sendKeys("randomtest"); }
    @And("i enter unique last name")
    public void i_enter_unique_last_name() {
        driver.findElement(By.id("lastName")).sendKeys("randomlastname");

    }
    @And("i enter unique date of birth")
    public void i_enter_unique_date_of_birth() {
        driver.findElement(By.id("dob")).sendKeys("12121999");  }
    @And("i enter specific street adress")
    public void i_enter_specific_street_adress() {
        driver.findElement(By.id("streetAddress")).sendKeys("123 test street"); }
    @And("i wait five seconds")
    public void i_wait_five_seconds() {
        try {
            // Beklemek istediğiniz süreyi milisaniye cinsinden girin (örneğin, 5 saniye için 5000)
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  }
    @And("i enter specific zipcode")
    public void i_enter_specific_zipcode() {
        driver.findElement(By.id("zip")).sendKeys("94116");
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("i select female at sex at birth")
    public void i_select_female_at_sex_at_birth() {


        WebElement selectElement = driver.findElement(By.xpath("//select[@aria-label='Sex at birth (required)']"));


        Select select = new Select(selectElement);
        select.selectByValue("female");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @And("i select female at gender identity")
    public void i_select_female_at_gender_identity() {
        WebElement selectElement = driver.findElement(By.xpath("//select[@aria-label='Gender Identity (required)']"));

        Select select = new Select(selectElement);
        select.selectByValue("female");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    @And("i click on continue button on patient information page")
    public void i_click_on_continue_button_on_patient_information_page() {
        driver.findElement(By.xpath(
                "//button[contains(@aria-label, 'Continue to Contact Information')]")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @And("i enter unique contact e-mail adress")
    public void i_enter_unique_contact_e_mail_adress() {
        driver.findElement(By.cssSelector("input[aria-label='Email address (required)']")).sendKeys("thisisauniqueemailadress@gmail.com"); }
    @And("i enter unique contact phone number")
    public void i_enter_unique_contact_phone_number() {
        driver.findElement(By.cssSelector("input[aria-label='Phone number (required)']")).sendKeys("4444444444");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    @And("i click on continue button on contact information section")
    public void i_click_on_continue_button_on_contact_information_section() {
        driver.findElement(By.cssSelector("button[aria-label='Continue to Insurance']")).click();  }
    @And("i click on No at insurance information section")
    public void i_click_on_no_at_insurance_information_section() {
        driver.findElement(By.id("No")).click();

    }
    @And("i click on continue button on insurance section")
    public void i_click_on_continue_button_on_insurance_section() {
        driver.findElement(By.cssSelector("button[aria-label='Continue to Review']")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on checking box")
    public void i_click_on_checking_box() {
        WebElement checkbox = driver.findElement(By.cssSelector("input[aria-labelledby='terms']"));
        checkbox.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("i click on schedule appointment button")
    public void i_click_on_schedule_appointment_button() {
        System.out.println("bastim say");


        /*     WebElement scheduleButton = driver.findElement(By.xpath("//button[contains(text(), 'Schedule appointment')]"));
        scheduleButton.click();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    */




   /* @Then("i should represent by confirmation massage")
    public void i_should_represent_by_confirmation_massage() {
        WebElement appointmentConfirmationHeader = driver.findElement(By.cssSelector("h1.Heading-module_heading__zecdK"));
        System.out.println("dammn");
     /*   String confirmationText = appointmentConfirmationHeader.getText();
        System.out.println("Appointment Confirmation Text: " + confirmationText);
    }*/



    /*  i_search_with_zipcode(30265);
            i_click_on_Find_Care_Button();*/

    }

    @And("i want to run the scenario 10 times")
    public void i_want_to_run_the_scenario_10_times() {
        System.out.println("run10timesdone");

       /*  for (int i = 0; i < 10; i++) {

           i_acces_to_walmart_clinic_website();
            i_click_to_schedule_now_button();


            i_click_on_medical_care_button();
            i_click_on_continue_button();
            i_click_on_continue_button_again();
            i_select_on_annual_physical_exam();
            i_click_on_continue_button_on_care_section();
            i_click_on_closest_date_and_hours();
            i_click_on_continue_button_on_appointment_date_page();
            i_select_for_someoneelse();
            i_enter_unique_first_name();
            i_enter_unique_last_name();
            i_enter_unique_date_of_birth();
            i_enter_specific_street_adress();
            i_wait_five_seconds();
            i_enter_specific_zipcode();
            i_select_female_at_sex_at_birth();
            i_select_female_at_gender_identity();
            i_click_on_continue_button_on_patient_information_page();
            i_enter_unique_contact_e_mail_adress();
            i_enter_unique_contact_phone_number();
            i_click_on_continue_button_on_contact_information_section();
            i_click_on_no_at_insurance_information_section();
            i_click_on_continue_button_on_insurance_section();
            i_click_on_checking_box();
            i_click_on_schedule_appointment_button();

            */























    }
}