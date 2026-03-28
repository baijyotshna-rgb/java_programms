class InterruptedExceptionExample{
public static void main(String args[]){
try{
Thread.sleep(2000);
System.out.println("thread completed");
}catch(InterruptedException e){
System.out.println("thread interrupted");
}
}
}