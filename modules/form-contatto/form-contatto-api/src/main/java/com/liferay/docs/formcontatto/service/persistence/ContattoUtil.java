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

import com.liferay.docs.formcontatto.model.Contatto;
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
 * The persistence utility for the contatto service. This utility wraps <code>com.liferay.docs.formcontatto.service.persistence.impl.ContattoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bruno De Boni
 * @see ContattoPersistence
 * @generated
 */
@ProviderType
public class ContattoUtil {

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
	public static void clearCache(Contatto contatto) {
		getPersistence().clearCache(contatto);
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
	public static Map<Serializable, Contatto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contatto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contatto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contatto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contatto update(Contatto contatto) {
		return getPersistence().update(contatto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contatto update(
		Contatto contatto, ServiceContext serviceContext) {

		return getPersistence().update(contatto, serviceContext);
	}

	/**
	 * Returns all the contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contattos
	 */
	public static List<Contatto> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the contattos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @return the range of matching contattos
	 */
	public static List<Contatto> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the contattos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contattos
	 */
	public static List<Contatto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contattos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contattos
	 */
	public static List<Contatto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByUuid_First(
			String uuid, OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByUuid_First(
		String uuid, OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByUuid_Last(
			String uuid, OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByUuid_Last(
		String uuid, OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the contattos before and after the current contatto in the ordered set where uuid = &#63;.
	 *
	 * @param contattoId the primary key of the current contatto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contatto
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public static Contatto[] findByUuid_PrevAndNext(
			long contattoId, String uuid,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUuid_PrevAndNext(
			contattoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the contattos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contattos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the contatto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContattoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the contatto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contatto that was removed
	 */
	public static Contatto removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of contattos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contattos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contattos
	 */
	public static List<Contatto> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @return the range of matching contattos
	 */
	public static List<Contatto> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contattos
	 */
	public static List<Contatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contattos
	 */
	public static List<Contatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the contattos before and after the current contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param contattoId the primary key of the current contatto
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contatto
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public static Contatto[] findByUuid_C_PrevAndNext(
			long contattoId, String uuid, long companyId,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			contattoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the contattos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contattos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @return the matching contattos
	 */
	public static List<Contatto> findByG_FC(long groupId, long formContattoId) {
		return getPersistence().findByG_FC(groupId, formContattoId);
	}

	/**
	 * Returns a range of all the contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @return the range of matching contattos
	 */
	public static List<Contatto> findByG_FC(
		long groupId, long formContattoId, int start, int end) {

		return getPersistence().findByG_FC(groupId, formContattoId, start, end);
	}

	/**
	 * Returns an ordered range of all the contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contattos
	 */
	public static List<Contatto> findByG_FC(
		long groupId, long formContattoId, int start, int end,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().findByG_FC(
			groupId, formContattoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contattos
	 */
	public static List<Contatto> findByG_FC(
		long groupId, long formContattoId, int start, int end,
		OrderByComparator<Contatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_FC(
			groupId, formContattoId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByG_FC_First(
			long groupId, long formContattoId,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByG_FC_First(
			groupId, formContattoId, orderByComparator);
	}

	/**
	 * Returns the first contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByG_FC_First(
		long groupId, long formContattoId,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().fetchByG_FC_First(
			groupId, formContattoId, orderByComparator);
	}

	/**
	 * Returns the last contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public static Contatto findByG_FC_Last(
			long groupId, long formContattoId,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByG_FC_Last(
			groupId, formContattoId, orderByComparator);
	}

	/**
	 * Returns the last contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public static Contatto fetchByG_FC_Last(
		long groupId, long formContattoId,
		OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().fetchByG_FC_Last(
			groupId, formContattoId, orderByComparator);
	}

	/**
	 * Returns the contattos before and after the current contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param contattoId the primary key of the current contatto
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contatto
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public static Contatto[] findByG_FC_PrevAndNext(
			long contattoId, long groupId, long formContattoId,
			OrderByComparator<Contatto> orderByComparator)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByG_FC_PrevAndNext(
			contattoId, groupId, formContattoId, orderByComparator);
	}

	/**
	 * Removes all the contattos where groupId = &#63; and formContattoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 */
	public static void removeByG_FC(long groupId, long formContattoId) {
		getPersistence().removeByG_FC(groupId, formContattoId);
	}

	/**
	 * Returns the number of contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @return the number of matching contattos
	 */
	public static int countByG_FC(long groupId, long formContattoId) {
		return getPersistence().countByG_FC(groupId, formContattoId);
	}

	/**
	 * Caches the contatto in the entity cache if it is enabled.
	 *
	 * @param contatto the contatto
	 */
	public static void cacheResult(Contatto contatto) {
		getPersistence().cacheResult(contatto);
	}

	/**
	 * Caches the contattos in the entity cache if it is enabled.
	 *
	 * @param contattos the contattos
	 */
	public static void cacheResult(List<Contatto> contattos) {
		getPersistence().cacheResult(contattos);
	}

	/**
	 * Creates a new contatto with the primary key. Does not add the contatto to the database.
	 *
	 * @param contattoId the primary key for the new contatto
	 * @return the new contatto
	 */
	public static Contatto create(long contattoId) {
		return getPersistence().create(contattoId);
	}

	/**
	 * Removes the contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto that was removed
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public static Contatto remove(long contattoId)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().remove(contattoId);
	}

	public static Contatto updateImpl(Contatto contatto) {
		return getPersistence().updateImpl(contatto);
	}

	/**
	 * Returns the contatto with the primary key or throws a <code>NoSuchContattoException</code> if it could not be found.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public static Contatto findByPrimaryKey(long contattoId)
		throws com.liferay.docs.formcontatto.exception.NoSuchContattoException {

		return getPersistence().findByPrimaryKey(contattoId);
	}

	/**
	 * Returns the contatto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto, or <code>null</code> if a contatto with the primary key could not be found
	 */
	public static Contatto fetchByPrimaryKey(long contattoId) {
		return getPersistence().fetchByPrimaryKey(contattoId);
	}

	/**
	 * Returns all the contattos.
	 *
	 * @return the contattos
	 */
	public static List<Contatto> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @return the range of contattos
	 */
	public static List<Contatto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contattos
	 */
	public static List<Contatto> findAll(
		int start, int end, OrderByComparator<Contatto> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contattos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ContattoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contattos
	 * @param end the upper bound of the range of contattos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contattos
	 */
	public static List<Contatto> findAll(
		int start, int end, OrderByComparator<Contatto> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the contattos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contattos.
	 *
	 * @return the number of contattos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContattoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContattoPersistence, ContattoPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContattoPersistence.class);

		ServiceTracker<ContattoPersistence, ContattoPersistence>
			serviceTracker =
				new ServiceTracker<ContattoPersistence, ContattoPersistence>(
					bundle.getBundleContext(), ContattoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}