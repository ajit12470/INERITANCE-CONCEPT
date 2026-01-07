class Parent {
    int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
}

class child1 extends Parent{
    void get(int x,int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.get(100, 200);  // 👈 pehle value set
        c1.show();        // 👈 phir print
    }
}
