public class Main {
    public static void main(String[] args) {
        Author chekhov = new Author("Антон", "Чехов");
        Author turgenev = new Author("Иван", "Тургенев");

        Book gull = new Book("Чайка", chekhov, 1895);
        Book fathersAndChildren = new Book("Отцы и дети", turgenev , 1862);

        System.out.println("Книга №1: " + gull.getTitle());
        System.out.println("Автор: " + gull.getAuthor().getFirstName() + " " + gull.getAuthor().getSecondName());
        System.out.println("Год издания: " + gull.getYear());

        System.out.println("Книга №2: " + fathersAndChildren.getTitle());
        System.out.println("Автор: " + fathersAndChildren.getAuthor().getFirstName() + " " + fathersAndChildren.getAuthor().getSecondName());
        System.out.println("Год издания: " + fathersAndChildren.getYear());

        fathersAndChildren.setYear(1896);
        System.out.println("Обновленный год издания для книги 'Чайка': " + fathersAndChildren.getYear());
    }
}