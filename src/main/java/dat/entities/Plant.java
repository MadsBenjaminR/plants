package dat.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plant")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "plant_type", nullable = false)
    private String plantType;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "max_height", nullable = false)
    private int maxHeight;

    @Column(name = "price", nullable = false)
    private float price;
}
