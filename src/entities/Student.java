package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade(){
        return nota1+nota2+nota3;
    }

    public void approvad(){
        if(finalGrade() > 60){
            System.out.print("Final Grade = " + finalGrade() + "\nPASS\n");
        }else{
            double missing = 60 - finalGrade();
            System.out.print("Final Grade = " + finalGrade() + "\nFAILED\n" + "MISSING " + missing + " POINTS\n");
        }
    }
}
