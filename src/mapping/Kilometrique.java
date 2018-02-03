package mapping;
// Generated 15 janv. 2018 23:23:09 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Kilometrique generated by hbm2java
 */
@Entity
@Table(name = "kilometrique",
        catalog = "notesdefrais"
)
public class Kilometrique implements java.io.Serializable {

    private Integer idKm;
    private Date dateKm;
    private String departKm;
    private String arriveeKm;
    private int distanceKm;
    private int puissance;
    private int idSalarie;

    public Kilometrique() {
    }

    public Kilometrique(Date dateKm, String departKm, String arriveeKm, int distanceKm, int puissance, int idSalarie) {
        this.dateKm = dateKm;
        this.departKm = departKm;
        this.arriveeKm = arriveeKm;
        this.distanceKm = distanceKm;
        this.puissance = puissance;
        this.idSalarie = idSalarie;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id_km", nullable = false)
    public Integer getIdKm() {
        return this.idKm;
    }

    public void setIdKm(Integer idKm) {
        this.idKm = idKm;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_km", nullable = false, length = 10)
    public Date getDateKm() {
        return this.dateKm;
    }

    public void setDateKm(Date dateKm) {
        this.dateKm = dateKm;
    }

    @Column(name = "depart_km", nullable = false, length = 50)
    public String getDepartKm() {
        return this.departKm;
    }

    public void setDepartKm(String departKm) {
        this.departKm = departKm;
    }

    @Column(name = "arrivee_km", nullable = false, length = 50)
    public String getArriveeKm() {
        return this.arriveeKm;
    }

    public void setArriveeKm(String arriveeKm) {
        this.arriveeKm = arriveeKm;
    }

    @Column(name = "distance_km", nullable = false)
    public int getDistanceKm() {
        return this.distanceKm;
    }

    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }

    @Column(name = "puissance", nullable = false)
    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Column(name = "id_salarie", nullable = false)
    public int getIdSalarie() {
        return idSalarie;
    }

    public void setIdSalarie(int idSalarie) {
        this.idSalarie = idSalarie;
    }

}
