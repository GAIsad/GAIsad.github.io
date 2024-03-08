package day240303.e3;

public class StudentTest {

    public static void main(String[] args) {

        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            Student student=new Student();
            student.number=i;
            student.state=(int)(Math.random()*6+1);
            student.score=(int)(Math.random()*101);
            students[i]=student;
        }

        SelectState(2,students);
        BinaryScore(students);




    /*for(int i=0;i<students.length;i++){
        if(students[i].state==2){
            students[i].show(students);
        }
    }

     */
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            students[i].show();

        }
    }
    public static  void SelectState(int state,Student[] students){
        for (int i = 0; i < students.length; i++) {

            if(students[i].state==2){
                students[i].show();
            }
        }
    }
    public static  void  BinaryScore(Student[] students){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1; j++) {
                if(students[j].score<students[j+1].score){
                    Student t=students[j];
                    students[j]=students[j+1];
                    students[j+1]=t;
                }
            }
        }
    }
}