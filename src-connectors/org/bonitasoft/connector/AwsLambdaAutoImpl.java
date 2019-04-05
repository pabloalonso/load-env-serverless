package org.bonitasoft.connector;

import java.nio.charset.StandardCharsets;

import org.bonitasoft.engine.connector.ConnectorException;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;

public class AwsLambdaAutoImpl extends AbstractAwsLambdaAutoImpl {

	@Override
	protected void executeBusinessLogic() throws ConnectorException {
		try {
			AWSLambdaClientBuilder clientBuilder = AWSLambdaClientBuilder
					.standard()
					.withRegion(Regions.fromName(getRegion()));
			
			if(!isEmptyOrNull(getAccessKeyId()) && !isEmptyOrNull(getSecretAccessKey())) {
				clientBuilder.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(getAccessKeyId(), getSecretAccessKey())));
			}
					
			AWSLambda client = clientBuilder.build();
	
			InvokeRequest request = new InvokeRequest()
					.withFunctionName(getFunctionName());
			
			if(!isEmptyOrNull(getPayload())) {
				request.withPayload(getPayload());
			}
			if(!isEmptyOrNull(getClientContext())) {
				request.withClientContext(getClientContext());
			}
			if(!isEmptyOrNull(getInvocationType())) {
				request.withInvocationType(getInvocationType());
			}
			if(!isEmptyOrNull(getLogType())) {
				request.withLogType(getLogType());
			}
	
			InvokeResult result = client.invoke(request);
	
			setStatusCode(result.getStatusCode());
			setContent(StandardCharsets.UTF_8.decode(result.getPayload()).toString());
			setExecutedVersion(result.getExecutedVersion());
			setFunctionError(result.getFunctionError());
			setLogResult(result.getLogResult());
		} catch(Throwable e) {
			throw new ConnectorException(e);
		}
	}
	
	private boolean isEmptyOrNull(Object value) {
		return value == null || value.toString().equals("null") || value.toString().isEmpty();
	}

	@Override
	public void connect() throws ConnectorException{}

	@Override
	public void disconnect() throws ConnectorException{}
}
