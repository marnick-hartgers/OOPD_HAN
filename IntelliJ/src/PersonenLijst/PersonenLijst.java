package PersonenLijst;

import java.util.ArrayList;

public class PersonenLijst {
    private ArrayList<Persoon> lijst = new ArrayList<>();

    public void printNamen(){
        for(Persoon p : lijst){
            System.out.println(p);
        }
    }

    public ArrayList<Student> getSLBStudenten(Docent d) {
        ArrayList<Student> res = new ArrayList<>();

        for(Persoon p : lijst){
            if(p instanceof Student && ((Student) p).getSLBer() == d){
                res.add((Student) p);
            }
        }

        return res;
    }

    public static void main(String[] args){
        PersonenLijst p = new PersonenLijst();
        Docent piet=new Docent("Piet","Jansen","jnsnp");
        Student marie=new Student("Marie","Pieters",31415,piet);
        Student jan=new Student("Jan","de Vries",92653,null); // nog geen SLB’er
        p.lijst.add(piet);
        p.lijst.add(marie);
        p.lijst.add(jan);
        // voeg zelf nog enkele docenten en studenten toe
        ArrayList<Student> studentenVanPiet = p.getSLBStudenten(piet);

        for(Student s : studentenVanPiet){
            System.out.println(s);
        }

        //p.printNamen();
    }

}

