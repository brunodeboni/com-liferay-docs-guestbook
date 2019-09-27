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

package com.liferay.docs.formcontatto.model.impl;

import com.liferay.docs.formcontatto.model.Contatto;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Contatto in entity cache.
 *
 * @author Bruno De Boni
 * @generated
 */
@ProviderType
public class ContattoCacheModel
	implements CacheModel<Contatto>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContattoCacheModel)) {
			return false;
		}

		ContattoCacheModel contattoCacheModel = (ContattoCacheModel)obj;

		if (contattoId == contattoCacheModel.contattoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contattoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", contattoId=");
		sb.append(contattoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", cognome=");
		sb.append(cognome);
		sb.append(", email=");
		sb.append(email);
		sb.append(", formContattoId=");
		sb.append(formContattoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contatto toEntityModel() {
		ContattoImpl contattoImpl = new ContattoImpl();

		if (uuid == null) {
			contattoImpl.setUuid("");
		}
		else {
			contattoImpl.setUuid(uuid);
		}

		contattoImpl.setContattoId(contattoId);
		contattoImpl.setGroupId(groupId);
		contattoImpl.setCompanyId(companyId);
		contattoImpl.setUserId(userId);

		if (userName == null) {
			contattoImpl.setUserName("");
		}
		else {
			contattoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			contattoImpl.setCreateDate(null);
		}
		else {
			contattoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contattoImpl.setModifiedDate(null);
		}
		else {
			contattoImpl.setModifiedDate(new Date(modifiedDate));
		}

		contattoImpl.setStatus(status);
		contattoImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			contattoImpl.setStatusByUserName("");
		}
		else {
			contattoImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			contattoImpl.setStatusDate(null);
		}
		else {
			contattoImpl.setStatusDate(new Date(statusDate));
		}

		if (nome == null) {
			contattoImpl.setNome("");
		}
		else {
			contattoImpl.setNome(nome);
		}

		if (cognome == null) {
			contattoImpl.setCognome("");
		}
		else {
			contattoImpl.setCognome(cognome);
		}

		if (email == null) {
			contattoImpl.setEmail("");
		}
		else {
			contattoImpl.setEmail(email);
		}

		contattoImpl.setFormContattoId(formContattoId);

		contattoImpl.resetOriginalValues();

		return contattoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		contattoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		nome = objectInput.readUTF();
		cognome = objectInput.readUTF();
		email = objectInput.readUTF();

		formContattoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(contattoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (cognome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cognome);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(formContattoId);
	}

	public String uuid;
	public long contattoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String nome;
	public String cognome;
	public String email;
	public long formContattoId;

}