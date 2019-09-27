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

package com.liferay.docs.formcontatto.service.persistence;

import com.liferay.docs.formcontatto.model.FormContatto;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the form contatto service. This utility wraps <code>com.liferay.docs.formcontatto.service.persistence.impl.FormContattoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bruno De Boni
 * @see FormContattoPersistence
 * @generated
 */
@ProviderType
public class FormContattoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FormContatto formContatto) {
		getPersistence().clearCache(formContatto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, FormContatto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FormContatto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FormContatto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FormContatto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FormContatto update(FormContatto formContatto) {
		return getPersistence().update(formContatto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FormContatto update(
		FormContatto formContatto, ServiceContext serviceContext) {

		return getPersistence().update(formContatto, serviceContext);
	}

	/**
	 * Returns all the form contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching form contattos
	 */
	public static List<FormContatto> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the form contattos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @return the range of matching form contattos
	 */
	public static List<FormContatto> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the form contattos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching form contattos
	 */
	public static List<FormContatto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the form contattos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching form contattos
	 */
	public static List<FormContatto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FormContatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByUuid_First(
			String uuid, OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByUuid_First(
		String uuid, OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByUuid_Last(
			String uuid, OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByUuid_Last(
		String uuid, OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the form contattos before and after the current form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param formContattoId the primary key of the current form contatto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public static FormContatto[] findByUuid_PrevAndNext(
			long formContattoId, String uuid,
			OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUuid_PrevAndNext(
			formContattoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the form contattos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of form contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching form contattos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the form contatto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFormContattoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the form contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the form contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the form contatto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the form contatto that was removed
	 */
	public static FormContatto removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of form contattos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching form contattos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching form contattos
	 */
	public static List<FormContatto> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @return the range of matching form contattos
	 */
	public static List<FormContatto> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching form contattos
	 */
	public static List<FormContatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching form contattos
	 */
	public static List<FormContatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FormContatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the form contattos before and after the current form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param formContattoId the primary key of the current form contatto
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public static FormContatto[] findByUuid_C_PrevAndNext(
			long formContattoId, String uuid, long companyId,
			OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			formContattoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the form contattos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching form contattos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the form contattos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching form contattos
	 */
	public static List<FormContatto> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the form contattos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @return the range of matching form contattos
	 */
	public static List<FormContatto> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the form contattos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching form contattos
	 */
	public static List<FormContatto> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the form contattos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching form contattos
	 */
	public static List<FormContatto> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<FormContatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByGroupId_First(
			long groupId, OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByGroupId_First(
		long groupId, OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public static FormContatto findByGroupId_Last(
			long groupId, OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public static FormContatto fetchByGroupId_Last(
		long groupId, OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the form contattos before and after the current form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param formContattoId the primary key of the current form contatto
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public static FormContatto[] findByGroupId_PrevAndNext(
			long formContattoId, long groupId,
			OrderByComparator<FormContatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByGroupId_PrevAndNext(
			formContattoId, groupId, orderByComparator);
	}

	/**
	 * Removes all the form contattos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of form contattos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching form contattos
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the form contatto in the entity cache if it is enabled.
	 *
	 * @param formContatto the form contatto
	 */
	public static void cacheResult(FormContatto formContatto) {
		getPersistence().cacheResult(formContatto);
	}

	/**
	 * Caches the form contattos in the entity cache if it is enabled.
	 *
	 * @param formContattos the form contattos
	 */
	public static void cacheResult(List<FormContatto> formContattos) {
		getPersistence().cacheResult(formContattos);
	}

	/**
	 * Creates a new form contatto with the primary key. Does not add the form contatto to the database.
	 *
	 * @param formContattoId the primary key for the new form contatto
	 * @return the new form contatto
	 */
	public static FormContatto create(long formContattoId) {
		return getPersistence().create(formContattoId);
	}

	/**
	 * Removes the form contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto that was removed
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public static FormContatto remove(long formContattoId)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().remove(formContattoId);
	}

	public static FormContatto updateImpl(FormContatto formContatto) {
		return getPersistence().updateImpl(formContatto);
	}

	/**
	 * Returns the form contatto with the primary key or throws a <code>NoSuchFormContattoException</code> if it could not be found.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public static FormContatto findByPrimaryKey(long formContattoId)
		throws com.liferay.docs.formcontatto.exception.
			NoSuchFormContattoException {

		return getPersistence().findByPrimaryKey(formContattoId);
	}

	/**
	 * Returns the form contatto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto, or <code>null</code> if a form contatto with the primary key could not be found
	 */
	public static FormContatto fetchByPrimaryKey(long formContattoId) {
		return getPersistence().fetchByPrimaryKey(formContattoId);
	}

	/**
	 * Returns all the form contattos.
	 *
	 * @return the form contattos
	 */
	public static List<FormContatto> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the form contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @return the range of form contattos
	 */
	public static List<FormContatto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the form contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of form contattos
	 */
	public static List<FormContatto> findAll(
		int start, int end, OrderByComparator<FormContatto> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the form contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>FormContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form contattos
	 * @param end the upper bound of the range of form contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of form contattos
	 */
	public static List<FormContatto> findAll(
		int start, int end, OrderByComparator<FormContatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the form contattos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of form contattos.
	 *
	 * @return the number of form contattos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FormContattoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<FormContattoPersistence, FormContattoPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FormContattoPersistence.class);

		ServiceTracker<FormContattoPersistence, FormContattoPersistence>
			serviceTracker =
				new ServiceTracker
					<FormContattoPersistence, FormContattoPersistence>(
						bundle.getBundleContext(),
						FormContattoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}