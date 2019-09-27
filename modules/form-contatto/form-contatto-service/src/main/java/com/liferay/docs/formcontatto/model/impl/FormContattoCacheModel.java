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

import com.liferay.docs.formcontatto.model.FormContatto;
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
 * The cache model class for representing FormContatto in entity cache.
 *
 * @author Bruno De Boni
 * @generated
 */
@ProviderType
public class FormContattoCacheModel
	implements CacheModel<FormContatto>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FormContattoCacheModel)) {
			return false;
		}

		FormContattoCacheModel formContattoCacheModel =
			(FormContattoCacheModel)obj;

		if (formContattoId == formContattoCacheModel.formContattoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, formContattoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", formContattoId=");
		sb.append(formContattoId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FormContatto toEntityModel() {
		FormContattoImpl formContattoImpl = new FormContattoImpl();

		if (uuid == null) {
			formContattoImpl.setUuid("");
		}
		else {
			formContattoImpl.setUuid(uuid);
		}

		formContattoImpl.setFormContattoId(formContattoId);
		formContattoImpl.setGroupId(groupId);
		formContattoImpl.setCompanyId(companyId);
		formContattoImpl.setUserId(userId);

		if (userName == null) {
			formContattoImpl.setUserName("");
		}
		else {
			formContattoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			formContattoImpl.setCreateDate(null);
		}
		else {
			formContattoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			formContattoImpl.setModifiedDate(null);
		}
		else {
			formContattoImpl.setModifiedDate(new Date(modifiedDate));
		}

		formContattoImpl.setStatus(status);
		formContattoImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			formContattoImpl.setStatusByUserName("");
		}
		else {
			formContattoImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			formContattoImpl.setStatusDate(null);
		}
		else {
			formContattoImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			formContattoImpl.setName("");
		}
		else {
			formContattoImpl.setName(name);
		}

		formContattoImpl.resetOriginalValues();

		return formContattoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		formContattoId = objectInput.readLong();

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
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(formContattoId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public String uuid;
	public long formContattoId;
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
	public String name;

}