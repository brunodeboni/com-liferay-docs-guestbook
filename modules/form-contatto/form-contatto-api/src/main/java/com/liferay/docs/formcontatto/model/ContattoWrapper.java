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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Contatto}.
 * </p>
 *
 * @author Bruno De Boni
 * @see Contatto
 * @generated
 */
@ProviderType
public class ContattoWrapper
	extends BaseModelWrapper<Contatto>
	implements Contatto, ModelWrapper<Contatto> {

	public ContattoWrapper(Contatto contatto) {
		super(contatto);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("contattoId", getContattoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("nome", getNome());
		attributes.put("cognome", getCognome());
		attributes.put("email", getEmail());
		attributes.put("formContattoId", getFormContattoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long contattoId = (Long)attributes.get("contattoId");

		if (contattoId != null) {
			setContattoId(contattoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String cognome = (String)attributes.get("cognome");

		if (cognome != null) {
			setCognome(cognome);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long formContattoId = (Long)attributes.get("formContattoId");

		if (formContattoId != null) {
			setFormContattoId(formContattoId);
		}
	}

	/**
	 * Returns the cognome of this contatto.
	 *
	 * @return the cognome of this contatto
	 */
	@Override
	public String getCognome() {
		return model.getCognome();
	}

	/**
	 * Returns the company ID of this contatto.
	 *
	 * @return the company ID of this contatto
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contatto ID of this contatto.
	 *
	 * @return the contatto ID of this contatto
	 */
	@Override
	public long getContattoId() {
		return model.getContattoId();
	}

	/**
	 * Returns the create date of this contatto.
	 *
	 * @return the create date of this contatto
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this contatto.
	 *
	 * @return the email of this contatto
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the form contatto ID of this contatto.
	 *
	 * @return the form contatto ID of this contatto
	 */
	@Override
	public long getFormContattoId() {
		return model.getFormContattoId();
	}

	/**
	 * Returns the group ID of this contatto.
	 *
	 * @return the group ID of this contatto
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this contatto.
	 *
	 * @return the modified date of this contatto
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nome of this contatto.
	 *
	 * @return the nome of this contatto
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the primary key of this contatto.
	 *
	 * @return the primary key of this contatto
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this contatto.
	 *
	 * @return the status of this contatto
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this contatto.
	 *
	 * @return the status by user ID of this contatto
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this contatto.
	 *
	 * @return the status by user name of this contatto
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this contatto.
	 *
	 * @return the status by user uuid of this contatto
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this contatto.
	 *
	 * @return the status date of this contatto
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this contatto.
	 *
	 * @return the user ID of this contatto
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this contatto.
	 *
	 * @return the user name of this contatto
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this contatto.
	 *
	 * @return the user uuid of this contatto
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this contatto.
	 *
	 * @return the uuid of this contatto
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this contatto is approved.
	 *
	 * @return <code>true</code> if this contatto is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this contatto is denied.
	 *
	 * @return <code>true</code> if this contatto is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this contatto is a draft.
	 *
	 * @return <code>true</code> if this contatto is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this contatto is expired.
	 *
	 * @return <code>true</code> if this contatto is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this contatto is inactive.
	 *
	 * @return <code>true</code> if this contatto is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this contatto is incomplete.
	 *
	 * @return <code>true</code> if this contatto is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this contatto is pending.
	 *
	 * @return <code>true</code> if this contatto is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this contatto is scheduled.
	 *
	 * @return <code>true</code> if this contatto is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cognome of this contatto.
	 *
	 * @param cognome the cognome of this contatto
	 */
	@Override
	public void setCognome(String cognome) {
		model.setCognome(cognome);
	}

	/**
	 * Sets the company ID of this contatto.
	 *
	 * @param companyId the company ID of this contatto
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contatto ID of this contatto.
	 *
	 * @param contattoId the contatto ID of this contatto
	 */
	@Override
	public void setContattoId(long contattoId) {
		model.setContattoId(contattoId);
	}

	/**
	 * Sets the create date of this contatto.
	 *
	 * @param createDate the create date of this contatto
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this contatto.
	 *
	 * @param email the email of this contatto
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the form contatto ID of this contatto.
	 *
	 * @param formContattoId the form contatto ID of this contatto
	 */
	@Override
	public void setFormContattoId(long formContattoId) {
		model.setFormContattoId(formContattoId);
	}

	/**
	 * Sets the group ID of this contatto.
	 *
	 * @param groupId the group ID of this contatto
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this contatto.
	 *
	 * @param modifiedDate the modified date of this contatto
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nome of this contatto.
	 *
	 * @param nome the nome of this contatto
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the primary key of this contatto.
	 *
	 * @param primaryKey the primary key of this contatto
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this contatto.
	 *
	 * @param status the status of this contatto
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this contatto.
	 *
	 * @param statusByUserId the status by user ID of this contatto
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this contatto.
	 *
	 * @param statusByUserName the status by user name of this contatto
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this contatto.
	 *
	 * @param statusByUserUuid the status by user uuid of this contatto
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this contatto.
	 *
	 * @param statusDate the status date of this contatto
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this contatto.
	 *
	 * @param userId the user ID of this contatto
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this contatto.
	 *
	 * @param userName the user name of this contatto
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this contatto.
	 *
	 * @param userUuid the user uuid of this contatto
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this contatto.
	 *
	 * @param uuid the uuid of this contatto
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ContattoWrapper wrap(Contatto contatto) {
		return new ContattoWrapper(contatto);
	}

}