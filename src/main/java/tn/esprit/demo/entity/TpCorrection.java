package tn.esprit.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_tpCorrection")
public class TpCorrection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Id_TC")
	private  Long IdTC;
	
	@Column(name="correction_tc")
	private String CorrectionTc;

	@ManyToOne
	private TravauxPratiques travauxPratiques;

	@Override
	public String toString() {
		return "TpCorrection [IdTC=" + IdTC + ", CorrectionTc=" + CorrectionTc + ", travauxPratiques="
				+ travauxPratiques + "]";
	}

	public Long getIdTC() {
		return IdTC;
	}

	public void setIdTC(Long idTC) {
		IdTC = idTC;
	}

	public String getCorrectionTc() {
		return CorrectionTc;
	}

	public void setCorrectionTc(String correctionTc) {
		CorrectionTc = correctionTc;
	}

	public TravauxPratiques getTravauxPratiques() {
		return travauxPratiques;
	}

	public void setTravauxPratiques(TravauxPratiques travauxPratiques) {
		this.travauxPratiques = travauxPratiques;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TpCorrection(Long idTC, String correctionTc, TravauxPratiques travauxPratiques) {
		super();
		IdTC = idTC;
		CorrectionTc = correctionTc;
		this.travauxPratiques = travauxPratiques;
	}
	
	
	
}
