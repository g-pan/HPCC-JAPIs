package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ActivatePackageResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.660Z
 */
public class ActivatePackageResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected BasePackageStatusWrapper local_status;

	public ActivatePackageResponseWrapper() {}

	public ActivatePackageResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse activatepackageresponse)
	{
		copy( activatepackageresponse );
	}
	public ActivatePackageResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status )
	{
		this.local_exceptions = _exceptions;
		this.local_status = _status;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getStatus() != null)
			this.local_status = new BasePackageStatusWrapper( raw.getStatus());

	}

	@Override
	public String toString()
	{
		return "ActivatePackageResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse();
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setStatus( BasePackageStatusWrapper _status )
	{
		this.local_status = _status;
	}
	public BasePackageStatusWrapper getStatus( )
	{
		return this.local_status;
	}
}