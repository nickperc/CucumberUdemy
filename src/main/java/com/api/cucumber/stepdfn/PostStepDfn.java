package com.api.cucumber.stepdfn;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostStepDfn {
    @Given("^User should be logged in$")
    public void user_should_be_logged_in() {
        System.out.println("Given User should be logged in");
    }

    @When("^I type the text in the text box$")
    public void i_type_the_text_in_the_text_box() {
        System.out.println("When I type the text in the text box");
    }

    @When("^User supply the youtube link in the text box$")
    public void user_supply_the_youtube_link_in_the_text_box() {
        System.out.println("When User supply the youtube link in the text box");
    }

    @Then("^The message should be posted$")
    public void the_message_should_be_posted() {
        System.out.println("Then The message should be posted");
    }

    @Then("^Video should get posted on the user wall$")
    public void video_should_get_posted_on_the_user_wall() {
        System.out.println("Then Video should get posted on the user wall");
    }

    @And("^Should be present at its own wall$")
    public void should_be_present_at_its_own_wall() {
        System.out.println("And Should be present at its own wall");
    }

    @And("^Click on Post button$")
    public void click_on_post_button() {
        System.out.println("And Click on Post button");
    }

    @And("^The video should have proper Thumnail$")
    public void the_video_should_have_proper_thumnail() {
        System.out.println("And The video should have proper Thumnail");
    }
}
