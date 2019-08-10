package TwoPow;

public class TwoPow {//zadanko z prezentacji
    public int powIter (int exp) {
        int result = 0;
        while (exp >0) {
            result *=2;
            --exp;
        } return result;
    }
    public int powRec (int exp){
        if (exp == 0)
          return 1;
        return powRec(exp-1)*2;
    }
}
