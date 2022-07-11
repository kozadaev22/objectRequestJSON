public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Козадаев";
        post.name = "Александр";
        post.patronymic = "Александрович";
        post.pasport = "5555 № 555555";
        post.phone = "+7(555)555-55-55";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 4;
        post.birthday.month = 7;
        post.birthday.year = 1994;
    }
}
