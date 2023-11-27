package services;

public class UsaInterestService implements InterestServiceInterface {
  private double interestRate;

  public UsaInterestService(double interestRate) {
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
