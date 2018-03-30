package comments;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TechnicalDebtShould {
    private TechnicalDebt technicalDebt;

    @Before
    public void setUp() {
        this.technicalDebt = new TechnicalDebt();
    }

    @Test
    public void
    fixing_issue_issue_deducts_effort_from_total() {
        technicalDebt.register(50f, "Declared Issue class in same file as TechnicalDebt class");

        technicalDebt.fixed(50f);

        assertThat(technicalDebt.getTotal(), is(0f));
    }

    @Test
    public void
    registering_issue_increases_total() {
        technicalDebt.register(50f, "Declared Issue class in same file as TechnicalDebt class");

        assertThat(technicalDebt.getTotal(), is(50f));
    }
    
    @Test
    public void
    registering_issue_updates_last_issue_date() {
        technicalDebt.register(50f, "Declared Issue class in same file as TechnicalDebt class");

        LocalDate now = LocalDate.now();

        assertThat(technicalDebt.lastIssueDate(), is(now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    registering_more_than_max_allowed_effort_throws_exception() {
        technicalDebt.register(1001f, "The PM forced me to register this");
    }
}
