public class Main {
    public static void main(String[] args) {
        Author kovi = new Author("Стивен", "Кови");
        Author karnegi = new Author("Дейл", "Карнеги");

        Book theSevenHabitsOfHighlyEffectivePeople = new Book("7 навыков высокоэффективных людей", kovi, 1989);
        Book howToWinFriends = new Book("Как завоевывать друзей", karnegi, 1935);

        printBook(theSevenHabitsOfHighlyEffectivePeople);
        printBook(howToWinFriends);

        howToWinFriends.setPublishingYear(2012);
        printBook(howToWinFriends);

        System.out.println(howToWinFriends.equals(theSevenHabitsOfHighlyEffectivePeople));

        Book theSevenHabitsOfHighlyEffectivePeopleNew = new Book(" 7 навыков высокоэффективных людей", kovi, 2012);
        System.out.println(theSevenHabitsOfHighlyEffectivePeople.equals(theSevenHabitsOfHighlyEffectivePeopleNew));
        System.out.println(kovi.getClass());
        System.out.println(theSevenHabitsOfHighlyEffectivePeople.getClass());
    }
    private static void printBook(Book book) {
        System.out.println(book.toString());
    }
}