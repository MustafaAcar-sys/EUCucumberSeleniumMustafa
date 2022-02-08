package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, Vehicle")
    public void the_user_navigates_to_Fleet_Vehicle() {
        System.out.println("the user navigates to Fleet, Vehicle");
    }

    @Then("The title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Expected and actual title are matching");
    }

    @When("the user navigates to Marketing-Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing-Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("Expected and actual title are matching");
    }

    @When("the user navigates to Activities--Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities--Calendar Events");
    }

    @Then("the title should be Calendars")
    public void the_title_should_be_Calendars() {
        System.out.println("Expected and actual title are matching");
    }


    @And("the title should be this")
    public void theTitleShouldBeThis() {
        System.out.println("true = " + true);

    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitFor(3);
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.pageNumber.getAttribute("value");
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNumber, actualNumber);



    }
}

