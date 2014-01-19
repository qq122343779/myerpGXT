package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_selection2")
@IdClass(org.adempiere.model.TSelection2PK.class)
public class TSelection2 extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adPinstanceId;
	private BigDecimal queryId;
	private Integer tSelectionId;

	public TSelection2() {
	}

	public TSelection2(Integer adPinstanceId, BigDecimal queryId, Integer tSelectionId) {
		this.adPinstanceId = adPinstanceId;
		this.queryId = queryId;
		this.tSelectionId = tSelectionId;
	}

	@Id
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
	}

	@Id
	@Column(name="QUERY_ID")
	public BigDecimal getQueryId() {
		return queryId;
	}

	public void setQueryId(BigDecimal queryId) {
		this.queryId = queryId;
	}

	@Id
	@Column(name="T_SELECTION_ID", columnDefinition="INT")
	public Integer getTSelectionId() {
		return tSelectionId;
	}

	public void setTSelectionId(Integer tSelectionId) {
		this.tSelectionId = tSelectionId;
	}
}