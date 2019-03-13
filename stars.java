public class stars{

    public static void star1(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    void star2(){
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    void star3(){
        int no = 0;
        for(int i=0;i<10;i++){
            no = Math.abs(5-i);
            for(int j=0; j<5-no; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    void star4(){
        for(int i=0;i<5;i++){
            for(int k = 0;k<5-i;k++){
                System.out.print(' ');
            }
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    void star5(){
        int no = 0;
        for(int i=0;i<10;i++){
            no = Math.abs(5-i);
            for(int j=0; j<no; j++){
                System.out.print(' ');
            }
            for(int j=0; j<5-no; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    void star6(){
        int no = 0;
        for(int i=0;i<10;i++){
            no = Math.abs(5-i);
            for(int j=0; j<no; j++){
                System.out.print(' ');
            }
            for(int j=0; j<2*(5-no)-1; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        stars obj = new stars();
        obj.star1();
        System.out.println('\n');
        obj.star2();
        System.out.println('\n');
        obj.star3();
        System.out.println('\n');
        obj.star4();
        System.out.println('\n');
        obj.star5();
        System.out.println('\n');
        obj.star6();
    }
}
