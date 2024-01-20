public class RewardValue {
    double cash, miles;
    RewardValue(int Miles){
        miles = Miles;
    }

    RewardValue(double Cash){
        cash = Cash;
    }

    double getCashValue(){
        return miles / 0.0035;
    }

    double getMilesValue(){
        return cash * 0.0035;
    }
}
