package LAB1.TASK4;

import java.math.BigDecimal;

public class Deposit {
    public double deposit;
    public double percent;

    public void Deposit(double dep, double cent) {
        if (dep > 0 && cent > 0)
        {
            this.deposit = dep;
            this.percent = cent;
        }
         else {
            System.out.println("Процент и депозит не могут быть отрицательными или равными 0");
        }
    }

    public void finalValue(){
        double curvalue = deposit;
        int m;
        for (m = 0; curvalue <= deposit*2;m++){
            curvalue = curvalue+curvalue*(percent/100);
        }
       System.out.println(curvalue);
       System.out.println(m);
    }
}
