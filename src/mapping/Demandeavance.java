package mapping;
// Generated 15 janv. 2018 23:23:09 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Demandeavance generated by hbm2java
 */
@Entity
@Table(name="demandeavance"
    ,catalog="notesdefrais"
)
public class Demandeavance  implements java.io.Serializable {


     private Integer iddemande;
     private String type;
     private double montant;
     private int idSalarie;

    public Demandeavance() {
    }

    public Demandeavance(String type, double montant, int idSalarie) {
       this.type = type;
       this.montant = montant;
       this.idSalarie = idSalarie;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iddemande", unique=true, nullable=false)
    public Integer getIddemande() {
        return this.iddemande;
    }
    
    public void setIddemande(Integer iddemande) {
        this.iddemande = iddemande;
    }

    
    @Column(name="type", nullable=false, length=11)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name="montant", nullable=false, precision=22, scale=0)
    public double getMontant() {
        return this.montant;
    }
    
    public void setMontant(double montant) {
        this.montant = montant;
    }

    
    @Column(name="id_salarie", nullable=false)
    public int getIdSalarie() {
        return this.idSalarie;
    }
    
    public void setIdSalarie(int idSalarie) {
        this.idSalarie = idSalarie;
    }




}

