package chapter06.mapped;

import jakarta.persistence.Entity;

@Entity
public class ComputerBook extends Book {
    String language;

    public ComputerBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
