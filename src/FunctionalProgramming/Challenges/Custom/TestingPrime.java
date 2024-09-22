package FunctionalProgramming.Challenges.Custom;

public class TestingPrime {
    public static void main(String[] args) {
        Candidate candidate = num ->{
            if(num == 1){
                return false;
            }
            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };

       boolean result = candidate.prime(3);
        System.out.println(result);
    }
}
