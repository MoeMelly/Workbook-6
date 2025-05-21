public class Main {
    public static void main(String[] args) {


         FixedList<String> names = new FixedList<>(6);
         names.add("Sean");
         names.add("Gio");
         names.add("Noah");
         names.add("David");
         names.add("Kevin");
         names.add("Mo");

        System.out.println("Names: " + names.getMama());
    }
}
