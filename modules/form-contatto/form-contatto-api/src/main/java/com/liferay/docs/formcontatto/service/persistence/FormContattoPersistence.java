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

import com.liferay.docs.formcontatto.exception.NoSuchFormContattoException;
import com.liferay.docs.formcontatto.model.FormContatto;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the form contatto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bruno De Boni
 * @see FormContattoUtil
 * @generated
 */
@ProviderType
public interface FormContattoPersistence extends BasePersistence<FormContatto> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FormContattoUtil} to access the form contatto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the form contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching form contattos
	 */
	public java.util.List<FormContatto> findByUuid(String uuid);

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
	public java.util.List<FormContatto> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<FormContatto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

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
	public java.util.List<FormContatto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

	/**
	 * Returns the form contattos before and after the current form contatto in the ordered set where uuid = &#63;.
	 *
	 * @param formContattoId the primary key of the current form contatto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public FormContatto[] findByUuid_PrevAndNext(
			long formContattoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Removes all the form contattos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of form contattos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching form contattos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the form contatto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFormContattoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByUUID_G(String uuid, long groupId)
		throws NoSuchFormContattoException;

	/**
	 * Returns the form contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the form contatto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the form contatto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the form contatto that was removed
	 */
	public FormContatto removeByUUID_G(String uuid, long groupId)
		throws NoSuchFormContattoException;

	/**
	 * Returns the number of form contattos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching form contattos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching form contattos
	 */
	public java.util.List<FormContatto> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<FormContatto> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<FormContatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

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
	public java.util.List<FormContatto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Returns the first form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Returns the last form contatto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

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
	public FormContatto[] findByUuid_C_PrevAndNext(
			long formContattoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Removes all the form contattos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of form contattos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching form contattos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the form contattos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching form contattos
	 */
	public java.util.List<FormContatto> findByGroupId(long groupId);

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
	public java.util.List<FormContatto> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<FormContatto> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

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
	public java.util.List<FormContatto> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Returns the first form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

	/**
	 * Returns the last form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto
	 * @throws NoSuchFormContattoException if a matching form contatto could not be found
	 */
	public FormContatto findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Returns the last form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form contatto, or <code>null</code> if a matching form contatto could not be found
	 */
	public FormContatto fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

	/**
	 * Returns the form contattos before and after the current form contatto in the ordered set where groupId = &#63;.
	 *
	 * @param formContattoId the primary key of the current form contatto
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public FormContatto[] findByGroupId_PrevAndNext(
			long formContattoId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
				orderByComparator)
		throws NoSuchFormContattoException;

	/**
	 * Removes all the form contattos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of form contattos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching form contattos
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the form contatto in the entity cache if it is enabled.
	 *
	 * @param formContatto the form contatto
	 */
	public void cacheResult(FormContatto formContatto);

	/**
	 * Caches the form contattos in the entity cache if it is enabled.
	 *
	 * @param formContattos the form contattos
	 */
	public void cacheResult(java.util.List<FormContatto> formContattos);

	/**
	 * Creates a new form contatto with the primary key. Does not add the form contatto to the database.
	 *
	 * @param formContattoId the primary key for the new form contatto
	 * @return the new form contatto
	 */
	public FormContatto create(long formContattoId);

	/**
	 * Removes the form contatto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto that was removed
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public FormContatto remove(long formContattoId)
		throws NoSuchFormContattoException;

	public FormContatto updateImpl(FormContatto formContatto);

	/**
	 * Returns the form contatto with the primary key or throws a <code>NoSuchFormContattoException</code> if it could not be found.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto
	 * @throws NoSuchFormContattoException if a form contatto with the primary key could not be found
	 */
	public FormContatto findByPrimaryKey(long formContattoId)
		throws NoSuchFormContattoException;

	/**
	 * Returns the form contatto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param formContattoId the primary key of the form contatto
	 * @return the form contatto, or <code>null</code> if a form contatto with the primary key could not be found
	 */
	public FormContatto fetchByPrimaryKey(long formContattoId);

	/**
	 * Returns all the form contattos.
	 *
	 * @return the form contattos
	 */
	public java.util.List<FormContatto> findAll();

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
	public java.util.List<FormContatto> findAll(int start, int end);

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
	public java.util.List<FormContatto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator);

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
	public java.util.List<FormContatto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormContatto>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the form contattos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of form contattos.
	 *
	 * @return the number of form contattos
	 */
	public int countAll();

}