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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for FormContatto. This utility wraps
 * <code>com.liferay.docs.formcontatto.service.impl.FormContattoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Bruno De Boni
 * @see FormContattoLocalService
 * @generated
 */
@ProviderType
public class FormContattoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.docs.formcontatto.service.impl.FormContattoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the form contatto to the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was added
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
		addFormContatto(
			com.liferay.docs.formcontatto.model.FormContatto formContatto) {

		return getService().addFormContatto(formContatto);
	}

	public static com.liferay.docs.formcontatto.model.FormContatto
			addFormContatto(
				long userId, String name,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addFormContatto(userId, name, serviceContext);
	}

	/**
	 * Creates a new form contatto with the primary key. Does not add the form contatto to the database.
	 *
	 * @param formContattoId the primary key for the new form contatto
	 * @return the new form contatto
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
		createFormContatto(long formContattoId) {

		return getService().createFormContatto(formContattoId);
	}

	/**
	 * Deletes the form contatto from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was removed
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
		deleteFormContatto(
			com.liferay.docs.formcontatto.model.FormContatto formContatto) {

		return getService().deleteFormContatto(formContatto);
	}

	/**
	 * Deletes the form contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto that was removed
	 * @throws PortalException if a form contatto with the primary key could not be found
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
			deleteFormContatto(long formContattoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteFormContatto(formContattoId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.docs.formcontatto.model.FormContatto
		fetchFormContatto(long formContattoId) {

		return getService().fetchFormContatto(formContattoId);
	}

	/**
	 * Returns the form contatto matching the UUID and group.
	 *
	 * @param uuid the form contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
		fetchFormContattoByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchFormContattoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the form contatto with the primary key.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto
	 * @throws PortalException if a form contatto with the primary key could not be found
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
			getFormContatto(long formContattoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFormContatto(formContattoId);
	}

	/**
	 * Returns the form contatto matching the UUID and group.
	 *
	 * @param uuid the form contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form contatto
	 * @throws PortalException if a matching form contatto could not be found
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
			getFormContattoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFormContattoByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List
		<com.liferay.docs.formcontatto.model.FormContatto> getFormContattos(
			int start, int end) {

		return getService().getFormContattos(start, end);
	}

	/**
	 * Returns all the form contattos matching the UUID and company.
	 *
	 * @param uuid the UUID of the form contattos
	 * @param companyId the primary key of the company
	 * @return the matching form contattos, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.liferay.docs.formcontatto.model.FormContatto>
			getFormContattosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getFormContattosByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List
		<com.liferay.docs.formcontatto.model.FormContatto>
			getFormContattosByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.docs.formcontatto.model.FormContatto>
						orderByComparator) {

		return getService().getFormContattosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of form contattos.
	 *
	 * @return the number of form contattos
	 */
	public static int getFormContattosCount() {
		return getService().getFormContattosCount();
	}

	public static java.util.List
		<com.liferay.docs.formcontatto.model.FormContatto> getFormsContatto(
			long groupId) {

		return getService().getFormsContatto(groupId);
	}

	public static java.util.List
		<com.liferay.docs.formcontatto.model.FormContatto> getFormsContatto(
			long groupId, int start, int end) {

		return getService().getFormsContatto(groupId, start, end);
	}

	public static java.util.List
		<com.liferay.docs.formcontatto.model.FormContatto> getFormsContatto(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.formcontatto.model.FormContatto> obc) {

		return getService().getFormsContatto(groupId, start, end, obc);
	}

	public static int getFormsContattoCount(long groupId) {
		return getService().getFormsContattoCount(groupId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the form contatto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param formContatto the form contatto
	 * @return the form contatto that was updated
	 */
	public static com.liferay.docs.formcontatto.model.FormContatto
		updateFormContatto(
			com.liferay.docs.formcontatto.model.FormContatto formContatto) {

		return getService().updateFormContatto(formContatto);
	}

	public static FormContattoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<FormContattoLocalService, FormContattoLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FormContattoLocalService.class);

		ServiceTracker<FormContattoLocalService, FormContattoLocalService>
			serviceTracker =
				new ServiceTracker
					<FormContattoLocalService, FormContattoLocalService>(
						bundle.getBundleContext(),
						FormContattoLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}