package dataclasses;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IssueSummaryViewShould {
    @Test
    public void
    customer_summary_includes_full_name_with_title_and_city_post_code_and_country() {
        Issue issue = new Issue(10, "Some critical issue", Priority.Critical);
        IssueSummarizer issueSummarizer = new IssueSummarizer(issue);

        String summary = issueSummarizer.summarize();

        assertThat(summary, is("Description:'Some critical issue' Effort:'10' Priority:'Critical'"));
    }
}
