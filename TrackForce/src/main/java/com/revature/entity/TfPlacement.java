package com.revature.entity;
// Generated Nov 2, 2017 9:19:06 AM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TfPlacement generated by hbm2java
 */
@Entity
@Table(name = "TF_PLACEMENT", schema = "ADMIN")
public class TfPlacement implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 273052269297562777L;
	private BigDecimal tfPlacementId;
	private TfAssociate tfAssociate;
	private TfClient tfClient;
	private TfEndClient tfEndClient;
	private Timestamp tfPlacementStartDate;
	private Timestamp tfPlacementEndDate;

	public TfPlacement() {
	}

	public TfPlacement(BigDecimal tfPlacementId) {
		this.tfPlacementId = tfPlacementId;
	}

	public TfPlacement(BigDecimal tfPlacementId, TfAssociate tfAssociate, TfClient tfClient, TfEndClient tfEndClient,
			Timestamp tfPlacementStartDate, Timestamp tfPlacementEndDate) {
		this.tfPlacementId = tfPlacementId;
		this.tfAssociate = tfAssociate;
		this.tfClient = tfClient;
		this.tfEndClient = tfEndClient;
		this.tfPlacementStartDate = tfPlacementStartDate;
		this.tfPlacementEndDate = tfPlacementEndDate;
	}

	@Id

	@Column(name = "TF_PLACEMENT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTfPlacementId() {
		return this.tfPlacementId;
	}

	public void setTfPlacementId(BigDecimal tfPlacementId) {
		this.tfPlacementId = tfPlacementId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_ASSOCIATE_ID")
	public TfAssociate getTfAssociate() {
		return this.tfAssociate;
	}

	public void setTfAssociate(TfAssociate tfAssociate) {
		this.tfAssociate = tfAssociate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_CLIENT_ID")
	public TfClient getTfClient() {
		return this.tfClient;
	}

	public void setTfClient(TfClient tfClient) {
		this.tfClient = tfClient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_END_CLIENT_ID")
	public TfEndClient getTfEndClient() {
		return this.tfEndClient;
	}

	public void setTfEndClient(TfEndClient tfEndClient) {
		this.tfEndClient = tfEndClient;
	}

	@Column(name = "TF_PLACEMENT_START_DATE")
	public Serializable getTfPlacementStartDate() {
		return this.tfPlacementStartDate;
	}

	public void setTfPlacementStartDate(Timestamp tfPlacementStartDate) {
		this.tfPlacementStartDate = tfPlacementStartDate;
	}

	@Column(name = "TF_PLACEMENT_END_DATE")
	public Serializable getTfPlacementEndDate() {
		return this.tfPlacementEndDate;
	}

	public void setTfPlacementEndDate(Timestamp tfPlacementEndDate) {
		this.tfPlacementEndDate = tfPlacementEndDate;
	}

}
