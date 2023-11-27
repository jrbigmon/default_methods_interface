package services;

public class BrazilInterestService implements InterestServiceInterface {
  private double interestRate;

  public BrazilInterestService(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
