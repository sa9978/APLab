public class Run
{
    public static void main(String[] args)
    {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(11);
        std2.print();
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        std3.setGrade(13);

        Lab[] labs = new Lab[2];
        labs[0] = new Lab(1, "saturday");
        labs[1] = new Lab(2, "sunday");
        labs[0].enrollStudent(std1);
        labs[1].enrollStudent(std2);
        labs[1].enrollStudent(std3);

        System.out.println("*********");
        System.out.println("faculty : ");
        Faculty f = new Faculty(5);
        f.enrollLab(labs[0]);
        f.enrollLab(labs[1]);
        f.setLabs(labs);

        //print
        f.print();
    }
}