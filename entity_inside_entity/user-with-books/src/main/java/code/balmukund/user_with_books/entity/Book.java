package code.balmukund.user_with_books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TUTORIAL_BOOK")
@Data
// @NoArgsConstructor
// @AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Book {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String title;
    private String publisher;
    private String genre;

}
