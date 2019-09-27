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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link FormContattoLocalService}.
 *
 * @author Bruno De Boni
 * @see FormContattoLocalService
 * @generated
 */
@ProviderType
public class FormContattoLocalServiceWrapper
	implements FormContattoLocalService,
			   ServiceWrapper<FormContattoLocalService> {

	public FormContattoLocalServiceWrapper(
		FormContattoLocalService formContattoLocalService) {

		_formContattoLocalService = formContattoLocalService;
	}

	/**
	 * Adds the form contatto to the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was added
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto addFormContatto(
		com.liferay.docs.formcontatto.model.FormContatto formContatto) {

		return _formContattoLocalService.addFormContatto(formContatto);
	}

	@Override
	public com.liferay.docs.formcontatto.model.FormContatto addFormContatto(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formContattoLocalService.addFormContatto(
			userId, name, serviceContext);
	}

	/**
	 * Creates a new form contatto with the primary key. Does not add the form contatto to the database.
	 *
	 * @param formContattoId the primary key for the new form contatto
	 * @return the new form contatto
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto createFormContatto(
		long formContattoId) {

		return _formContattoLocalService.createFormContatto(formContattoId);
	}

	/**
	 * Deletes the form contatto from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was removed
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto deleteFormContatto(
		com.liferay.docs.formcontatto.model.FormContatto formContatto) {

		return _formContattoLocalService.deleteFormContatto(formContatto);
	}

	/**
	 * Deletes the form contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto that was removed
	 * @throws PortalException if a form contatto with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto deleteFormContatto(
			long formContattoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formContattoLocalService.deleteFormContatto(formContattoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formContattoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _formContattoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formContattoLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _formContattoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _formContattoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formContattoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _formContattoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.formcontatto.model.FormContatto fetchFormContatto(
		long formContattoId) {

		return _formContattoLocalService.fetchFormContatto(formContattoId);
	}

	/**
	 * Returns the form contatto matching the UUID and group.
	 *
	 * @param uuid the form contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto
		fetchFormContattoByUuidAndGroupId(String uuid, long groupId) {

		return _formContattoLocalService.fetchFormContattoByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _formContattoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _formContattoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the form contatto with the primary key.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto
	 * @throws PortalException if a form contatto with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto getFormContatto(
			long formContattoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formContattoLocalService.getFormContatto(formContattoId);
	}

	/**
	 * Returns the form contatto matching the UUID and group.
	 *
	 * @param uuid the form contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form contatto
	 * @throws PortalException if a matching form contatto could not be found
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto
			getFormContattoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formContattoLocalService.getFormContattoByUuidAndGroupId(
			uuid, groupId);
	}

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
	@Override
	public java.util.List<com.liferay.docs.formcontatto.model.FormContatto>
		getFormContattos(int start, int end) {

		return _formContattoLocalService.getFormContattos(start, end);
	}

	/**
	 * Returns all the form contattos matching the UUID and company.
	 *
	 * @param uuid the UUID of the form contattos
	 * @param companyId the primary key of the company
	 * @return the matching form contattos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.formcontatto.model.FormContatto>
		getFormContattosByUuidAndCompanyId(String uuid, long companyId) {

		return _formContattoLocalService.getFormContattosByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<com.liferay.docs.formcontatto.model.FormContatto>
		getFormContattosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.formcontatto.model.FormContatto>
					orderByComparator) {

		return _formContattoLocalService.getFormContattosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of form contattos.
	 *
	 * @return the number of form contattos
	 */
	@Override
	public int getFormContattosCount() {
		return _formContattoLocalService.getFormContattosCount();
	}

	@Override
	public java.util.List<com.liferay.docs.formcontatto.model.FormContatto>
		getFormsContatto(long groupId) {

		return _formContattoLocalService.getFormsContatto(groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.formcontatto.model.FormContatto>
		getFormsContatto(long groupId, int start, int end) {

		return _formContattoLocalService.getFormsContatto(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.formcontatto.model.FormContatto>
		getFormsContatto(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.formcontatto.model.FormContatto> obc) {

		return _formContattoLocalService.getFormsContatto(
			groupId, start, end, obc);
	}

	@Override
	public int getFormsContattoCount(long groupId) {
		return _formContattoLocalService.getFormsContattoCount(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _formContattoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _formContattoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formContattoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the form contatto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was updated
	 */
	@Override
	public com.liferay.docs.formcontatto.model.FormContatto updateFormContatto(
		com.liferay.docs.formcontatto.model.FormContatto formContatto) {

		return _formContattoLocalService.updateFormContatto(formContatto);
	}

	@Override
	public FormContattoLocalService getWrappedService() {
		return _formContattoLocalService;
	}

	@Override
	public void setWrappedService(
		FormContattoLocalService formContattoLocalService) {

		_formContattoLocalService = formContattoLocalService;
	}

	private FormContattoLocalService _formContattoLocalService;

}