class E {
    void m1(String msg) { //parameter
      System.out.println(msg);
    }

    public static void main(String[] args) {
       System.out.println("main");
          E e1 = new E();
          e1.m1("Rishabh"); //argument
    }
}