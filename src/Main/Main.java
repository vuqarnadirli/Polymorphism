package Main;

import Ders4.Azay;
import Ders4.Serxan;
import Ders4.Tural;
import Ders4.X;

public class Main {
    public static void main(String[] args) {

        //1-ci variant
//        Serxan s =new Serxan();
//
//        test(s);//extend olundugu ucun Azay teleb olunan yere  Serxan obyektini gondere bilirik.
//
//        Azay azay = new Azay();
//
//    }
//
//    public static void test(Azay a){
//        /*extend olundugu ucun Azay teleb olunan yere Serxan obyektini gondere bilirik.
//        burada azay yalniz ozune aid olan hisseleri gore bilir.
//        * */
//        a.methodInAzay1();
//
//        Serxan s2 = (Serxan) a;// Bunu rahatliqla ede bilirik.
//
//        s2.methodInSerxan1();
//        s2.methodInSerxan2();
//        s2.methodInAzay1();
//
//
//

//        //2-ci variant
//
//        Serxan serxan=new Serxan();//111 reference
//        Tural tural =new Tural();//112 reference
//
//        test(serxan);
//        test(tural);
//
//
//        System.out.println(serxan instanceof Azay);
//        System.out.println(serxan instanceof Serxan);
//        System.out.println(serxan instanceof X);
//        System.out.println(serxan instanceof Object);
//
//    }
//
//    public static void test(Azay a){//111 112
//        if ( a instanceof Serxan) {
//           Serxan s = (Serxan) a;
//        } else if (a instanceof Tural) {
//            Tural t = (Tural) a;
//        }

//        //3-cu variant
//
//        Serxan s = new Serxan();
//
//        Azay a = s;//up casting
//        /*a heqiqetde Serxan obyekti olmagina baxmayaraq ozunu
//        Azay obekti kimi aparir.
//        Bu hal Polymorphism adlanir.
//         */
//
//        System.out.println(a.getClass());
//
//        Serxan ss = (Serxan) a; //down casting or explicitly write

        //4-cu variant
        Serxan s =new Serxan();

        method(s);

    }
    public static void method (Serxan s){
        System.out.println("Serxan");
    }

    public static void method (Azay a){
        System.out.println("Azay");
    }

    public static void method (X x){
        System.out.println("X");
    }

    public static void method (Object o){
        System.out.println("Object");
    }

}