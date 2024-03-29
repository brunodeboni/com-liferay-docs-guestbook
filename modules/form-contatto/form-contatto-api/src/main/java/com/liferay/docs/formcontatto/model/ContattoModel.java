/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.formcontatto.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Contatto service. Represents a row in the &quot;FC_Contatto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.docs.formcontatto.model.impl.ContattoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.docs.formcontatto.model.impl.ContattoImpl</code>.
 * </p>
 *
 * @author Bruno De Boni
 * @see Contatto
 * @generated
 */
@ProviderType
public interface ContattoModel
	extends BaseModel<Contatto>, GroupedModel, ShardedModel, StagedAuditedModel,
			WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contatto model instance should use the {@link Contatto} interface instead.
	 */

	/**
	 * Returns the primary key of this contatto.
	 *
	 * @return the primary key of this contatto
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contatto.
	 *
	 * @param primaryKey the primary key of this contatto
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this contatto.
	 *
	 * @return the uuid of this contatto
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this contatto.
	 *
	 * @param uuid the uuid of this contatto
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the contatto ID of this contatto.
	 *
	 * @return the contatto ID of this contatto
	 */
	public long getContattoId();

	/**
	 * Sets the contatto ID of this contatto.
	 *
	 * @param contattoId the contatto ID of this contatto
	 */
	public void setContattoId(long contattoId);

	/**
	 * Returns the group ID of this contatto.
	 *
	 * @return the group ID of this contatto
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this contatto.
	 *
	 * @param groupId the group ID of this contatto
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this contatto.
	 *
	 * @return the company ID of this contatto
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this contatto.
	 *
	 * @param companyId the company ID of this contatto
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this contatto.
	 *
	 * @return the user ID of this contatto
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this contatto.
	 *
	 * @param userId the user ID of this contatto
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this contatto.
	 *
	 * @return the user uuid of this contatto
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this contatto.
	 *
	 * @param userUuid the user uuid of this contatto
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this contatto.
	 *
	 * @return the user name of this contatto
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this contatto.
	 *
	 * @param userName the user name of this contatto
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this contatto.
	 *
	 * @return the create date of this contatto
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this contatto.
	 *
	 * @param createDate the create date of this contatto
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this contatto.
	 *
	 * @return the modified date of this contatto
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this contatto.
	 *
	 * @param modifiedDate the modified date of this contatto
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this contatto.
	 *
	 * @return the status of this contatto
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this contatto.
	 *
	 * @param status the status of this contatto
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this contatto.
	 *
	 * @return the status by user ID of this contatto
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this contatto.
	 *
	 * @param statusByUserId the status by user ID of this contatto
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this contatto.
	 *
	 * @return the status by user uuid of this contatto
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this contatto.
	 *
	 * @param statusByUserUuid the status by user uuid of this contatto
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this contatto.
	 *
	 * @return the status by user name of this contatto
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this contatto.
	 *
	 * @param statusByUserName the status by user name of this contatto
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this contatto.
	 *
	 * @return the status date of this contatto
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this contatto.
	 *
	 * @param statusDate the status date of this contatto
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the nome of this contatto.
	 *
	 * @return the nome of this contatto
	 */
	@AutoEscape
	public String getNome();

	/**
	 * Sets the nome of this contatto.
	 *
	 * @param nome the nome of this contatto
	 */
	public void setNome(String nome);

	/**
	 * Returns the cognome of this contatto.
	 *
	 * @return the cognome of this contatto
	 */
	@AutoEscape
	public String getCognome();

	/**
	 * Sets the cognome of this contatto.
	 *
	 * @param cognome the cognome of this contatto
	 */
	public void setCognome(String cognome);

	/**
	 * Returns the email of this contatto.
	 *
	 * @return the email of this contatto
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this contatto.
	 *
	 * @param email the email of this contatto
	 */
	public void setEmail(String email);

	/**
	 * Returns the form contatto ID of this contatto.
	 *
	 * @return the form contatto ID of this contatto
	 */
	public long getFormContattoId();

	/**
	 * Sets the form contatto ID of this contatto.
	 *
	 * @param formContattoId the form contatto ID of this contatto
	 */
	public void setFormContattoId(long formContattoId);

	/**
	 * Returns <code>true</code> if this contatto is approved.
	 *
	 * @return <code>true</code> if this contatto is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this contatto is denied.
	 *
	 * @return <code>true</code> if this contatto is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this contatto is a draft.
	 *
	 * @return <code>true</code> if this contatto is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this contatto is expired.
	 *
	 * @return <code>true</code> if this contatto is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this contatto is inactive.
	 *
	 * @return <code>true</code> if this contatto is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this contatto is incomplete.
	 *
	 * @return <code>true</code> if this contatto is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this contatto is pending.
	 *
	 * @return <code>true</code> if this contatto is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this contatto is scheduled.
	 *
	 * @return <code>true</code> if this contatto is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}