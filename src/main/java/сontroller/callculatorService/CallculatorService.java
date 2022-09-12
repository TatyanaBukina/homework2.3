package сontroller.callculatorService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CallculatorService {
    @GetMapping

    public  int sum(int a,int b){
        return  a+b;
    }
    public  int minus(int a,int b){
        return  a-b;

    }
    public  int mulyiply (int a,int b){
        return  a*b;
    }
    public  double divide(int a,int b){

        return (double) a / b;
    }

}
