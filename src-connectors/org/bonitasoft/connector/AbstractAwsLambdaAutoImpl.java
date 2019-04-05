/**
 * 
 */
package org.bonitasoft.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

/**
 * This abstract class is generated and should not be modified.
 */
public abstract class AbstractAwsLambdaAutoImpl extends AbstractConnector {

	protected final static String REGION_INPUT_PARAMETER = "region";
	protected final static String ACCESSKEYID_INPUT_PARAMETER = "accessKeyId";
	protected final static String SECRETACCESSKEY_INPUT_PARAMETER = "secretAccessKey";
	protected final static String SDKCLIENTEXECUTIONTIMEOUT_INPUT_PARAMETER = "sdkClientExecutionTimeout";
	protected final static String FUNCTIONNAME_INPUT_PARAMETER = "functionName";
	protected final static String JAR_INPUT_PARAMETER = "jar";
	protected final static String ROLE_INPUT_PARAMETER = "role";
	protected final static String HANDLER_INPUT_PARAMETER = "handler";
	protected final static String PAYLOAD_INPUT_PARAMETER = "payload";
	protected final static String CLIENTCONTEXT_INPUT_PARAMETER = "clientContext";
	protected final static String INVOCATIONTYPE_INPUT_PARAMETER = "invocationType";
	protected final static String LOGTYPE_INPUT_PARAMETER = "logType";
	protected final static String SDKREQUESTTIMEOUT_INPUT_PARAMETER = "sdkRequestTimeout";
	protected final String STATUSCODE_OUTPUT_PARAMETER = "statusCode";
	protected final String CONTENT_OUTPUT_PARAMETER = "content";
	protected final String EXECUTEDVERSION_OUTPUT_PARAMETER = "executedVersion";
	protected final String FUNCTIONERROR_OUTPUT_PARAMETER = "functionError";
	protected final String LOGRESULT_OUTPUT_PARAMETER = "logResult";

	protected final java.lang.String getRegion() {
		return (java.lang.String) getInputParameter(REGION_INPUT_PARAMETER);
	}

	protected final java.lang.String getAccessKeyId() {
		return (java.lang.String) getInputParameter(ACCESSKEYID_INPUT_PARAMETER);
	}

	protected final java.lang.String getSecretAccessKey() {
		return (java.lang.String) getInputParameter(SECRETACCESSKEY_INPUT_PARAMETER);
	}

	protected final java.lang.Integer getSdkClientExecutionTimeout() {
		return (java.lang.Integer) getInputParameter(SDKCLIENTEXECUTIONTIMEOUT_INPUT_PARAMETER);
	}

	protected final java.lang.String getFunctionName() {
		return (java.lang.String) getInputParameter(FUNCTIONNAME_INPUT_PARAMETER);
	}

	protected final java.lang.String getJar() {
		return (java.lang.String) getInputParameter(JAR_INPUT_PARAMETER);
	}

	protected final java.lang.String getRole() {
		return (java.lang.String) getInputParameter(ROLE_INPUT_PARAMETER);
	}

	protected final java.lang.String getHandler() {
		return (java.lang.String) getInputParameter(HANDLER_INPUT_PARAMETER);
	}

	protected final java.lang.String getPayload() {
		return (java.lang.String) getInputParameter(PAYLOAD_INPUT_PARAMETER);
	}

	protected final java.lang.String getClientContext() {
		return (java.lang.String) getInputParameter(CLIENTCONTEXT_INPUT_PARAMETER);
	}

	protected final java.lang.String getInvocationType() {
		return (java.lang.String) getInputParameter(INVOCATIONTYPE_INPUT_PARAMETER);
	}

	protected final java.lang.String getLogType() {
		return (java.lang.String) getInputParameter(LOGTYPE_INPUT_PARAMETER);
	}

	protected final java.lang.Integer getSdkRequestTimeout() {
		return (java.lang.Integer) getInputParameter(SDKREQUESTTIMEOUT_INPUT_PARAMETER);
	}

	protected final void setStatusCode(java.lang.Integer statusCode) {
		setOutputParameter(STATUSCODE_OUTPUT_PARAMETER, statusCode);
	}

	protected final void setContent(java.lang.String content) {
		setOutputParameter(CONTENT_OUTPUT_PARAMETER, content);
	}

	protected final void setExecutedVersion(java.lang.String executedVersion) {
		setOutputParameter(EXECUTEDVERSION_OUTPUT_PARAMETER, executedVersion);
	}

	protected final void setFunctionError(java.lang.String functionError) {
		setOutputParameter(FUNCTIONERROR_OUTPUT_PARAMETER, functionError);
	}

	protected final void setLogResult(java.lang.String logResult) {
		setOutputParameter(LOGRESULT_OUTPUT_PARAMETER, logResult);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getRegion();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("region type is invalid");
		}
		try {
			getAccessKeyId();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("accessKeyId type is invalid");
		}
		try {
			getSecretAccessKey();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("secretAccessKey type is invalid");
		}
		try {
			getSdkClientExecutionTimeout();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("sdkClientExecutionTimeout type is invalid");
		}
		try {
			getFunctionName();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("functionName type is invalid");
		}
		try {
			getJar();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("jar type is invalid");
		}
		try {
			getRole();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("role type is invalid");
		}
		try {
			getHandler();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("handler type is invalid");
		}
		try {
			getPayload();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("payload type is invalid");
		}
		try {
			getClientContext();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("clientContext type is invalid");
		}
		try {
			getInvocationType();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("invocationType type is invalid");
		}
		try {
			getLogType();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("logType type is invalid");
		}
		try {
			getSdkRequestTimeout();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("sdkRequestTimeout type is invalid");
		}

	}

}
