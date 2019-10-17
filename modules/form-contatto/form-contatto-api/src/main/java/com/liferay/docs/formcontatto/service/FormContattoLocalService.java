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

package com.liferay.docs.formcontatto.service;

import com.liferay.docs.formcontatto.model.FormContatto;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for FormContatto. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Bruno De Boni
 * @see FormContattoLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface FormContattoLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FormContattoLocalServiceUtil} to access the form contatto local service. Add custom service methods to <code>com.liferay.docs.formcontatto.service.impl.FormContattoLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the form contatto to the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FormContatto addFormContatto(FormContatto formContatto);

	public FormContatto addFormContatto(
			long userId, String name, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new form contatto with the primary key. Does not add the form contatto to the database.
	 *
	 * @param formContattoId the primary key for the new form contatto
	 * @return the new form contatto
	 */
	@Transactional(enabled = false)
	public FormContatto createFormContatto(long formContattoId);

	/**
	 * Deletes the form contatto from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public FormContatto deleteFormContatto(FormContatto formContatto);
	
	/**
	 * Deletes the form contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto that was removed
	 * @throws PortalException if a form contatto with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public FormContatto deleteFormContatto(long formContattoId)
		throws PortalException;
	
	public FormContatto deleteFormContatto(
			long formContattoId, ServiceContext serviceContext)
		throws PortalException;
	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.formcontatto.model.impl.FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.formcontatto.model.impl.FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FormContatto fetchFormContatto(long formContattoId);

	/**
	 * Returns the form contatto matching the UUID and group.
	 *
	 * @param uuid the form contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FormContatto fetchFormContattoByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	/**
	 * Returns the form contatto with the primary key.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto
	 * @throws PortalException if a form contatto with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FormContatto getFormContatto(long formContattoId)
		throws PortalException;

	/**
	 * Returns the form contatto matching the UUID and group.
	 *
	 * @param uuid the form contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form contatto
	 * @throws PortalException if a matching form contatto could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FormContatto getFormContattoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the form contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.formcontatto.model.impl.FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @return the range of form contattos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FormContatto> getFormContattos(int start, int end);

	/**
	 * Returns all the form contattos matching the UUID and company.
	 *
	 * @param uuid the UUID of the form contattos
	 * @param companyId the primary key of the company
	 * @return the matching form contattos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FormContatto> getFormContattosByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of form contattos matching the UUID and company.
	 *
	 * @param uuid the UUID of the form contattos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching form contattos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FormContatto> getFormContattosByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FormContatto> orderByComparator);

	/**
	 * Returns the number of form contattos.
	 *
	 * @return the number of form contattos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFormContattosCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FormContatto> getFormsContatto(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FormContatto> getFormsContatto(
		long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FormContatto> getFormsContatto(
		long groupId, int start, int end, OrderByComparator<FormContatto> obc);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFormsContattoCount(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the form contatto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FormContatto updateFormContatto(FormContatto formContatto);
	
	public FormContatto updateFormContatto(
			long userId, long formContattoId, String name, ServiceContext serviceContext)
		throws PortalException;

}