class Employees{


 int eid;
 String name;

 Employees(int eid, String name){
  this.eid=eid;
  this.name=name;
 }




 void display(){
 System.out.println(eid+" "+name);
 }
}


class ObjectArray{
   public static void main(String[] args) {

      Employees e[] = new Employees[3];

      int i;
      String name[]={"Joel", "Pranav", "Leaster"};
      for(i=0; i<e.length ;i++){
         e[i] = new Employees(i+1,name[i]);
      }
     System.out.println("Eid      Name");
     for(i=0;i<e.length ;i++)
           e[i].display();
}
}
