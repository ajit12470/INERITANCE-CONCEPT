class parent {
    private int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
}
class child2 extends parent{
    void set(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String []args){
        child2 c2=new child2();
        c2.set(100, 200);
        c2.show();
    }
}
