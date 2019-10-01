package day;

public class Student {

   int score1=90;
   int score2=100;

   public int sum(){
       int avg=(score1+score2)/2;
       return avg;

   }
   public void ShowAvag(){
       int avg=this.sum();

       System.out.println("avager"+avg);
   }

    public static void main(String[] args) {

       Student student=new Student();

      int g= student.sum();
      student.ShowAvag();

    }
}

