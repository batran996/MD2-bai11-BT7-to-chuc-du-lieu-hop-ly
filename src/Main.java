import java.util.ArrayList;
import java.util.Queue;

public class Main {
    private static boolean listNu;

    public static void main(String[] args) {
        public static void suLyOldList
        Object Person;
        boolean listNam;
        boolean listPerson;
        (Queue < Person > listNu, Queue < Person > listNam, ArrayList < Person > listPerson){
            for (int i = 0; i < listPerson.size(); i++) {
                Person holder = listPerson.get(i);
                if (holder.getGender().equals("nu")) {
                    listNu.add(holder);

                } else {
                    listNam.add(holder);
                }


            }

            public static ArrayList inputData () {
                ArrayList<Pertion> listPertion = new ArrayList<>();
                Pertion pertion1 = new Pertion("mot", "nam", "1996");
                Pertion pertion2 = new Pertion("hai", "nu", "1997");
                Pertion pertion3 = new Pertion("ba", "nu", "1998");
                Pertion pertion4 = new Pertion("bon", "nam", "1999");
                Pertion pertion5 = new Pertion("nam", "nam", "2000");
                listPertion.add(pertion1);
                listPertion.add(pertion2);
                listPertion.add(pertion3);
                listPertion.add(pertion4);
                listPertion.add(pertion5);
                return listPertion;
            }

            public static ArrayList newList (Queue < Person > listNu, Queue < Person > listNam){
                ArrayList<Person> newListPerson = new ArrayList<>();
                for (Person p :
                        listNu) {
                    newListPerson.add(p);

                }
                for (Person p :
                        listNam) {
                    newListPerson.add(p);

                }
                return newListPerson;
            }

            private static class Person {
            }
            public static void showData (ArrayList < Person > list) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("name: " + list.get(i).getName() + ", giới tính: " + list.get(i).getGender() + ", năm sinh: " + list.get(i).getDayOfBirth());


                }

            }