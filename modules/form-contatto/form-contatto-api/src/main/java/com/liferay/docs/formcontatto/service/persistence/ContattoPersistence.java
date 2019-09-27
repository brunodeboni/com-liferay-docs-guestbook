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

import com.liferay.docs.formcontatto.exception.NoSuchContattoException;
import com.liferay.docs.formcontatto.model.Contatto;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contatto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bruno De Boni
 * @see ContattoUtil
 * @generated
 */
@ProviderType
public interface ContattoPersistence extends BasePersistence<Contatto> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContattoUtil} to access the contatto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contattos
	 */
	public java.util.List<Contatto> findByUuid(String uuid);

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
	public java.util.List<Contatto> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Contatto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

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
	public java.util.List<Contatto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

	/**
	 * Returns the contattos before and after the current contatto in the ordered set where uuid = &#63;.
	 *
	 * @param contattoId the primary key of the current contatto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contatto
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public Contatto[] findByUuid_PrevAndNext(
			long contattoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Removes all the contattos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contattos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the contatto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContattoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByUUID_G(String uuid, long groupId)
		throws NoSuchContattoException;

	/**
	 * Returns the contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the contatto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contatto that was removed
	 */
	public Contatto removeByUUID_G(String uuid, long groupId)
		throws NoSuchContattoException;

	/**
	 * Returns the number of contattos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contattos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contattos
	 */
	public java.util.List<Contatto> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Contatto> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Contatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

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
	public java.util.List<Contatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Returns the first contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Returns the last contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

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
	public Contatto[] findByUuid_C_PrevAndNext(
			long contattoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Removes all the contattos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contattos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @return the matching contattos
	 */
	public java.util.List<Contatto> findByG_FC(
		long groupId, long formContattoId);

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
	public java.util.List<Contatto> findByG_FC(
		long groupId, long formContattoId, int start, int end);

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
	public java.util.List<Contatto> findByG_FC(
		long groupId, long formContattoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

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
	public java.util.List<Contatto> findByG_FC(
		long groupId, long formContattoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByG_FC_First(
			long groupId, long formContattoId,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Returns the first contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByG_FC_First(
		long groupId, long formContattoId,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

	/**
	 * Returns the last contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto
	 * @throws NoSuchContattoException if a matching contatto could not be found
	 */
	public Contatto findByG_FC_Last(
			long groupId, long formContattoId,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Returns the last contatto in the ordered set where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contatto, or <code>null</code> if a matching contatto could not be found
	 */
	public Contatto fetchByG_FC_Last(
		long groupId, long formContattoId,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

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
	public Contatto[] findByG_FC_PrevAndNext(
			long contattoId, long groupId, long formContattoId,
			com.liferay.portal.kernel.util.OrderByComparator<Contatto>
				orderByComparator)
		throws NoSuchContattoException;

	/**
	 * Removes all the contattos where groupId = &#63; and formContattoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 */
	public void removeByG_FC(long groupId, long formContattoId);

	/**
	 * Returns the number of contattos where groupId = &#63; and formContattoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param formContattoId the form contatto ID
	 * @return the number of matching contattos
	 */
	public int countByG_FC(long groupId, long formContattoId);

	/**
	 * Caches the contatto in the entity cache if it is enabled.
	 *
	 * @param contatto the contatto
	 */
	public void cacheResult(Contatto contatto);

	/**
	 * Caches the contattos in the entity cache if it is enabled.
	 *
	 * @param contattos the contattos
	 */
	public void cacheResult(java.util.List<Contatto> contattos);

	/**
	 * Creates a new contatto with the primary key. Does not add the contatto to the database.
	 *
	 * @param contattoId the primary key for the new contatto
	 * @return the new contatto
	 */
	public Contatto create(long contattoId);

	/**
	 * Removes the contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto that was removed
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public Contatto remove(long contattoId) throws NoSuchContattoException;

	public Contatto updateImpl(Contatto contatto);

	/**
	 * Returns the contatto with the primary key or throws a <code>NoSuchContattoException</code> if it could not be found.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto
	 * @throws NoSuchContattoException if a contatto with the primary key could not be found
	 */
	public Contatto findByPrimaryKey(long contattoId)
		throws NoSuchContattoException;

	/**
	 * Returns the contatto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contattoId the primary key of the contatto
	 * @return the contatto, or <code>null</code> if a contatto with the primary key could not be found
	 */
	public Contatto fetchByPrimaryKey(long contattoId);

	/**
	 * Returns all the contattos.
	 *
	 * @return the contattos
	 */
	public java.util.List<Contatto> findAll();

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
	public java.util.List<Contatto> findAll(int start, int end);

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
	public java.util.List<Contatto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator);

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
	public java.util.List<Contatto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the contattos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contattos.
	 *
	 * @return the number of contattos
	 */
	public int countAll();

}