public class RewardValue {
    double cash, miles;
    RewardValue(int Miles){
        miles = Miles;
    }

    RewardValue(double Cash){
        cash = Cash;
    }

    double getCashValue(){
        return cash;
    }

    double getMilesValue(){
        return miles;
    }

    double cash_to_miles(){
        return cash * 0.0035;
    }

    double miles_to_cash(){
        return miles / 0.0035;
    }
}
