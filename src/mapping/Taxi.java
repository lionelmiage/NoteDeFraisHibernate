package mapping;
// Generated 15 janv. 2018 23:23:09 by Hibernate Tools 4.3.1


import java.util.Date;
import javafx.scene.control.DatePicker;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Taxi generated by hbm2java
 */
@Entity
@Table(name="taxi"
    ,catalog="notesdefrais"
)
public class Taxi  implements java.io.Serializable {


     private Integer idTaxi;
     private Date date;
     private String departTaxi;
     private String arriveeTaxi;
     private double montantTaxi;
     private String nomSociete;
     private int idSalarie;

    public Taxi() {
    }

    public Taxi(Date date,String departTaxi, String arriveeTaxi, double montantTaxi, String nomSociete, int idSalarie) {
        
        this.date = date;
       this.departTaxi = departTaxi;
       this.arriveeTaxi = arriveeTaxi;
       this.montantTaxi = montantTaxi;
       this.nomSociete = nomSociete;
       this.idSalarie = idSalarie;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_taxi", unique=true, nullable=false)
    public Integer getIdTaxi() {
        return this.idTaxi;
    }
    
    public void setIdTaxi(Integer idTaxi) {
        this.idTaxi = idTaxi;
    }
     @Temporal(TemporalType.DATE)
    @Column(name = "date_taxi", nullable = false, length = 10)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

    
    @Column(name="depart_taxi", nullable=false, length=50)
    public String getDepartTaxi() {
        return this.departTaxi;
    }
    
    public void setDepartTaxi(String departTaxi) {
        this.departTaxi = departTaxi;
    }

    
    @Column(name="arrivee_taxi", nullable=false, length=50)
    public String getArriveeTaxi() {
        return this.arriveeTaxi;
    }
    
    public void setArriveeTaxi(String arriveeTaxi) {
        this.arriveeTaxi = arriveeTaxi;
    }

    
    @Column(name="montant_taxi", nullable=false, precision=22, scale=0)
    public double getMontantTaxi() {
        return this.montantTaxi;
    }
    
    public void setMontantTaxi(double montantTaxi) {
        this.montantTaxi = montantTaxi;
    }

    
    @Column(name="nom_societe", nullable=false, length=50)
    public String getNomSociete() {
        return this.nomSociete;
    }
    
    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    
     @Column(name = "id_salarie", unique = true, nullable = false)
    public int getIdSalarie() {
        return this.idSalarie;
    }
    
    public void setIdSalarie(int iIdSalarie) {
        this.idSalarie = idSalarie;
    }




}


