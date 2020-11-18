package tn.esprit.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_tp")
public class TravauxPratiques implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Id_TP")
	private Long tpId;
	
	@Column(name="Sujet_TP")
	private String tpSujet;
	
	
	@Column(name="Duree_TP")
	private Long tpDuree;
	
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="travauxPratiques")
	private Set<TpCorrection> TpCorrections;

	@ManyToMany(mappedBy="formationsTps",cascade=CascadeType.ALL)
	private Set<Formation> formations;

	
	
	
	public TravauxPratiques(Long tpId, String tpSujet, Long tpDuree, Set<TpCorrection> tpCorrections,
			Set<Formation> formations) {
		super();
		this.tpId = tpId;
		this.tpSujet = tpSujet;
		this.tpDuree = tpDuree;
		TpCorrections = tpCorrections;
		this.formations = formations;
	}




	public Long getTpId() {
		return tpId;
	}




	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}




	public String getTpSujet() {
		return tpSujet;
	}




	public void setTpSujet(String tpSujet) {
		this.tpSujet = tpSujet;
	}




	public Long getTpDuree() {
		return tpDuree;
	}




	public void setTpDuree(Long tpDuree) {
		this.tpDuree = tpDuree;
	}




	public Set<TpCorrection> getTpCorrections() {
		return TpCorrections;
	}




	public void setTpCorrections(Set<TpCorrection> tpCorrections) {
		TpCorrections = tpCorrections;
	}




	public Set<Formation> getFormations() {
		return formations;
	}




	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "TravauxPratiques [tpId=" + tpId + ", tpSujet=" + tpSujet + ", tpDuree=" + tpDuree + ", TpCorrections="
				+ TpCorrections + ", formations=" + formations + "]";
	}
	

	
	
}
