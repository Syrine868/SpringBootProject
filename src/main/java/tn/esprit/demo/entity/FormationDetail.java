package tn.esprit.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_formation_detail")

public class FormationDetail implements Serializable{
	
	private static final long serialVersionUID =1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_FD")
	private Long FDId;

	@Column(name="Table_matiere_FD")
	private String fdTableMatiere;
	
	@Column(name="SupportPdf_FD")
	private String fdSupportPDF;
	

	@OneToOne(mappedBy="formationDetail")
	private Formation formation;

	public Long getFDId() {
		return FDId;
	}

	public void setFDId(Long fDId) {
		FDId = fDId;
	}

	public String getFdTableMatiere() {
		return fdTableMatiere;
	}

	public void setFdTableMatiere(String fdTableMatiere) {
		this.fdTableMatiere = fdTableMatiere;
	}

	public String getFdSupportPDF() {
		return fdSupportPDF;
	}

	public void setFdSupportPDF(String fdSupportPDF) {
		this.fdSupportPDF = fdSupportPDF;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public FormationDetail(Long fDId, String fdTableMatiere, String fdSupportPDF) {
		super();
		FDId = fDId;
		this.fdTableMatiere = fdTableMatiere;
		this.fdSupportPDF = fdSupportPDF;
	}

	@Override
	public String toString() {
		return "FormationDetail [FDId=" + FDId + ", fdTableMatiere=" + fdTableMatiere + ", fdSupportPDF=" + fdSupportPDF
				+ "]";
	}
	
}
