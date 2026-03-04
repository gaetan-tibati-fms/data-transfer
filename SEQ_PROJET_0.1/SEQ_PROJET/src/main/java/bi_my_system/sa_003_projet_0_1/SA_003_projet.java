// ============================================================================
//
// Copyright (c) 2006-2015, Talaxie SA.
//
// Le code source a été automatiquement généré par_Talaxie Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence").
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.


package bi_my_system.sa_003_projet_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: SA_003_projet Purpose: <br>
 * Description:  <br>
 * @author 
 * @version 202511
 * @status 
 */
public class SA_003_projet implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	

	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
		

	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(JOURNAL_password != null){
				
					this.setProperty("JOURNAL_password", JOURNAL_password.toString());
				
			}
			
			if(JOURNAL_Server != null){
				
					this.setProperty("JOURNAL_Server", JOURNAL_Server.toString());
				
			}
			
			if(JOURNAL_AdditionalParams != null){
				
					this.setProperty("JOURNAL_AdditionalParams", JOURNAL_AdditionalParams.toString());
				
			}
			
			if(JOURNAL_Schema != null){
				
					this.setProperty("JOURNAL_Schema", JOURNAL_Schema.toString());
				
			}
			
			if(JOURNAL_Login != null){
				
					this.setProperty("JOURNAL_Login", JOURNAL_Login.toString());
				
			}
			
			if(JOURNAL_Port != null){
				
					this.setProperty("JOURNAL_Port", JOURNAL_Port.toString());
				
			}
			
			if(JOURNAL_Database != null){
				
					this.setProperty("JOURNAL_Database", JOURNAL_Database.toString());
				
			}
			
			if(DWH_V1_Port != null){
				
					this.setProperty("DWH_V1_Port", DWH_V1_Port.toString());
				
			}
			
			if(DWH_V1_Server != null){
				
					this.setProperty("DWH_V1_Server", DWH_V1_Server.toString());
				
			}
			
			if(DWH_V1_Login != null){
				
					this.setProperty("DWH_V1_Login", DWH_V1_Login.toString());
				
			}
			
			if(DWH_V1_AdditionalParams != null){
				
					this.setProperty("DWH_V1_AdditionalParams", DWH_V1_AdditionalParams.toString());
				
			}
			
			if(DWH_V1_Schema != null){
				
					this.setProperty("DWH_V1_Schema", DWH_V1_Schema.toString());
				
			}
			
			if(DWH_V1_Database != null){
				
					this.setProperty("DWH_V1_Database", DWH_V1_Database.toString());
				
			}
			
			if(DWH_V1_Password != null){
				
					this.setProperty("DWH_V1_Password", DWH_V1_Password.toString());
				
			}
			
			if(SA_V1_Login != null){
				
					this.setProperty("SA_V1_Login", SA_V1_Login.toString());
				
			}
			
			if(SA_V1_Port != null){
				
					this.setProperty("SA_V1_Port", SA_V1_Port.toString());
				
			}
			
			if(SA_V1_AdditionalParams != null){
				
					this.setProperty("SA_V1_AdditionalParams", SA_V1_AdditionalParams.toString());
				
			}
			
			if(SA_V1_Schema != null){
				
					this.setProperty("SA_V1_Schema", SA_V1_Schema.toString());
				
			}
			
			if(SA_V1_Database != null){
				
					this.setProperty("SA_V1_Database", SA_V1_Database.toString());
				
			}
			
			if(SA_V1_Password != null){
				
					this.setProperty("SA_V1_Password", SA_V1_Password.toString());
				
			}
			
			if(SA_V1_Server != null){
				
					this.setProperty("SA_V1_Server", SA_V1_Server.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public java.lang.String JOURNAL_password;
public java.lang.String getJOURNAL_password(){
	return this.JOURNAL_password;
}
public String JOURNAL_Server;
public String getJOURNAL_Server(){
	return this.JOURNAL_Server;
}
public String JOURNAL_AdditionalParams;
public String getJOURNAL_AdditionalParams(){
	return this.JOURNAL_AdditionalParams;
}
public String JOURNAL_Schema;
public String getJOURNAL_Schema(){
	return this.JOURNAL_Schema;
}
public String JOURNAL_Login;
public String getJOURNAL_Login(){
	return this.JOURNAL_Login;
}
public String JOURNAL_Port;
public String getJOURNAL_Port(){
	return this.JOURNAL_Port;
}
public String JOURNAL_Database;
public String getJOURNAL_Database(){
	return this.JOURNAL_Database;
}
public String DWH_V1_Port;
public String getDWH_V1_Port(){
	return this.DWH_V1_Port;
}
public String DWH_V1_Server;
public String getDWH_V1_Server(){
	return this.DWH_V1_Server;
}
public String DWH_V1_Login;
public String getDWH_V1_Login(){
	return this.DWH_V1_Login;
}
public String DWH_V1_AdditionalParams;
public String getDWH_V1_AdditionalParams(){
	return this.DWH_V1_AdditionalParams;
}
public String DWH_V1_Schema;
public String getDWH_V1_Schema(){
	return this.DWH_V1_Schema;
}
public String DWH_V1_Database;
public String getDWH_V1_Database(){
	return this.DWH_V1_Database;
}
public java.lang.String DWH_V1_Password;
public java.lang.String getDWH_V1_Password(){
	return this.DWH_V1_Password;
}
public String SA_V1_Login;
public String getSA_V1_Login(){
	return this.SA_V1_Login;
}
public String SA_V1_Port;
public String getSA_V1_Port(){
	return this.SA_V1_Port;
}
public String SA_V1_AdditionalParams;
public String getSA_V1_AdditionalParams(){
	return this.SA_V1_AdditionalParams;
}
public String SA_V1_Schema;
public String getSA_V1_Schema(){
	return this.SA_V1_Schema;
}
public String SA_V1_Database;
public String getSA_V1_Database(){
	return this.SA_V1_Database;
}
public java.lang.String SA_V1_Password;
public java.lang.String getSA_V1_Password(){
	return this.SA_V1_Password;
}
public String SA_V1_Server;
public String getSA_V1_Server(){
	return this.SA_V1_Server;
}
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "SA_003_projet";
	private final String projectName = "BI_MY_SYSTEM";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	LogCatcherUtils talendLogs_LOGS = new LogCatcherUtils();
	StatCatcherUtils talendStats_STATS = new StatCatcherUtils("_yd6w0OxEEe6qZqdo9RrEAA", "0.1");
	MetterCatcherUtils talendMeter_METTER = new MetterCatcherUtils("_yd6w0OxEEe6qZqdo9RrEAA", "0.1");

private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	
	private String currentComponent = null;
	private String cLabel =  null;
	
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}
	
	private TalendException(Exception e, String errorComponent, String errorComponentLabel, final java.util.Map<String, Object> globalMap) {
		this(e, errorComponent, globalMap);
		this.cLabel = errorComponentLabel;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				SA_003_projet.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(SA_003_projet.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
				talendLogs_LOGS.addMessage("Java Exception", currentComponent, 6, e.getClass().getName() + ":" + e.getMessage(), 1);
				talendLogs_LOGSProcess(globalMap);
			}
			} catch (TalendException e) {
				// do nothing
			
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void preStaLogCon_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					preStaLogCon_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRESTClient_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tRESTClient_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tExtractJSONFields_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tRESTClient_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tRESTClient_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tRESTClient_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHttpRequest_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tExtractJSONFields_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHttpRequest_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tExtractJSONFields_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void connectionStatsLogs_Commit_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					connectionStatsLogs_Commit_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void connectionStatsLogs_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					connectionStatsLogs_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendStats_STATS_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendStats_DB_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendStats_DB_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendStats_STATS_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendLogs_LOGS_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendLogs_DB_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendLogs_DB_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendLogs_LOGS_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendMeter_METTER_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendMeter_DB_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendMeter_DB_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendMeter_METTER_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void preStaLogCon_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRESTClient_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
						}
					
					errorCode = null;
					tJava_2Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void connectionStatsLogs_Commit_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void connectionStatsLogs_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendStats_STATS_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendLogs_LOGS_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendMeter_METTER_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	






public void preStaLogConProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("preStaLogCon_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [preStaLogCon begin ] start
	 */

	

	
		
		ok_Hash.put("preStaLogCon", false);
		start_Hash.put("preStaLogCon", System.currentTimeMillis());
		
	
	currentComponent="preStaLogCon";
	
	
		int tos_count_preStaLogCon = 0;
		

 



/**
 * [preStaLogCon begin ] stop
 */
	
	/**
	 * [preStaLogCon main ] start
	 */

	

	
	
	currentComponent="preStaLogCon";
	
	

 


	tos_count_preStaLogCon++;

/**
 * [preStaLogCon main ] stop
 */
	
	/**
	 * [preStaLogCon process_data_begin ] start
	 */

	

	
	
	currentComponent="preStaLogCon";
	
	

 



/**
 * [preStaLogCon process_data_begin ] stop
 */
	
	/**
	 * [preStaLogCon process_data_end ] start
	 */

	

	
	
	currentComponent="preStaLogCon";
	
	

 



/**
 * [preStaLogCon process_data_end ] stop
 */
	
	/**
	 * [preStaLogCon end ] start
	 */

	

	
	
	currentComponent="preStaLogCon";
	
	

 

ok_Hash.put("preStaLogCon", true);
end_Hash.put("preStaLogCon", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("after_preStaLogCon_connectionStatsLogs", 0, "ok");
				}
				connectionStatsLogsProcess(globalMap);



/**
 * [preStaLogCon end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [preStaLogCon finally ] start
	 */

	

	
	
	currentComponent="preStaLogCon";
	
	

 



/**
 * [preStaLogCon finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("preStaLogCon_SUBPROCESS_STATE", 1);
	}
	


public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";
	
	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	


public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";
	
	
		int tos_count_tDBConnection_1 = 0;
		
	

	
			String url_tDBConnection_1 = "jdbc:jtds:sqlserver://" + context.SA_V1_Server ;
		String port_tDBConnection_1 = context.SA_V1_Port;
		String dbname_tDBConnection_1 = context.SA_V1_Database ;
    	if (!"".equals(port_tDBConnection_1)) {
    		url_tDBConnection_1 += ":" + context.SA_V1_Port;
    	}
    	if (!"".equals(dbname_tDBConnection_1)) {
    		
				url_tDBConnection_1 += "//" + context.SA_V1_Database; 
    	}

		url_tDBConnection_1 += ";appName=" + projectName + ";" + context.SA_V1_AdditionalParams;  
	String dbUser_tDBConnection_1 = context.SA_V1_Login;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.SA_V1_Password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
		
			String driverClass_tDBConnection_1 = "net.sourceforge.jtds.jdbc.Driver";
			java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
			globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);
		
			conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1,dbUser_tDBConnection_1,dbPwd_tDBConnection_1);

		globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("dbschema_tDBConnection_1", context.SA_V1_Schema);

	globalMap.put("db_tDBConnection_1",  context.SA_V1_Database);
	
	globalMap.put("shareIdentitySetting_tDBConnection_1",  false);

	globalMap.put("driver_tDBConnection_1", "JTDS");

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());




/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	


public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";
	
	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	


public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";
	
	
		int tos_count_tDBCommit_1 = 0;
		

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
		try{
	
			
			conn_tDBCommit_1.commit();
			
	
		}finally{
			
			conn_tDBCommit_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    }
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBClose_1Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	


public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_1", false);
		start_Hash.put("tDBClose_1", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_1";
	
	
		int tos_count_tDBClose_1 = 0;
		

 



/**
 * [tDBClose_1 begin ] stop
 */
	
	/**
	 * [tDBClose_1 main ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	



	java.sql.Connection conn_tDBClose_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBClose_1 != null && !conn_tDBClose_1.isClosed())
	{
        conn_tDBClose_1.close();
	}

 


	tos_count_tDBClose_1++;

/**
 * [tDBClose_1 main ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 



/**
 * [tDBClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 



/**
 * [tDBClose_1 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_1 end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 

ok_Hash.put("tDBClose_1", true);
end_Hash.put("tDBClose_1", System.currentTimeMillis());




/**
 * [tDBClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_1 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 



/**
 * [tDBClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}
	


public static class delete_insert_projetStruct implements routines.system.IPersistableRow<delete_insert_projetStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return 255;
				}
				public Integer id_projet_tpPrecision(){
				    return null;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				
			    public String nom_projet;

				public String getNom_projet () {
					return this.nom_projet;
				}

				public Boolean nom_projetIsNullable(){
				    return true;
				}
				public Boolean nom_projetIsKey(){
				    return false;
				}
				public Integer nom_projetLength(){
				    return 255;
				}
				public Integer nom_projetPrecision(){
				    return null;
				}
				public String nom_projetDefault(){
				
					return null;
				
				}
				public String nom_projetComment(){
				
				    return "";
				
				}
				public String nom_projetPattern(){
				
					return "";
				
				}
				public String nom_projetOriginalDbColumnName(){
				
					return "nom_projet";
				
				}

				
			    public String description;

				public String getDescription () {
					return this.description;
				}

				public Boolean descriptionIsNullable(){
				    return true;
				}
				public Boolean descriptionIsKey(){
				    return false;
				}
				public Integer descriptionLength(){
				    return 4000;
				}
				public Integer descriptionPrecision(){
				    return null;
				}
				public String descriptionDefault(){
				
					return null;
				
				}
				public String descriptionComment(){
				
				    return "";
				
				}
				public String descriptionPattern(){
				
					return "";
				
				}
				public String descriptionOriginalDbColumnName(){
				
					return "description";
				
				}

				
			    public String type_projet;

				public String getType_projet () {
					return this.type_projet;
				}

				public Boolean type_projetIsNullable(){
				    return true;
				}
				public Boolean type_projetIsKey(){
				    return false;
				}
				public Integer type_projetLength(){
				    return 255;
				}
				public Integer type_projetPrecision(){
				    return null;
				}
				public String type_projetDefault(){
				
					return null;
				
				}
				public String type_projetComment(){
				
				    return "";
				
				}
				public String type_projetPattern(){
				
					return "";
				
				}
				public String type_projetOriginalDbColumnName(){
				
					return "type_projet";
				
				}

				
			    public String sponsor;

				public String getSponsor () {
					return this.sponsor;
				}

				public Boolean sponsorIsNullable(){
				    return true;
				}
				public Boolean sponsorIsKey(){
				    return false;
				}
				public Integer sponsorLength(){
				    return 255;
				}
				public Integer sponsorPrecision(){
				    return null;
				}
				public String sponsorDefault(){
				
					return null;
				
				}
				public String sponsorComment(){
				
				    return "";
				
				}
				public String sponsorPattern(){
				
					return "";
				
				}
				public String sponsorOriginalDbColumnName(){
				
					return "sponsor";
				
				}

				
			    public String id_etat_projet;

				public String getId_etat_projet () {
					return this.id_etat_projet;
				}

				public Boolean id_etat_projetIsNullable(){
				    return true;
				}
				public Boolean id_etat_projetIsKey(){
				    return false;
				}
				public Integer id_etat_projetLength(){
				    return 255;
				}
				public Integer id_etat_projetPrecision(){
				    return null;
				}
				public String id_etat_projetDefault(){
				
					return null;
				
				}
				public String id_etat_projetComment(){
				
				    return "";
				
				}
				public String id_etat_projetPattern(){
				
					return "";
				
				}
				public String id_etat_projetOriginalDbColumnName(){
				
					return "id_etat_projet";
				
				}

				
			    public String libelle_etat_projet;

				public String getLibelle_etat_projet () {
					return this.libelle_etat_projet;
				}

				public Boolean libelle_etat_projetIsNullable(){
				    return true;
				}
				public Boolean libelle_etat_projetIsKey(){
				    return false;
				}
				public Integer libelle_etat_projetLength(){
				    return 255;
				}
				public Integer libelle_etat_projetPrecision(){
				    return null;
				}
				public String libelle_etat_projetDefault(){
				
					return null;
				
				}
				public String libelle_etat_projetComment(){
				
				    return "";
				
				}
				public String libelle_etat_projetPattern(){
				
					return "";
				
				}
				public String libelle_etat_projetOriginalDbColumnName(){
				
					return "libelle_etat_projet";
				
				}

				
			    public Integer priorite;

				public Integer getPriorite () {
					return this.priorite;
				}

				public Boolean prioriteIsNullable(){
				    return true;
				}
				public Boolean prioriteIsKey(){
				    return false;
				}
				public Integer prioriteLength(){
				    return null;
				}
				public Integer prioritePrecision(){
				    return null;
				}
				public String prioriteDefault(){
				
					return null;
				
				}
				public String prioriteComment(){
				
				    return "";
				
				}
				public String prioritePattern(){
				
					return "";
				
				}
				public String prioriteOriginalDbColumnName(){
				
					return "priorite";
				
				}

				
			    public String etiquette;

				public String getEtiquette () {
					return this.etiquette;
				}

				public Boolean etiquetteIsNullable(){
				    return true;
				}
				public Boolean etiquetteIsKey(){
				    return false;
				}
				public Integer etiquetteLength(){
				    return 255;
				}
				public Integer etiquettePrecision(){
				    return null;
				}
				public String etiquetteDefault(){
				
					return null;
				
				}
				public String etiquetteComment(){
				
				    return "";
				
				}
				public String etiquettePattern(){
				
					return "";
				
				}
				public String etiquetteOriginalDbColumnName(){
				
					return "etiquette";
				
				}

				
			    public String archive;

				public String getArchive () {
					return this.archive;
				}

				public Boolean archiveIsNullable(){
				    return true;
				}
				public Boolean archiveIsKey(){
				    return false;
				}
				public Integer archiveLength(){
				    return 255;
				}
				public Integer archivePrecision(){
				    return null;
				}
				public String archiveDefault(){
				
					return null;
				
				}
				public String archiveComment(){
				
				    return "";
				
				}
				public String archivePattern(){
				
					return "";
				
				}
				public String archiveOriginalDbColumnName(){
				
					return "archive";
				
				}

				
			    public java.util.Date date_insert;

				public java.util.Date getDate_insert () {
					return this.date_insert;
				}

				public Boolean date_insertIsNullable(){
				    return true;
				}
				public Boolean date_insertIsKey(){
				    return false;
				}
				public Integer date_insertLength(){
				    return null;
				}
				public Integer date_insertPrecision(){
				    return null;
				}
				public String date_insertDefault(){
				
					return null;
				
				}
				public String date_insertComment(){
				
				    return "";
				
				}
				public String date_insertPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String date_insertOriginalDbColumnName(){
				
					return "date_insert";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 255;
				}
				public Integer pidPrecision(){
				    return null;
				}
				public String pidDefault(){
				
					return null;
				
				}
				public String pidComment(){
				
				    return "";
				
				}
				public String pidPattern(){
				
					return "";
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.nom_projet = readString(dis);
					
					this.description = readString(dis);
					
					this.type_projet = readString(dis);
					
					this.sponsor = readString(dis);
					
					this.id_etat_projet = readString(dis);
					
					this.libelle_etat_projet = readString(dis);
					
						this.priorite = readInteger(dis);
					
					this.etiquette = readString(dis);
					
					this.archive = readString(dis);
					
					this.date_insert = readDate(dis);
					
					this.pid = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.nom_projet = readString(dis);
					
					this.description = readString(dis);
					
					this.type_projet = readString(dis);
					
					this.sponsor = readString(dis);
					
					this.id_etat_projet = readString(dis);
					
					this.libelle_etat_projet = readString(dis);
					
						this.priorite = readInteger(dis);
					
					this.etiquette = readString(dis);
					
					this.archive = readString(dis);
					
					this.date_insert = readDate(dis);
					
					this.pid = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.nom_projet,dos);
					
					// String
				
						writeString(this.description,dos);
					
					// String
				
						writeString(this.type_projet,dos);
					
					// String
				
						writeString(this.sponsor,dos);
					
					// String
				
						writeString(this.id_etat_projet,dos);
					
					// String
				
						writeString(this.libelle_etat_projet,dos);
					
					// Integer
				
						writeInteger(this.priorite,dos);
					
					// String
				
						writeString(this.etiquette,dos);
					
					// String
				
						writeString(this.archive,dos);
					
					// java.util.Date
				
						writeDate(this.date_insert,dos);
					
					// String
				
						writeString(this.pid,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.nom_projet,dos);
					
					// String
				
						writeString(this.description,dos);
					
					// String
				
						writeString(this.type_projet,dos);
					
					// String
				
						writeString(this.sponsor,dos);
					
					// String
				
						writeString(this.id_etat_projet,dos);
					
					// String
				
						writeString(this.libelle_etat_projet,dos);
					
					// Integer
				
						writeInteger(this.priorite,dos);
					
					// String
				
						writeString(this.etiquette,dos);
					
					// String
				
						writeString(this.archive,dos);
					
					// java.util.Date
				
						writeDate(this.date_insert,dos);
					
					// String
				
						writeString(this.pid,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
		sb.append(",nom_projet="+nom_projet);
		sb.append(",description="+description);
		sb.append(",type_projet="+type_projet);
		sb.append(",sponsor="+sponsor);
		sb.append(",id_etat_projet="+id_etat_projet);
		sb.append(",libelle_etat_projet="+libelle_etat_projet);
		sb.append(",priorite="+String.valueOf(priorite));
		sb.append(",etiquette="+etiquette);
		sb.append(",archive="+archive);
		sb.append(",date_insert="+String.valueOf(date_insert));
		sb.append(",pid="+pid);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(delete_insert_projetStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class extraction_id_projetStruct implements routines.system.IPersistableRow<extraction_id_projetStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return null;
				}
				public Integer id_projet_tpPrecision(){
				    return null;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				
			    public String nom_projet;

				public String getNom_projet () {
					return this.nom_projet;
				}

				public Boolean nom_projetIsNullable(){
				    return true;
				}
				public Boolean nom_projetIsKey(){
				    return false;
				}
				public Integer nom_projetLength(){
				    return null;
				}
				public Integer nom_projetPrecision(){
				    return null;
				}
				public String nom_projetDefault(){
				
					return null;
				
				}
				public String nom_projetComment(){
				
				    return "";
				
				}
				public String nom_projetPattern(){
				
					return "";
				
				}
				public String nom_projetOriginalDbColumnName(){
				
					return "nom_projet";
				
				}

				
			    public String description;

				public String getDescription () {
					return this.description;
				}

				public Boolean descriptionIsNullable(){
				    return true;
				}
				public Boolean descriptionIsKey(){
				    return false;
				}
				public Integer descriptionLength(){
				    return null;
				}
				public Integer descriptionPrecision(){
				    return null;
				}
				public String descriptionDefault(){
				
					return null;
				
				}
				public String descriptionComment(){
				
				    return "";
				
				}
				public String descriptionPattern(){
				
					return "";
				
				}
				public String descriptionOriginalDbColumnName(){
				
					return "description";
				
				}

				
			    public String type_projet;

				public String getType_projet () {
					return this.type_projet;
				}

				public Boolean type_projetIsNullable(){
				    return true;
				}
				public Boolean type_projetIsKey(){
				    return false;
				}
				public Integer type_projetLength(){
				    return null;
				}
				public Integer type_projetPrecision(){
				    return null;
				}
				public String type_projetDefault(){
				
					return null;
				
				}
				public String type_projetComment(){
				
				    return "";
				
				}
				public String type_projetPattern(){
				
					return "";
				
				}
				public String type_projetOriginalDbColumnName(){
				
					return "type_projet";
				
				}

				
			    public String sponsor;

				public String getSponsor () {
					return this.sponsor;
				}

				public Boolean sponsorIsNullable(){
				    return true;
				}
				public Boolean sponsorIsKey(){
				    return false;
				}
				public Integer sponsorLength(){
				    return null;
				}
				public Integer sponsorPrecision(){
				    return null;
				}
				public String sponsorDefault(){
				
					return null;
				
				}
				public String sponsorComment(){
				
				    return "";
				
				}
				public String sponsorPattern(){
				
					return "";
				
				}
				public String sponsorOriginalDbColumnName(){
				
					return "sponsor";
				
				}

				
			    public String id_etat_projet;

				public String getId_etat_projet () {
					return this.id_etat_projet;
				}

				public Boolean id_etat_projetIsNullable(){
				    return true;
				}
				public Boolean id_etat_projetIsKey(){
				    return false;
				}
				public Integer id_etat_projetLength(){
				    return null;
				}
				public Integer id_etat_projetPrecision(){
				    return null;
				}
				public String id_etat_projetDefault(){
				
					return null;
				
				}
				public String id_etat_projetComment(){
				
				    return "";
				
				}
				public String id_etat_projetPattern(){
				
					return "";
				
				}
				public String id_etat_projetOriginalDbColumnName(){
				
					return "id_etat_projet";
				
				}

				
			    public String libelle_etat_projet;

				public String getLibelle_etat_projet () {
					return this.libelle_etat_projet;
				}

				public Boolean libelle_etat_projetIsNullable(){
				    return true;
				}
				public Boolean libelle_etat_projetIsKey(){
				    return false;
				}
				public Integer libelle_etat_projetLength(){
				    return null;
				}
				public Integer libelle_etat_projetPrecision(){
				    return null;
				}
				public String libelle_etat_projetDefault(){
				
					return null;
				
				}
				public String libelle_etat_projetComment(){
				
				    return "";
				
				}
				public String libelle_etat_projetPattern(){
				
					return "";
				
				}
				public String libelle_etat_projetOriginalDbColumnName(){
				
					return "libelle_etat_projet";
				
				}

				
			    public Integer priorite;

				public Integer getPriorite () {
					return this.priorite;
				}

				public Boolean prioriteIsNullable(){
				    return true;
				}
				public Boolean prioriteIsKey(){
				    return false;
				}
				public Integer prioriteLength(){
				    return null;
				}
				public Integer prioritePrecision(){
				    return null;
				}
				public String prioriteDefault(){
				
					return null;
				
				}
				public String prioriteComment(){
				
				    return "";
				
				}
				public String prioritePattern(){
				
					return "";
				
				}
				public String prioriteOriginalDbColumnName(){
				
					return "priorite";
				
				}

				
			    public String etiquette;

				public String getEtiquette () {
					return this.etiquette;
				}

				public Boolean etiquetteIsNullable(){
				    return true;
				}
				public Boolean etiquetteIsKey(){
				    return false;
				}
				public Integer etiquetteLength(){
				    return null;
				}
				public Integer etiquettePrecision(){
				    return null;
				}
				public String etiquetteDefault(){
				
					return null;
				
				}
				public String etiquetteComment(){
				
				    return "";
				
				}
				public String etiquettePattern(){
				
					return "";
				
				}
				public String etiquetteOriginalDbColumnName(){
				
					return "etiquette";
				
				}

				
			    public String archive;

				public String getArchive () {
					return this.archive;
				}

				public Boolean archiveIsNullable(){
				    return true;
				}
				public Boolean archiveIsKey(){
				    return false;
				}
				public Integer archiveLength(){
				    return null;
				}
				public Integer archivePrecision(){
				    return null;
				}
				public String archiveDefault(){
				
					return null;
				
				}
				public String archiveComment(){
				
				    return "";
				
				}
				public String archivePattern(){
				
					return "";
				
				}
				public String archiveOriginalDbColumnName(){
				
					return "archive";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.nom_projet = readString(dis);
					
					this.description = readString(dis);
					
					this.type_projet = readString(dis);
					
					this.sponsor = readString(dis);
					
					this.id_etat_projet = readString(dis);
					
					this.libelle_etat_projet = readString(dis);
					
						this.priorite = readInteger(dis);
					
					this.etiquette = readString(dis);
					
					this.archive = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.nom_projet = readString(dis);
					
					this.description = readString(dis);
					
					this.type_projet = readString(dis);
					
					this.sponsor = readString(dis);
					
					this.id_etat_projet = readString(dis);
					
					this.libelle_etat_projet = readString(dis);
					
						this.priorite = readInteger(dis);
					
					this.etiquette = readString(dis);
					
					this.archive = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.nom_projet,dos);
					
					// String
				
						writeString(this.description,dos);
					
					// String
				
						writeString(this.type_projet,dos);
					
					// String
				
						writeString(this.sponsor,dos);
					
					// String
				
						writeString(this.id_etat_projet,dos);
					
					// String
				
						writeString(this.libelle_etat_projet,dos);
					
					// Integer
				
						writeInteger(this.priorite,dos);
					
					// String
				
						writeString(this.etiquette,dos);
					
					// String
				
						writeString(this.archive,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.nom_projet,dos);
					
					// String
				
						writeString(this.description,dos);
					
					// String
				
						writeString(this.type_projet,dos);
					
					// String
				
						writeString(this.sponsor,dos);
					
					// String
				
						writeString(this.id_etat_projet,dos);
					
					// String
				
						writeString(this.libelle_etat_projet,dos);
					
					// Integer
				
						writeInteger(this.priorite,dos);
					
					// String
				
						writeString(this.etiquette,dos);
					
					// String
				
						writeString(this.archive,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
		sb.append(",nom_projet="+nom_projet);
		sb.append(",description="+description);
		sb.append(",type_projet="+type_projet);
		sb.append(",sponsor="+sponsor);
		sb.append(",id_etat_projet="+id_etat_projet);
		sb.append(",libelle_etat_projet="+libelle_etat_projet);
		sb.append(",priorite="+String.valueOf(priorite));
		sb.append(",etiquette="+etiquette);
		sb.append(",archive="+archive);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(extraction_id_projetStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public Integer statusCode;

				public Integer getStatusCode () {
					return this.statusCode;
				}

				public Boolean statusCodeIsNullable(){
				    return true;
				}
				public Boolean statusCodeIsKey(){
				    return false;
				}
				public Integer statusCodeLength(){
				    return 0;
				}
				public Integer statusCodePrecision(){
				    return 0;
				}
				public String statusCodeDefault(){
				
					return "";
				
				}
				public String statusCodeComment(){
				
				    return null;
				
				}
				public String statusCodePattern(){
				
				    return null;
				
				}
				public String statusCodeOriginalDbColumnName(){
				
					return "statusCode";
				
				}

				
			    public routines.system.Document body;

				public routines.system.Document getBody () {
					return this.body;
				}

				public Boolean bodyIsNullable(){
				    return true;
				}
				public Boolean bodyIsKey(){
				    return false;
				}
				public Integer bodyLength(){
				    return 0;
				}
				public Integer bodyPrecision(){
				    return 0;
				}
				public String bodyDefault(){
				
					return "";
				
				}
				public String bodyComment(){
				
				    return null;
				
				}
				public String bodyPattern(){
				
				    return null;
				
				}
				public String bodyOriginalDbColumnName(){
				
					return "body";
				
				}

				
			    public String string;

				public String getString () {
					return this.string;
				}

				public Boolean stringIsNullable(){
				    return true;
				}
				public Boolean stringIsKey(){
				    return false;
				}
				public Integer stringLength(){
				    return 4048;
				}
				public Integer stringPrecision(){
				    return 0;
				}
				public String stringDefault(){
				
					return "";
				
				}
				public String stringComment(){
				
				    return null;
				
				}
				public String stringPattern(){
				
				    return null;
				
				}
				public String stringOriginalDbColumnName(){
				
					return "string";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
						this.statusCode = readInteger(dis);
					
						this.body = (routines.system.Document) dis.readObject();
					
					this.string = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
						this.statusCode = readInteger(dis);
					
						this.body = (routines.system.Document) dis.readObject();
					
					this.string = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.statusCode,dos);
					
					// Document
				
       			    	dos.writeObject(this.body);
					
					// String
				
						writeString(this.string,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.statusCode,dos);
					
					// Document
				
						dos.clearInstanceCache();
						dos.writeObject(this.body);
					
					// String
				
						writeString(this.string,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("statusCode="+String.valueOf(statusCode));
		sb.append(",body="+String.valueOf(body));
		sb.append(",string="+string);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void tRESTClient_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRESTClient_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row6Struct row6 = new row6Struct();
extraction_id_projetStruct extraction_id_projet = new extraction_id_projetStruct();
delete_insert_projetStruct delete_insert_projet = new delete_insert_projetStruct();






	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"delete_insert_projet");
					}
				
		int tos_count_tDBOutput_1 = 0;
		



int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;
String dbschema_tDBOutput_1 = null;
String tableName_tDBOutput_1 = null;
boolean whetherReject_tDBOutput_1 = false;

java.util.Calendar calendar_tDBOutput_1 = java.util.Calendar.getInstance();
long year1_tDBOutput_1 = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_tDBOutput_1 = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_tDBOutput_1 = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_tDBOutput_1;

java.util.Calendar calendar_datetimeoffset_tDBOutput_1 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));



	
java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = (String)globalMap.get("dbschema_tDBConnection_1");
	
	conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
   int batchSize_tDBOutput_1 = 10000;
   int batchSizeCounter_tDBOutput_1=0;

if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
    tableName_tDBOutput_1 = "projet";
} else {
    tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "].[" + "projet";
}
	int count_tDBOutput_1=0;

            int rsTruncCountNumber_tDBOutput_1 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_1 = stmtTruncCount_tDBOutput_1.executeQuery("SELECT COUNT(1) FROM [" + tableName_tDBOutput_1 + "]")) {
                    if(rsTruncCount_tDBOutput_1.next()) {
                        rsTruncCountNumber_tDBOutput_1 = rsTruncCount_tDBOutput_1.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
                stmtTrunc_tDBOutput_1.executeUpdate("TRUNCATE TABLE [" + tableName_tDBOutput_1 + "]");
                deletedCount_tDBOutput_1 += rsTruncCountNumber_tDBOutput_1;
            }
    java.sql.PreparedStatement pstmt_tDBOutput_1 = null;
    java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = null;
    java.sql.PreparedStatement pstmtUpdate_tDBOutput_1 = null;
        String insert_tDBOutput_1 = "INSERT INTO [" + tableName_tDBOutput_1 + "] ([id_projet_tp],[nom_projet],[description],[type_projet],[sponsor],[id_etat_projet],[libelle_etat_projet],[priorite],[etiquette],[archive],[date_insert],[pid]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);

 	boolean isShareIdentity_tDBOutput_1 = globalMap.get("shareIdentitySetting_tDBConnection_1") != null && (Boolean)globalMap.get("shareIdentitySetting_tDBConnection_1") == true;

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"extraction_id_projet");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
	String etiquette;
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
delete_insert_projetStruct delete_insert_projet_tmp = new delete_insert_projetStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tExtractJSONFields_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tExtractJSONFields_2", false);
		start_Hash.put("tExtractJSONFields_2", System.currentTimeMillis());
		
	
	currentComponent="tExtractJSONFields_2";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tExtractJSONFields_2 = 0;
		

int nb_line_tExtractJSONFields_2 = 0;
String jsonStr_tExtractJSONFields_2 = "";

	

class JsonPathCache_tExtractJSONFields_2 {
	final java.util.Map<String,com.jayway.jsonpath.JsonPath> jsonPathString2compiledJsonPath = new java.util.HashMap<String,com.jayway.jsonpath.JsonPath>();
	
	public com.jayway.jsonpath.JsonPath getCompiledJsonPath(String jsonPath) {
		if(jsonPathString2compiledJsonPath.containsKey(jsonPath)) {
			return jsonPathString2compiledJsonPath.get(jsonPath);
		} else {
			com.jayway.jsonpath.JsonPath compiledLoopPath = com.jayway.jsonpath.JsonPath.compile(jsonPath);
			jsonPathString2compiledJsonPath.put(jsonPath,compiledLoopPath);
			return compiledLoopPath;
		}
	}
}

JsonPathCache_tExtractJSONFields_2 jsonPathCache_tExtractJSONFields_2 = new JsonPathCache_tExtractJSONFields_2();

 



/**
 * [tExtractJSONFields_2 begin ] stop
 */



	
	/**
	 * [tRESTClient_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRESTClient_2", false);
		start_Hash.put("tRESTClient_2", System.currentTimeMillis());
		
	
	currentComponent="tRESTClient_2";
	
	
		int tos_count_tRESTClient_2 = 0;
		

 



/**
 * [tRESTClient_2 begin ] stop
 */
	
	/**
	 * [tRESTClient_2 main ] start
	 */

	

	
	
	currentComponent="tRESTClient_2";
	
	
	row6 = null;

// expected response body
Object responseDoc_tRESTClient_2 = null;

try {
	// request body
	org.dom4j.Document requestDoc_tRESTClient_2 = null;
	String requestString_tRESTClient_2 = null;

	Object requestBody_tRESTClient_2 = requestDoc_tRESTClient_2 != null ? requestDoc_tRESTClient_2 : requestString_tRESTClient_2;

	

    //resposne class name
	Class<?> responseClass_tRESTClient_2
		= String.class;

	// create web client instance
	org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean factoryBean_tRESTClient_2 =
			new org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean();

	boolean inOSGi = routines.system.BundleUtils.inOSGi();

	final java.util.List<org.apache.cxf.feature.Feature> features_tRESTClient_2 =
			new java.util.ArrayList<org.apache.cxf.feature.Feature>();

	String url = null;
	
		url =  "https://pma.timeperformance.com/api/v4/projects";
		// {baseUri}tRESTClient
		factoryBean_tRESTClient_2.setServiceName(new javax.xml.namespace.QName(url, "tRESTClient"));
		factoryBean_tRESTClient_2.setAddress(url);
	

	

    boolean log_messages_tRESTClient_2 = Boolean.valueOf(false);
	if (log_messages_tRESTClient_2) {
		org.apache.cxf.ext.logging.LoggingFeature loggingFeature = new  org.apache.cxf.ext.logging.LoggingFeature();
		loggingFeature.addSensitiveProtocolHeaderNames(new java.util.HashSet<>(java.util.Arrays.asList(org.apache.cxf.helpers.HttpHeaderHelper.AUTHORIZATION)));
		loggingFeature.addSensitiveElementNames(new java.util.HashSet<>(java.util.Arrays.asList("password")));
		features_tRESTClient_2.add(loggingFeature);
	}

	

	factoryBean_tRESTClient_2.setFeatures(features_tRESTClient_2);


	java.util.List<Object> providers_tRESTClient_2 = new java.util.ArrayList<Object>();
	providers_tRESTClient_2.add(new org.apache.cxf.jaxrs.provider.dom4j.DOM4JProvider() {
		// workaround for https://jira.talendforge.org/browse/TESB-7276
		public org.dom4j.Document readFrom(Class<org.dom4j.Document> cls,
											java.lang.reflect.Type type,
											java.lang.annotation.Annotation[] anns,
											javax.ws.rs.core.MediaType mt,
											javax.ws.rs.core.MultivaluedMap<String, String> headers,
											java.io.InputStream is)
				throws IOException, javax.ws.rs.WebApplicationException {
			String contentLength = headers.getFirst("Content-Length");
			if (!org.apache.cxf.common.util.StringUtils.isEmpty(contentLength)
					&& Integer.valueOf(contentLength) <= 0) {
				try {
					return org.dom4j.DocumentHelper.parseText("<root/>");
				} catch (org.dom4j.DocumentException e_tRESTClient_2) {
					e_tRESTClient_2.printStackTrace();
				}
				return null;
			}
			return super.readFrom(cls, type, anns, mt, headers, is);
		}
	});
	org.apache.cxf.jaxrs.provider.json.JSONProvider jsonProvider_tRESTClient_2 =
			new org.apache.cxf.jaxrs.provider.json.JSONProvider();
		jsonProvider_tRESTClient_2.setIgnoreNamespaces(true);
		jsonProvider_tRESTClient_2.setAttributesToElements(true);
	
	
	
		jsonProvider_tRESTClient_2.setSupportUnwrapped(true);
		jsonProvider_tRESTClient_2.setWrapperName("root");
	
	
		jsonProvider_tRESTClient_2.setDropRootElement(false);
		jsonProvider_tRESTClient_2.setConvertTypesToStrings(false);
	providers_tRESTClient_2.add(jsonProvider_tRESTClient_2);
	factoryBean_tRESTClient_2.setProviders(providers_tRESTClient_2);
	factoryBean_tRESTClient_2.setTransportId("http://cxf.apache.org/transports/http");

	boolean use_auth_tRESTClient_2 = true;

	
		if (use_auth_tRESTClient_2 && "SAML".equals("BASIC")) {
			if (!inOSGi) {
				throw new IllegalArgumentException("SAML based security scenarios are not supported in Studio (standalone)");
			}
			// set SAML Token authentication
			
			 
	final String decryptedPassword_tRESTClient_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:0S30do/gJ1WZ9x8R2ivsXcAxop8zVQXIzcTAzspktQZQoRLXv3uhu3fWhB4xX15XutAtog==");

			org.apache.cxf.ws.security.trust.STSClient stsClient =
				org.talend.esb.security.saml.STSClientUtils.createSTSClient(factoryBean_tRESTClient_2.getBus(),
					"1373486@at17209", decryptedPassword_tRESTClient_2);
			
			org.talend.esb.security.saml.SAMLRESTUtils.configureClient(factoryBean_tRESTClient_2, stsClient);
		}

	

	org.apache.cxf.jaxrs.client.WebClient webClient_tRESTClient_2 = null;
	
		webClient_tRESTClient_2 = factoryBean_tRESTClient_2.createWebClient();
		// set request path
		webClient_tRESTClient_2.path("");
	

	// set connection properties
	org.apache.cxf.jaxrs.client.ClientConfiguration clientConfig_tRESTClient_2 = org.apache.cxf.jaxrs.client.WebClient.getConfig(webClient_tRESTClient_2);
	org.apache.cxf.transport.http.auth.HttpAuthSupplier httpAuthSupplerHttpConduit = null;
	org.apache.cxf.transport.http.HTTPConduit conduit_tRESTClient_2 = null;

	
		conduit_tRESTClient_2 = clientConfig_tRESTClient_2.getHttpConduit();
	
	
    if (clientConfig_tRESTClient_2.getEndpoint() != null) {
		org.apache.cxf.service.model.EndpointInfo endpointInfo_tRESTClient_2 = clientConfig_tRESTClient_2.getEndpoint().getEndpointInfo();
		if(endpointInfo_tRESTClient_2 != null) {
			endpointInfo_tRESTClient_2.setProperty("enable.webclient.operation.reporting", true);
		}
    }

	

	

			if (use_auth_tRESTClient_2 && "BASIC".equals("BASIC")) {
			// set BASIC auth
			
			 
	final String decryptedPassword_tRESTClient_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:weTJOyeI75DlSz673vWQ73ihQ2TIgrobM1THY9jyMrs4MEhM/upqNbqfD8KEdzcDG+/gTw==");

			org.apache.cxf.configuration.security.AuthorizationPolicy authPolicy_tRESTClient_2 = new org.apache.cxf.configuration.security.AuthorizationPolicy();
				authPolicy_tRESTClient_2.setAuthorizationType("Basic");
				authPolicy_tRESTClient_2.setUserName("1373486@at17209");
				authPolicy_tRESTClient_2.setPassword(decryptedPassword_tRESTClient_2);
			conduit_tRESTClient_2.setAuthorization(authPolicy_tRESTClient_2);
		} else if (use_auth_tRESTClient_2 && "HTTP Digest".equals("BASIC")) {
			// set Digest auth
			
			 
	final String decryptedPassword_tRESTClient_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Nh+sj6TFpQcoGM77+rQVAN/tGxcxxlLH2GlVS3svRVtmhHRJ9+iPv0rAF6tExkm+WAFDzg==");

			org.apache.cxf.configuration.security.AuthorizationPolicy authPolicy_tRESTClient_2 = new org.apache.cxf.configuration.security.AuthorizationPolicy();
			authPolicy_tRESTClient_2.setAuthorizationType("Digest");
			authPolicy_tRESTClient_2.setUserName("1373486@at17209");
			authPolicy_tRESTClient_2.setPassword(decryptedPassword_tRESTClient_2);
			conduit_tRESTClient_2.setAuthorization(authPolicy_tRESTClient_2);
		}

	

	if (!inOSGi) {
		conduit_tRESTClient_2.getClient().setReceiveTimeout((long)(60 * 1000L));
		conduit_tRESTClient_2.getClient().setConnectionTimeout((long)(30 * 1000L));
	}
	
	
	
		

	

	

	
		// set Accept-Type
		webClient_tRESTClient_2.accept("application/json");
	

	
		// set optional query and header properties if any
	
	if (use_auth_tRESTClient_2 && "OAUTH2_BEARER".equals("BASIC")) {
		// set oAuth2 bearer token
		org.apache.cxf.rs.security.oauth2.client.BearerAuthSupplier authSupplier = new org.apache.cxf.rs.security.oauth2.client.BearerAuthSupplier();
		authSupplier.setAccessToken((String) "");
		conduit_tRESTClient_2.setAuthSupplier(authSupplier);
	}

	

		if (use_auth_tRESTClient_2 && "OIDC_PASSWORD_GRANT".equals("BASIC")) {

	        
	         
	final String decryptedPassword_tRESTClient_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Kc0MpRmJAivTGXPm1ssUZr/ilaQJfdF+vq46k9wW6R7iFP0gW9gaSDR023Es6WQWtpYbtw==");

	        String username_tRESTClient_2 = "1373486@at17209";
	        String password_tRESTClient_2 = decryptedPassword_tRESTClient_2;

	        String bearerHeader_tRESTClient_2 = null;

	        try {
				if (!inOSGi) {
					org.springframework.context.support.ClassPathXmlApplicationContext context_tRESTClient_2 =
						new org.springframework.context.support.ClassPathXmlApplicationContext("META-INF/tesb/oidc-context.xml");
					org.talend.esb.security.oidc.OidcConfiguration oidcConfiguration_tRESTClient_2 = context_tRESTClient_2.getBean(org.talend.esb.security.oidc.OidcConfiguration.class);
					bearerHeader_tRESTClient_2 = org.talend.esb.security.oidc.OidcClientUtils.oidcClientBearer(username_tRESTClient_2, password_tRESTClient_2, oidcConfiguration_tRESTClient_2);
				}else{
					bearerHeader_tRESTClient_2 = org.talend.esb.security.oidc.OidcClientUtils.oidcClientBearer(username_tRESTClient_2, password_tRESTClient_2);
				}
			} catch (Exception ex) {
	            throw new javax.ws.rs.WebApplicationException("Failed to get OIDC access token: ", ex);
	        }

			webClient_tRESTClient_2.header("Authorization", bearerHeader_tRESTClient_2);
		}

	

	// if FORM request then capture query parameters into Form, otherwise set them as queries
	
		
		
	


	try {
		// start send request
		
			responseDoc_tRESTClient_2 = webClient_tRESTClient_2.get();
			javax.ws.rs.core.Response responseObjBase_tRESTClient_2 = (javax.ws.rs.core.Response)responseDoc_tRESTClient_2;
            int status_tRESTClient_2 = responseObjBase_tRESTClient_2.getStatus();
            if (status_tRESTClient_2 != 304 && status_tRESTClient_2 >= 300 && responseClass_tRESTClient_2 != javax.ws.rs.core.Response.class) {
                throw org.apache.cxf.jaxrs.utils.ExceptionUtils.toWebApplicationException((javax.ws.rs.core.Response)responseObjBase_tRESTClient_2);
            }
            if (status_tRESTClient_2 != 204 && responseObjBase_tRESTClient_2.getEntity() != null) {
				responseDoc_tRESTClient_2 = responseObjBase_tRESTClient_2.readEntity(responseClass_tRESTClient_2);
			}
		


		int webClientResponseStatus_tRESTClient_2 = webClient_tRESTClient_2.getResponse().getStatus();
		if (webClientResponseStatus_tRESTClient_2 >= 300) {
			throw new javax.ws.rs.WebApplicationException(webClient_tRESTClient_2.getResponse());
		}

		
			if (row6 == null) {
				row6 = new row6Struct();
			}

			row6.statusCode = webClientResponseStatus_tRESTClient_2;
			row6.string = "";
			
				
				{
					Object responseObj_tRESTClient_2 = responseDoc_tRESTClient_2;
				
				if(responseObj_tRESTClient_2 != null){
					if (responseClass_tRESTClient_2 == String.class && responseObj_tRESTClient_2 instanceof String) {
							row6.string = (String) responseObj_tRESTClient_2;
					} else {
						routines.system.Document responseTalendDoc_tRESTClient_2 = null;
						if (null != responseObj_tRESTClient_2) {
							responseTalendDoc_tRESTClient_2 = new routines.system.Document();
							if (responseObj_tRESTClient_2 instanceof org.dom4j.Document) {
								responseTalendDoc_tRESTClient_2.setDocument((org.dom4j.Document) responseObj_tRESTClient_2);
							}
						}
						row6.body = responseTalendDoc_tRESTClient_2;
					}
				}
			}
			

			java.util.Map<String, javax.ws.rs.core.NewCookie> cookies_tRESTClient_2 = new java.util.HashMap<String, javax.ws.rs.core.NewCookie>();

			if (webClient_tRESTClient_2.getResponse() != null && webClient_tRESTClient_2.getResponse().getCookies() != null ) { 
				cookies_tRESTClient_2.putAll(webClient_tRESTClient_2.getResponse().getCookies());
			}

			


			globalMap.put("tRESTClient_2_HEADERS", webClient_tRESTClient_2.getResponse().getHeaders());
			globalMap.put("tRESTClient_2_COOKIES", cookies_tRESTClient_2);
			
		

	} catch (javax.ws.rs.WebApplicationException ex_tRESTClient_2) {
	    globalMap.put("tRESTClient_2_ERROR_MESSAGE",ex_tRESTClient_2.getMessage());
		
			throw ex_tRESTClient_2;
		
	}

} catch(Exception e_tRESTClient_2) {
    globalMap.put("tRESTClient_2_ERROR_MESSAGE",e_tRESTClient_2.getMessage());
	
		throw new TalendException(e_tRESTClient_2, currentComponent, globalMap);
	
}


 


	tos_count_tRESTClient_2++;

/**
 * [tRESTClient_2 main ] stop
 */
	
	/**
	 * [tRESTClient_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRESTClient_2";
	
	

 



/**
 * [tRESTClient_2 process_data_begin ] stop
 */
// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tExtractJSONFields_2 main ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_2";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					

            if(row6.string!=null){// C_01
                jsonStr_tExtractJSONFields_2 = row6.string.toString();
   
extraction_id_projet = null;

	

String loopPath_tExtractJSONFields_2 = "*";
java.util.List<Object> resultset_tExtractJSONFields_2 = new java.util.ArrayList<Object>();

boolean isStructError_tExtractJSONFields_2 = true;
com.jayway.jsonpath.ReadContext document_tExtractJSONFields_2 = null;
try {
	document_tExtractJSONFields_2 = com.jayway.jsonpath.JsonPath.parse(jsonStr_tExtractJSONFields_2);
	com.jayway.jsonpath.JsonPath compiledLoopPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(loopPath_tExtractJSONFields_2);
	Object result_tExtractJSONFields_2 = document_tExtractJSONFields_2.read(compiledLoopPath_tExtractJSONFields_2,net.minidev.json.JSONObject.class);
	if (result_tExtractJSONFields_2 instanceof net.minidev.json.JSONArray) {
		resultset_tExtractJSONFields_2 = (net.minidev.json.JSONArray) result_tExtractJSONFields_2;
	} else {
		resultset_tExtractJSONFields_2.add(result_tExtractJSONFields_2);
	}
	
	isStructError_tExtractJSONFields_2 = false;
} catch (java.lang.Exception ex_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",ex_tExtractJSONFields_2.getMessage());
		System.err.println(ex_tExtractJSONFields_2.getMessage());
}

String jsonPath_tExtractJSONFields_2 = null;
com.jayway.jsonpath.JsonPath compiledJsonPath_tExtractJSONFields_2 = null;

Object value_tExtractJSONFields_2 = null;

Object root_tExtractJSONFields_2 = null;
for(int i_tExtractJSONFields_2=0; isStructError_tExtractJSONFields_2 || (i_tExtractJSONFields_2 < resultset_tExtractJSONFields_2.size());i_tExtractJSONFields_2++){
	if(!isStructError_tExtractJSONFields_2){
		Object row_tExtractJSONFields_2 = resultset_tExtractJSONFields_2.get(i_tExtractJSONFields_2);
            extraction_id_projet = null;
	extraction_id_projet = new extraction_id_projetStruct();
	nb_line_tExtractJSONFields_2++;
	try {
		jsonPath_tExtractJSONFields_2 = "id";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.id_projet_tp = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.id_projet_tp = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "name";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.nom_projet = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.nom_projet = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "description";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.description = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.description = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "projectType";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.type_projet = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.type_projet = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "sponsor";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.sponsor = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.sponsor = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "state.id";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.id_etat_projet = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.id_etat_projet = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "state.name";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.libelle_etat_projet = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.libelle_etat_projet = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "priority";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				if(value_tExtractJSONFields_2 != null && !value_tExtractJSONFields_2.toString().isEmpty()) {
					extraction_id_projet.priorite = ParserUtils.parseTo_Integer(value_tExtractJSONFields_2.toString());
				} else {
					extraction_id_projet.priorite = 

		null

;
				}
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.priorite = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "labels[*].name";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.etiquette = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.etiquette = 

		null

;
		}
		jsonPath_tExtractJSONFields_2 = "archived";
		compiledJsonPath_tExtractJSONFields_2 = jsonPathCache_tExtractJSONFields_2.getCompiledJsonPath(jsonPath_tExtractJSONFields_2);
		
		try {
		    
		        value_tExtractJSONFields_2 = compiledJsonPath_tExtractJSONFields_2.read(row_tExtractJSONFields_2);
		    
				extraction_id_projet.archive = value_tExtractJSONFields_2 == null ? 

		null

 : value_tExtractJSONFields_2.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",e_tExtractJSONFields_2.getMessage());
			extraction_id_projet.archive = 

		null

;
		}	
	} catch (java.lang.Exception ex_tExtractJSONFields_2) {
globalMap.put("tExtractJSONFields_2_ERROR_MESSAGE",ex_tExtractJSONFields_2.getMessage());
		    System.err.println(ex_tExtractJSONFields_2.getMessage());
		    extraction_id_projet = null;	
	}
	
	}
    
	isStructError_tExtractJSONFields_2 = false;
	
//}


 


	tos_count_tExtractJSONFields_2++;

/**
 * [tExtractJSONFields_2 main ] stop
 */
	
	/**
	 * [tExtractJSONFields_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_2";
	
	

 



/**
 * [tExtractJSONFields_2 process_data_begin ] stop
 */
// Start of branch "extraction_id_projet"
if(extraction_id_projet != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"extraction_id_projet"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_2 = false;
		boolean mainRowRejected_tMap_2 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;
Var.etiquette = extraction_id_projet.etiquette != null
    ? extraction_id_projet.etiquette
        .replaceAll("[\\[\\]\"]", "")
        .replaceAll(",", "; ")
        .replace("\\/", "/")
    : "" ;// ###############################
        // ###############################
        // # Output tables

delete_insert_projet = null;


// # Output table : 'delete_insert_projet'
delete_insert_projet_tmp.id_projet_tp = extraction_id_projet.id_projet_tp ;
delete_insert_projet_tmp.nom_projet = extraction_id_projet.nom_projet ;
delete_insert_projet_tmp.description = extraction_id_projet.description ;
delete_insert_projet_tmp.type_projet = extraction_id_projet.type_projet ;
delete_insert_projet_tmp.sponsor = extraction_id_projet.sponsor ;
delete_insert_projet_tmp.id_etat_projet = extraction_id_projet.id_etat_projet ;
delete_insert_projet_tmp.libelle_etat_projet = extraction_id_projet.libelle_etat_projet ;
delete_insert_projet_tmp.priorite = extraction_id_projet.priorite ;
delete_insert_projet_tmp.etiquette = Var.etiquette ;
delete_insert_projet_tmp.archive = extraction_id_projet.archive ;
delete_insert_projet_tmp.date_insert = TalendDate.getCurrentDate() ;
delete_insert_projet_tmp.pid = this.pid;
delete_insert_projet = delete_insert_projet_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "delete_insert_projet"
if(delete_insert_projet != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"delete_insert_projet"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    if(delete_insert_projet.id_projet_tp == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, delete_insert_projet.id_projet_tp);
}

                    if(delete_insert_projet.nom_projet == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, delete_insert_projet.nom_projet);
}

                    if(delete_insert_projet.description == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(3, delete_insert_projet.description);
}

                    if(delete_insert_projet.type_projet == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(4, delete_insert_projet.type_projet);
}

                    if(delete_insert_projet.sponsor == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(5, delete_insert_projet.sponsor);
}

                    if(delete_insert_projet.id_etat_projet == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(6, delete_insert_projet.id_etat_projet);
}

                    if(delete_insert_projet.libelle_etat_projet == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(7, delete_insert_projet.libelle_etat_projet);
}

                    if(delete_insert_projet.priorite == null) {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(8, delete_insert_projet.priorite);
}

                    if(delete_insert_projet.etiquette == null) {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(9, delete_insert_projet.etiquette);
}

                    if(delete_insert_projet.archive == null) {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(10, delete_insert_projet.archive);
}

                    if(delete_insert_projet.date_insert != null) {
pstmt_tDBOutput_1.setTimestamp(11, new java.sql.Timestamp(delete_insert_projet.date_insert.getTime()));
} else {
pstmt_tDBOutput_1.setNull(11, java.sql.Types.TIMESTAMP);
}

                    if(delete_insert_projet.pid == null) {
pstmt_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(12, delete_insert_projet.pid);
}


        		pstmt_tDBOutput_1.addBatch();
        		nb_line_tDBOutput_1++;
        		
    		 
    		  batchSizeCounter_tDBOutput_1++;
    		
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_tDBOutput_1{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_tDBOutput_1) throws Exception {
                try {
						
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							if(countEach_tDBOutput_1 == -2 || countEach_tDBOutput_1 == -3) {
								break;
							}
							counter += countEach_tDBOutput_1;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_1 = 0;
					for(int countEach_tDBOutput_1: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
				
            	    	
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_tDBOutput_1) throws Exception {
                try {
                		
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							if(countEach_tDBOutput_1 == -2 || countEach_tDBOutput_1 == -3) {
								break;
							}
							counter += countEach_tDBOutput_1;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_tDBOutput_1: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					
            	    	
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_tDBOutput_1 > 0) && (batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1)) {
    		
    		            
            	    		insertedCount_tDBOutput_1 = new LimitBytesHelper_tDBOutput_1().limitBytePart1(insertedCount_tDBOutput_1,pstmt_tDBOutput_1);
            	    		rowsToCommitCount_tDBOutput_1 = insertedCount_tDBOutput_1;
            	    	
    			
			    batchSizeCounter_tDBOutput_1 = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "delete_insert_projet"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "extraction_id_projet"

		// end for
	}


	
		} // C_01
	
	
	/**
	 * [tExtractJSONFields_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_2";
	
	

 



/**
 * [tExtractJSONFields_2 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tRESTClient_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tRESTClient_2";
	
	

 



/**
 * [tRESTClient_2 process_data_end ] stop
 */
	
	/**
	 * [tRESTClient_2 end ] start
	 */

	

	
	
	currentComponent="tRESTClient_2";
	
	


if (globalMap.get("tRESTClient_2_NB_LINE") == null) {
	globalMap.put("tRESTClient_2_NB_LINE", 1);
}

// [tRESTCliend_end]
 

ok_Hash.put("tRESTClient_2", true);
end_Hash.put("tRESTClient_2", System.currentTimeMillis());




/**
 * [tRESTClient_2 end ] stop
 */

	
	/**
	 * [tExtractJSONFields_2 end ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_2";
	
	
   globalMap.put("tExtractJSONFields_2_NB_LINE", nb_line_tExtractJSONFields_2);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tExtractJSONFields_2", true);
end_Hash.put("tExtractJSONFields_2", System.currentTimeMillis());




/**
 * [tExtractJSONFields_2 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"extraction_id_projet");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	



                try {
						int countSum_tDBOutput_1 = 0;
						if (pstmt_tDBOutput_1 != null && batchSizeCounter_tDBOutput_1 > 0) {
							
							for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
								if(countEach_tDBOutput_1 == -2 || countEach_tDBOutput_1 == -3) {
									break;
								}
								countSum_tDBOutput_1 += countEach_tDBOutput_1;
							}
							rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
							
						}
            	    	
            	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_1 = 0;
					for(int countEach_tDBOutput_1: e.getUpdateCounts()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
					
            	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_tDBOutput_1 != null) {
			
				pstmt_tDBOutput_1.close();
				resourceMap.remove("pstmt_tDBOutput_1");
			
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"delete_insert_projet");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */









				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRESTClient_2:OnSubjobOk1", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tJava_1Process(globalMap); 
						
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRESTClient_2:OnSubjobOk2", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tDBInput_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRESTClient_2 finally ] start
	 */

	

	
	
	currentComponent="tRESTClient_2";
	
	

 



/**
 * [tRESTClient_2 finally ] stop
 */

	
	/**
	 * [tExtractJSONFields_2 finally ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_2";
	
	

 



/**
 * [tExtractJSONFields_2 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */









				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRESTClient_2_SUBPROCESS_STATE", 1);
	}
	


public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";
	
	
		int tos_count_tJava_1 = 0;
		


System.out.println("sa.projet_tp ok");
 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	


public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";
	
	
		int tos_count_tJava_2 = 0;
		


System.out.println("sa.projet_tp ko");
 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";
	
	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
	}
	


public static class meteo_project_managerStruct implements routines.system.IPersistableRow<meteo_project_managerStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return true;
				}
				public Integer id_projet_tpLength(){
				    return 255;
				}
				public Integer id_projet_tpPrecision(){
				    return 0;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return null;
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				
			    public String meteo;

				public String getMeteo () {
					return this.meteo;
				}

				public Boolean meteoIsNullable(){
				    return true;
				}
				public Boolean meteoIsKey(){
				    return false;
				}
				public Integer meteoLength(){
				    return 255;
				}
				public Integer meteoPrecision(){
				    return 0;
				}
				public String meteoDefault(){
				
					return null;
				
				}
				public String meteoComment(){
				
				    return null;
				
				}
				public String meteoPattern(){
				
					return "";
				
				}
				public String meteoOriginalDbColumnName(){
				
					return "meteo";
				
				}

				
			    public String project_manager;

				public String getProject_manager () {
					return this.project_manager;
				}

				public Boolean project_managerIsNullable(){
				    return true;
				}
				public Boolean project_managerIsKey(){
				    return false;
				}
				public Integer project_managerLength(){
				    return 2147483647;
				}
				public Integer project_managerPrecision(){
				    return 0;
				}
				public String project_managerDefault(){
				
					return null;
				
				}
				public String project_managerComment(){
				
				    return null;
				
				}
				public String project_managerPattern(){
				
					return "";
				
				}
				public String project_managerOriginalDbColumnName(){
				
					return "project_manager";
				
				}

				
			    public java.util.Date date_insert;

				public java.util.Date getDate_insert () {
					return this.date_insert;
				}

				public Boolean date_insertIsNullable(){
				    return true;
				}
				public Boolean date_insertIsKey(){
				    return false;
				}
				public Integer date_insertLength(){
				    return 23;
				}
				public Integer date_insertPrecision(){
				    return 3;
				}
				public String date_insertDefault(){
				
					return null;
				
				}
				public String date_insertComment(){
				
				    return null;
				
				}
				public String date_insertPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String date_insertOriginalDbColumnName(){
				
					return "date_insert";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 255;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return null;
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
					return "";
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.id_projet_tp == null) ? 0 : this.id_projet_tp.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final meteo_project_managerStruct other = (meteo_project_managerStruct) obj;
		
						if (this.id_projet_tp == null) {
							if (other.id_projet_tp != null)
								return false;
						
						} else if (!this.id_projet_tp.equals(other.id_projet_tp))
						
							return false;
					

		return true;
    }

	public void copyDataTo(meteo_project_managerStruct other) {

		other.id_projet_tp = this.id_projet_tp;
	            other.meteo = this.meteo;
	            other.project_manager = this.project_manager;
	            other.date_insert = this.date_insert;
	            other.pid = this.pid;
	            
	}

	public void copyKeysDataTo(meteo_project_managerStruct other) {

		other.id_projet_tp = this.id_projet_tp;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.meteo = readString(dis);
					
					this.project_manager = readString(dis);
					
					this.date_insert = readDate(dis);
					
					this.pid = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.meteo = readString(dis);
					
					this.project_manager = readString(dis);
					
					this.date_insert = readDate(dis);
					
					this.pid = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.meteo,dos);
					
					// String
				
						writeString(this.project_manager,dos);
					
					// java.util.Date
				
						writeDate(this.date_insert,dos);
					
					// String
				
						writeString(this.pid,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.meteo,dos);
					
					// String
				
						writeString(this.project_manager,dos);
					
					// java.util.Date
				
						writeDate(this.date_insert,dos);
					
					// String
				
						writeString(this.pid,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
		sb.append(",meteo="+meteo);
		sb.append(",project_manager="+project_manager);
		sb.append(",date_insert="+String.valueOf(date_insert));
		sb.append(",pid="+pid);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(meteo_project_managerStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_projet_tp, other.id_projet_tp);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return null;
				}
				public Integer id_projet_tpPrecision(){
				    return null;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				
			    public String meteo;

				public String getMeteo () {
					return this.meteo;
				}

				public Boolean meteoIsNullable(){
				    return true;
				}
				public Boolean meteoIsKey(){
				    return false;
				}
				public Integer meteoLength(){
				    return null;
				}
				public Integer meteoPrecision(){
				    return null;
				}
				public String meteoDefault(){
				
					return null;
				
				}
				public String meteoComment(){
				
				    return "";
				
				}
				public String meteoPattern(){
				
					return "";
				
				}
				public String meteoOriginalDbColumnName(){
				
					return "meteo";
				
				}

				
			    public String project_manager;

				public String getProject_manager () {
					return this.project_manager;
				}

				public Boolean project_managerIsNullable(){
				    return true;
				}
				public Boolean project_managerIsKey(){
				    return false;
				}
				public Integer project_managerLength(){
				    return null;
				}
				public Integer project_managerPrecision(){
				    return null;
				}
				public String project_managerDefault(){
				
					return null;
				
				}
				public String project_managerComment(){
				
				    return "";
				
				}
				public String project_managerPattern(){
				
					return "";
				
				}
				public String project_managerOriginalDbColumnName(){
				
					return "project_manager";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.meteo = readString(dis);
					
					this.project_manager = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
					this.meteo = readString(dis);
					
					this.project_manager = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.meteo,dos);
					
					// String
				
						writeString(this.project_manager,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// String
				
						writeString(this.meteo,dos);
					
					// String
				
						writeString(this.project_manager,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
		sb.append(",meteo="+meteo);
		sb.append(",project_manager="+project_manager);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String ResponseContent;

				public String getResponseContent () {
					return this.ResponseContent;
				}

				public Boolean ResponseContentIsNullable(){
				    return true;
				}
				public Boolean ResponseContentIsKey(){
				    return false;
				}
				public Integer ResponseContentLength(){
				    return 0;
				}
				public Integer ResponseContentPrecision(){
				    return 0;
				}
				public String ResponseContentDefault(){
				
					return "";
				
				}
				public String ResponseContentComment(){
				
				    return null;
				
				}
				public String ResponseContentPattern(){
				
				    return null;
				
				}
				public String ResponseContentOriginalDbColumnName(){
				
					return "ResponseContent";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.ResponseContent = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.ResponseContent = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ResponseContent,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ResponseContent,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ResponseContent="+ResponseContent);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class liste_projetStruct implements routines.system.IPersistableRow<liste_projetStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return 255;
				}
				public Integer id_projet_tpPrecision(){
				    return 0;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(liste_projetStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return null;
				}
				public Integer id_projet_tpPrecision(){
				    return null;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row1Struct row1 = new row1Struct();
liste_projetStruct liste_projet = new liste_projetStruct();
row2Struct row2 = new row2Struct();
row3Struct row3 = new row3Struct();
meteo_project_managerStruct meteo_project_manager = new meteo_project_managerStruct();





	
	/**
	 * [tFlowToIterate_1 begin ] start
	 */

				
			int NB_ITERATE_tHttpRequest_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_1", false);
		start_Hash.put("tFlowToIterate_1", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_1";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"liste_projet");
					}
				
		int tos_count_tFlowToIterate_1 = 0;
		

int nb_line_tFlowToIterate_1 = 0;
int counter_tFlowToIterate_1 = 0;

 



/**
 * [tFlowToIterate_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
liste_projetStruct liste_projet_tmp = new liste_projetStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";
	
	
		int tos_count_tDBInput_1 = 0;
		
	
    
	
			org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_1 = org.talend.designer.components.util.mssql.MSSqlUtilFactory.getMSSqlGenerateTimestampUtil();
			
			java.util.List<String> talendToDBList_tDBInput_1 = new java.util.ArrayList();
			String[] talendToDBArray_tDBInput_1  = new String[]{"FLOAT","NUMERIC","NUMERIC IDENTITY","DECIMAL","DECIMAL IDENTITY","REAL"}; 
			java.util.Collections.addAll(talendToDBList_tDBInput_1, talendToDBArray_tDBInput_1); 
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
			String dbschema_tDBInput_1 = (String)globalMap.get("dbschema_tDBConnection_1");
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT id_projet_tp\nFROM sa.projet";
		    

		    globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);

		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row1.id_projet_tp = null;
							} else {
	                         		
           		tmpContent_tDBInput_1 = rs_tDBInput_1.getString(1);
            if(tmpContent_tDBInput_1 != null) {
            	if (talendToDBList_tDBInput_1 .contains(rsmd_tDBInput_1.getColumnTypeName(1).toUpperCase(java.util.Locale.ENGLISH))) {
            		row1.id_projet_tp = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
            	} else {
                	row1.id_projet_tp = tmpContent_tDBInput_1;
                }
            } else {
                row1.id_projet_tp = null;
            }
		                    }
					





 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_1 = false;
		boolean mainRowRejected_tMap_1 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

liste_projet = null;


// # Output table : 'liste_projet'
liste_projet_tmp.id_projet_tp = row1.id_projet_tp ;
liste_projet = liste_projet_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "liste_projet"
if(liste_projet != null) { 



	
	/**
	 * [tFlowToIterate_1 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"liste_projet"
						
						);
					}
					


    	            
            globalMap.put("liste_projet.id_projet_tp", liste_projet.id_projet_tp);
    	
 
	   nb_line_tFlowToIterate_1++;  
       counter_tFlowToIterate_1++;
       globalMap.put("tFlowToIterate_1_CURRENT_ITERATION", counter_tFlowToIterate_1);
 


	tos_count_tFlowToIterate_1++;

/**
 * [tFlowToIterate_1 main ] stop
 */
	
	/**
	 * [tFlowToIterate_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";
	
	

 



/**
 * [tFlowToIterate_1 process_data_begin ] stop
 */
	NB_ITERATE_tHttpRequest_1++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row3", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("meteo_project_manager", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate1", 1, "exec" + NB_ITERATE_tHttpRequest_1);
					//Thread.sleep(1000);
				}				
			




	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"meteo_project_manager");
					}
				
		int tos_count_tDBOutput_2 = 0;
		



int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;
String dbschema_tDBOutput_2 = null;
String tableName_tDBOutput_2 = null;
boolean whetherReject_tDBOutput_2 = false;

java.util.Calendar calendar_tDBOutput_2 = java.util.Calendar.getInstance();
long year1_tDBOutput_2 = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_tDBOutput_2 = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_tDBOutput_2 = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_tDBOutput_2;

java.util.Calendar calendar_datetimeoffset_tDBOutput_2 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));


        int updateKeyCount_tDBOutput_2 = 1;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 5 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
        }

	
java.sql.Connection conn_tDBOutput_2 = null;
String dbUser_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = (String)globalMap.get("dbschema_tDBConnection_1");
	
	conn_tDBOutput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
   int batchSize_tDBOutput_2 = 10000;
   int batchSizeCounter_tDBOutput_2=0;

if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
    tableName_tDBOutput_2 = "projet";
} else {
    tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "].[" + "projet";
}
	int count_tDBOutput_2=0;

    java.sql.PreparedStatement pstmt_tDBOutput_2 = null;
    java.sql.PreparedStatement pstmtInsert_tDBOutput_2 = null;
    java.sql.PreparedStatement pstmtUpdate_tDBOutput_2 = null;
        String update_tDBOutput_2 = "UPDATE [" + tableName_tDBOutput_2 + "] SET [meteo] = ?,[project_manager] = ?,[date_insert] = ?,[pid] = ? WHERE [id_projet_tp] = ?";
        pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
        resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
 	boolean isShareIdentity_tDBOutput_2 = globalMap.get("shareIdentitySetting_tDBConnection_1") != null && (Boolean)globalMap.get("shareIdentitySetting_tDBConnection_1") == true;

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
	String project_manager;
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
meteo_project_managerStruct meteo_project_manager_tmp = new meteo_project_managerStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tExtractJSONFields_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tExtractJSONFields_1", false);
		start_Hash.put("tExtractJSONFields_1", System.currentTimeMillis());
		
	
	currentComponent="tExtractJSONFields_1";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tExtractJSONFields_1 = 0;
		

int nb_line_tExtractJSONFields_1 = 0;
String jsonStr_tExtractJSONFields_1 = "";

	

class JsonPathCache_tExtractJSONFields_1 {
	final java.util.Map<String,com.jayway.jsonpath.JsonPath> jsonPathString2compiledJsonPath = new java.util.HashMap<String,com.jayway.jsonpath.JsonPath>();
	
	public com.jayway.jsonpath.JsonPath getCompiledJsonPath(String jsonPath) {
		if(jsonPathString2compiledJsonPath.containsKey(jsonPath)) {
			return jsonPathString2compiledJsonPath.get(jsonPath);
		} else {
			com.jayway.jsonpath.JsonPath compiledLoopPath = com.jayway.jsonpath.JsonPath.compile(jsonPath);
			jsonPathString2compiledJsonPath.put(jsonPath,compiledLoopPath);
			return compiledLoopPath;
		}
	}
}

JsonPathCache_tExtractJSONFields_1 jsonPathCache_tExtractJSONFields_1 = new JsonPathCache_tExtractJSONFields_1();

 



/**
 * [tExtractJSONFields_1 begin ] stop
 */



	
	/**
	 * [tHttpRequest_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHttpRequest_1", false);
		start_Hash.put("tHttpRequest_1", System.currentTimeMillis());
		
	
	currentComponent="tHttpRequest_1";
	
	
		int tos_count_tHttpRequest_1 = 0;
		

 



/**
 * [tHttpRequest_1 begin ] stop
 */
	
	/**
	 * [tHttpRequest_1 main ] start
	 */

	

	
	
	currentComponent="tHttpRequest_1";
	
	


int connectTimeOut_tHttpRequest_1 = Integer.valueOf(30)*1000;
int readTimeOut_tHttpRequest_1 = Integer.valueOf(0)*1000;

java.net.URL url_tHttpRequest_1 = new java.net.URL("https://pma.timeperformance.com/api/v4/projects/"+((String)globalMap.get("liste_projet.id_projet_tp"))+"/brief");

  java.net.Authenticator.setDefault(new java.net.Authenticator() {
      protected java.net.PasswordAuthentication getPasswordAuthentication() {

 
	final String decryptedPassword_tHttpRequest_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:+NvePOA5pyxVY6864yhOZmrarh1UBKgYXAQqJb860yJzm6JEerRIbi9MFRIRqybHif6tEQ==");

        return new java.net.PasswordAuthentication("1373486@at17209", decryptedPassword_tHttpRequest_1.toCharArray());
  }});
java.net.HttpURLConnection urlConn_tHttpRequest_1 = null;

if ("local".equals(System.getProperty("http.proxySet"))) {
    java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance().getProxyForUriString("https://pma.timeperformance.com/api/v4/projects/"+((String)globalMap.get("liste_projet.id_projet_tp"))+"/brief");
    urlConn_tHttpRequest_1 = (java.net.HttpURLConnection) url_tHttpRequest_1.openConnection(proxyToUse); 
} else {
    urlConn_tHttpRequest_1 = (java.net.HttpURLConnection) url_tHttpRequest_1.openConnection();
}
urlConn_tHttpRequest_1.setRequestMethod("GET");
urlConn_tHttpRequest_1.setDoOutput(true);
urlConn_tHttpRequest_1.setDoInput(true);
urlConn_tHttpRequest_1.setUseCaches(false);

boolean connected_tHttpRequest_1 = false;
int responseCode_tHttpRequest_1 = 0;
globalMap.put("tHttpRequest_1_CONNECTED", false);
try{
    urlConn_tHttpRequest_1.connect();
    connected_tHttpRequest_1 = true;
    globalMap.put("tHttpRequest_1_CONNECTED", true);

    byte[] buffer_tHttpRequest_1 = new byte[1024];
    int bos_buffer_tHttpRequest_1 = 0;java.io.ByteArrayOutputStream bytestream_tHttpRequest_1 = new java.io.ByteArrayOutputStream(); 

    responseCode_tHttpRequest_1 = urlConn_tHttpRequest_1.getResponseCode();
    globalMap.put("tHttpRequest_1_RESPONSE_CODE", responseCode_tHttpRequest_1);

    if ( responseCode_tHttpRequest_1 >= 200 && responseCode_tHttpRequest_1 < 300) { //Status code 2XX indicates success
        java.io.InputStream bis_tHttpRequest_1 = new java.io.BufferedInputStream(urlConn_tHttpRequest_1.getInputStream());
        while ((bos_buffer_tHttpRequest_1 = bis_tHttpRequest_1.read(buffer_tHttpRequest_1)) != -1) {bytestream_tHttpRequest_1.write(buffer_tHttpRequest_1,0,bos_buffer_tHttpRequest_1);
        }
        bis_tHttpRequest_1.close();
    } else {
    	String responseMessage_tHttpRequest_1 = urlConn_tHttpRequest_1.getResponseMessage();
    
        //get details response information which will be used when error appear
        java.io.InputStream err_stream_tHttpRequest_1 = urlConn_tHttpRequest_1.getErrorStream();
        if(err_stream_tHttpRequest_1!=null) {
            java.io.InputStream es_tHttpRequest_1 = new java.io.BufferedInputStream(err_stream_tHttpRequest_1);
        	java.io.ByteArrayOutputStream baos_tHttpRequest_1 = new java.io.ByteArrayOutputStream();
        	
        	byte[] buf_tHttpRequest_1 = new byte[1024];
            int read_tHttpRequest_1 = -1;
        	try {
            	while ((read_tHttpRequest_1 = es_tHttpRequest_1.read(buf_tHttpRequest_1)) > 0) {
            		baos_tHttpRequest_1.write(buf_tHttpRequest_1, 0, read_tHttpRequest_1);
            	}
        	} finally {
        		es_tHttpRequest_1.close();
        	}
        
        	responseMessage_tHttpRequest_1 += ("\n" + new String(baos_tHttpRequest_1.toByteArray()));
        }
    	
            System.err.println(responseCode_tHttpRequest_1 + " " + responseMessage_tHttpRequest_1);
            globalMap.put("tHttpRequest_1" + "_ERROR_MESSAGE","Request failed:" + responseCode_tHttpRequest_1 + " " + responseMessage_tHttpRequest_1);
    }

                    row2.ResponseContent = new String(bytestream_tHttpRequest_1.toByteArray());
    urlConn_tHttpRequest_1.disconnect();
}catch(Exception e){
globalMap.put("tHttpRequest_1_ERROR_MESSAGE",e.getMessage());
        System.err.println(e.getMessage());
}

 


	tos_count_tHttpRequest_1++;

/**
 * [tHttpRequest_1 main ] stop
 */
	
	/**
	 * [tHttpRequest_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHttpRequest_1";
	
	

 



/**
 * [tHttpRequest_1 process_data_begin ] stop
 */

	
	/**
	 * [tExtractJSONFields_1 main ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_1";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					

            if(row2.ResponseContent!=null){// C_01
                jsonStr_tExtractJSONFields_1 = row2.ResponseContent.toString();
   
row3 = null;

	

String loopPath_tExtractJSONFields_1 = "$";
java.util.List<Object> resultset_tExtractJSONFields_1 = new java.util.ArrayList<Object>();

boolean isStructError_tExtractJSONFields_1 = true;
com.jayway.jsonpath.ReadContext document_tExtractJSONFields_1 = null;
try {
	document_tExtractJSONFields_1 = com.jayway.jsonpath.JsonPath.parse(jsonStr_tExtractJSONFields_1);
	com.jayway.jsonpath.JsonPath compiledLoopPath_tExtractJSONFields_1 = jsonPathCache_tExtractJSONFields_1.getCompiledJsonPath(loopPath_tExtractJSONFields_1);
	Object result_tExtractJSONFields_1 = document_tExtractJSONFields_1.read(compiledLoopPath_tExtractJSONFields_1,net.minidev.json.JSONObject.class);
	if (result_tExtractJSONFields_1 instanceof net.minidev.json.JSONArray) {
		resultset_tExtractJSONFields_1 = (net.minidev.json.JSONArray) result_tExtractJSONFields_1;
	} else {
		resultset_tExtractJSONFields_1.add(result_tExtractJSONFields_1);
	}
	
	isStructError_tExtractJSONFields_1 = false;
} catch (java.lang.Exception ex_tExtractJSONFields_1) {
globalMap.put("tExtractJSONFields_1_ERROR_MESSAGE",ex_tExtractJSONFields_1.getMessage());
		System.err.println(ex_tExtractJSONFields_1.getMessage());
}

String jsonPath_tExtractJSONFields_1 = null;
com.jayway.jsonpath.JsonPath compiledJsonPath_tExtractJSONFields_1 = null;

Object value_tExtractJSONFields_1 = null;

Object root_tExtractJSONFields_1 = null;
for(int i_tExtractJSONFields_1=0; isStructError_tExtractJSONFields_1 || (i_tExtractJSONFields_1 < resultset_tExtractJSONFields_1.size());i_tExtractJSONFields_1++){
	if(!isStructError_tExtractJSONFields_1){
		Object row_tExtractJSONFields_1 = resultset_tExtractJSONFields_1.get(i_tExtractJSONFields_1);
            row3 = null;
	row3 = new row3Struct();
	nb_line_tExtractJSONFields_1++;
	try {
		jsonPath_tExtractJSONFields_1 = "$.id";
		compiledJsonPath_tExtractJSONFields_1 = jsonPathCache_tExtractJSONFields_1.getCompiledJsonPath(jsonPath_tExtractJSONFields_1);
		
		try {
		    
		        value_tExtractJSONFields_1 = compiledJsonPath_tExtractJSONFields_1.read(row_tExtractJSONFields_1);
		    
				row3.id_projet_tp = value_tExtractJSONFields_1 == null ? 

		null

 : value_tExtractJSONFields_1.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_1) {
globalMap.put("tExtractJSONFields_1_ERROR_MESSAGE",e_tExtractJSONFields_1.getMessage());
			row3.id_projet_tp = 

		null

;
		}
		jsonPath_tExtractJSONFields_1 = "$.appraisal.rating";
		compiledJsonPath_tExtractJSONFields_1 = jsonPathCache_tExtractJSONFields_1.getCompiledJsonPath(jsonPath_tExtractJSONFields_1);
		
		try {
		    
		        value_tExtractJSONFields_1 = compiledJsonPath_tExtractJSONFields_1.read(row_tExtractJSONFields_1);
		    
				row3.meteo = value_tExtractJSONFields_1 == null ? 

		null

 : value_tExtractJSONFields_1.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_1) {
globalMap.put("tExtractJSONFields_1_ERROR_MESSAGE",e_tExtractJSONFields_1.getMessage());
			row3.meteo = 

		null

;
		}
		jsonPath_tExtractJSONFields_1 = "$.projectManagers[*].name";
		compiledJsonPath_tExtractJSONFields_1 = jsonPathCache_tExtractJSONFields_1.getCompiledJsonPath(jsonPath_tExtractJSONFields_1);
		
		try {
		    
		        value_tExtractJSONFields_1 = compiledJsonPath_tExtractJSONFields_1.read(row_tExtractJSONFields_1);
		    
				row3.project_manager = value_tExtractJSONFields_1 == null ? 

		null

 : value_tExtractJSONFields_1.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_1) {
globalMap.put("tExtractJSONFields_1_ERROR_MESSAGE",e_tExtractJSONFields_1.getMessage());
			row3.project_manager = 

		null

;
		}	
	} catch (java.lang.Exception ex_tExtractJSONFields_1) {
globalMap.put("tExtractJSONFields_1_ERROR_MESSAGE",ex_tExtractJSONFields_1.getMessage());
		    System.err.println(ex_tExtractJSONFields_1.getMessage());
		    row3 = null;	
	}
	
	}
    
	isStructError_tExtractJSONFields_1 = false;
	
//}


 


	tos_count_tExtractJSONFields_1++;

/**
 * [tExtractJSONFields_1 main ] stop
 */
	
	/**
	 * [tExtractJSONFields_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_1";
	
	

 



/**
 * [tExtractJSONFields_1 process_data_begin ] stop
 */
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_3 = false;
		boolean mainRowRejected_tMap_3 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.project_manager = row3.project_manager != null
    ? row3.project_manager
        .replaceAll("[\\[\\]\"]", "")
        .replaceAll(",", "; ")
        .replace("\\/", "/")
    : "" ;// ###############################
        // ###############################
        // # Output tables

meteo_project_manager = null;


// # Output table : 'meteo_project_manager'
meteo_project_manager_tmp.id_projet_tp = row3.id_projet_tp ;
meteo_project_manager_tmp.meteo = row3.meteo ;
meteo_project_manager_tmp.project_manager = Var.project_manager ;
meteo_project_manager_tmp.date_insert = TalendDate.getCurrentDate() ;
meteo_project_manager_tmp.pid = this.pid;
meteo_project_manager = meteo_project_manager_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "meteo_project_manager"
if(meteo_project_manager != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"meteo_project_manager"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    if(meteo_project_manager.meteo == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, meteo_project_manager.meteo);
}

                    if(meteo_project_manager.project_manager == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, meteo_project_manager.project_manager);
}

                    if(meteo_project_manager.date_insert != null) {
pstmt_tDBOutput_2.setTimestamp(3, new java.sql.Timestamp(meteo_project_manager.date_insert.getTime()));
} else {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.TIMESTAMP);
}

                    if(meteo_project_manager.pid == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, meteo_project_manager.pid);
}


                    if(meteo_project_manager.id_projet_tp == null) {
pstmt_tDBOutput_2.setNull(5 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(5 + count_tDBOutput_2, meteo_project_manager.id_projet_tp);
}


    		pstmt_tDBOutput_2.addBatch();
    		nb_line_tDBOutput_2++;
    		
    		
    		batchSizeCounter_tDBOutput_2++;
    		
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_tDBOutput_2{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_tDBOutput_2) throws Exception {
                try {
						
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							if(countEach_tDBOutput_2 == -2 || countEach_tDBOutput_2 == -3) {
								break;
							}
							counter += countEach_tDBOutput_2;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_2 = 0;
					for(int countEach_tDBOutput_2: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
				
            	    	
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_tDBOutput_2) throws Exception {
                try {
                		
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							if(countEach_tDBOutput_2 == -2 || countEach_tDBOutput_2 == -3) {
								break;
							}
							counter += countEach_tDBOutput_2;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_tDBOutput_2: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					
            	    	
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_tDBOutput_2 > 0) && (batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2)) {
    		
    		            
            	    		updatedCount_tDBOutput_2 = new LimitBytesHelper_tDBOutput_2().limitBytePart1(updatedCount_tDBOutput_2,pstmt_tDBOutput_2);
            	    		rowsToCommitCount_tDBOutput_2 = updatedCount_tDBOutput_2;
            	    	
    			
			    batchSizeCounter_tDBOutput_2 = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "meteo_project_manager"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "row3"

		// end for
	}


	
		} // C_01
	
	
	/**
	 * [tExtractJSONFields_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_1";
	
	

 



/**
 * [tExtractJSONFields_1 process_data_end ] stop
 */



	
	/**
	 * [tHttpRequest_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHttpRequest_1";
	
	

 



/**
 * [tHttpRequest_1 process_data_end ] stop
 */
	
	/**
	 * [tHttpRequest_1 end ] start
	 */

	

	
	
	currentComponent="tHttpRequest_1";
	
	

 

ok_Hash.put("tHttpRequest_1", true);
end_Hash.put("tHttpRequest_1", System.currentTimeMillis());




/**
 * [tHttpRequest_1 end ] stop
 */

	
	/**
	 * [tExtractJSONFields_1 end ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_1";
	
	
   globalMap.put("tExtractJSONFields_1_NB_LINE", nb_line_tExtractJSONFields_1);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tExtractJSONFields_1", true);
end_Hash.put("tExtractJSONFields_1", System.currentTimeMillis());




/**
 * [tExtractJSONFields_1 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	



                try {
						int countSum_tDBOutput_2 = 0;
						if (pstmt_tDBOutput_2 != null && batchSizeCounter_tDBOutput_2 > 0) {
							
							for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
								if(countEach_tDBOutput_2 == -2 || countEach_tDBOutput_2 == -3) {
									break;
								}
								countSum_tDBOutput_2 += countEach_tDBOutput_2;
							}
							rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
							
						}
            	    	
            	    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_2 = 0;
					for(int countEach_tDBOutput_2: e.getUpdateCounts()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
					
            	    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
            	    	
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_tDBOutput_2 != null) {
			
				pstmt_tDBOutput_2.close();
				resourceMap.remove("pstmt_tDBOutput_2");
			
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"meteo_project_manager");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */









						if(execStat){
							runStat.updateStatOnConnection("iterate1", 2, "exec" + NB_ITERATE_tHttpRequest_1);
						}				
					




	
	/**
	 * [tFlowToIterate_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";
	
	

 



/**
 * [tFlowToIterate_1 process_data_end ] stop
 */

} // End of branch "liste_projet"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);

 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tFlowToIterate_1 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";
	
	

globalMap.put("tFlowToIterate_1_NB_LINE",nb_line_tFlowToIterate_1);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"liste_projet");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_1", true);
end_Hash.put("tFlowToIterate_1", System.currentTimeMillis());




/**
 * [tFlowToIterate_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tDBInput_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_1 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";
	
	

 



/**
 * [tFlowToIterate_1 finally ] stop
 */

	
	/**
	 * [tHttpRequest_1 finally ] start
	 */

	

	
	
	currentComponent="tHttpRequest_1";
	
	

 



/**
 * [tHttpRequest_1 finally ] stop
 */

	
	/**
	 * [tExtractJSONFields_1 finally ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_1";
	
	

 



/**
 * [tExtractJSONFields_1 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */


















				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class avancement_delaiStruct implements routines.system.IPersistableRow<avancement_delaiStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return true;
				}
				public Integer id_projet_tpLength(){
				    return 255;
				}
				public Integer id_projet_tpPrecision(){
				    return 0;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return null;
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				
			    public Double avancement;

				public Double getAvancement () {
					return this.avancement;
				}

				public Boolean avancementIsNullable(){
				    return true;
				}
				public Boolean avancementIsKey(){
				    return false;
				}
				public Integer avancementLength(){
				    return 255;
				}
				public Integer avancementPrecision(){
				    return 0;
				}
				public String avancementDefault(){
				
					return null;
				
				}
				public String avancementComment(){
				
				    return null;
				
				}
				public String avancementPattern(){
				
					return "";
				
				}
				public String avancementOriginalDbColumnName(){
				
					return "avancement";
				
				}

				
			    public Double delai;

				public Double getDelai () {
					return this.delai;
				}

				public Boolean delaiIsNullable(){
				    return true;
				}
				public Boolean delaiIsKey(){
				    return false;
				}
				public Integer delaiLength(){
				    return 255;
				}
				public Integer delaiPrecision(){
				    return 0;
				}
				public String delaiDefault(){
				
					return null;
				
				}
				public String delaiComment(){
				
				    return null;
				
				}
				public String delaiPattern(){
				
					return "";
				
				}
				public String delaiOriginalDbColumnName(){
				
					return "delai";
				
				}

				
			    public java.util.Date date_insert;

				public java.util.Date getDate_insert () {
					return this.date_insert;
				}

				public Boolean date_insertIsNullable(){
				    return true;
				}
				public Boolean date_insertIsKey(){
				    return false;
				}
				public Integer date_insertLength(){
				    return 23;
				}
				public Integer date_insertPrecision(){
				    return 3;
				}
				public String date_insertDefault(){
				
					return null;
				
				}
				public String date_insertComment(){
				
				    return null;
				
				}
				public String date_insertPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String date_insertOriginalDbColumnName(){
				
					return "date_insert";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 255;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return null;
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
					return "";
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.id_projet_tp == null) ? 0 : this.id_projet_tp.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final avancement_delaiStruct other = (avancement_delaiStruct) obj;
		
						if (this.id_projet_tp == null) {
							if (other.id_projet_tp != null)
								return false;
						
						} else if (!this.id_projet_tp.equals(other.id_projet_tp))
						
							return false;
					

		return true;
    }

	public void copyDataTo(avancement_delaiStruct other) {

		other.id_projet_tp = this.id_projet_tp;
	            other.avancement = this.avancement;
	            other.delai = this.delai;
	            other.date_insert = this.date_insert;
	            other.pid = this.pid;
	            
	}

	public void copyKeysDataTo(avancement_delaiStruct other) {

		other.id_projet_tp = this.id_projet_tp;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.avancement = null;
           				} else {
           			    	this.avancement = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.delai = null;
           				} else {
           			    	this.delai = dis.readDouble();
           				}
					
					this.date_insert = readDate(dis);
					
					this.pid = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.avancement = null;
           				} else {
           			    	this.avancement = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.delai = null;
           				} else {
           			    	this.delai = dis.readDouble();
           				}
					
					this.date_insert = readDate(dis);
					
					this.pid = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// Double
				
						if(this.avancement == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.avancement);
		            	}
					
					// Double
				
						if(this.delai == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.delai);
		            	}
					
					// java.util.Date
				
						writeDate(this.date_insert,dos);
					
					// String
				
						writeString(this.pid,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// Double
				
						if(this.avancement == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.avancement);
		            	}
					
					// Double
				
						if(this.delai == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.delai);
		            	}
					
					// java.util.Date
				
						writeDate(this.date_insert,dos);
					
					// String
				
						writeString(this.pid,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
		sb.append(",avancement="+String.valueOf(avancement));
		sb.append(",delai="+String.valueOf(delai));
		sb.append(",date_insert="+String.valueOf(date_insert));
		sb.append(",pid="+pid);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(avancement_delaiStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_projet_tp, other.id_projet_tp);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return null;
				}
				public Integer id_projet_tpPrecision(){
				    return null;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				
			    public Double avancement;

				public Double getAvancement () {
					return this.avancement;
				}

				public Boolean avancementIsNullable(){
				    return true;
				}
				public Boolean avancementIsKey(){
				    return false;
				}
				public Integer avancementLength(){
				    return null;
				}
				public Integer avancementPrecision(){
				    return null;
				}
				public String avancementDefault(){
				
					return null;
				
				}
				public String avancementComment(){
				
				    return "";
				
				}
				public String avancementPattern(){
				
					return "";
				
				}
				public String avancementOriginalDbColumnName(){
				
					return "avancement";
				
				}

				
			    public Double delai;

				public Double getDelai () {
					return this.delai;
				}

				public Boolean delaiIsNullable(){
				    return true;
				}
				public Boolean delaiIsKey(){
				    return false;
				}
				public Integer delaiLength(){
				    return null;
				}
				public Integer delaiPrecision(){
				    return null;
				}
				public String delaiDefault(){
				
					return null;
				
				}
				public String delaiComment(){
				
				    return "";
				
				}
				public String delaiPattern(){
				
					return "";
				
				}
				public String delaiOriginalDbColumnName(){
				
					return "delai";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.avancement = null;
           				} else {
           			    	this.avancement = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.delai = null;
           				} else {
           			    	this.delai = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.avancement = null;
           				} else {
           			    	this.avancement = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.delai = null;
           				} else {
           			    	this.delai = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// Double
				
						if(this.avancement == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.avancement);
		            	}
					
					// Double
				
						if(this.delai == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.delai);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
					// Double
				
						if(this.avancement == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.avancement);
		            	}
					
					// Double
				
						if(this.delai == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.delai);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
		sb.append(",avancement="+String.valueOf(avancement));
		sb.append(",delai="+String.valueOf(delai));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String ResponseContent;

				public String getResponseContent () {
					return this.ResponseContent;
				}

				public Boolean ResponseContentIsNullable(){
				    return true;
				}
				public Boolean ResponseContentIsKey(){
				    return false;
				}
				public Integer ResponseContentLength(){
				    return 0;
				}
				public Integer ResponseContentPrecision(){
				    return 0;
				}
				public String ResponseContentDefault(){
				
					return "";
				
				}
				public String ResponseContentComment(){
				
				    return null;
				
				}
				public String ResponseContentPattern(){
				
				    return null;
				
				}
				public String ResponseContentOriginalDbColumnName(){
				
					return "ResponseContent";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.ResponseContent = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.ResponseContent = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ResponseContent,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ResponseContent,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ResponseContent="+ResponseContent);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class liste_projet_2Struct implements routines.system.IPersistableRow<liste_projet_2Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return 255;
				}
				public Integer id_projet_tpPrecision(){
				    return 0;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(liste_projet_2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public String id_projet_tp;

				public String getId_projet_tp () {
					return this.id_projet_tp;
				}

				public Boolean id_projet_tpIsNullable(){
				    return true;
				}
				public Boolean id_projet_tpIsKey(){
				    return false;
				}
				public Integer id_projet_tpLength(){
				    return null;
				}
				public Integer id_projet_tpPrecision(){
				    return null;
				}
				public String id_projet_tpDefault(){
				
					return null;
				
				}
				public String id_projet_tpComment(){
				
				    return "";
				
				}
				public String id_projet_tpPattern(){
				
					return "";
				
				}
				public String id_projet_tpOriginalDbColumnName(){
				
					return "id_projet_tp";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.id_projet_tp = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.id_projet_tp,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_projet_tp="+id_projet_tp);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row4Struct row4 = new row4Struct();
liste_projet_2Struct liste_projet_2 = new liste_projet_2Struct();
row5Struct row5 = new row5Struct();
row7Struct row7 = new row7Struct();
avancement_delaiStruct avancement_delai = new avancement_delaiStruct();





	
	/**
	 * [tFlowToIterate_2 begin ] start
	 */

				
			int NB_ITERATE_tHttpRequest_2 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_2", false);
		start_Hash.put("tFlowToIterate_2", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_2";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"liste_projet_2");
					}
				
		int tos_count_tFlowToIterate_2 = 0;
		

int nb_line_tFlowToIterate_2 = 0;
int counter_tFlowToIterate_2 = 0;

 



/**
 * [tFlowToIterate_2 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
liste_projet_2Struct liste_projet_2_tmp = new liste_projet_2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";
	
	
		int tos_count_tDBInput_2 = 0;
		
	
    
	
			org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_2 = org.talend.designer.components.util.mssql.MSSqlUtilFactory.getMSSqlGenerateTimestampUtil();
			
			java.util.List<String> talendToDBList_tDBInput_2 = new java.util.ArrayList();
			String[] talendToDBArray_tDBInput_2  = new String[]{"FLOAT","NUMERIC","NUMERIC IDENTITY","DECIMAL","DECIMAL IDENTITY","REAL"}; 
			java.util.Collections.addAll(talendToDBList_tDBInput_2, talendToDBArray_tDBInput_2); 
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
			String dbschema_tDBInput_2 = (String)globalMap.get("dbschema_tDBConnection_1");
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT id_projet_tp\nFROM sa.projet";
		    

		    globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);

		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row4.id_projet_tp = null;
							} else {
	                         		
           		tmpContent_tDBInput_2 = rs_tDBInput_2.getString(1);
            if(tmpContent_tDBInput_2 != null) {
            	if (talendToDBList_tDBInput_2 .contains(rsmd_tDBInput_2.getColumnTypeName(1).toUpperCase(java.util.Locale.ENGLISH))) {
            		row4.id_projet_tp = FormatterUtils.formatUnwithE(tmpContent_tDBInput_2);
            	} else {
                	row4.id_projet_tp = tmpContent_tDBInput_2;
                }
            } else {
                row4.id_projet_tp = null;
            }
		                    }
					





 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_4 = false;
		boolean mainRowRejected_tMap_4 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

liste_projet_2 = null;


// # Output table : 'liste_projet_2'
liste_projet_2_tmp.id_projet_tp = row4.id_projet_tp ;
liste_projet_2 = liste_projet_2_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "liste_projet_2"
if(liste_projet_2 != null) { 



	
	/**
	 * [tFlowToIterate_2 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"liste_projet_2"
						
						);
					}
					


    	            
            globalMap.put("liste_projet_2.id_projet_tp", liste_projet_2.id_projet_tp);
    	
 
	   nb_line_tFlowToIterate_2++;  
       counter_tFlowToIterate_2++;
       globalMap.put("tFlowToIterate_2_CURRENT_ITERATION", counter_tFlowToIterate_2);
 


	tos_count_tFlowToIterate_2++;

/**
 * [tFlowToIterate_2 main ] stop
 */
	
	/**
	 * [tFlowToIterate_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";
	
	

 



/**
 * [tFlowToIterate_2 process_data_begin ] stop
 */
	NB_ITERATE_tHttpRequest_2++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row7", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("avancement_delai", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row5", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate2", 1, "exec" + NB_ITERATE_tHttpRequest_2);
					//Thread.sleep(1000);
				}				
			




	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"avancement_delai");
					}
				
		int tos_count_tDBOutput_4 = 0;
		



int nb_line_tDBOutput_4 = 0;
int nb_line_update_tDBOutput_4 = 0;
int nb_line_inserted_tDBOutput_4 = 0;
int nb_line_deleted_tDBOutput_4 = 0;
int nb_line_rejected_tDBOutput_4 = 0;

int deletedCount_tDBOutput_4=0;
int updatedCount_tDBOutput_4=0;
int insertedCount_tDBOutput_4=0;
int rowsToCommitCount_tDBOutput_4=0;
int rejectedCount_tDBOutput_4=0;
String dbschema_tDBOutput_4 = null;
String tableName_tDBOutput_4 = null;
boolean whetherReject_tDBOutput_4 = false;

java.util.Calendar calendar_tDBOutput_4 = java.util.Calendar.getInstance();
long year1_tDBOutput_4 = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_tDBOutput_4 = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_tDBOutput_4 = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_tDBOutput_4;

java.util.Calendar calendar_datetimeoffset_tDBOutput_4 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));


        int updateKeyCount_tDBOutput_4 = 1;
        if(updateKeyCount_tDBOutput_4 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_4 == 5 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
        }

	
java.sql.Connection conn_tDBOutput_4 = null;
String dbUser_tDBOutput_4 = null;
	dbschema_tDBOutput_4 = (String)globalMap.get("dbschema_tDBConnection_1");
	
	conn_tDBOutput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
   int batchSize_tDBOutput_4 = 10000;
   int batchSizeCounter_tDBOutput_4=0;

if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
    tableName_tDBOutput_4 = "projet";
} else {
    tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "].[" + "projet";
}
	int count_tDBOutput_4=0;

    java.sql.PreparedStatement pstmt_tDBOutput_4 = null;
    java.sql.PreparedStatement pstmtInsert_tDBOutput_4 = null;
    java.sql.PreparedStatement pstmtUpdate_tDBOutput_4 = null;
        String update_tDBOutput_4 = "UPDATE [" + tableName_tDBOutput_4 + "] SET [avancement] = ?,[delai] = ?,[date_insert] = ?,[pid] = ? WHERE [id_projet_tp] = ?";
        pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(update_tDBOutput_4);
        resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);
 	boolean isShareIdentity_tDBOutput_4 = globalMap.get("shareIdentitySetting_tDBConnection_1") != null && (Boolean)globalMap.get("shareIdentitySetting_tDBConnection_1") == true;

 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
					}
				
		int tos_count_tMap_5 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_5__Struct  {
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
avancement_delaiStruct avancement_delai_tmp = new avancement_delaiStruct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */



	
	/**
	 * [tExtractJSONFields_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tExtractJSONFields_3", false);
		start_Hash.put("tExtractJSONFields_3", System.currentTimeMillis());
		
	
	currentComponent="tExtractJSONFields_3";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
					}
				
		int tos_count_tExtractJSONFields_3 = 0;
		

int nb_line_tExtractJSONFields_3 = 0;
String jsonStr_tExtractJSONFields_3 = "";

	

class JsonPathCache_tExtractJSONFields_3 {
	final java.util.Map<String,com.jayway.jsonpath.JsonPath> jsonPathString2compiledJsonPath = new java.util.HashMap<String,com.jayway.jsonpath.JsonPath>();
	
	public com.jayway.jsonpath.JsonPath getCompiledJsonPath(String jsonPath) {
		if(jsonPathString2compiledJsonPath.containsKey(jsonPath)) {
			return jsonPathString2compiledJsonPath.get(jsonPath);
		} else {
			com.jayway.jsonpath.JsonPath compiledLoopPath = com.jayway.jsonpath.JsonPath.compile(jsonPath);
			jsonPathString2compiledJsonPath.put(jsonPath,compiledLoopPath);
			return compiledLoopPath;
		}
	}
}

JsonPathCache_tExtractJSONFields_3 jsonPathCache_tExtractJSONFields_3 = new JsonPathCache_tExtractJSONFields_3();

 



/**
 * [tExtractJSONFields_3 begin ] stop
 */



	
	/**
	 * [tHttpRequest_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tHttpRequest_2", false);
		start_Hash.put("tHttpRequest_2", System.currentTimeMillis());
		
	
	currentComponent="tHttpRequest_2";
	
	
		int tos_count_tHttpRequest_2 = 0;
		

 



/**
 * [tHttpRequest_2 begin ] stop
 */
	
	/**
	 * [tHttpRequest_2 main ] start
	 */

	

	
	
	currentComponent="tHttpRequest_2";
	
	


int connectTimeOut_tHttpRequest_2 = Integer.valueOf(30)*1000;
int readTimeOut_tHttpRequest_2 = Integer.valueOf(0)*1000;

java.net.URL url_tHttpRequest_2 = new java.net.URL("https://pma.timeperformance.com/api/v4/projects/"+((String)globalMap.get("liste_projet_2.id_projet_tp"))+"/progressReport");

  java.net.Authenticator.setDefault(new java.net.Authenticator() {
      protected java.net.PasswordAuthentication getPasswordAuthentication() {

 
	final String decryptedPassword_tHttpRequest_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:KlUizd1V46uqOKkTHq0cREoo7jJ2EXDCrRzlFJqJU96d6+B3QI+keG6bTCXGzMUbWEWkDg==");

        return new java.net.PasswordAuthentication("1373486@at17209", decryptedPassword_tHttpRequest_2.toCharArray());
  }});
java.net.HttpURLConnection urlConn_tHttpRequest_2 = null;

if ("local".equals(System.getProperty("http.proxySet"))) {
    java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance().getProxyForUriString("https://pma.timeperformance.com/api/v4/projects/"+((String)globalMap.get("liste_projet_2.id_projet_tp"))+"/progressReport");
    urlConn_tHttpRequest_2 = (java.net.HttpURLConnection) url_tHttpRequest_2.openConnection(proxyToUse); 
} else {
    urlConn_tHttpRequest_2 = (java.net.HttpURLConnection) url_tHttpRequest_2.openConnection();
}
urlConn_tHttpRequest_2.setRequestMethod("GET");
urlConn_tHttpRequest_2.setDoOutput(true);
urlConn_tHttpRequest_2.setDoInput(true);
urlConn_tHttpRequest_2.setUseCaches(false);

boolean connected_tHttpRequest_2 = false;
int responseCode_tHttpRequest_2 = 0;
globalMap.put("tHttpRequest_2_CONNECTED", false);
try{
    urlConn_tHttpRequest_2.connect();
    connected_tHttpRequest_2 = true;
    globalMap.put("tHttpRequest_2_CONNECTED", true);

    byte[] buffer_tHttpRequest_2 = new byte[1024];
    int bos_buffer_tHttpRequest_2 = 0;java.io.ByteArrayOutputStream bytestream_tHttpRequest_2 = new java.io.ByteArrayOutputStream(); 

    responseCode_tHttpRequest_2 = urlConn_tHttpRequest_2.getResponseCode();
    globalMap.put("tHttpRequest_2_RESPONSE_CODE", responseCode_tHttpRequest_2);

    if ( responseCode_tHttpRequest_2 >= 200 && responseCode_tHttpRequest_2 < 300) { //Status code 2XX indicates success
        java.io.InputStream bis_tHttpRequest_2 = new java.io.BufferedInputStream(urlConn_tHttpRequest_2.getInputStream());
        while ((bos_buffer_tHttpRequest_2 = bis_tHttpRequest_2.read(buffer_tHttpRequest_2)) != -1) {bytestream_tHttpRequest_2.write(buffer_tHttpRequest_2,0,bos_buffer_tHttpRequest_2);
        }
        bis_tHttpRequest_2.close();
    } else {
    	String responseMessage_tHttpRequest_2 = urlConn_tHttpRequest_2.getResponseMessage();
    
        //get details response information which will be used when error appear
        java.io.InputStream err_stream_tHttpRequest_2 = urlConn_tHttpRequest_2.getErrorStream();
        if(err_stream_tHttpRequest_2!=null) {
            java.io.InputStream es_tHttpRequest_2 = new java.io.BufferedInputStream(err_stream_tHttpRequest_2);
        	java.io.ByteArrayOutputStream baos_tHttpRequest_2 = new java.io.ByteArrayOutputStream();
        	
        	byte[] buf_tHttpRequest_2 = new byte[1024];
            int read_tHttpRequest_2 = -1;
        	try {
            	while ((read_tHttpRequest_2 = es_tHttpRequest_2.read(buf_tHttpRequest_2)) > 0) {
            		baos_tHttpRequest_2.write(buf_tHttpRequest_2, 0, read_tHttpRequest_2);
            	}
        	} finally {
        		es_tHttpRequest_2.close();
        	}
        
        	responseMessage_tHttpRequest_2 += ("\n" + new String(baos_tHttpRequest_2.toByteArray()));
        }
    	
            System.err.println(responseCode_tHttpRequest_2 + " " + responseMessage_tHttpRequest_2);
            globalMap.put("tHttpRequest_2" + "_ERROR_MESSAGE","Request failed:" + responseCode_tHttpRequest_2 + " " + responseMessage_tHttpRequest_2);
    }

                    row5.ResponseContent = new String(bytestream_tHttpRequest_2.toByteArray());
    urlConn_tHttpRequest_2.disconnect();
}catch(Exception e){
globalMap.put("tHttpRequest_2_ERROR_MESSAGE",e.getMessage());
        System.err.println(e.getMessage());
}

 


	tos_count_tHttpRequest_2++;

/**
 * [tHttpRequest_2 main ] stop
 */
	
	/**
	 * [tHttpRequest_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHttpRequest_2";
	
	

 



/**
 * [tHttpRequest_2 process_data_begin ] stop
 */

	
	/**
	 * [tExtractJSONFields_3 main ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_3";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					

            if(row5.ResponseContent!=null){// C_01
                jsonStr_tExtractJSONFields_3 = row5.ResponseContent.toString();
   
row7 = null;

	

String loopPath_tExtractJSONFields_3 = "$";
java.util.List<Object> resultset_tExtractJSONFields_3 = new java.util.ArrayList<Object>();

boolean isStructError_tExtractJSONFields_3 = true;
com.jayway.jsonpath.ReadContext document_tExtractJSONFields_3 = null;
try {
	document_tExtractJSONFields_3 = com.jayway.jsonpath.JsonPath.parse(jsonStr_tExtractJSONFields_3);
	com.jayway.jsonpath.JsonPath compiledLoopPath_tExtractJSONFields_3 = jsonPathCache_tExtractJSONFields_3.getCompiledJsonPath(loopPath_tExtractJSONFields_3);
	Object result_tExtractJSONFields_3 = document_tExtractJSONFields_3.read(compiledLoopPath_tExtractJSONFields_3,net.minidev.json.JSONObject.class);
	if (result_tExtractJSONFields_3 instanceof net.minidev.json.JSONArray) {
		resultset_tExtractJSONFields_3 = (net.minidev.json.JSONArray) result_tExtractJSONFields_3;
	} else {
		resultset_tExtractJSONFields_3.add(result_tExtractJSONFields_3);
	}
	
	isStructError_tExtractJSONFields_3 = false;
} catch (java.lang.Exception ex_tExtractJSONFields_3) {
globalMap.put("tExtractJSONFields_3_ERROR_MESSAGE",ex_tExtractJSONFields_3.getMessage());
		System.err.println(ex_tExtractJSONFields_3.getMessage());
}

String jsonPath_tExtractJSONFields_3 = null;
com.jayway.jsonpath.JsonPath compiledJsonPath_tExtractJSONFields_3 = null;

Object value_tExtractJSONFields_3 = null;

Object root_tExtractJSONFields_3 = null;
for(int i_tExtractJSONFields_3=0; isStructError_tExtractJSONFields_3 || (i_tExtractJSONFields_3 < resultset_tExtractJSONFields_3.size());i_tExtractJSONFields_3++){
	if(!isStructError_tExtractJSONFields_3){
		Object row_tExtractJSONFields_3 = resultset_tExtractJSONFields_3.get(i_tExtractJSONFields_3);
            row7 = null;
	row7 = new row7Struct();
	nb_line_tExtractJSONFields_3++;
	try {
		jsonPath_tExtractJSONFields_3 = "$.element.id";
		compiledJsonPath_tExtractJSONFields_3 = jsonPathCache_tExtractJSONFields_3.getCompiledJsonPath(jsonPath_tExtractJSONFields_3);
		
		try {
		    
		        value_tExtractJSONFields_3 = compiledJsonPath_tExtractJSONFields_3.read(row_tExtractJSONFields_3);
		    
				row7.id_projet_tp = value_tExtractJSONFields_3 == null ? 

		null

 : value_tExtractJSONFields_3.toString();
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_3) {
globalMap.put("tExtractJSONFields_3_ERROR_MESSAGE",e_tExtractJSONFields_3.getMessage());
			row7.id_projet_tp = 

		null

;
		}
		jsonPath_tExtractJSONFields_3 = "$.progress";
		compiledJsonPath_tExtractJSONFields_3 = jsonPathCache_tExtractJSONFields_3.getCompiledJsonPath(jsonPath_tExtractJSONFields_3);
		
		try {
		    
		        value_tExtractJSONFields_3 = compiledJsonPath_tExtractJSONFields_3.read(row_tExtractJSONFields_3);
		    
				if(value_tExtractJSONFields_3 != null && !value_tExtractJSONFields_3.toString().isEmpty()) {
					row7.avancement = ParserUtils.parseTo_Double(value_tExtractJSONFields_3.toString());
				} else {
					row7.avancement = 

		null

;
				}
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_3) {
globalMap.put("tExtractJSONFields_3_ERROR_MESSAGE",e_tExtractJSONFields_3.getMessage());
			row7.avancement = 

		null

;
		}
		jsonPath_tExtractJSONFields_3 = "$.scheduleVariance";
		compiledJsonPath_tExtractJSONFields_3 = jsonPathCache_tExtractJSONFields_3.getCompiledJsonPath(jsonPath_tExtractJSONFields_3);
		
		try {
		    
		        value_tExtractJSONFields_3 = compiledJsonPath_tExtractJSONFields_3.read(row_tExtractJSONFields_3);
		    
				if(value_tExtractJSONFields_3 != null && !value_tExtractJSONFields_3.toString().isEmpty()) {
					row7.delai = ParserUtils.parseTo_Double(value_tExtractJSONFields_3.toString());
				} else {
					row7.delai = 

		null

;
				}
		} catch (com.jayway.jsonpath.PathNotFoundException e_tExtractJSONFields_3) {
globalMap.put("tExtractJSONFields_3_ERROR_MESSAGE",e_tExtractJSONFields_3.getMessage());
			row7.delai = 

		null

;
		}	
	} catch (java.lang.Exception ex_tExtractJSONFields_3) {
globalMap.put("tExtractJSONFields_3_ERROR_MESSAGE",ex_tExtractJSONFields_3.getMessage());
		    System.err.println(ex_tExtractJSONFields_3.getMessage());
		    row7 = null;	
	}
	
	}
    
	isStructError_tExtractJSONFields_3 = false;
	
//}


 


	tos_count_tExtractJSONFields_3++;

/**
 * [tExtractJSONFields_3 main ] stop
 */
	
	/**
	 * [tExtractJSONFields_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_3";
	
	

 



/**
 * [tExtractJSONFields_3 process_data_begin ] stop
 */
// Start of branch "row7"
if(row7 != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_5 = false;
		boolean mainRowRejected_tMap_5 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_5__Struct Var = Var__tMap_5;// ###############################
        // ###############################
        // # Output tables

avancement_delai = null;


// # Output table : 'avancement_delai'
avancement_delai_tmp.id_projet_tp = row7.id_projet_tp ;
avancement_delai_tmp.avancement = row7.avancement ;
avancement_delai_tmp.delai = row7.delai ;
avancement_delai_tmp.date_insert = TalendDate.getCurrentDate() ;
avancement_delai_tmp.pid = this.pid;
avancement_delai = avancement_delai_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "avancement_delai"
if(avancement_delai != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"avancement_delai"
						
						);
					}
					



        whetherReject_tDBOutput_4 = false;
                    if(avancement_delai.avancement == null) {
pstmt_tDBOutput_4.setNull(1, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_4.setDouble(1, avancement_delai.avancement);
}

                    if(avancement_delai.delai == null) {
pstmt_tDBOutput_4.setNull(2, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_4.setDouble(2, avancement_delai.delai);
}

                    if(avancement_delai.date_insert != null) {
pstmt_tDBOutput_4.setTimestamp(3, new java.sql.Timestamp(avancement_delai.date_insert.getTime()));
} else {
pstmt_tDBOutput_4.setNull(3, java.sql.Types.TIMESTAMP);
}

                    if(avancement_delai.pid == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(4, avancement_delai.pid);
}


                    if(avancement_delai.id_projet_tp == null) {
pstmt_tDBOutput_4.setNull(5 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(5 + count_tDBOutput_4, avancement_delai.id_projet_tp);
}


    		pstmt_tDBOutput_4.addBatch();
    		nb_line_tDBOutput_4++;
    		
    		
    		batchSizeCounter_tDBOutput_4++;
    		
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_tDBOutput_4{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_tDBOutput_4) throws Exception {
                try {
						
						for(int countEach_tDBOutput_4: pstmt_tDBOutput_4.executeBatch()) {
							if(countEach_tDBOutput_4 == -2 || countEach_tDBOutput_4 == -3) {
								break;
							}
							counter += countEach_tDBOutput_4;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_4 = 0;
					for(int countEach_tDBOutput_4: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
					}
				
            	    	
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_tDBOutput_4) throws Exception {
                try {
                		
						for(int countEach_tDBOutput_4: pstmt_tDBOutput_4.executeBatch()) {
							if(countEach_tDBOutput_4 == -2 || countEach_tDBOutput_4 == -3) {
								break;
							}
							counter += countEach_tDBOutput_4;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_tDBOutput_4: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
					}
					
            	    	
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_tDBOutput_4 > 0) && (batchSize_tDBOutput_4 <= batchSizeCounter_tDBOutput_4)) {
    		
    		            
            	    		updatedCount_tDBOutput_4 = new LimitBytesHelper_tDBOutput_4().limitBytePart1(updatedCount_tDBOutput_4,pstmt_tDBOutput_4);
            	    		rowsToCommitCount_tDBOutput_4 = updatedCount_tDBOutput_4;
            	    	
    			
			    batchSizeCounter_tDBOutput_4 = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "avancement_delai"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "row7"

		// end for
	}


	
		} // C_01
	
	
	/**
	 * [tExtractJSONFields_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_3";
	
	

 



/**
 * [tExtractJSONFields_3 process_data_end ] stop
 */



	
	/**
	 * [tHttpRequest_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tHttpRequest_2";
	
	

 



/**
 * [tHttpRequest_2 process_data_end ] stop
 */
	
	/**
	 * [tHttpRequest_2 end ] start
	 */

	

	
	
	currentComponent="tHttpRequest_2";
	
	

 

ok_Hash.put("tHttpRequest_2", true);
end_Hash.put("tHttpRequest_2", System.currentTimeMillis());




/**
 * [tHttpRequest_2 end ] stop
 */

	
	/**
	 * [tExtractJSONFields_3 end ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_3";
	
	
   globalMap.put("tExtractJSONFields_3_NB_LINE", nb_line_tExtractJSONFields_3);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tExtractJSONFields_3", true);
end_Hash.put("tExtractJSONFields_3", System.currentTimeMillis());




/**
 * [tExtractJSONFields_3 end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	



                try {
						int countSum_tDBOutput_4 = 0;
						if (pstmt_tDBOutput_4 != null && batchSizeCounter_tDBOutput_4 > 0) {
							
							for(int countEach_tDBOutput_4: pstmt_tDBOutput_4.executeBatch()) {
								if(countEach_tDBOutput_4 == -2 || countEach_tDBOutput_4 == -3) {
									break;
								}
								countSum_tDBOutput_4 += countEach_tDBOutput_4;
							}
							rowsToCommitCount_tDBOutput_4 += countSum_tDBOutput_4;
							
						}
            	    	
            	    		updatedCount_tDBOutput_4 += countSum_tDBOutput_4;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_4 = 0;
					for(int countEach_tDBOutput_4: e.getUpdateCounts()) {
						countSum_tDBOutput_4 += (countEach_tDBOutput_4 < 0 ? 0 : countEach_tDBOutput_4);
					}
					rowsToCommitCount_tDBOutput_4 += countSum_tDBOutput_4;
					
            	    		updatedCount_tDBOutput_4 += countSum_tDBOutput_4;
            	    	
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_tDBOutput_4 != null) {
			
				pstmt_tDBOutput_4.close();
				resourceMap.remove("pstmt_tDBOutput_4");
			
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);

	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"avancement_delai");
			  	}
			  	
 

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
 */









						if(execStat){
							runStat.updateStatOnConnection("iterate2", 2, "exec" + NB_ITERATE_tHttpRequest_2);
						}				
					




	
	/**
	 * [tFlowToIterate_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";
	
	

 



/**
 * [tFlowToIterate_2 process_data_end ] stop
 */

} // End of branch "liste_projet_2"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);

 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tFlowToIterate_2 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";
	
	

globalMap.put("tFlowToIterate_2_NB_LINE",nb_line_tFlowToIterate_2);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"liste_projet_2");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_2", true);
end_Hash.put("tFlowToIterate_2", System.currentTimeMillis());




/**
 * [tFlowToIterate_2 end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_2 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";
	
	

 



/**
 * [tFlowToIterate_2 finally ] stop
 */

	
	/**
	 * [tHttpRequest_2 finally ] start
	 */

	

	
	
	currentComponent="tHttpRequest_2";
	
	

 



/**
 * [tHttpRequest_2 finally ] stop
 */

	
	/**
	 * [tExtractJSONFields_3 finally ] start
	 */

	

	
	
	currentComponent="tExtractJSONFields_3";
	
	

 



/**
 * [tExtractJSONFields_3 finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */


















				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public void connectionStatsLogs_CommitProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("connectionStatsLogs_Commit_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [connectionStatsLogs_Commit begin ] start
	 */

	

	
		
		ok_Hash.put("connectionStatsLogs_Commit", false);
		start_Hash.put("connectionStatsLogs_Commit", System.currentTimeMillis());
		
	
	currentComponent="connectionStatsLogs_Commit";
	
	
		int tos_count_connectionStatsLogs_Commit = 0;
		

 



/**
 * [connectionStatsLogs_Commit begin ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit main ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";
	
	

	java.sql.Connection conn_connectionStatsLogs_Commit = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
	if(conn_connectionStatsLogs_Commit != null && !conn_connectionStatsLogs_Commit.isClosed())
	{
	
			
			conn_connectionStatsLogs_Commit.commit();
			
	
	}

 


	tos_count_connectionStatsLogs_Commit++;

/**
 * [connectionStatsLogs_Commit main ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit process_data_begin ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";
	
	

 



/**
 * [connectionStatsLogs_Commit process_data_begin ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit process_data_end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";
	
	

 



/**
 * [connectionStatsLogs_Commit process_data_end ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";
	
	

 

ok_Hash.put("connectionStatsLogs_Commit", true);
end_Hash.put("connectionStatsLogs_Commit", System.currentTimeMillis());




/**
 * [connectionStatsLogs_Commit end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [connectionStatsLogs_Commit finally ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";
	
	

 



/**
 * [connectionStatsLogs_Commit finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("connectionStatsLogs_Commit_SUBPROCESS_STATE", 1);
	}
	


public void connectionStatsLogsProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("connectionStatsLogs_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [connectionStatsLogs begin ] start
	 */

	

	
		
		ok_Hash.put("connectionStatsLogs", false);
		start_Hash.put("connectionStatsLogs", System.currentTimeMillis());
		
	
	currentComponent="connectionStatsLogs";
	
	
		int tos_count_connectionStatsLogs = 0;
		
	

	
			String url_connectionStatsLogs = "jdbc:jtds:sqlserver://" + context.JOURNAL_Server ;
		String port_connectionStatsLogs = context.JOURNAL_Port;
		String dbname_connectionStatsLogs = context.JOURNAL_Database ;
    	if (!"".equals(port_connectionStatsLogs)) {
    		url_connectionStatsLogs += ":" + context.JOURNAL_Port;
    	}
    	if (!"".equals(dbname_connectionStatsLogs)) {
    		
				url_connectionStatsLogs += "//" + context.JOURNAL_Database; 
    	}

		url_connectionStatsLogs += ";appName=" + projectName + ";" + "";  
	String dbUser_connectionStatsLogs = context.JOURNAL_Login;
	
	
		
	final String decryptedPassword_connectionStatsLogs = context.JOURNAL_password; 
		String dbPwd_connectionStatsLogs = decryptedPassword_connectionStatsLogs;
	
	
	java.sql.Connection conn_connectionStatsLogs = null;
	
	
			String sharedConnectionName_connectionStatsLogs = "StatsAndLog_Shared_Connection";
			conn_connectionStatsLogs = SharedDBConnection.getDBConnection("net.sourceforge.jtds.jdbc.Driver",url_connectionStatsLogs,dbUser_connectionStatsLogs , dbPwd_connectionStatsLogs , sharedConnectionName_connectionStatsLogs);
			globalMap.put("conn_connectionStatsLogs", conn_connectionStatsLogs);
	if (null != conn_connectionStatsLogs) {
		
			conn_connectionStatsLogs.setAutoCommit(false);
	}

	globalMap.put("dbschema_connectionStatsLogs", context.JOURNAL_Schema);

	globalMap.put("db_connectionStatsLogs",  context.JOURNAL_Database);
	
	globalMap.put("shareIdentitySetting_connectionStatsLogs",  false);

	globalMap.put("driver_connectionStatsLogs", "JTDS");

 



/**
 * [connectionStatsLogs begin ] stop
 */
	
	/**
	 * [connectionStatsLogs main ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";
	
	

 


	tos_count_connectionStatsLogs++;

/**
 * [connectionStatsLogs main ] stop
 */
	
	/**
	 * [connectionStatsLogs process_data_begin ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";
	
	

 



/**
 * [connectionStatsLogs process_data_begin ] stop
 */
	
	/**
	 * [connectionStatsLogs process_data_end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";
	
	

 



/**
 * [connectionStatsLogs process_data_end ] stop
 */
	
	/**
	 * [connectionStatsLogs end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";
	
	

 

ok_Hash.put("connectionStatsLogs", true);
end_Hash.put("connectionStatsLogs", System.currentTimeMillis());




/**
 * [connectionStatsLogs end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [connectionStatsLogs finally ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";
	
	

 



/**
 * [connectionStatsLogs finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("connectionStatsLogs_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendStats_STATSStruct implements routines.system.IPersistableRow<row_talendStats_STATSStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public Long system_pid;

				public Long getSystem_pid () {
					return this.system_pid;
				}

				public Boolean system_pidIsNullable(){
				    return true;
				}
				public Boolean system_pidIsKey(){
				    return false;
				}
				public Integer system_pidLength(){
				    return 8;
				}
				public Integer system_pidPrecision(){
				    return 0;
				}
				public String system_pidDefault(){
				
					return "";
				
				}
				public String system_pidComment(){
				
				    return null;
				
				}
				public String system_pidPattern(){
				
				    return null;
				
				}
				public String system_pidOriginalDbColumnName(){
				
					return "system_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String job_repository_id;

				public String getJob_repository_id () {
					return this.job_repository_id;
				}

				public Boolean job_repository_idIsNullable(){
				    return true;
				}
				public Boolean job_repository_idIsKey(){
				    return false;
				}
				public Integer job_repository_idLength(){
				    return 255;
				}
				public Integer job_repository_idPrecision(){
				    return 0;
				}
				public String job_repository_idDefault(){
				
					return "";
				
				}
				public String job_repository_idComment(){
				
				    return null;
				
				}
				public String job_repository_idPattern(){
				
				    return null;
				
				}
				public String job_repository_idOriginalDbColumnName(){
				
					return "job_repository_id";
				
				}

				
			    public String job_version;

				public String getJob_version () {
					return this.job_version;
				}

				public Boolean job_versionIsNullable(){
				    return true;
				}
				public Boolean job_versionIsKey(){
				    return false;
				}
				public Integer job_versionLength(){
				    return 255;
				}
				public Integer job_versionPrecision(){
				    return 0;
				}
				public String job_versionDefault(){
				
					return "";
				
				}
				public String job_versionComment(){
				
				    return null;
				
				}
				public String job_versionPattern(){
				
				    return null;
				
				}
				public String job_versionOriginalDbColumnName(){
				
					return "job_version";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String message_type;

				public String getMessage_type () {
					return this.message_type;
				}

				public Boolean message_typeIsNullable(){
				    return true;
				}
				public Boolean message_typeIsKey(){
				    return false;
				}
				public Integer message_typeLength(){
				    return 255;
				}
				public Integer message_typePrecision(){
				    return 0;
				}
				public String message_typeDefault(){
				
					return "";
				
				}
				public String message_typeComment(){
				
				    return null;
				
				}
				public String message_typePattern(){
				
				    return null;
				
				}
				public String message_typeOriginalDbColumnName(){
				
					return "message_type";
				
				}

				
			    public String message;

				public String getMessage () {
					return this.message;
				}

				public Boolean messageIsNullable(){
				    return true;
				}
				public Boolean messageIsKey(){
				    return false;
				}
				public Integer messageLength(){
				    return 255;
				}
				public Integer messagePrecision(){
				    return 0;
				}
				public String messageDefault(){
				
					return "";
				
				}
				public String messageComment(){
				
				    return null;
				
				}
				public String messagePattern(){
				
				    return null;
				
				}
				public String messageOriginalDbColumnName(){
				
					return "message";
				
				}

				
			    public Long duration;

				public Long getDuration () {
					return this.duration;
				}

				public Boolean durationIsNullable(){
				    return true;
				}
				public Boolean durationIsKey(){
				    return false;
				}
				public Integer durationLength(){
				    return 8;
				}
				public Integer durationPrecision(){
				    return 0;
				}
				public String durationDefault(){
				
					return "";
				
				}
				public String durationComment(){
				
				    return null;
				
				}
				public String durationPattern(){
				
				    return null;
				
				}
				public String durationOriginalDbColumnName(){
				
					return "duration";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.root_pid = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.system_pid = null;
           				} else {
           			    	this.system_pid = dis.readLong();
           				}
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.job_repository_id = readString(dis);
					
					this.job_version = readString(dis);
					
					this.context = readString(dis);
					
					this.origin = readString(dis);
					
					this.message_type = readString(dis);
					
					this.message = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.duration = null;
           				} else {
           			    	this.duration = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.root_pid = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.system_pid = null;
           				} else {
           			    	this.system_pid = dis.readLong();
           				}
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.job_repository_id = readString(dis);
					
					this.job_version = readString(dis);
					
					this.context = readString(dis);
					
					this.origin = readString(dis);
					
					this.message_type = readString(dis);
					
					this.message = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.duration = null;
           				} else {
           			    	this.duration = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message_type,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Long
				
						if(this.duration == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.duration);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message_type,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Long
				
						if(this.duration == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.duration);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",system_pid="+String.valueOf(system_pid));
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",job_repository_id="+job_repository_id);
		sb.append(",job_version="+job_version);
		sb.append(",context="+context);
		sb.append(",origin="+origin);
		sb.append(",message_type="+message_type);
		sb.append(",message="+message);
		sb.append(",duration="+String.valueOf(duration));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row_talendStats_STATSStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void talendStats_STATSProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendStats_STATS_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendStats_STATSStruct row_talendStats_STATS = new row_talendStats_STATSStruct();




	
	/**
	 * [talendStats_DB begin ] start
	 */

	

	
		
		ok_Hash.put("talendStats_DB", false);
		start_Hash.put("talendStats_DB", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendStats_DB = 0;
		



int nb_line_talendStats_DB = 0;
int nb_line_update_talendStats_DB = 0;
int nb_line_inserted_talendStats_DB = 0;
int nb_line_deleted_talendStats_DB = 0;
int nb_line_rejected_talendStats_DB = 0;

int deletedCount_talendStats_DB=0;
int updatedCount_talendStats_DB=0;
int insertedCount_talendStats_DB=0;
int rowsToCommitCount_talendStats_DB=0;
int rejectedCount_talendStats_DB=0;
String dbschema_talendStats_DB = null;
String tableName_talendStats_DB = null;
boolean whetherReject_talendStats_DB = false;

java.util.Calendar calendar_talendStats_DB = java.util.Calendar.getInstance();
long year1_talendStats_DB = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_talendStats_DB = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_talendStats_DB = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_talendStats_DB;

java.util.Calendar calendar_datetimeoffset_talendStats_DB = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));



	
java.sql.Connection conn_talendStats_DB = null;
String dbUser_talendStats_DB = null;
	dbschema_talendStats_DB = (String)globalMap.get("dbschema_connectionStatsLogs");
	
	conn_talendStats_DB = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
	
   int batchSize_talendStats_DB = 10000;
   int batchSizeCounter_talendStats_DB=0;

if(dbschema_talendStats_DB == null || dbschema_talendStats_DB.trim().length() == 0) {
    tableName_talendStats_DB = "stats";
} else {
    tableName_talendStats_DB = dbschema_talendStats_DB + "].[" + "stats";
}
	int count_talendStats_DB=0;


                    // [%connection%][checktable][tableName]
                    String keyCheckTable_talendStats_DB = conn_talendStats_DB + "[checktable]" + "[" + "stats" + "]";

                if(GlobalResource.resourceMap.get(keyCheckTable_talendStats_DB)== null){//}

                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_talendStats_DB)) {//}
                        if(GlobalResource.resourceMap.get(keyCheckTable_talendStats_DB)== null){//}
                                boolean whetherExist_talendStats_DB = false;
                                try (java.sql.Statement isExistStmt_talendStats_DB = conn_talendStats_DB.createStatement()) {
                                    try {
                                    	
                                        isExistStmt_talendStats_DB.execute("SELECT TOP 1 1 FROM [" + tableName_talendStats_DB + "]" );
                                        whetherExist_talendStats_DB = true;
                                    } catch (java.lang.Exception e){
globalMap.put("talendStats_DB_ERROR_MESSAGE",e.getMessage());
                                        whetherExist_talendStats_DB = false;
                                    }
                                }
                                if(!whetherExist_talendStats_DB) {
                                    try (java.sql.Statement stmtCreate_talendStats_DB = conn_talendStats_DB.createStatement()) {
                                        stmtCreate_talendStats_DB.execute("CREATE TABLE [" + tableName_talendStats_DB + "]([moment] DATETIME ,[pid] VARCHAR(20)  ,[father_pid] VARCHAR(20)  ,[root_pid] VARCHAR(20)  ,[system_pid] BIGINT ,[project] VARCHAR(50)  ,[job] VARCHAR(255)  ,[job_repository_id] VARCHAR(255)  ,[job_version] VARCHAR(255)  ,[context] VARCHAR(50)  ,[origin] VARCHAR(255)  ,[message_type] VARCHAR(255)  ,[message] VARCHAR(255)  ,[duration] BIGINT )");
                                    }
                                }
                            GlobalResource.resourceMap.put(keyCheckTable_talendStats_DB, true);
            //{{{
                        } // end of if
                    } // end synchronized
                }
    java.sql.PreparedStatement pstmt_talendStats_DB = null;
    java.sql.PreparedStatement pstmtInsert_talendStats_DB = null;
    java.sql.PreparedStatement pstmtUpdate_talendStats_DB = null;
        String insert_talendStats_DB = "INSERT INTO [" + tableName_talendStats_DB + "] ([moment],[pid],[father_pid],[root_pid],[system_pid],[project],[job],[job_repository_id],[job_version],[context],[origin],[message_type],[message],[duration]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        String keyPsmt_talendStats_DB = conn_talendStats_DB + "[psmt]" + "[" + "stats" + "]";
        pstmt_talendStats_DB = SharedDBPreparedStatement.getSharedPreparedStatement(conn_talendStats_DB,insert_talendStats_DB,keyPsmt_talendStats_DB);
        resourceMap.put("pstmt_talendStats_DB", pstmt_talendStats_DB);
        resourceMap.put("keyPsmt_talendStats_DB", keyPsmt_talendStats_DB);
 	boolean isShareIdentity_talendStats_DB = globalMap.get("shareIdentitySetting_connectionStatsLogs") != null && (Boolean)globalMap.get("shareIdentitySetting_connectionStatsLogs") == true;

 



/**
 * [talendStats_DB begin ] stop
 */



	
	/**
	 * [talendStats_STATS begin ] start
	 */

	

	
		
		ok_Hash.put("talendStats_STATS", false);
		start_Hash.put("talendStats_STATS", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	
		int tos_count_talendStats_STATS = 0;
		

	for (StatCatcherUtils.StatCatcherMessage scm : talendStats_STATS.getMessages()) {
		row_talendStats_STATS.pid = pid;
		row_talendStats_STATS.root_pid = rootPid;
		row_talendStats_STATS.father_pid = fatherPid;	
    	row_talendStats_STATS.project = projectName;
    	row_talendStats_STATS.job = jobName;
    	row_talendStats_STATS.context = contextStr;
		row_talendStats_STATS.origin = (scm.getOrigin()==null || scm.getOrigin().length()<1 ? null : scm.getOrigin());
		row_talendStats_STATS.message = scm.getMessage();
		row_talendStats_STATS.duration = scm.getDuration();
		row_talendStats_STATS.moment = scm.getMoment();
		row_talendStats_STATS.message_type = scm.getMessageType();
		row_talendStats_STATS.job_version = scm.getJobVersion();
		row_talendStats_STATS.job_repository_id = scm.getJobId();
		row_talendStats_STATS.system_pid = scm.getSystemPid();

 



/**
 * [talendStats_STATS begin ] stop
 */
	
	/**
	 * [talendStats_STATS main ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 


	tos_count_talendStats_STATS++;

/**
 * [talendStats_STATS main ] stop
 */
	
	/**
	 * [talendStats_STATS process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 



/**
 * [talendStats_STATS process_data_begin ] stop
 */

	
	/**
	 * [talendStats_DB main ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					



        whetherReject_talendStats_DB = false;
                    if(row_talendStats_STATS.moment != null) {
pstmt_talendStats_DB.setTimestamp(1, new java.sql.Timestamp(row_talendStats_STATS.moment.getTime()));
} else {
pstmt_talendStats_DB.setNull(1, java.sql.Types.TIMESTAMP);
}

                    if(row_talendStats_STATS.pid == null) {
pstmt_talendStats_DB.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(2, row_talendStats_STATS.pid);
}

                    if(row_talendStats_STATS.father_pid == null) {
pstmt_talendStats_DB.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(3, row_talendStats_STATS.father_pid);
}

                    if(row_talendStats_STATS.root_pid == null) {
pstmt_talendStats_DB.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(4, row_talendStats_STATS.root_pid);
}

                    if(row_talendStats_STATS.system_pid == null) {
pstmt_talendStats_DB.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_talendStats_DB.setLong(5, row_talendStats_STATS.system_pid);
}

                    if(row_talendStats_STATS.project == null) {
pstmt_talendStats_DB.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(6, row_talendStats_STATS.project);
}

                    if(row_talendStats_STATS.job == null) {
pstmt_talendStats_DB.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(7, row_talendStats_STATS.job);
}

                    if(row_talendStats_STATS.job_repository_id == null) {
pstmt_talendStats_DB.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(8, row_talendStats_STATS.job_repository_id);
}

                    if(row_talendStats_STATS.job_version == null) {
pstmt_talendStats_DB.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(9, row_talendStats_STATS.job_version);
}

                    if(row_talendStats_STATS.context == null) {
pstmt_talendStats_DB.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(10, row_talendStats_STATS.context);
}

                    if(row_talendStats_STATS.origin == null) {
pstmt_talendStats_DB.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(11, row_talendStats_STATS.origin);
}

                    if(row_talendStats_STATS.message_type == null) {
pstmt_talendStats_DB.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(12, row_talendStats_STATS.message_type);
}

                    if(row_talendStats_STATS.message == null) {
pstmt_talendStats_DB.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(13, row_talendStats_STATS.message);
}

                    if(row_talendStats_STATS.duration == null) {
pstmt_talendStats_DB.setNull(14, java.sql.Types.INTEGER);
} else {pstmt_talendStats_DB.setLong(14, row_talendStats_STATS.duration);
}


        		pstmt_talendStats_DB.addBatch();
        		nb_line_talendStats_DB++;
        		
    		 
    		  batchSizeCounter_talendStats_DB++;
    		
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_talendStats_DB{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_talendStats_DB) throws Exception {
                try {
						
						for(int countEach_talendStats_DB: pstmt_talendStats_DB.executeBatch()) {
							if(countEach_talendStats_DB == -2 || countEach_talendStats_DB == -3) {
								break;
							}
							counter += countEach_talendStats_DB;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendStats_DB_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_talendStats_DB = 0;
					for(int countEach_talendStats_DB: e.getUpdateCounts()) {
						counter += (countEach_talendStats_DB < 0 ? 0 : countEach_talendStats_DB);
					}
				
            	    	
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_talendStats_DB) throws Exception {
                try {
                		
						for(int countEach_talendStats_DB: pstmt_talendStats_DB.executeBatch()) {
							if(countEach_talendStats_DB == -2 || countEach_talendStats_DB == -3) {
								break;
							}
							counter += countEach_talendStats_DB;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendStats_DB_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_talendStats_DB: e.getUpdateCounts()) {
						counter += (countEach_talendStats_DB < 0 ? 0 : countEach_talendStats_DB);
					}
					
            	    	
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_talendStats_DB > 0) && (batchSize_talendStats_DB <= batchSizeCounter_talendStats_DB)) {
    		
    		            
            	    		insertedCount_talendStats_DB = new LimitBytesHelper_talendStats_DB().limitBytePart1(insertedCount_talendStats_DB,pstmt_talendStats_DB);
            	    		rowsToCommitCount_talendStats_DB = insertedCount_talendStats_DB;
            	    	
    			
			    batchSizeCounter_talendStats_DB = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_talendStats_DB++;

/**
 * [talendStats_DB main ] stop
 */
	
	/**
	 * [talendStats_DB process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";
	
	

 



/**
 * [talendStats_DB process_data_begin ] stop
 */
	
	/**
	 * [talendStats_DB process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";
	
	

 



/**
 * [talendStats_DB process_data_end ] stop
 */



	
	/**
	 * [talendStats_STATS process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 



/**
 * [talendStats_STATS process_data_end ] stop
 */
	
	/**
	 * [talendStats_STATS end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

	}


 

ok_Hash.put("talendStats_STATS", true);
end_Hash.put("talendStats_STATS", System.currentTimeMillis());




/**
 * [talendStats_STATS end ] stop
 */

	
	/**
	 * [talendStats_DB end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";
	
	



                try {
						int countSum_talendStats_DB = 0;
						if (pstmt_talendStats_DB != null && batchSizeCounter_talendStats_DB > 0) {
							
							for(int countEach_talendStats_DB: pstmt_talendStats_DB.executeBatch()) {
								if(countEach_talendStats_DB == -2 || countEach_talendStats_DB == -3) {
									break;
								}
								countSum_talendStats_DB += countEach_talendStats_DB;
							}
							rowsToCommitCount_talendStats_DB += countSum_talendStats_DB;
							
						}
            	    	
            	    		insertedCount_talendStats_DB += countSum_talendStats_DB;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendStats_DB_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_talendStats_DB = 0;
					for(int countEach_talendStats_DB: e.getUpdateCounts()) {
						countSum_talendStats_DB += (countEach_talendStats_DB < 0 ? 0 : countEach_talendStats_DB);
					}
					rowsToCommitCount_talendStats_DB += countSum_talendStats_DB;
					
            	    		insertedCount_talendStats_DB += countSum_talendStats_DB;
            	    	
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_talendStats_DB != null) {
			
				SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendStats_DB);
				resourceMap.remove("keyPsmt_talendStats_DB");
			
        }
    resourceMap.put("statementClosed_talendStats_DB", true);

	nb_line_deleted_talendStats_DB=nb_line_deleted_talendStats_DB+ deletedCount_talendStats_DB;
	nb_line_update_talendStats_DB=nb_line_update_talendStats_DB + updatedCount_talendStats_DB;
	nb_line_inserted_talendStats_DB=nb_line_inserted_talendStats_DB + insertedCount_talendStats_DB;
	nb_line_rejected_talendStats_DB=nb_line_rejected_talendStats_DB + rejectedCount_talendStats_DB;
	
        globalMap.put("talendStats_DB_NB_LINE",nb_line_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_UPDATED",nb_line_update_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_INSERTED",nb_line_inserted_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_DELETED",nb_line_deleted_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_REJECTED", nb_line_rejected_talendStats_DB);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 

ok_Hash.put("talendStats_DB", true);
end_Hash.put("talendStats_DB", System.currentTimeMillis());




/**
 * [talendStats_DB end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:talendStats_STATS:sub_ok_talendStats_connectionStatsLogs_Commit", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("sub_ok_talendStats_connectionStatsLogs_Commit", 0, "ok");
								} 
							
							connectionStatsLogs_CommitProcess(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendStats_STATS finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 



/**
 * [talendStats_STATS finally ] stop
 */

	
	/**
	 * [talendStats_DB finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";
	
	



    String keyPsmt_talendStats_DB = null;
    if ((keyPsmt_talendStats_DB = (String) resourceMap.remove("keyPsmt_talendStats_DB")) != null) {
        SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendStats_DB);
    }
    if (resourceMap.get("statementClosed_talendStats_DB") == null) {
                java.sql.PreparedStatement pstmtToClose_talendStats_DB = null;
                if ((pstmtToClose_talendStats_DB = (java.sql.PreparedStatement) resourceMap.remove("pstmt_talendStats_DB")) != null) {
                    pstmtToClose_talendStats_DB.close();
                }
    }
 



/**
 * [talendStats_DB finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendStats_STATS_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendLogs_LOGSStruct implements routines.system.IPersistableRow<row_talendLogs_LOGSStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}

				public Boolean priorityIsNullable(){
				    return true;
				}
				public Boolean priorityIsKey(){
				    return false;
				}
				public Integer priorityLength(){
				    return 3;
				}
				public Integer priorityPrecision(){
				    return 0;
				}
				public String priorityDefault(){
				
					return "";
				
				}
				public String priorityComment(){
				
				    return null;
				
				}
				public String priorityPattern(){
				
				    return null;
				
				}
				public String priorityOriginalDbColumnName(){
				
					return "priority";
				
				}

				
			    public String type;

				public String getType () {
					return this.type;
				}

				public Boolean typeIsNullable(){
				    return true;
				}
				public Boolean typeIsKey(){
				    return false;
				}
				public Integer typeLength(){
				    return 255;
				}
				public Integer typePrecision(){
				    return 0;
				}
				public String typeDefault(){
				
					return "";
				
				}
				public String typeComment(){
				
				    return null;
				
				}
				public String typePattern(){
				
				    return null;
				
				}
				public String typeOriginalDbColumnName(){
				
					return "type";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String message;

				public String getMessage () {
					return this.message;
				}

				public Boolean messageIsNullable(){
				    return true;
				}
				public Boolean messageIsKey(){
				    return false;
				}
				public Integer messageLength(){
				    return 255;
				}
				public Integer messagePrecision(){
				    return 0;
				}
				public String messageDefault(){
				
					return "";
				
				}
				public String messageComment(){
				
				    return null;
				
				}
				public String messagePattern(){
				
				    return null;
				
				}
				public String messageOriginalDbColumnName(){
				
					return "message";
				
				}

				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}

				public Boolean codeIsNullable(){
				    return true;
				}
				public Boolean codeIsKey(){
				    return false;
				}
				public Integer codeLength(){
				    return 3;
				}
				public Integer codePrecision(){
				    return 0;
				}
				public String codeDefault(){
				
					return "";
				
				}
				public String codeComment(){
				
				    return null;
				
				}
				public String codePattern(){
				
				    return null;
				
				}
				public String codeOriginalDbColumnName(){
				
					return "code";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row_talendLogs_LOGSStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void talendLogs_LOGSProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendLogs_LOGS_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendLogs_LOGSStruct row_talendLogs_LOGS = new row_talendLogs_LOGSStruct();




	
	/**
	 * [talendLogs_DB begin ] start
	 */

	

	
		
		ok_Hash.put("talendLogs_DB", false);
		start_Hash.put("talendLogs_DB", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendLogs_DB = 0;
		



int nb_line_talendLogs_DB = 0;
int nb_line_update_talendLogs_DB = 0;
int nb_line_inserted_talendLogs_DB = 0;
int nb_line_deleted_talendLogs_DB = 0;
int nb_line_rejected_talendLogs_DB = 0;

int deletedCount_talendLogs_DB=0;
int updatedCount_talendLogs_DB=0;
int insertedCount_talendLogs_DB=0;
int rowsToCommitCount_talendLogs_DB=0;
int rejectedCount_talendLogs_DB=0;
String dbschema_talendLogs_DB = null;
String tableName_talendLogs_DB = null;
boolean whetherReject_talendLogs_DB = false;

java.util.Calendar calendar_talendLogs_DB = java.util.Calendar.getInstance();
long year1_talendLogs_DB = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_talendLogs_DB = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_talendLogs_DB = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_talendLogs_DB;

java.util.Calendar calendar_datetimeoffset_talendLogs_DB = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));



	
java.sql.Connection conn_talendLogs_DB = null;
String dbUser_talendLogs_DB = null;
	dbschema_talendLogs_DB = (String)globalMap.get("dbschema_connectionStatsLogs");
	
	conn_talendLogs_DB = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
	
   int batchSize_talendLogs_DB = 10000;
   int batchSizeCounter_talendLogs_DB=0;

if(dbschema_talendLogs_DB == null || dbschema_talendLogs_DB.trim().length() == 0) {
    tableName_talendLogs_DB = "logs";
} else {
    tableName_talendLogs_DB = dbschema_talendLogs_DB + "].[" + "logs";
}
	int count_talendLogs_DB=0;


                    // [%connection%][checktable][tableName]
                    String keyCheckTable_talendLogs_DB = conn_talendLogs_DB + "[checktable]" + "[" + "logs" + "]";

                if(GlobalResource.resourceMap.get(keyCheckTable_talendLogs_DB)== null){//}

                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_talendLogs_DB)) {//}
                        if(GlobalResource.resourceMap.get(keyCheckTable_talendLogs_DB)== null){//}
                                boolean whetherExist_talendLogs_DB = false;
                                try (java.sql.Statement isExistStmt_talendLogs_DB = conn_talendLogs_DB.createStatement()) {
                                    try {
                                    	
                                        isExistStmt_talendLogs_DB.execute("SELECT TOP 1 1 FROM [" + tableName_talendLogs_DB + "]" );
                                        whetherExist_talendLogs_DB = true;
                                    } catch (java.lang.Exception e){
globalMap.put("talendLogs_DB_ERROR_MESSAGE",e.getMessage());
                                        whetherExist_talendLogs_DB = false;
                                    }
                                }
                                if(!whetherExist_talendLogs_DB) {
                                    try (java.sql.Statement stmtCreate_talendLogs_DB = conn_talendLogs_DB.createStatement()) {
                                        stmtCreate_talendLogs_DB.execute("CREATE TABLE [" + tableName_talendLogs_DB + "]([moment] DATETIME ,[pid] VARCHAR(20)  ,[root_pid] VARCHAR(20)  ,[father_pid] VARCHAR(20)  ,[project] VARCHAR(50)  ,[job] VARCHAR(255)  ,[context] VARCHAR(50)  ,[priority] INT ,[type] VARCHAR(255)  ,[origin] VARCHAR(255)  ,[message] VARCHAR(255)  ,[code] INT )");
                                    }
                                }
                            GlobalResource.resourceMap.put(keyCheckTable_talendLogs_DB, true);
            //{{{
                        } // end of if
                    } // end synchronized
                }
    java.sql.PreparedStatement pstmt_talendLogs_DB = null;
    java.sql.PreparedStatement pstmtInsert_talendLogs_DB = null;
    java.sql.PreparedStatement pstmtUpdate_talendLogs_DB = null;
        String insert_talendLogs_DB = "INSERT INTO [" + tableName_talendLogs_DB + "] ([moment],[pid],[root_pid],[father_pid],[project],[job],[context],[priority],[type],[origin],[message],[code]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        String keyPsmt_talendLogs_DB = conn_talendLogs_DB + "[psmt]" + "[" + "logs" + "]";
        pstmt_talendLogs_DB = SharedDBPreparedStatement.getSharedPreparedStatement(conn_talendLogs_DB,insert_talendLogs_DB,keyPsmt_talendLogs_DB);
        resourceMap.put("pstmt_talendLogs_DB", pstmt_talendLogs_DB);
        resourceMap.put("keyPsmt_talendLogs_DB", keyPsmt_talendLogs_DB);
 	boolean isShareIdentity_talendLogs_DB = globalMap.get("shareIdentitySetting_connectionStatsLogs") != null && (Boolean)globalMap.get("shareIdentitySetting_connectionStatsLogs") == true;

 



/**
 * [talendLogs_DB begin ] stop
 */



	
	/**
	 * [talendLogs_LOGS begin ] start
	 */

	

	
		
		ok_Hash.put("talendLogs_LOGS", false);
		start_Hash.put("talendLogs_LOGS", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	
		int tos_count_talendLogs_LOGS = 0;
		

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : talendLogs_LOGS.getMessages()) {
		row_talendLogs_LOGS.type = lcm.getType();
		row_talendLogs_LOGS.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row_talendLogs_LOGS.priority = lcm.getPriority();
		row_talendLogs_LOGS.message = lcm.getMessage();
		row_talendLogs_LOGS.code = lcm.getCode();
		
		row_talendLogs_LOGS.moment = java.util.Calendar.getInstance().getTime();
	
    	row_talendLogs_LOGS.pid = pid;
		row_talendLogs_LOGS.root_pid = rootPid;
		row_talendLogs_LOGS.father_pid = fatherPid;
	
    	row_talendLogs_LOGS.project = projectName;
    	row_talendLogs_LOGS.job = jobName;
    	row_talendLogs_LOGS.context = contextStr;
    		
 



/**
 * [talendLogs_LOGS begin ] stop
 */
	
	/**
	 * [talendLogs_LOGS main ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 


	tos_count_talendLogs_LOGS++;

/**
 * [talendLogs_LOGS main ] stop
 */
	
	/**
	 * [talendLogs_LOGS process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 



/**
 * [talendLogs_LOGS process_data_begin ] stop
 */

	
	/**
	 * [talendLogs_DB main ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					



        whetherReject_talendLogs_DB = false;
                    if(row_talendLogs_LOGS.moment != null) {
pstmt_talendLogs_DB.setTimestamp(1, new java.sql.Timestamp(row_talendLogs_LOGS.moment.getTime()));
} else {
pstmt_talendLogs_DB.setNull(1, java.sql.Types.TIMESTAMP);
}

                    if(row_talendLogs_LOGS.pid == null) {
pstmt_talendLogs_DB.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(2, row_talendLogs_LOGS.pid);
}

                    if(row_talendLogs_LOGS.root_pid == null) {
pstmt_talendLogs_DB.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(3, row_talendLogs_LOGS.root_pid);
}

                    if(row_talendLogs_LOGS.father_pid == null) {
pstmt_talendLogs_DB.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(4, row_talendLogs_LOGS.father_pid);
}

                    if(row_talendLogs_LOGS.project == null) {
pstmt_talendLogs_DB.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(5, row_talendLogs_LOGS.project);
}

                    if(row_talendLogs_LOGS.job == null) {
pstmt_talendLogs_DB.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(6, row_talendLogs_LOGS.job);
}

                    if(row_talendLogs_LOGS.context == null) {
pstmt_talendLogs_DB.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(7, row_talendLogs_LOGS.context);
}

                    if(row_talendLogs_LOGS.priority == null) {
pstmt_talendLogs_DB.setNull(8, java.sql.Types.INTEGER);
} else {pstmt_talendLogs_DB.setInt(8, row_talendLogs_LOGS.priority);
}

                    if(row_talendLogs_LOGS.type == null) {
pstmt_talendLogs_DB.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(9, row_talendLogs_LOGS.type);
}

                    if(row_talendLogs_LOGS.origin == null) {
pstmt_talendLogs_DB.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(10, row_talendLogs_LOGS.origin);
}

                    if(row_talendLogs_LOGS.message == null) {
pstmt_talendLogs_DB.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(11, row_talendLogs_LOGS.message);
}

                    if(row_talendLogs_LOGS.code == null) {
pstmt_talendLogs_DB.setNull(12, java.sql.Types.INTEGER);
} else {pstmt_talendLogs_DB.setInt(12, row_talendLogs_LOGS.code);
}


        		pstmt_talendLogs_DB.addBatch();
        		nb_line_talendLogs_DB++;
        		
    		 
    		  batchSizeCounter_talendLogs_DB++;
    		
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_talendLogs_DB{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_talendLogs_DB) throws Exception {
                try {
						
						for(int countEach_talendLogs_DB: pstmt_talendLogs_DB.executeBatch()) {
							if(countEach_talendLogs_DB == -2 || countEach_talendLogs_DB == -3) {
								break;
							}
							counter += countEach_talendLogs_DB;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendLogs_DB_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_talendLogs_DB = 0;
					for(int countEach_talendLogs_DB: e.getUpdateCounts()) {
						counter += (countEach_talendLogs_DB < 0 ? 0 : countEach_talendLogs_DB);
					}
				
            	    	
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_talendLogs_DB) throws Exception {
                try {
                		
						for(int countEach_talendLogs_DB: pstmt_talendLogs_DB.executeBatch()) {
							if(countEach_talendLogs_DB == -2 || countEach_talendLogs_DB == -3) {
								break;
							}
							counter += countEach_talendLogs_DB;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendLogs_DB_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_talendLogs_DB: e.getUpdateCounts()) {
						counter += (countEach_talendLogs_DB < 0 ? 0 : countEach_talendLogs_DB);
					}
					
            	    	
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_talendLogs_DB > 0) && (batchSize_talendLogs_DB <= batchSizeCounter_talendLogs_DB)) {
    		
    		            
            	    		insertedCount_talendLogs_DB = new LimitBytesHelper_talendLogs_DB().limitBytePart1(insertedCount_talendLogs_DB,pstmt_talendLogs_DB);
            	    		rowsToCommitCount_talendLogs_DB = insertedCount_talendLogs_DB;
            	    	
    			
			    batchSizeCounter_talendLogs_DB = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_talendLogs_DB++;

/**
 * [talendLogs_DB main ] stop
 */
	
	/**
	 * [talendLogs_DB process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";
	
	

 



/**
 * [talendLogs_DB process_data_begin ] stop
 */
	
	/**
	 * [talendLogs_DB process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";
	
	

 



/**
 * [talendLogs_DB process_data_end ] stop
 */



	
	/**
	 * [talendLogs_LOGS process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 



/**
 * [talendLogs_LOGS process_data_end ] stop
 */
	
	/**
	 * [talendLogs_LOGS end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	
	}
} catch (Exception e_talendLogs_LOGS) {
globalMap.put("talendLogs_LOGS_ERROR_MESSAGE",e_talendLogs_LOGS.getMessage());
	logIgnoredError(String.format("talendLogs_LOGS - tLogCatcher failed to process log message(s) due to internal error: %s", e_talendLogs_LOGS), e_talendLogs_LOGS);
}

 

ok_Hash.put("talendLogs_LOGS", true);
end_Hash.put("talendLogs_LOGS", System.currentTimeMillis());




/**
 * [talendLogs_LOGS end ] stop
 */

	
	/**
	 * [talendLogs_DB end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";
	
	



                try {
						int countSum_talendLogs_DB = 0;
						if (pstmt_talendLogs_DB != null && batchSizeCounter_talendLogs_DB > 0) {
							
							for(int countEach_talendLogs_DB: pstmt_talendLogs_DB.executeBatch()) {
								if(countEach_talendLogs_DB == -2 || countEach_talendLogs_DB == -3) {
									break;
								}
								countSum_talendLogs_DB += countEach_talendLogs_DB;
							}
							rowsToCommitCount_talendLogs_DB += countSum_talendLogs_DB;
							
						}
            	    	
            	    		insertedCount_talendLogs_DB += countSum_talendLogs_DB;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendLogs_DB_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_talendLogs_DB = 0;
					for(int countEach_talendLogs_DB: e.getUpdateCounts()) {
						countSum_talendLogs_DB += (countEach_talendLogs_DB < 0 ? 0 : countEach_talendLogs_DB);
					}
					rowsToCommitCount_talendLogs_DB += countSum_talendLogs_DB;
					
            	    		insertedCount_talendLogs_DB += countSum_talendLogs_DB;
            	    	
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_talendLogs_DB != null) {
			
				SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendLogs_DB);
				resourceMap.remove("keyPsmt_talendLogs_DB");
			
        }
    resourceMap.put("statementClosed_talendLogs_DB", true);

	nb_line_deleted_talendLogs_DB=nb_line_deleted_talendLogs_DB+ deletedCount_talendLogs_DB;
	nb_line_update_talendLogs_DB=nb_line_update_talendLogs_DB + updatedCount_talendLogs_DB;
	nb_line_inserted_talendLogs_DB=nb_line_inserted_talendLogs_DB + insertedCount_talendLogs_DB;
	nb_line_rejected_talendLogs_DB=nb_line_rejected_talendLogs_DB + rejectedCount_talendLogs_DB;
	
        globalMap.put("talendLogs_DB_NB_LINE",nb_line_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_UPDATED",nb_line_update_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_INSERTED",nb_line_inserted_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_DELETED",nb_line_deleted_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_REJECTED", nb_line_rejected_talendLogs_DB);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 

ok_Hash.put("talendLogs_DB", true);
end_Hash.put("talendLogs_DB", System.currentTimeMillis());




/**
 * [talendLogs_DB end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:talendLogs_LOGS:sub_ok_talendLogs_connectionStatsLogs_Commit", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("sub_ok_talendLogs_connectionStatsLogs_Commit", 0, "ok");
								} 
							
							connectionStatsLogs_CommitProcess(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendLogs_LOGS finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 



/**
 * [talendLogs_LOGS finally ] stop
 */

	
	/**
	 * [talendLogs_DB finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";
	
	



    String keyPsmt_talendLogs_DB = null;
    if ((keyPsmt_talendLogs_DB = (String) resourceMap.remove("keyPsmt_talendLogs_DB")) != null) {
        SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendLogs_DB);
    }
    if (resourceMap.get("statementClosed_talendLogs_DB") == null) {
                java.sql.PreparedStatement pstmtToClose_talendLogs_DB = null;
                if ((pstmtToClose_talendLogs_DB = (java.sql.PreparedStatement) resourceMap.remove("pstmt_talendLogs_DB")) != null) {
                    pstmtToClose_talendLogs_DB.close();
                }
    }
 



/**
 * [talendLogs_DB finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendLogs_LOGS_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendMeter_METTERStruct implements routines.system.IPersistableRow<row_talendMeter_METTERStruct> {
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public Long system_pid;

				public Long getSystem_pid () {
					return this.system_pid;
				}

				public Boolean system_pidIsNullable(){
				    return true;
				}
				public Boolean system_pidIsKey(){
				    return false;
				}
				public Integer system_pidLength(){
				    return 8;
				}
				public Integer system_pidPrecision(){
				    return 0;
				}
				public String system_pidDefault(){
				
					return "";
				
				}
				public String system_pidComment(){
				
				    return null;
				
				}
				public String system_pidPattern(){
				
				    return null;
				
				}
				public String system_pidOriginalDbColumnName(){
				
					return "system_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String job_repository_id;

				public String getJob_repository_id () {
					return this.job_repository_id;
				}

				public Boolean job_repository_idIsNullable(){
				    return true;
				}
				public Boolean job_repository_idIsKey(){
				    return false;
				}
				public Integer job_repository_idLength(){
				    return 255;
				}
				public Integer job_repository_idPrecision(){
				    return 0;
				}
				public String job_repository_idDefault(){
				
					return "";
				
				}
				public String job_repository_idComment(){
				
				    return null;
				
				}
				public String job_repository_idPattern(){
				
				    return null;
				
				}
				public String job_repository_idOriginalDbColumnName(){
				
					return "job_repository_id";
				
				}

				
			    public String job_version;

				public String getJob_version () {
					return this.job_version;
				}

				public Boolean job_versionIsNullable(){
				    return true;
				}
				public Boolean job_versionIsKey(){
				    return false;
				}
				public Integer job_versionLength(){
				    return 255;
				}
				public Integer job_versionPrecision(){
				    return 0;
				}
				public String job_versionDefault(){
				
					return "";
				
				}
				public String job_versionComment(){
				
				    return null;
				
				}
				public String job_versionPattern(){
				
				    return null;
				
				}
				public String job_versionOriginalDbColumnName(){
				
					return "job_version";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String label;

				public String getLabel () {
					return this.label;
				}

				public Boolean labelIsNullable(){
				    return true;
				}
				public Boolean labelIsKey(){
				    return false;
				}
				public Integer labelLength(){
				    return 255;
				}
				public Integer labelPrecision(){
				    return 0;
				}
				public String labelDefault(){
				
					return "";
				
				}
				public String labelComment(){
				
				    return null;
				
				}
				public String labelPattern(){
				
				    return null;
				
				}
				public String labelOriginalDbColumnName(){
				
					return "label";
				
				}

				
			    public Integer count;

				public Integer getCount () {
					return this.count;
				}

				public Boolean countIsNullable(){
				    return true;
				}
				public Boolean countIsKey(){
				    return false;
				}
				public Integer countLength(){
				    return 3;
				}
				public Integer countPrecision(){
				    return 0;
				}
				public String countDefault(){
				
					return "";
				
				}
				public String countComment(){
				
				    return null;
				
				}
				public String countPattern(){
				
				    return null;
				
				}
				public String countOriginalDbColumnName(){
				
					return "count";
				
				}

				
			    public Integer reference;

				public Integer getReference () {
					return this.reference;
				}

				public Boolean referenceIsNullable(){
				    return true;
				}
				public Boolean referenceIsKey(){
				    return false;
				}
				public Integer referenceLength(){
				    return 3;
				}
				public Integer referencePrecision(){
				    return 0;
				}
				public String referenceDefault(){
				
					return "";
				
				}
				public String referenceComment(){
				
				    return null;
				
				}
				public String referencePattern(){
				
				    return null;
				
				}
				public String referenceOriginalDbColumnName(){
				
					return "reference";
				
				}

				
			    public String thresholds;

				public String getThresholds () {
					return this.thresholds;
				}

				public Boolean thresholdsIsNullable(){
				    return true;
				}
				public Boolean thresholdsIsKey(){
				    return false;
				}
				public Integer thresholdsLength(){
				    return 255;
				}
				public Integer thresholdsPrecision(){
				    return 0;
				}
				public String thresholdsDefault(){
				
					return "";
				
				}
				public String thresholdsComment(){
				
				    return null;
				
				}
				public String thresholdsPattern(){
				
				    return null;
				
				}
				public String thresholdsOriginalDbColumnName(){
				
					return "thresholds";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_MY_SYSTEM_SA_003_projet.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SA_003_projet.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SA_003_projet = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SA_003_projet, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.root_pid = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.system_pid = null;
           				} else {
           			    	this.system_pid = dis.readLong();
           				}
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.job_repository_id = readString(dis);
					
					this.job_version = readString(dis);
					
					this.context = readString(dis);
					
					this.origin = readString(dis);
					
					this.label = readString(dis);
					
						this.count = readInteger(dis);
					
						this.reference = readInteger(dis);
					
					this.thresholds = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SA_003_projet) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.root_pid = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.system_pid = null;
           				} else {
           			    	this.system_pid = dis.readLong();
           				}
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.job_repository_id = readString(dis);
					
					this.job_version = readString(dis);
					
					this.context = readString(dis);
					
					this.origin = readString(dis);
					
					this.label = readString(dis);
					
						this.count = readInteger(dis);
					
						this.reference = readInteger(dis);
					
					this.thresholds = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.count,dos);
					
					// Integer
				
						writeInteger(this.reference,dos);
					
					// String
				
						writeString(this.thresholds,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.count,dos);
					
					// Integer
				
						writeInteger(this.reference,dos);
					
					// String
				
						writeString(this.thresholds,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",system_pid="+String.valueOf(system_pid));
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",job_repository_id="+job_repository_id);
		sb.append(",job_version="+job_version);
		sb.append(",context="+context);
		sb.append(",origin="+origin);
		sb.append(",label="+label);
		sb.append(",count="+String.valueOf(count));
		sb.append(",reference="+String.valueOf(reference));
		sb.append(",thresholds="+thresholds);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row_talendMeter_METTERStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void talendMeter_METTERProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendMeter_METTER_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	

		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendMeter_METTERStruct row_talendMeter_METTER = new row_talendMeter_METTERStruct();




	
	/**
	 * [talendMeter_DB begin ] start
	 */

	

	
		
		ok_Hash.put("talendMeter_DB", false);
		start_Hash.put("talendMeter_DB", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendMeter_DB = 0;
		



int nb_line_talendMeter_DB = 0;
int nb_line_update_talendMeter_DB = 0;
int nb_line_inserted_talendMeter_DB = 0;
int nb_line_deleted_talendMeter_DB = 0;
int nb_line_rejected_talendMeter_DB = 0;

int deletedCount_talendMeter_DB=0;
int updatedCount_talendMeter_DB=0;
int insertedCount_talendMeter_DB=0;
int rowsToCommitCount_talendMeter_DB=0;
int rejectedCount_talendMeter_DB=0;
String dbschema_talendMeter_DB = null;
String tableName_talendMeter_DB = null;
boolean whetherReject_talendMeter_DB = false;

java.util.Calendar calendar_talendMeter_DB = java.util.Calendar.getInstance();
long year1_talendMeter_DB = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_talendMeter_DB = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_talendMeter_DB = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_talendMeter_DB;

java.util.Calendar calendar_datetimeoffset_talendMeter_DB = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));



	
java.sql.Connection conn_talendMeter_DB = null;
String dbUser_talendMeter_DB = null;
	dbschema_talendMeter_DB = (String)globalMap.get("dbschema_connectionStatsLogs");
	
	conn_talendMeter_DB = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
	
   int batchSize_talendMeter_DB = 10000;
   int batchSizeCounter_talendMeter_DB=0;

if(dbschema_talendMeter_DB == null || dbschema_talendMeter_DB.trim().length() == 0) {
    tableName_talendMeter_DB = "mesures";
} else {
    tableName_talendMeter_DB = dbschema_talendMeter_DB + "].[" + "mesures";
}
	int count_talendMeter_DB=0;


                    // [%connection%][checktable][tableName]
                    String keyCheckTable_talendMeter_DB = conn_talendMeter_DB + "[checktable]" + "[" + "mesures" + "]";

                if(GlobalResource.resourceMap.get(keyCheckTable_talendMeter_DB)== null){//}

                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_talendMeter_DB)) {//}
                        if(GlobalResource.resourceMap.get(keyCheckTable_talendMeter_DB)== null){//}
                                boolean whetherExist_talendMeter_DB = false;
                                try (java.sql.Statement isExistStmt_talendMeter_DB = conn_talendMeter_DB.createStatement()) {
                                    try {
                                    	
                                        isExistStmt_talendMeter_DB.execute("SELECT TOP 1 1 FROM [" + tableName_talendMeter_DB + "]" );
                                        whetherExist_talendMeter_DB = true;
                                    } catch (java.lang.Exception e){
globalMap.put("talendMeter_DB_ERROR_MESSAGE",e.getMessage());
                                        whetherExist_talendMeter_DB = false;
                                    }
                                }
                                if(!whetherExist_talendMeter_DB) {
                                    try (java.sql.Statement stmtCreate_talendMeter_DB = conn_talendMeter_DB.createStatement()) {
                                        stmtCreate_talendMeter_DB.execute("CREATE TABLE [" + tableName_talendMeter_DB + "]([moment] DATETIME ,[pid] VARCHAR(20)  ,[father_pid] VARCHAR(20)  ,[root_pid] VARCHAR(20)  ,[system_pid] BIGINT ,[project] VARCHAR(50)  ,[job] VARCHAR(255)  ,[job_repository_id] VARCHAR(255)  ,[job_version] VARCHAR(255)  ,[context] VARCHAR(50)  ,[origin] VARCHAR(255)  ,[label] VARCHAR(255)  ,[count] INT ,[reference] INT ,[thresholds] VARCHAR(255)  )");
                                    }
                                }
                            GlobalResource.resourceMap.put(keyCheckTable_talendMeter_DB, true);
            //{{{
                        } // end of if
                    } // end synchronized
                }
    java.sql.PreparedStatement pstmt_talendMeter_DB = null;
    java.sql.PreparedStatement pstmtInsert_talendMeter_DB = null;
    java.sql.PreparedStatement pstmtUpdate_talendMeter_DB = null;
        String insert_talendMeter_DB = "INSERT INTO [" + tableName_talendMeter_DB + "] ([moment],[pid],[father_pid],[root_pid],[system_pid],[project],[job],[job_repository_id],[job_version],[context],[origin],[label],[count],[reference],[thresholds]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        String keyPsmt_talendMeter_DB = conn_talendMeter_DB + "[psmt]" + "[" + "mesures" + "]";
        pstmt_talendMeter_DB = SharedDBPreparedStatement.getSharedPreparedStatement(conn_talendMeter_DB,insert_talendMeter_DB,keyPsmt_talendMeter_DB);
        resourceMap.put("pstmt_talendMeter_DB", pstmt_talendMeter_DB);
        resourceMap.put("keyPsmt_talendMeter_DB", keyPsmt_talendMeter_DB);
 	boolean isShareIdentity_talendMeter_DB = globalMap.get("shareIdentitySetting_connectionStatsLogs") != null && (Boolean)globalMap.get("shareIdentitySetting_connectionStatsLogs") == true;

 



/**
 * [talendMeter_DB begin ] stop
 */



	
	/**
	 * [talendMeter_METTER begin ] start
	 */

	

	
		
		ok_Hash.put("talendMeter_METTER", false);
		start_Hash.put("talendMeter_METTER", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";
	
	
		int tos_count_talendMeter_METTER = 0;
		

	for (MetterCatcherUtils.MetterCatcherMessage mcm : talendMeter_METTER.getMessages()) {
		row_talendMeter_METTER.pid = pid;
		row_talendMeter_METTER.root_pid = rootPid;
		row_talendMeter_METTER.father_pid = fatherPid;	
        row_talendMeter_METTER.project = projectName;
        row_talendMeter_METTER.job = jobName;
        row_talendMeter_METTER.context = contextStr;
		row_talendMeter_METTER.origin = (mcm.getOrigin()==null || mcm.getOrigin().length()<1 ? null : mcm.getOrigin());
		row_talendMeter_METTER.moment = mcm.getMoment();
		row_talendMeter_METTER.job_version = mcm.getJobVersion();
		row_talendMeter_METTER.job_repository_id = mcm.getJobId();
		row_talendMeter_METTER.system_pid = mcm.getSystemPid();
		row_talendMeter_METTER.label = mcm.getLabel();
		row_talendMeter_METTER.count = mcm.getCount();
		row_talendMeter_METTER.reference = talendMeter_METTER.getConnLinesCount(mcm.getReferense()+"_count");
		row_talendMeter_METTER.thresholds = mcm.getThresholds();
		

 



/**
 * [talendMeter_METTER begin ] stop
 */
	
	/**
	 * [talendMeter_METTER main ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";
	
	

 


	tos_count_talendMeter_METTER++;

/**
 * [talendMeter_METTER main ] stop
 */
	
	/**
	 * [talendMeter_METTER process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";
	
	

 



/**
 * [talendMeter_METTER process_data_begin ] stop
 */

	
	/**
	 * [talendMeter_DB main ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					



        whetherReject_talendMeter_DB = false;
                    if(row_talendMeter_METTER.moment != null) {
pstmt_talendMeter_DB.setTimestamp(1, new java.sql.Timestamp(row_talendMeter_METTER.moment.getTime()));
} else {
pstmt_talendMeter_DB.setNull(1, java.sql.Types.TIMESTAMP);
}

                    if(row_talendMeter_METTER.pid == null) {
pstmt_talendMeter_DB.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(2, row_talendMeter_METTER.pid);
}

                    if(row_talendMeter_METTER.father_pid == null) {
pstmt_talendMeter_DB.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(3, row_talendMeter_METTER.father_pid);
}

                    if(row_talendMeter_METTER.root_pid == null) {
pstmt_talendMeter_DB.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(4, row_talendMeter_METTER.root_pid);
}

                    if(row_talendMeter_METTER.system_pid == null) {
pstmt_talendMeter_DB.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_talendMeter_DB.setLong(5, row_talendMeter_METTER.system_pid);
}

                    if(row_talendMeter_METTER.project == null) {
pstmt_talendMeter_DB.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(6, row_talendMeter_METTER.project);
}

                    if(row_talendMeter_METTER.job == null) {
pstmt_talendMeter_DB.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(7, row_talendMeter_METTER.job);
}

                    if(row_talendMeter_METTER.job_repository_id == null) {
pstmt_talendMeter_DB.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(8, row_talendMeter_METTER.job_repository_id);
}

                    if(row_talendMeter_METTER.job_version == null) {
pstmt_talendMeter_DB.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(9, row_talendMeter_METTER.job_version);
}

                    if(row_talendMeter_METTER.context == null) {
pstmt_talendMeter_DB.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(10, row_talendMeter_METTER.context);
}

                    if(row_talendMeter_METTER.origin == null) {
pstmt_talendMeter_DB.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(11, row_talendMeter_METTER.origin);
}

                    if(row_talendMeter_METTER.label == null) {
pstmt_talendMeter_DB.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(12, row_talendMeter_METTER.label);
}

                    if(row_talendMeter_METTER.count == null) {
pstmt_talendMeter_DB.setNull(13, java.sql.Types.INTEGER);
} else {pstmt_talendMeter_DB.setInt(13, row_talendMeter_METTER.count);
}

                    if(row_talendMeter_METTER.reference == null) {
pstmt_talendMeter_DB.setNull(14, java.sql.Types.INTEGER);
} else {pstmt_talendMeter_DB.setInt(14, row_talendMeter_METTER.reference);
}

                    if(row_talendMeter_METTER.thresholds == null) {
pstmt_talendMeter_DB.setNull(15, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(15, row_talendMeter_METTER.thresholds);
}


        		pstmt_talendMeter_DB.addBatch();
        		nb_line_talendMeter_DB++;
        		
    		 
    		  batchSizeCounter_talendMeter_DB++;
    		
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_talendMeter_DB{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_talendMeter_DB) throws Exception {
                try {
						
						for(int countEach_talendMeter_DB: pstmt_talendMeter_DB.executeBatch()) {
							if(countEach_talendMeter_DB == -2 || countEach_talendMeter_DB == -3) {
								break;
							}
							counter += countEach_talendMeter_DB;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendMeter_DB_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_talendMeter_DB = 0;
					for(int countEach_talendMeter_DB: e.getUpdateCounts()) {
						counter += (countEach_talendMeter_DB < 0 ? 0 : countEach_talendMeter_DB);
					}
				
            	    	
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_talendMeter_DB) throws Exception {
                try {
                		
						for(int countEach_talendMeter_DB: pstmt_talendMeter_DB.executeBatch()) {
							if(countEach_talendMeter_DB == -2 || countEach_talendMeter_DB == -3) {
								break;
							}
							counter += countEach_talendMeter_DB;
						}
						
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendMeter_DB_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_talendMeter_DB: e.getUpdateCounts()) {
						counter += (countEach_talendMeter_DB < 0 ? 0 : countEach_talendMeter_DB);
					}
					
            	    	
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_talendMeter_DB > 0) && (batchSize_talendMeter_DB <= batchSizeCounter_talendMeter_DB)) {
    		
    		            
            	    		insertedCount_talendMeter_DB = new LimitBytesHelper_talendMeter_DB().limitBytePart1(insertedCount_talendMeter_DB,pstmt_talendMeter_DB);
            	    		rowsToCommitCount_talendMeter_DB = insertedCount_talendMeter_DB;
            	    	
    			
			    batchSizeCounter_talendMeter_DB = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_talendMeter_DB++;

/**
 * [talendMeter_DB main ] stop
 */
	
	/**
	 * [talendMeter_DB process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";
	
	

 



/**
 * [talendMeter_DB process_data_begin ] stop
 */
	
	/**
	 * [talendMeter_DB process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";
	
	

 



/**
 * [talendMeter_DB process_data_end ] stop
 */



	
	/**
	 * [talendMeter_METTER process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";
	
	

 



/**
 * [talendMeter_METTER process_data_end ] stop
 */
	
	/**
	 * [talendMeter_METTER end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";
	
	

	}


 

ok_Hash.put("talendMeter_METTER", true);
end_Hash.put("talendMeter_METTER", System.currentTimeMillis());




/**
 * [talendMeter_METTER end ] stop
 */

	
	/**
	 * [talendMeter_DB end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";
	
	



                try {
						int countSum_talendMeter_DB = 0;
						if (pstmt_talendMeter_DB != null && batchSizeCounter_talendMeter_DB > 0) {
							
							for(int countEach_talendMeter_DB: pstmt_talendMeter_DB.executeBatch()) {
								if(countEach_talendMeter_DB == -2 || countEach_talendMeter_DB == -3) {
									break;
								}
								countSum_talendMeter_DB += countEach_talendMeter_DB;
							}
							rowsToCommitCount_talendMeter_DB += countSum_talendMeter_DB;
							
						}
            	    	
            	    		insertedCount_talendMeter_DB += countSum_talendMeter_DB;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("talendMeter_DB_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_talendMeter_DB = 0;
					for(int countEach_talendMeter_DB: e.getUpdateCounts()) {
						countSum_talendMeter_DB += (countEach_talendMeter_DB < 0 ? 0 : countEach_talendMeter_DB);
					}
					rowsToCommitCount_talendMeter_DB += countSum_talendMeter_DB;
					
            	    		insertedCount_talendMeter_DB += countSum_talendMeter_DB;
            	    	
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_talendMeter_DB != null) {
			
				SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendMeter_DB);
				resourceMap.remove("keyPsmt_talendMeter_DB");
			
        }
    resourceMap.put("statementClosed_talendMeter_DB", true);

	nb_line_deleted_talendMeter_DB=nb_line_deleted_talendMeter_DB+ deletedCount_talendMeter_DB;
	nb_line_update_talendMeter_DB=nb_line_update_talendMeter_DB + updatedCount_talendMeter_DB;
	nb_line_inserted_talendMeter_DB=nb_line_inserted_talendMeter_DB + insertedCount_talendMeter_DB;
	nb_line_rejected_talendMeter_DB=nb_line_rejected_talendMeter_DB + rejectedCount_talendMeter_DB;
	
        globalMap.put("talendMeter_DB_NB_LINE",nb_line_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_UPDATED",nb_line_update_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_INSERTED",nb_line_inserted_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_DELETED",nb_line_deleted_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_REJECTED", nb_line_rejected_talendMeter_DB);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 

ok_Hash.put("talendMeter_DB", true);
end_Hash.put("talendMeter_DB", System.currentTimeMillis());




/**
 * [talendMeter_DB end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:talendMeter_METTER:sub_ok_talendMeter_connectionStatsLogs_Commit", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("sub_ok_talendMeter_connectionStatsLogs_Commit", 0, "ok");
								} 
							
							connectionStatsLogs_CommitProcess(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendMeter_METTER finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";
	
	

 



/**
 * [talendMeter_METTER finally ] stop
 */

	
	/**
	 * [talendMeter_DB finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";
	
	



    String keyPsmt_talendMeter_DB = null;
    if ((keyPsmt_talendMeter_DB = (String) resourceMap.remove("keyPsmt_talendMeter_DB")) != null) {
        SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendMeter_DB);
    }
    if (resourceMap.get("statementClosed_talendMeter_DB") == null) {
                java.sql.PreparedStatement pstmtToClose_talendMeter_DB = null;
                if ((pstmtToClose_talendMeter_DB = (java.sql.PreparedStatement) resourceMap.remove("pstmt_talendMeter_DB")) != null) {
                    pstmtToClose_talendMeter_DB.close();
                }
    }
 



/**
 * [talendMeter_DB finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendMeter_METTER_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "dev";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    
    
    private final static java.util.Properties jobInfo = new java.util.Properties();
    private final static java.util.Map<String,String> mdcInfo = new java.util.HashMap<>();
    private final static java.util.concurrent.atomic.AtomicLong subJobPidCounter = new java.util.concurrent.atomic.AtomicLong();


    public static void main(String[] args){
        final SA_003_projet SA_003_projetClass = new SA_003_projet();

        int exitCode = SA_003_projetClass.runJobInTOS(args);

        System.exit(exitCode);
    }
	

	
	
	private void getjobInfo() {
		final String TEMPLATE_PATH = "src/main/templates/jobInfo_template.properties";
		final String BUILD_PATH = "../jobInfo.properties";
		final String path = this.getClass().getResource("").getPath();
		if(path.lastIndexOf("target") > 0) {
			final java.io.File templateFile = new java.io.File(
					path.substring(0, path.lastIndexOf("target")).concat(TEMPLATE_PATH));
			if (templateFile.exists()) {
				readJobInfo(templateFile);
				return;
			}
		}
			readJobInfo(new java.io.File(BUILD_PATH));
	}

    private void readJobInfo(java.io.File jobInfoFile){
	
        if(jobInfoFile.exists()) {
            try (java.io.InputStream is = new java.io.FileInputStream(jobInfoFile)) {
            	jobInfo.load(is);
            } catch (IOException e) {
            	 
                
            }
        }
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));


		
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }


        if (rootPid==null) {
            rootPid = pid;
        }


        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = SA_003_projet.class.getClassLoader().getResourceAsStream("bi_my_system/sa_003_projet_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = SA_003_projet.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }
            
            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("JOURNAL_password", "id_Password");
                        if(context.getStringValue("JOURNAL_password") == null) {
                            context.JOURNAL_password = null;
                        } else {
                            String pwd_JOURNAL_password_value = context.getProperty("JOURNAL_password");
                            context.JOURNAL_password = null;
                            if(pwd_JOURNAL_password_value!=null) {
                                if(context_param.containsKey("JOURNAL_password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.JOURNAL_password = pwd_JOURNAL_password_value;
                                } else if (!pwd_JOURNAL_password_value.isEmpty()) {
                                    try {
                                        context.JOURNAL_password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_JOURNAL_password_value);
                                        context.put("JOURNAL_password",context.JOURNAL_password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("JOURNAL_Server", "id_String");
                        if(context.getStringValue("JOURNAL_Server") == null) {
                            context.JOURNAL_Server = null;
                        } else {
                            context.JOURNAL_Server=(String) context.getProperty("JOURNAL_Server");
                        }
                        context.setContextType("JOURNAL_AdditionalParams", "id_String");
                        if(context.getStringValue("JOURNAL_AdditionalParams") == null) {
                            context.JOURNAL_AdditionalParams = null;
                        } else {
                            context.JOURNAL_AdditionalParams=(String) context.getProperty("JOURNAL_AdditionalParams");
                        }
                        context.setContextType("JOURNAL_Schema", "id_String");
                        if(context.getStringValue("JOURNAL_Schema") == null) {
                            context.JOURNAL_Schema = null;
                        } else {
                            context.JOURNAL_Schema=(String) context.getProperty("JOURNAL_Schema");
                        }
                        context.setContextType("JOURNAL_Login", "id_String");
                        if(context.getStringValue("JOURNAL_Login") == null) {
                            context.JOURNAL_Login = null;
                        } else {
                            context.JOURNAL_Login=(String) context.getProperty("JOURNAL_Login");
                        }
                        context.setContextType("JOURNAL_Port", "id_String");
                        if(context.getStringValue("JOURNAL_Port") == null) {
                            context.JOURNAL_Port = null;
                        } else {
                            context.JOURNAL_Port=(String) context.getProperty("JOURNAL_Port");
                        }
                        context.setContextType("JOURNAL_Database", "id_String");
                        if(context.getStringValue("JOURNAL_Database") == null) {
                            context.JOURNAL_Database = null;
                        } else {
                            context.JOURNAL_Database=(String) context.getProperty("JOURNAL_Database");
                        }
                        context.setContextType("DWH_V1_Port", "id_String");
                        if(context.getStringValue("DWH_V1_Port") == null) {
                            context.DWH_V1_Port = null;
                        } else {
                            context.DWH_V1_Port=(String) context.getProperty("DWH_V1_Port");
                        }
                        context.setContextType("DWH_V1_Server", "id_String");
                        if(context.getStringValue("DWH_V1_Server") == null) {
                            context.DWH_V1_Server = null;
                        } else {
                            context.DWH_V1_Server=(String) context.getProperty("DWH_V1_Server");
                        }
                        context.setContextType("DWH_V1_Login", "id_String");
                        if(context.getStringValue("DWH_V1_Login") == null) {
                            context.DWH_V1_Login = null;
                        } else {
                            context.DWH_V1_Login=(String) context.getProperty("DWH_V1_Login");
                        }
                        context.setContextType("DWH_V1_AdditionalParams", "id_String");
                        if(context.getStringValue("DWH_V1_AdditionalParams") == null) {
                            context.DWH_V1_AdditionalParams = null;
                        } else {
                            context.DWH_V1_AdditionalParams=(String) context.getProperty("DWH_V1_AdditionalParams");
                        }
                        context.setContextType("DWH_V1_Schema", "id_String");
                        if(context.getStringValue("DWH_V1_Schema") == null) {
                            context.DWH_V1_Schema = null;
                        } else {
                            context.DWH_V1_Schema=(String) context.getProperty("DWH_V1_Schema");
                        }
                        context.setContextType("DWH_V1_Database", "id_String");
                        if(context.getStringValue("DWH_V1_Database") == null) {
                            context.DWH_V1_Database = null;
                        } else {
                            context.DWH_V1_Database=(String) context.getProperty("DWH_V1_Database");
                        }
                        context.setContextType("DWH_V1_Password", "id_Password");
                        if(context.getStringValue("DWH_V1_Password") == null) {
                            context.DWH_V1_Password = null;
                        } else {
                            String pwd_DWH_V1_Password_value = context.getProperty("DWH_V1_Password");
                            context.DWH_V1_Password = null;
                            if(pwd_DWH_V1_Password_value!=null) {
                                if(context_param.containsKey("DWH_V1_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.DWH_V1_Password = pwd_DWH_V1_Password_value;
                                } else if (!pwd_DWH_V1_Password_value.isEmpty()) {
                                    try {
                                        context.DWH_V1_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_DWH_V1_Password_value);
                                        context.put("DWH_V1_Password",context.DWH_V1_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("SA_V1_Login", "id_String");
                        if(context.getStringValue("SA_V1_Login") == null) {
                            context.SA_V1_Login = null;
                        } else {
                            context.SA_V1_Login=(String) context.getProperty("SA_V1_Login");
                        }
                        context.setContextType("SA_V1_Port", "id_String");
                        if(context.getStringValue("SA_V1_Port") == null) {
                            context.SA_V1_Port = null;
                        } else {
                            context.SA_V1_Port=(String) context.getProperty("SA_V1_Port");
                        }
                        context.setContextType("SA_V1_AdditionalParams", "id_String");
                        if(context.getStringValue("SA_V1_AdditionalParams") == null) {
                            context.SA_V1_AdditionalParams = null;
                        } else {
                            context.SA_V1_AdditionalParams=(String) context.getProperty("SA_V1_AdditionalParams");
                        }
                        context.setContextType("SA_V1_Schema", "id_String");
                        if(context.getStringValue("SA_V1_Schema") == null) {
                            context.SA_V1_Schema = null;
                        } else {
                            context.SA_V1_Schema=(String) context.getProperty("SA_V1_Schema");
                        }
                        context.setContextType("SA_V1_Database", "id_String");
                        if(context.getStringValue("SA_V1_Database") == null) {
                            context.SA_V1_Database = null;
                        } else {
                            context.SA_V1_Database=(String) context.getProperty("SA_V1_Database");
                        }
                        context.setContextType("SA_V1_Password", "id_Password");
                        if(context.getStringValue("SA_V1_Password") == null) {
                            context.SA_V1_Password = null;
                        } else {
                            String pwd_SA_V1_Password_value = context.getProperty("SA_V1_Password");
                            context.SA_V1_Password = null;
                            if(pwd_SA_V1_Password_value!=null) {
                                if(context_param.containsKey("SA_V1_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.SA_V1_Password = pwd_SA_V1_Password_value;
                                } else if (!pwd_SA_V1_Password_value.isEmpty()) {
                                    try {
                                        context.SA_V1_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_SA_V1_Password_value);
                                        context.put("SA_V1_Password",context.SA_V1_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("SA_V1_Server", "id_String");
                        if(context.getStringValue("SA_V1_Server") == null) {
                            context.SA_V1_Server = null;
                        } else {
                            context.SA_V1_Server=(String) context.getProperty("SA_V1_Server");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("JOURNAL_password")) {
                context.JOURNAL_password = (java.lang.String) parentContextMap.get("JOURNAL_password");
            }if (parentContextMap.containsKey("JOURNAL_Server")) {
                context.JOURNAL_Server = (String) parentContextMap.get("JOURNAL_Server");
            }if (parentContextMap.containsKey("JOURNAL_AdditionalParams")) {
                context.JOURNAL_AdditionalParams = (String) parentContextMap.get("JOURNAL_AdditionalParams");
            }if (parentContextMap.containsKey("JOURNAL_Schema")) {
                context.JOURNAL_Schema = (String) parentContextMap.get("JOURNAL_Schema");
            }if (parentContextMap.containsKey("JOURNAL_Login")) {
                context.JOURNAL_Login = (String) parentContextMap.get("JOURNAL_Login");
            }if (parentContextMap.containsKey("JOURNAL_Port")) {
                context.JOURNAL_Port = (String) parentContextMap.get("JOURNAL_Port");
            }if (parentContextMap.containsKey("JOURNAL_Database")) {
                context.JOURNAL_Database = (String) parentContextMap.get("JOURNAL_Database");
            }if (parentContextMap.containsKey("DWH_V1_Port")) {
                context.DWH_V1_Port = (String) parentContextMap.get("DWH_V1_Port");
            }if (parentContextMap.containsKey("DWH_V1_Server")) {
                context.DWH_V1_Server = (String) parentContextMap.get("DWH_V1_Server");
            }if (parentContextMap.containsKey("DWH_V1_Login")) {
                context.DWH_V1_Login = (String) parentContextMap.get("DWH_V1_Login");
            }if (parentContextMap.containsKey("DWH_V1_AdditionalParams")) {
                context.DWH_V1_AdditionalParams = (String) parentContextMap.get("DWH_V1_AdditionalParams");
            }if (parentContextMap.containsKey("DWH_V1_Schema")) {
                context.DWH_V1_Schema = (String) parentContextMap.get("DWH_V1_Schema");
            }if (parentContextMap.containsKey("DWH_V1_Database")) {
                context.DWH_V1_Database = (String) parentContextMap.get("DWH_V1_Database");
            }if (parentContextMap.containsKey("DWH_V1_Password")) {
                context.DWH_V1_Password = (java.lang.String) parentContextMap.get("DWH_V1_Password");
            }if (parentContextMap.containsKey("SA_V1_Login")) {
                context.SA_V1_Login = (String) parentContextMap.get("SA_V1_Login");
            }if (parentContextMap.containsKey("SA_V1_Port")) {
                context.SA_V1_Port = (String) parentContextMap.get("SA_V1_Port");
            }if (parentContextMap.containsKey("SA_V1_AdditionalParams")) {
                context.SA_V1_AdditionalParams = (String) parentContextMap.get("SA_V1_AdditionalParams");
            }if (parentContextMap.containsKey("SA_V1_Schema")) {
                context.SA_V1_Schema = (String) parentContextMap.get("SA_V1_Schema");
            }if (parentContextMap.containsKey("SA_V1_Database")) {
                context.SA_V1_Database = (String) parentContextMap.get("SA_V1_Database");
            }if (parentContextMap.containsKey("SA_V1_Password")) {
                context.SA_V1_Password = (java.lang.String) parentContextMap.get("SA_V1_Password");
            }if (parentContextMap.containsKey("SA_V1_Server")) {
                context.SA_V1_Server = (String) parentContextMap.get("SA_V1_Server");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("JOURNAL_password");
			parametersToEncrypt.add("DWH_V1_Password");
			parametersToEncrypt.add("SA_V1_Password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));


if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();
        talendStats_STATS.addMessage("begin");


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;preStaLogConProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_preStaLogCon) {
globalMap.put("preStaLogCon_SUBPROCESS_STATE", -1);

e_preStaLogCon.printStackTrace();

}
try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}



        try {
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tRESTClient_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tRESTClient_2) {
globalMap.put("tRESTClient_2_SUBPROCESS_STATE", -1);

e_tRESTClient_2.printStackTrace();

}
catch (Error error_tRESTClient_2 ) {
end = System.currentTimeMillis();
talendStats_STATS.addMessage("failure", (end-startTime));
try {
 talendStats_STATSProcess(globalMap);
} catch (Exception e_talendStats_STATS) {
e_talendStats_STATS.printStackTrace();
}
throw error_tRESTClient_2;
}


this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : SA_003_projet");
        }
        talendStats_STATS.addMessage(status==""?"end":status, (end-startTime));
        try {
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");
    resumeUtil.flush();


    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_connectionStatsLogs");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
            connections.put("conn_connectionStatsLogs", globalMap.get("conn_connectionStatsLogs"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }
		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
		} else if (arg.startsWith("-D")) {
            String keyValue = arg.substring(2);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                String key = keyValue.substring(0, index);
                String value = keyValue.substring(index + 1);
                System.setProperty(key, value);
            }
        } else if (arg.startsWith("--context_file")) {
        	String keyValue = arg.substring(15);
        	String filePath = new String(java.util.Base64.getDecoder().decode(keyValue));
        	java.nio.file.Path contextFile = java.nio.file.Paths.get(filePath);
            try (java.io.BufferedReader reader = java.nio.file.Files.newBufferedReader(contextFile)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    int index = -1;
                    if ( (index = line.indexOf('=')) > -1) {
							if (line.startsWith("--context_param")) {
								if ("id_Password".equals(context_param.getContextType(line.substring(16, index)))) {
									context_param.put(line.substring(16, index), routines.system.PasswordEncryptUtil.decryptPassword(
											line.substring(index + 1)));
								} else {
									context_param.put(line.substring(16, index), line.substring(index + 1));
								}
							}else {//--context_type
								context_param.setContextType(line.substring(15, index), line.substring(index + 1));
							}
                    }
                }
            } catch (java.io.IOException e) {
            	System.err.println("Could not load the context file: " + filePath);
                e.printStackTrace();
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     459213 characters generated by Talaxie Open Studio for Data Integration 
 *     on the 3 mars 2026, 22:17:32 CET
 ************************************************************************************************/