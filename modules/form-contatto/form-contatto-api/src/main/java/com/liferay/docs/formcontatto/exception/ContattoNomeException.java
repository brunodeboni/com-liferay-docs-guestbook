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
package com.liferay.docs.formcontatto.exception;

import org.osgi.annotation.versioning.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Bruno De Boni
 */
@ProviderType
public class ContattoNomeException extends PortalException {

	public ContattoNomeException() {
	}

	public ContattoNomeException(String msg) {
		super(msg);
	}

	public ContattoNomeException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ContattoNomeException(Throwable cause) {
		super(cause);
	}

}