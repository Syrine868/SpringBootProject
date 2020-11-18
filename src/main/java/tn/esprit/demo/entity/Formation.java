package tn.esprit.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_formation")
public class Formation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_formation")
	private Long id;

	@Column(name="theme_formation")
	private String theme;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="FK_FD_ID")
	private FormationDetail formationDetail;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<TravauxPratiques> formationsTps;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public FormationDetail getFormationDetail() {
		return formationDetail;
	}

	public void setFormationDetail(FormationDetail formationDetail) {
		this.formationDetail = formationDetail;
	}

	public Set<TravauxPratiques> getFormationsTps() {
		return formationsTps;
	}

	public void setFormationsTps(Set<TravauxPratiques> formationsTps) {
		this.formationsTps = formationsTps;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Formation(Long id, String theme, FormationDetail formationDetail, Set<TravauxPratiques> formationsTps) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationDetail = formationDetail;
		this.formationsTps = formationsTps;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + ", formationDetail=" + formationDetail + ", formationsTps="
				+ formationsTps + "]";
	}
	

	
	
	
}
