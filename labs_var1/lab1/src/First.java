public class First{
    public static void main(String[] args) {

        int money = Integer.parseInt(args[0]);
        int count = money;
        int years = 0, month = 0;
        float percent = Float.parseFloat(args[1]);
        percent = percent/100/12;
        System.out.println(percent);
        while (count < money*2){

            month +=1;
            count += percent*count;
            if (month % 12 == 0){
                years+=1;
            }
        }

        System.out.println(years);


    }
}