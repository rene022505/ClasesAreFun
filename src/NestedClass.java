class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

class MainClass2 {
    public static void main(String[] args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        System.out.println(inner.y + outer.x);
    }
}
