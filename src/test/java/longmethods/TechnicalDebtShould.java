package longmethods;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TechnicalDebtShould {
    private TechnicalDebt technicalDebt;

    @Before
    public void setUp() {
        technicalDebt = new TechnicalDebt();
    }

    @Test
    public void
    fixing_issue_issue_deducts_effort_from_total() {
        technicalDebt.register(50f, "Declared Issue class in same file as TechnicalDebt class");

        technicalDebt.fixed(50f);

        assertThat(0f, is(technicalDebt.total()));
    }

    @Test
    public void
    registering_issue_increases_total() {
        technicalDebt.register(50f, "Declared Issue class in same file as TechnicalDebt class");

        assertThat(50f, is(technicalDebt.total()));
    }

    @Test
    public void
    registering_issue_with_effort_bigger_than_five_hundred_marks_it_as_critical_priority() {
        technicalDebt.register(501f, "Declared Issue class in same file as TechnicalDebt class");
        Issue lastIssue = technicalDebt.getLastIssue();

        assertThat(lastIssue.getPriority(), is(Priority.CRITICAL));
    }

    @Test
    public void
    registering_issue_with_effort_bigger_than_two_hundred_and_fifty_marks_it_as_high_priority() {
        technicalDebt.register(251f, "Declared Issue class in same file as TechnicalDebt class");
        Issue lastIssue = technicalDebt.getLastIssue();

        assertThat(lastIssue.getPriority(), is(Priority.HIGH));
    }
    
    @Test
    public void
    registering_issue_with_effort_bigger_than_one_hundred_marks_it_as_medium_priority() {
        technicalDebt.register(101f, "Declared Issue class in same file as TechnicalDebt class");
        Issue lastIssue = technicalDebt.getLastIssue();

        assertThat(lastIssue.getPriority(), is(Priority.MEDIUM));
    }
    
    @Test
    public void
    registering_issue_with_effort_equal_or_lower_than_one_hundred_marks_it_as_low_priority() {
        technicalDebt.register(100f, "Declared Issue class in same file as TechnicalDebt class");
        Issue lastIssue = technicalDebt.getLastIssue();

        assertThat(lastIssue.getPriority(), is(Priority.LOW));
    }

    @Test
    public void
    registering_issue_updates_last_issue_date() {
        technicalDebt.register(50f, "Declared Issue class in same file as TechnicalDebt class");
        LocalDate now = LocalDate.now();

        assertThat(technicalDebt.lastIssueDate(), is(now.getDayOfMonth() + "/" + now.getMonthValue() +"/" + now.getYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    registering_more_than_max_allowed_effort_throws_exception() {
        technicalDebt.register(1001f, "The PM forced me to register this");
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    registering_less_than_min_allowed_effort_throws_exception() {
        technicalDebt.register(0f, "The PM forced me to register this");
    }
}
