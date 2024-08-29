package code.balmukund.user_with_books.util;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import code.balmukund.user_with_books.entity.Book;
import code.balmukund.user_with_books.entity.User;

@Profile("dev")
@Component
public class DataLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Faker faker = new Faker();

        Book book = Book.builder()
                        .title(faker.book().title())
                        .author(faker.book().author())
                        .publisher(faker.book().publisher())
                        .genre(faker.book().genre())
                        .build();

        System.out.println(book);

        User user = User.builder()
                        .name("Vaibhav")
                        .build();

        System.out.println(user);
    }
    
}
