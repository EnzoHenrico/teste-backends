import java.util.*;

public class Solution {

  public static String processMessages(List<String> messages) {

    List<String[]> splitedMessages = new ArrayList<String[]>();

    for (String string : messages) {

      splitedMessages.add(string.split(","));
    }

    for (String[] strings : splitedMessages) {

      String eventId = strings[0];
      String eventAction = strings[1];
      String eventTime = strings[3];

      if (eventAction.equals("proposal")) {

        String proposalId = strings[4];
        String proposalLoanValue = strings[5];
        String proposalMonthlyInstallments = strings[6];

        Proposal proposal = new Proposal(eventId, eventAction, eventTime, proposalId, proposalLoanValue,
            proposalMonthlyInstallments);

        System.out.println(proposal.toString());

      }
      if (eventAction.equals("waranty")) {

        String warrantyId = strings[4];
        String warrantyValue = strings[5];
        String warrantyProvince = strings[6];

        Waranty waranty = new Waranty(eventId, eventAction, eventTime, warrantyId, warrantyValue, warrantyProvince);
      }
      if (eventAction.equals("proponent")) {

        String proponentId = strings[5];
        String proponentName = strings[6];
        String proponentAge = strings[7];
        String proponentMonthlyIncome = strings[8];
        String proponentIsMain = strings[9];

        Proponent proponent = new Proponent(eventId, eventAction, eventTime, proponentId, proponentName, proponentAge,
            proponentMonthlyIncome, proponentIsMain);
      }
    }

    return "";
  }

  public void checkLoanValue() {

    // O valor deve ser entre 30.000,00 e 3.000.000,00
  }

  public void checkTimeToPay() {
    // Deve ser pago em: 2 anos >= x <= 15 anos
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
