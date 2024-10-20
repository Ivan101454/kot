package by.ivan101454.kot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "exercise", schema = "kot")
public class Exercise implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "section_number", nullable = false)
    private int sectionNumber;
    @Column(name = "page", nullable = false)
    private int page;
    @Column(name = "description", nullable = false)
    private String description;
    @OneToMany(mappedBy = "exercise")
    private List<Question> questions;

    protected boolean canEqual(final Object other) {
        return other instanceof Exercise;
    }

}
