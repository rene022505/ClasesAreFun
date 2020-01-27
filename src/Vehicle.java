class Vehicle {
    protected String brandName = "Mercedes";

    protected void ausDemBenza(){
        System.out.println("Eine Hand auf 'n Lenker, and're aus dem Fenster");
    }

}

class Car extends Vehicle{
    private String cl500 = "CL 500";

    public static void main(String[] args) {
        Car c = new Car();
        c.ausDemBenza();
        System.out.println(c.brandName);
        System.out.println(c.cl500);
    }

}
