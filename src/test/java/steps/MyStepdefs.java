package steps;

import cucumber.api.java8.En;

public class MyStepdefs implements En {
    public MyStepdefs() {

        And("^I check all user information (\\d+)$", (Integer arg0) -> {
        });
    }
}
