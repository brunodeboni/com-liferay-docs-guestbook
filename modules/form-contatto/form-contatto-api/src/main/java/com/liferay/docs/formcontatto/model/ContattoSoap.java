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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.formcontatto.service.http.ContattoServiceSoap}.
 *
 * @author Bruno De Boni
 * @generated
 */
@ProviderType
public class ContattoSoap implements Serializable {

	public static ContattoSoap toSoapModel(Contatto model) {
		ContattoSoap soapModel = new ContattoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setContattoId(model.getContattoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setNome(model.getNome());
		soapModel.setCognome(model.getCognome());
		soapModel.setEmail(model.getEmail());
		soapModel.setFormContattoId(model.getFormContattoId());

		return soapModel;
	}

	public static ContattoSoap[] toSoapModels(Contatto[] models) {
		ContattoSoap[] soapModels = new ContattoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContattoSoap[][] toSoapModels(Contatto[][] models) {
		ContattoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContattoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContattoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContattoSoap[] toSoapModels(List<Contatto> models) {
		List<ContattoSoap> soapModels = new ArrayList<ContattoSoap>(
			models.size());

		for (Contatto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContattoSoap[soapModels.size()]);
	}

	public ContattoSoap() {
	}

	public long getPrimaryKey() {
		return _contattoId;
	}

	public void setPrimaryKey(long pk) {
		setContattoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getContattoId() {
		return _contattoId;
	}

	public void setContattoId(long contattoId) {
		_contattoId = contattoId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getCognome() {
		return _cognome;
	}

	public void setCognome(String cognome) {
		_cognome = cognome;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getFormContattoId() {
		return _formContattoId;
	}

	public void setFormContattoId(long formContattoId) {
		_formContattoId = formContattoId;
	}

	private String _uuid;
	private long _contattoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _nome;
	private String _cognome;
	private String _email;
	private long _formContattoId;

}