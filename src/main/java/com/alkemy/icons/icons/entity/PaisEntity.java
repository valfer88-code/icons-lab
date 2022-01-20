
package com.alkemy.icons.icons.entity;
/**
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.DefaultPropertiesPropertySource;



@Entity
@Table(name="pais")
@Getter
@Setter
*/
public class PaisEntity {
  /**
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String imagen;
    
    private String denominacion;
    
    @Column(name= "cant_habitantes")
    private Long cantidadHabitantes;
    
    private Long superficie;//m2
    //fetch = FetchType.EAGER cada vez que pida un dato tipo pais si o si va a traer un continente
    //cascade = CascadeType.ALL)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinColumn(name= "continente_id",insertable = false, updatable = false)
    private ContinenteEntity continente;
    
    //guardar y actualizar
    @Column (name="continente_id", nullable = false)
    private Long continenteId;
    
    @ManyToMany(
    cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
    }
    )
    /**
    @JoinTable(
            name= "icon-pais",
            joinColumns = @JoinColumn(name ="pais_id")),
         
            inverseJoinColumns= @JoinColumn(name= "icon_id"))        
    
    
   */ 
}
