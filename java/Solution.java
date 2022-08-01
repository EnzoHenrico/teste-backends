import java.util.*;

public class Solution {

  public static String processMessages(List<String> messages) {

    List<String[]> splitedMessages = new ArrayList<String[]>();
    List<String> aprovedIds = new ArrayList<String>();
    Proposal proposal = new Proposal();

    for (String string : messages) {

      splitedMessages.add(string.split(","));
    }

    for (String[] strings : splitedMessages) {

      String eventId = strings[0];
      String eventAction = strings[1];
      String eventSchema = strings[2];
      String eventTime = strings[3];
      
      // Proposal
      if (eventSchema.equals("proposal")){
        String proposalId = strings[4];
        String proposalLoanValue = strings[5];
        String proposalMonthlyInstallments = strings[6];  
          
        if (eventAction.equals("created")){
          proposal.setValues(proposalId, proposalLoanValue, proposalMonthlyInstallments);
        }
      }  

      // Waranty
      if (eventSchema.equals("waranty")) {
        String warrantyId = strings[4];
        String warrantyValue = strings[5];
        String warrantyProvince = strings[6];

        if (eventAction.equals("created")){
          Waranty waranty = new Waranty(warrantyId, warrantyValue, warrantyProvince);
          proposal.addWaranty(waranty.getString());
        }
      }

      // Proponent
      if (eventSchema.equals("proponent")) {

        String proponentId = strings[5];
        String proponentName = strings[6];
        String proponentAge = strings[7];
        String proponentMonthlyIncome = strings[8];
        String proponentIsMain = strings[9];

        if (eventAction.equals("created")){
          Proponent proponent = new Proponent(proponentId, proponentName, proponentAge, proponentMonthlyIncome, proponentIsMain);
          proposal.addProponent(proponent.getString());
        }
      }

      if (proposal.validateProposal()){
        aprovedIds.add(proposal.proposalId);
      }
      
    }

    if(aprovedIds.isEmpty()){
      return null;
    }

    return aprovedIds.stream().reduce("", (acc, curr) -> acc + "," + curr);
  }

  public void checkWaranty() {

    // Pelo menos um garantia por proposta
    // Soma do valor das garantias >= 2 * valor do emprestimo
    // Garantia de imóvel de PR, SC e RS não podi
  }

  public void checkProponents() {
    // Deve a haver no minimo 2 proponents e pelo menos 1 principal por proposta
    // Todos devem ser maiores de 18 anos
  }

  public void checkMajorProponent() {

    // A renda do principal deve ser >= :
    // - 4 * valor da parcela IF idade >= 18 && idade <= 24;
    // - 3 * valor da parcela IF idade >= 24 && idade <= 50;
    // - 2 * valor da parcela IF idade > 50;
  }

  public void checkUpdates() {

  }

  public void checkOutdateds() {

  }
}
