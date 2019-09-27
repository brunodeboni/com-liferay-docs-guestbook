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

import com.liferay.docs.formcontatto.exception.ContattoCognomeException;
import com.liferay.docs.formcontatto.exception.ContattoEmailException;
import com.liferay.docs.formcontatto.exception.ContattoNomeException;
import com.liferay.docs.formcontatto.model.Contatto;
import com.liferay.docs.formcontatto.service.base.ContattoLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the contatto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.docs.formcontatto.service.ContattoLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Bruno De Boni
 * @see ContattoLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.docs.formcontatto.model.Contatto",
	service = AopService.class
)
public class ContattoLocalServiceImpl extends ContattoLocalServiceBaseImpl {

	public Contatto addContatto(
	    long userId, long formContattoId, String nome, String cognome, String email, 
	    ServiceContext serviceContext)
	    throws PortalException {

	    long groupId = serviceContext.getScopeGroupId();

	    User user = userLocalService.getUserById(userId);

	    Date now = new Date();

	    validate(nome, cognome, email);

	    long contattoId = counterLocalService.increment();

	    Contatto contatto = contattoPersistence.create(contattoId);

	    contatto.setUuid(serviceContext.getUuid());
	    contatto.setUserId(userId);
	    contatto.setGroupId(groupId);
	    contatto.setCompanyId(user.getCompanyId());
	    contatto.setUserName(user.getFullName());
	    contatto.setCreateDate(serviceContext.getCreateDate(now));
	    contatto.setModifiedDate(serviceContext.getModifiedDate(now));
	    contatto.setExpandoBridgeAttributes(serviceContext);
	    contatto.setFormContattoId(formContattoId);
	    contatto.setNome(nome);
	    contatto.setCognome(cognome);
	    contatto.setEmail(email);

	    contattoPersistence.update(contatto);

	    return contatto;
	}
	
	public Contatto updateContatto (
	    long userId, long formContattoId, long contattoId, String nome, String cognome, String email,
	    ServiceContext serviceContext)
	    throws PortalException, SystemException {

	    Date now = new Date();

	    validate(nome, cognome, email);

	    Contatto contatto = getContatto(contattoId);

	    User user = userLocalService.getUserById(userId);

	    contatto.setUserId(userId);
	    contatto.setUserName(user.getFullName());
	    contatto.setModifiedDate(serviceContext.getModifiedDate(now));
	    contatto.setNome(nome);
	    contatto.setCognome(cognome);
	    contatto.setEmail(email);
	    contatto.setExpandoBridgeAttributes(serviceContext);

	    contattoPersistence.update(contatto);

	    return contatto;
	}
	
	public Contatto deleteContatto (long contattoId, ServiceContext serviceContext)
	    throws PortalException {

		Contatto contatto = getContatto(contattoId);

		contatto = deleteContatto(contattoId);

	    return contatto;
	}
	
	public List<Contatto> getContatti(long groupId, long formContattoId) {
	    return contattoPersistence.findByG_FC(groupId, formContattoId);
	}

	public List<Contatto> getContatti(long groupId, long formContattoId, int start, int end)
	    throws SystemException {

	    return contattoPersistence.findByG_FC(groupId, formContattoId, start, end);
	}

	public List<Contatto> getContatti(
	    long groupId, long formContattoId, int start, int end, OrderByComparator<Contatto> obc) {

	    return contattoPersistence.findByG_FC(groupId, formContattoId, start, end, obc);
	}

	public int getContattiCount(long groupId, long formContattoId) {
	    return contattoPersistence.countByG_FC(groupId, formContattoId);
	}
	
	protected void validate(String nome, String cognome, String email)
	    throws PortalException {

	    if (Validator.isNull(nome)) {
	        throw new ContattoNomeException("Inserisci il nome.");
	    }

	    if (Validator.isNull(cognome)) {
	        throw new ContattoCognomeException("Inserisci il cognome.");
	    }

	    if (!Validator.isEmailAddress(email)) {
	        throw new ContattoEmailException("Inserisci un indirizzo email valido.");
	    }
	}
}