class counter{
    static int obj_count;
    counter(){
        obj_count++;
    }

}
class question7{
    public static void main(String args[]){
        counter obj1 = new counter();
        counter obj2 = new counter();
        counter obj3 = new counter();
        counter obj4 = new counter();
        counter obj5 = new counter();
        counter obj6 = new counter();
        System.out.println("Total number of objects: "+counter.obj_count);
    }
}
