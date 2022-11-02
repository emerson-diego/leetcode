import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P2418_SortPeople {

    public static void main(String args[]) {

        String names[] = { "Mary", "John", "Emma" };
        int heights[] = { 180, 165, 170 };

        String[] result = new P2418_SortPeople().sort(names, heights);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    private String[] sort(String[] names, int[] heights) {

        List<Person> listPerson = new ArrayList<Person>();

        for (int i = 0; i < names.length; i++) {
            listPerson.add(new Person(names[i], heights[i]));
        }

        List<Person> sortedListPerson = listPerson.stream()
                .sorted(Comparator.comparingInt(Person::getHeight).reversed())
                .collect(Collectors.toList());

        String[] sortedResult = new String[sortedListPerson.size()];

        for (int i = 0; i < sortedListPerson.size(); i++) {
            sortedResult[i] = sortedListPerson.get(i).getName();
        }

        return sortedResult;
    }

    public class Person {
        private String name;
        private Integer height;

        public Person(String name, Integer height) {
            this.name = name;
            this.height = height;
        }

        public Integer getHeight() {
            return height;
        }

        public String getName() {
            return name;
        }

    }

}
