package javase01.t03;

import static java.lang.Math.tan;

class TrigFunction {  // Расчет значения функции
	double argX;
		
	double result(double argX) {
		return ( tan(2 * argX) - 3 );
	}
}

/*
// функция передачи аргументов a b и шаг
public class getArgs {
	double a, b, d;
}
*/

public class FunctChart {
    public static void main (String[] args) {
        
        System.out.println();
        System.out.println("F(x) = tg(2x)-3");
        
        double a = 0;
        double b = 3;
        double h = 0.5;
        
        System.out.println("x = [" + a + "; " + b + "], h = " + h + "\n\n");
                
        TrigFunction Fx = new TrigFunction();
        
        System.out.println("|\tx\t|\tF(x)\t\t|");
        do {
            System.out.println("|\t" + a + "\t|\t" + Fx.result(a)  + "\t|");
            a = a + h;
        } while (a <= b);

		// передача значений из getArgs
		
		// проверка значений, сортировка. Если а меньше б, поменять их местами.
		
        
    }
}