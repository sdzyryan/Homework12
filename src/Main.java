public class Main {
    public static void main(String[] args) {

        Author authorNineteenEightyFour = new Author("Джордж", "Оруэлл");
        Book nineteenEightyFour = new Book(authorNineteenEightyFour.toString(), "1984", 2019);
        System.out.println("Автор книги - " + authorNineteenEightyFour.getNameAuthor() + " "
                + authorNineteenEightyFour.getLastNameAuthor() + ". Название - " + nineteenEightyFour.getNameBook() +
                ". Год издания - " + nineteenEightyFour.getYear() + ".");

        Author authorFahrenheit451 = new Author("Рэй", "Брэдбери");
        Book fahrenheit451 = new Book(authorFahrenheit451.getNameAuthor(), "451 градус по фаренгейту",
                2016);
        System.out.println("Автор книги - " + authorFahrenheit451.getNameAuthor() + " "
                + authorFahrenheit451.getLastNameAuthor() + ". Название - " + fahrenheit451.getNameBook() +
                ". Год издания - " + fahrenheit451.getYear() + ".");

        fahrenheit451.setYear(2018);
        System.out.println("Автор книги - " + authorFahrenheit451.getNameAuthor() + " "
                + authorFahrenheit451.getLastNameAuthor() + ". Название - " + fahrenheit451.getNameBook() +
                ". Год издания - " + fahrenheit451.getYear() + ".");
    }
}

