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

package com.liferay.docs.formcontatto.service.impl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.docs.formcontatto.exception.FormContattoNameException;
import com.liferay.docs.formcontatto.model.FormContatto;
import com.liferay.docs.formcontatto.service.base.FormContattoLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the form-contatto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.docs.formcontatto.service.FormContattoLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Bruno De Boni
 * @see FormContattoLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.docs.formcontatto.model.FormContatto",
	service = AopService.class
)
public class FormContattoLocalServiceImpl
	extends FormContattoLocalServiceBaseImpl {

	public FormContatto addFormContatto(
	    long userId, String name, ServiceContext serviceContext)
	    throws PortalException {

	    long groupId = serviceContext.getScopeGroupId();

	    User user = userLocalService.getUserById(userId);

	    Date now = new Date();

	    validate(name);

	    long formContattoId = counterLocalService.increment();

	    FormContatto formContatto = formContattoPersistence.create(formContattoId);

	    formContatto.setUuid(serviceContext.getUuid());
	    formContatto.setUserId(userId);
	    formContatto.setGroupId(groupId);
	    formContatto.setCompanyId(user.getCompanyId());
	    formContatto.setUserName(user.getFullName());
	    formContatto.setCreateDate(serviceContext.getCreateDate(now));
	    formContatto.setModifiedDate(serviceContext.getModifiedDate(now));
	    formContatto.setName(name);
	    formContatto.setExpandoBridgeAttributes(serviceContext);

	    formContattoPersistence.update(formContatto);

	    return formContatto;

	}
	
	public List<FormContatto> getFormsContatto(long groupId) {

	    return formContattoPersistence.findByGroupId(groupId);
	}

	public List<FormContatto> getFormsContatto(long groupId, int start, int end, 
	    OrderByComparator<FormContatto> obc) {

	    return formContattoPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<FormContatto> getFormsContatto(long groupId, int start, int end) {

	    return formContattoPersistence.findByGroupId(groupId, start, end);
	}

	public int getFormsContattoCount(long groupId) {

	    return formContattoPersistence.countByGroupId(groupId);
	}
	
	protected void validate(String name) throws PortalException {
	    if (Validator.isNull(name)) {
	        throw new FormContattoNameException();
	    }
	}
}