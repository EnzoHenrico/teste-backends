public class Proposal extends Event {

    String proposalId;
    Float proposalLoanValue;
    Integer proposalMonthlyInstallments;

    public Proposal(String eventId, String eventAction, String eventTime, String proposalId, String proposalLoanValue,
            String proposalMonthlyInstallments) {

        super(eventId, eventAction, eventTime);

        this.proposalId = proposalId;
        this.proposalLoanValue = Float.parseFloat(proposalLoanValue);
        this.proposalMonthlyInstallments = Integer.parseInt(proposalMonthlyInstallments);
    }
}