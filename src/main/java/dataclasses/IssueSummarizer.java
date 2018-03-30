package dataclasses;

public class IssueSummarizer {
    private final Issue issue;

    public IssueSummarizer(Issue issue) {
        this.issue = issue;
    }

    public String summarize() {
        return "Description:'"+ issue.description() + "' Effort:'" + issue.effortManHours() + "' Priority:'" + issue.priority() + "'";
    }
}
