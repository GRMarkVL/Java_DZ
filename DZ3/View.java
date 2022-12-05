package DZ3;

public class View {
    int a;
    int b;
    int c;
    int d;

    public View()
    {
        input input = new input();
        a = input.inputInt("Введите число a: ");
        b = input.inputInt("Введите число b: ");
        c = input.inputInt("Введите число c: ");
        d = input.inputInt("Введите число d: ");
        System.out.println("a=" + a + "; " + "b=" + b + "; " + "c=" + c + "; " + "d=" + d);

    }
    /**
    * Выводит в консоль переданную в качестве параметра переменную типа String
    */
    public void showAnswer(String text){
        System.out.println(text);  
    }

    
}
