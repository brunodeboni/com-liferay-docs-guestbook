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
 * Provides the local service utility for Contatto. This utility wraps
 * <code>com.liferay.docs.formcontatto.service.impl.ContattoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Bruno De Boni
 * @see ContattoLocalService
 * @generated
 */
@ProviderType
public class ContattoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.docs.formcontatto.service.impl.ContattoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the contatto to the database. Also notifies the appropriate model listeners.
	 *
	 * @param contatto the contatto
	 * @return the contatto that was added
	 */
	public static com.liferay.docs.formcontatto.model.Contatto addContatto(
		com.liferay.docs.formcontatto.model.Contatto contatto) {

		return getService().addContatto(contatto);
	}

	public static com.liferay.docs.formcontatto.model.Contatto addContatto(
			long userId, long formContattoId, String nome, String cognome,
			String email,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addContatto(
			userId, formContattoId, nome, cognome, email, serviceContext);
	}

	/**
	 * Creates a new contatto with the primary key. Does not add the contatto to the database.
	 *
	 * @param contattoId the primary key for the new contatto
	 * @return the new contatto
	 */
	public static com.liferay.docs.formcontatto.model.Contatto createContatto(
		long contattoId) {

		return getService().createContatto(contattoId);
	}

	/**
	 * Deletes the contatto from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contatto the contatto
	 * @return the contatto that was removed
	 */
	public static com.liferay.docs.formcontatto.model.Contatto deleteContatto(
		com.liferay.docs.formcontatto.model.Contatto contatto) {

		return getService().deleteContatto(contatto);
	}

	/**
	 * Deletes the contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto that was removed
	 * @throws PortalException if a contatto with the primary key could not be found
	 */
	public static com.liferay.docs.formcontatto.model.Contatto deleteContatto(
			long contattoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteContatto(contattoId);
	}

	public static com.liferay.docs.formcontatto.model.Contatto deleteContatto(
			long contattoId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteContatto(contattoId, serviceContext);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.formcontatto.model.impl.ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.formcontatto.model.impl.ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.docs.formcontatto.model.Contatto fetchContatto(
		long contattoId) {

		return getService().fetchContatto(contattoId);
	}

	/**
	 * Returns the contatto matching the UUID and group.
	 *
	 * @param uuid the contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static com.liferay.docs.formcontatto.model.Contatto
		fetchContattoByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchContattoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<com.liferay.docs.formcontatto.model.Contatto>
		getContatti(long groupId, long formContattoId) {

		return getService().getContatti(groupId, formContattoId);
	}

	public static java.util.List<com.liferay.docs.formcontatto.model.Contatto>
			getContatti(long groupId, long formContattoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getContatti(groupId, formContattoId, start, end);
	}

	public static java.util.List<com.liferay.docs.formcontatto.model.Contatto>
		getContatti(
			long groupId, long formContattoId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.formcontatto.model.Contatto> obc) {

		return getService().getContatti(
			groupId, formContattoId, start, end, obc);
	}

	public static int getContattiCount(long groupId, long formContattoId) {
		return getService().getContattiCount(groupId, formContattoId);
	}

	/**
	 * Returns the contatto with the primary key.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto
	 * @throws PortalException if a contatto with the primary key could not be found
	 */
	public static com.liferay.docs.formcontatto.model.Contatto getContatto(
			long contattoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getContatto(contattoId);
	}

	/**
	 * Returns the contatto matching the UUID and group.
	 *
	 * @param uuid the contatto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contatto
	 * @throws PortalException if a matching contatto could not be found
	 */
	public static com.liferay.docs.formcontatto.model.Contatto
			getContattoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getContattoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.formcontatto.model.impl.ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @return the range of contattos
	 */
	public static java.util.List<com.liferay.docs.formcontatto.model.Contatto>
		getContattos(int start, int end) {

		return getService().getContattos(start, end);
	}

	/**
	 * Returns all the contattos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contattos
	 * @param companyId the primary key of the company
	 * @return the matching contattos, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.docs.formcontatto.model.Contatto>
		getContattosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getContattosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of contattos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contattos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching contattos, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.docs.formcontatto.model.Contatto>
		getContattosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.formcontatto.model.Contatto>
					orderByComparator) {

		return getService().getContattosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contattos.
	 *
	 * @return the number of contattos
	 */
	public static int getContattosCount() {
		return getService().getContattosCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the contatto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param contatto the contatto
	 * @return the contatto that was updated
	 */
	public static com.liferay.docs.formcontatto.model.Contatto updateContatto(
		com.liferay.docs.formcontatto.model.Contatto contatto) {

		return getService().updateContatto(contatto);
	}

	public static com.liferay.docs.formcontatto.model.Contatto updateContatto(
			long userId, long formContattoId, long contattoId, String nome,
			String cognome, String email,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateContatto(
			userId, formContattoId, contattoId, nome, cognome, email,
			serviceContext);
	}

	public static ContattoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContattoLocalService, ContattoLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContattoLocalService.class);

		ServiceTracker<ContattoLocalService, ContattoLocalService>
			serviceTracker =
				new ServiceTracker<ContattoLocalService, ContattoLocalService>(
					bundle.getBundleContext(), ContattoLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}