import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="country")
public class Country {
    @Id
    @Column(name="co_code")
    private String code;

    @Column(name="co_name")
    private String name;

    // getters, setters, toString
}
