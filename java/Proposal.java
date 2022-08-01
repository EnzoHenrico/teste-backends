import java.util.*;

public class Proposal{

  String proposalId;
  Float proposalLoanValue;
  Integer proposalMonthlyInstallments;
  ArrayList<String> waranty;
  ArrayList<String> proponent;

  public void setValues( String proposalId, String proposalLoanValue, String proposalMonthlyInstallments){
    this.proposalId = proposalId;
    this.proposalLoanValue = Float.parseFloat(proposalLoanValue);
    this.proposalMonthlyInstallments = Integer.parseInt(proposalMonthlyInstallments);
  }

  public boolean validateProposal(){
      // Pelo menos um garantia por proposta
      return true;
  }

  public void addWaranty(String value){    
    this.waranty.add(value);
  }

  public void addProponent(String value){
    this.proponent.add(value);
  }
  
  public boolean checkLoanValue(String loanValue) {  
    Float value = Float.valueOf(loanValue);
    
    if(value < 30000.00 || value > 3000000.00){
      return false;
    } 
    return true;
  }

  public boolean checkTimeToPay(int years) {
    if(years < 2  || years > 15){
      return false;
    }
    return true;
  }

}