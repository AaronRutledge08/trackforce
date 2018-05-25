package com.revature.entity;
// Generated Nov 7, 2017 9:24:46 PM by Hibernate Tools 5.2.5.Final

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TfInterview generated by hbm2java
 */
@Entity
@Table(name = "TF_INTERVIEW")
public class TfInterview implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4148475604579144144L;
	@Id
	@Column(name = "TF_INTERVIEW_ID", unique = true, nullable = false, precision = 22, scale = 0)
	private Integer tfInterviewId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_ASSOCIATE_ID")
	private TfAssociate tfAssociate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_CLIENT_ID")
	private TfClient tfClient;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_END_CLIENT_ID")
	private TfEndClient tfEndClient;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_INTERVIEW_TYPE_ID")
	private TfInterviewType tfInterviewType;
	@Column(name = "TF_INTERVIEW_DATE")
	private Timestamp tfInterviewDate;

	// 1804
	@Column(name = "TF_ASSOCIATE_FEEDBACK", length = 5000)
	private String tfAssociateFeedback;
	@Column(name = "TF_CLIENT_FEEDBACK", length = 5000)
	private String tfClientFeedback;
	@Column(name = "TF_JOB_DESCRIPTION", length = 2000)
	private String tfJobDescription;
	@Column(name = "TF_DATE_SALES_ISSUED")
	private Timestamp tfDateSalesIssued;
	@Column(name = "TF_DATE_ASSOCIATE_ISSUED")
	private Timestamp tfDateAssociateIssued;
	@Column(name = "TF_IS_INTERVIEW_FLAGGED", nullable = false)
	private Integer tfIsInterviewFlagged = 0;
	@Column(name = "TF_FLAG_REASON", length = 300)
	private String tfFlagReason;
	@Column(name = "TF_IS_CLIENT_FEEDBACK_VISIABLE", nullable = false)
	private Integer tfIsClientFeedbackVisiable = 0;

	public TfInterview() {
	}

	public TfInterview(Integer tfInterviewId) {
		this.tfInterviewId = tfInterviewId;
	}

	public TfInterview(Integer tfInterviewId, TfAssociate tfAssociate, TfClient tfClient, TfEndClient tfEndClient,
			TfInterviewType tfInterviewType, Timestamp tfInterviewDate, String associateFeedback, String clientFeedback,
					   String jobDescription, Timestamp dateSalesIssued, Timestamp dateAssociateIssued, Integer isInterviewFlagged,
					   String flagReason, Integer isClientFeedbackVisiable) {
		this.tfInterviewId = tfInterviewId;
		this.tfAssociate = tfAssociate;
		this.tfClient = tfClient;
		this.tfEndClient = tfEndClient;
		this.tfInterviewType = tfInterviewType;
		this.tfInterviewDate = tfInterviewDate;

		this.tfAssociateFeedback = associateFeedback;
		this.tfClientFeedback = clientFeedback;
		this.tfJobDescription = jobDescription;
		this.tfDateSalesIssued = dateSalesIssued;
		this.tfDateAssociateIssued = dateAssociateIssued;
		this.tfIsInterviewFlagged = isInterviewFlagged;
		this.tfFlagReason = flagReason;
		this.tfIsClientFeedbackVisiable = isClientFeedbackVisiable;
	}

	public Integer getTfInterviewId() {
		return this.tfInterviewId;
	}

	public void setTfInterviewId(Integer tfInterviewId) {
		this.tfInterviewId = tfInterviewId;
	}

	public TfAssociate getTfAssociate() {
		return this.tfAssociate;
	}

	public void setTfAssociate(TfAssociate tfAssociate) {
		this.tfAssociate = tfAssociate;
	}

	public TfClient getTfClient() {
		return this.tfClient;
	}

	public void setTfClient(TfClient tfClient) {
		this.tfClient = tfClient;
	}

	public TfEndClient getTfEndClient() {
		return this.tfEndClient;
	}

	public void setTfEndClient(TfEndClient tfEndClient) {
		this.tfEndClient = tfEndClient;
	}

	public TfInterviewType getTfInterviewType() {
		return this.tfInterviewType;
	}

	public void setTfInterviewType(TfInterviewType tfInterviewType) {
		this.tfInterviewType = tfInterviewType;
	}

	public Timestamp getTfInterviewDate() {
		return this.tfInterviewDate;
	}

	public void setTfInterviewDate(Timestamp tfInterviewDate) {
		this.tfInterviewDate = tfInterviewDate;
	}


	public void setTfEndClientName(String name) {
		this.tfEndClient.setTfEndClientName(name);
	}

	public String getTfAssociateFeedback() {
		return tfAssociateFeedback;
	}

	public void setTfAssociateFeedback(String tfassociateFeedback) {
		this.tfAssociateFeedback = tfassociateFeedback;
	}

	public String getTfClientFeedback() {
		return tfClientFeedback;
	}

	public void setTfClientFeedback(String tfclientFeedback) {
		this.tfClientFeedback = tfclientFeedback;
	}

	public String getTfJobDescription() {
		return tfJobDescription;
	}

	public void setTfJobDescription(String tfjobDescription) {
		this.tfJobDescription = tfjobDescription;
	}

	public Timestamp getTfDateSalesIssued() {
		return tfDateSalesIssued;
	}

	public void setTfDateSalesIssued(Timestamp tfdateSalesIssued) {
		this.tfDateSalesIssued = tfdateSalesIssued;
	}

	public Timestamp getTfDateAssociateIssued() {
		return tfDateAssociateIssued;
	}

	public void setTfDateAssociateIssued(Timestamp tfdateAssociateIssued) {
		this.tfDateAssociateIssued = tfdateAssociateIssued;
	}

	public Integer getTfIsInterviewFlagged() {
		return tfIsInterviewFlagged;
	}

	public void setTfIsInterviewFlagged(Integer tfisInterviewFlagged) {
		this.tfIsInterviewFlagged = tfisInterviewFlagged;
	}

	public String getTfFlagReason() {
		return tfFlagReason;
	}

	public void setTfFlagReason(String tfflagReason) {
		this.tfFlagReason = tfflagReason;
	}

	public Integer getTfIsClientFeedbackVisiable() {
		return tfIsClientFeedbackVisiable;
	}

	public void setTfIsClientFeedbackVisiable(Integer tfisClientFeedbackVisiable) {
		this.tfIsClientFeedbackVisiable = tfisClientFeedbackVisiable;
	}
}
