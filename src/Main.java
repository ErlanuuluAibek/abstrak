public class Main {
    public static void main(String[] args){
        Sheep sheep=new Sheep(7.5,3,"male","goba");
        Sheep sheep1=new Sheep(7.5,5,"female","bag");
        Sheep sheep2=new Sheep(7.5,6,"male","boba");
        Sheep sheep3=new Sheep(7.5,4,"female","bob");
        Sheep []sheeps={sheep,sheep1,sheep2};
        Sheep[]sheeps1={sheep3};
        Cow cow=new Cow(77,5,"male","toru");
        Cow cow1=new Cow(66,6,"female","mustang");
        Cow cow2=new Cow(78,8,"male","tor");
        Cow cow3=new Cow(90,6,"female","car");
        Cow cow4=new Cow(70,9,"male","back");
        Cow cow5=new Cow(60,7,"female","blend");
        Cow[] cows= {cow, cow1, cow2, cow3,cow4};
        Cow[]cows1={cow5};
        Horse horse=new Horse(75,7,"male","mustang","black");
        Horse horse1=new Horse(80,10,"female","tang","white-black");
        Horse horse2=new Horse(78,9,"male","alfa","white");
        Horse[]horses={horse,horse1};
        Horse[]horses1={horse2};
        Farm farm=new Farm(cows,horses,sheeps,"Timur","Russia");
        Farm farm1=new Farm(cows1,horses1,sheeps1,"Meder","Russia");
        System.out.println(farm1);
        System.out.println(farm);
    }
}