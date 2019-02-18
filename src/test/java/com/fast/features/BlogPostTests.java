package com.fast.features;

import com.fast.steps.serenity.BlogPostSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BlogPostTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    BlogPostSteps blogPostSteps;

    @Test
    public void logoutAtRandomString() {
        blogPostSteps.validLogin();
        blogPostSteps.clickBlogButton();
        blogPostSteps.commentBlogFieldRandomText();
        blogPostSteps.clickPostBlogCommentButton();
        blogPostSteps.logutAtWordinComment();
    }

}
