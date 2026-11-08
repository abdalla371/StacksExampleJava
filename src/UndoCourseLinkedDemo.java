public class UndoCourseLinkedDemo {
    public static void main(String[] args) {
//        Registration reg = new Registration();
//        reg.addCourse("CA314");
//        Stacks in Java  Examples · 13/14
//        reg.addCourse("CA301");
//        reg.addCourse("MA210");
//        reg.undoLastCourse();
//        reg.undoLastCourse();
        Registration reg=new Registration();
        reg.addCourse("Java");
        reg.addCourse("English");
        reg.addCourse("Math");
        reg.undoLastCourse();
        reg.undoLastCourse();
    }
}
class  Registration{
 private LinkedStack<String> courses=new LinkedStack<>();
 public void addCourse(String course){
     courses.push(course);
     System.out.println("Added " + course + " | top: " + courses.peek()
             + " | size: " + courses.size());
 }
 public void undoLastCourse(){
     if(courses.isEmpty()){
         System.out.println("There is no course to undo");
         return;
     }
     String removed=courses.pop();
     System.out.println("Removed " + removed + " | size: " + courses.size());
 }
}