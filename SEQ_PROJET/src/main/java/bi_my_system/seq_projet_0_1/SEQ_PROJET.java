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


package bi_my_system.seq_projet_0_1;

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
 





@SuppressWarnings("unused")

/**
 * Job: SEQ_PROJET Purpose: Séquenceur pour Pierre Soum<br>
 * Description: Filtre les taches sur le mois M-1 à l'exécution <br>
 * @author 
 * @version 202511
 * @status 
 */
public class SEQ_PROJET implements TalendJob {

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
			
			if(DWH_V1_AdditionalParams != null){
				
					this.setProperty("DWH_V1_AdditionalParams", DWH_V1_AdditionalParams.toString());
				
			}
			
			if(DWH_V1_Database != null){
				
					this.setProperty("DWH_V1_Database", DWH_V1_Database.toString());
				
			}
			
			if(DWH_V1_Login != null){
				
					this.setProperty("DWH_V1_Login", DWH_V1_Login.toString());
				
			}
			
			if(DWH_V1_Password != null){
				
					this.setProperty("DWH_V1_Password", DWH_V1_Password.toString());
				
			}
			
			if(DWH_V1_Port != null){
				
					this.setProperty("DWH_V1_Port", DWH_V1_Port.toString());
				
			}
			
			if(DWH_V1_Schema != null){
				
					this.setProperty("DWH_V1_Schema", DWH_V1_Schema.toString());
				
			}
			
			if(DWH_V1_Server != null){
				
					this.setProperty("DWH_V1_Server", DWH_V1_Server.toString());
				
			}
			
			if(JOURNAL_AdditionalParams != null){
				
					this.setProperty("JOURNAL_AdditionalParams", JOURNAL_AdditionalParams.toString());
				
			}
			
			if(JOURNAL_Database != null){
				
					this.setProperty("JOURNAL_Database", JOURNAL_Database.toString());
				
			}
			
			if(JOURNAL_Login != null){
				
					this.setProperty("JOURNAL_Login", JOURNAL_Login.toString());
				
			}
			
			if(JOURNAL_password != null){
				
					this.setProperty("JOURNAL_password", JOURNAL_password.toString());
				
			}
			
			if(JOURNAL_Port != null){
				
					this.setProperty("JOURNAL_Port", JOURNAL_Port.toString());
				
			}
			
			if(JOURNAL_Schema != null){
				
					this.setProperty("JOURNAL_Schema", JOURNAL_Schema.toString());
				
			}
			
			if(JOURNAL_Server != null){
				
					this.setProperty("JOURNAL_Server", JOURNAL_Server.toString());
				
			}
			
			if(ODS_V1_AdditionalParams != null){
				
					this.setProperty("ODS_V1_AdditionalParams", ODS_V1_AdditionalParams.toString());
				
			}
			
			if(ODS_V1_Database != null){
				
					this.setProperty("ODS_V1_Database", ODS_V1_Database.toString());
				
			}
			
			if(ODS_V1_Login != null){
				
					this.setProperty("ODS_V1_Login", ODS_V1_Login.toString());
				
			}
			
			if(ODS_V1_Password != null){
				
					this.setProperty("ODS_V1_Password", ODS_V1_Password.toString());
				
			}
			
			if(ODS_V1_Port != null){
				
					this.setProperty("ODS_V1_Port", ODS_V1_Port.toString());
				
			}
			
			if(ODS_V1_Schema != null){
				
					this.setProperty("ODS_V1_Schema", ODS_V1_Schema.toString());
				
			}
			
			if(ODS_V1_Server != null){
				
					this.setProperty("ODS_V1_Server", ODS_V1_Server.toString());
				
			}
			
			if(SA_V1_AdditionalParams != null){
				
					this.setProperty("SA_V1_AdditionalParams", SA_V1_AdditionalParams.toString());
				
			}
			
			if(SA_V1_Database != null){
				
					this.setProperty("SA_V1_Database", SA_V1_Database.toString());
				
			}
			
			if(SA_V1_Login != null){
				
					this.setProperty("SA_V1_Login", SA_V1_Login.toString());
				
			}
			
			if(SA_V1_Password != null){
				
					this.setProperty("SA_V1_Password", SA_V1_Password.toString());
				
			}
			
			if(SA_V1_Port != null){
				
					this.setProperty("SA_V1_Port", SA_V1_Port.toString());
				
			}
			
			if(SA_V1_Schema != null){
				
					this.setProperty("SA_V1_Schema", SA_V1_Schema.toString());
				
			}
			
			if(SA_V1_Server != null){
				
					this.setProperty("SA_V1_Server", SA_V1_Server.toString());
				
			}
			
			if(environnement != null){
				
					this.setProperty("environnement", environnement.toString());
				
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

public String DWH_V1_AdditionalParams;
public String getDWH_V1_AdditionalParams(){
	return this.DWH_V1_AdditionalParams;
}
public String DWH_V1_Database;
public String getDWH_V1_Database(){
	return this.DWH_V1_Database;
}
public String DWH_V1_Login;
public String getDWH_V1_Login(){
	return this.DWH_V1_Login;
}
public java.lang.String DWH_V1_Password;
public java.lang.String getDWH_V1_Password(){
	return this.DWH_V1_Password;
}
public String DWH_V1_Port;
public String getDWH_V1_Port(){
	return this.DWH_V1_Port;
}
public String DWH_V1_Schema;
public String getDWH_V1_Schema(){
	return this.DWH_V1_Schema;
}
public String DWH_V1_Server;
public String getDWH_V1_Server(){
	return this.DWH_V1_Server;
}
public String JOURNAL_AdditionalParams;
public String getJOURNAL_AdditionalParams(){
	return this.JOURNAL_AdditionalParams;
}
public String JOURNAL_Database;
public String getJOURNAL_Database(){
	return this.JOURNAL_Database;
}
public String JOURNAL_Login;
public String getJOURNAL_Login(){
	return this.JOURNAL_Login;
}
public java.lang.String JOURNAL_password;
public java.lang.String getJOURNAL_password(){
	return this.JOURNAL_password;
}
public String JOURNAL_Port;
public String getJOURNAL_Port(){
	return this.JOURNAL_Port;
}
public String JOURNAL_Schema;
public String getJOURNAL_Schema(){
	return this.JOURNAL_Schema;
}
public String JOURNAL_Server;
public String getJOURNAL_Server(){
	return this.JOURNAL_Server;
}
public String ODS_V1_AdditionalParams;
public String getODS_V1_AdditionalParams(){
	return this.ODS_V1_AdditionalParams;
}
public String ODS_V1_Database;
public String getODS_V1_Database(){
	return this.ODS_V1_Database;
}
public String ODS_V1_Login;
public String getODS_V1_Login(){
	return this.ODS_V1_Login;
}
public java.lang.String ODS_V1_Password;
public java.lang.String getODS_V1_Password(){
	return this.ODS_V1_Password;
}
public String ODS_V1_Port;
public String getODS_V1_Port(){
	return this.ODS_V1_Port;
}
public String ODS_V1_Schema;
public String getODS_V1_Schema(){
	return this.ODS_V1_Schema;
}
public String ODS_V1_Server;
public String getODS_V1_Server(){
	return this.ODS_V1_Server;
}
public String SA_V1_AdditionalParams;
public String getSA_V1_AdditionalParams(){
	return this.SA_V1_AdditionalParams;
}
public String SA_V1_Database;
public String getSA_V1_Database(){
	return this.SA_V1_Database;
}
public String SA_V1_Login;
public String getSA_V1_Login(){
	return this.SA_V1_Login;
}
public java.lang.String SA_V1_Password;
public java.lang.String getSA_V1_Password(){
	return this.SA_V1_Password;
}
public String SA_V1_Port;
public String getSA_V1_Port(){
	return this.SA_V1_Port;
}
public String SA_V1_Schema;
public String getSA_V1_Schema(){
	return this.SA_V1_Schema;
}
public String SA_V1_Server;
public String getSA_V1_Server(){
	return this.SA_V1_Server;
}
public String environnement;
public String getEnvironnement(){
	return this.environnement;
}
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "SEQ_PROJET";
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
	StatCatcherUtils talendStats_STATS = new StatCatcherUtils("_ML_I0BMHEfGX1IjHrOgGxg", "0.1");
	MetterCatcherUtils talendMeter_METTER = new MetterCatcherUtils("_ML_I0BMHEfGX1IjHrOgGxg", "0.1");

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
				SEQ_PROJET.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(SEQ_PROJET.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_4_onSubJobError(exception, errorComponent, globalMap);
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
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
						}
					
					errorCode = null;
					tSendMail_3Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tSendMail_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError2", 0, "error");
						}
					
					errorCode = null;
					tSendMail_4Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
	


public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

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
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";
	
	
		int tos_count_tChronometerStart_1 = 0;
		

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	

 

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());




/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tChronometerStart_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tSendMail_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";
	
	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	


public void tSendMail_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_1_SUBPROCESS_STATE", 0);

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
	 * [tSendMail_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_1", false);
		start_Hash.put("tSendMail_1", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_1";
	
	
		int tos_count_tSendMail_1 = 0;
		

 



/**
 * [tSendMail_1 begin ] stop
 */
	
	/**
	 * [tSendMail_1 main ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 

	String smtpHost_tSendMail_1 = "smtp.office365.com";
        String smtpPort_tSendMail_1 = "587";
	String from_tSendMail_1 = ("tmabi@fms-ea.com");
    String to_tSendMail_1 = ("tmabi@fms-ea.com").replace(";",",");
    String cc_tSendMail_1 = (("support.decisionnel@fms-ea.com")==null || "".equals("support.decisionnel@fms-ea.com"))?null:("support.decisionnel@fms-ea.com").replace(";",",");
    String bcc_tSendMail_1 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_1 = ("[" + context.environnement + "]Talaxie notification - Séquenceur PROJET démarré");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();

	String message_tSendMail_1 = (("<h3>Démarrage du traitement</h3>" +
"<p>Le job <b>" + jobName + "</b> vient de démarrer normalement.</p>" +
"<p>Les systèmes sont opérationnels et le traitement est en cours.</p>" +
"<p>" +
"<b>Serveur :</b> " +
java.net.InetAddress.getLocalHost().getHostName() +
" (" + java.net.InetAddress.getLocalHost().getHostAddress() + ")<br>" +
"<b>PID :</b> " +
java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0] + "<br>" +
"<b>Date :</b> " + TalendDate.getDate("yyyy-MM-dd HH:mm") +
"</p>" +
"<p><b>Prochaine notification attendue :</b> SUCCESS ou ERROR.</p>" +
"<p><i>(Si aucun message ne suit, c’est qu’il mérite probablement notre attention.)</i></p>") == null || "".equals("<h3>Démarrage du traitement</h3>" +
"<p>Le job <b>" + jobName + "</b> vient de démarrer normalement.</p>" +
"<p>Les systèmes sont opérationnels et le traitement est en cours.</p>" +
"<p>" +
"<b>Serveur :</b> " +
java.net.InetAddress.getLocalHost().getHostName() +
" (" + java.net.InetAddress.getLocalHost().getHostAddress() + ")<br>" +
"<b>PID :</b> " +
java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0] + "<br>" +
"<b>Date :</b> " + TalendDate.getDate("yyyy-MM-dd HH:mm") +
"</p>" +
"<p><b>Prochaine notification attendue :</b> SUCCESS ou ERROR.</p>" +
"<p><i>(Si aucun message ne suit, c’est qu’il mérite probablement notre attention.)</i></p>")) ? "\"\"" : ("<h3>Démarrage du traitement</h3>" +
"<p>Le job <b>" + jobName + "</b> vient de démarrer normalement.</p>" +
"<p>Les systèmes sont opérationnels et le traitement est en cours.</p>" +
"<p>" +
"<b>Serveur :</b> " +
java.net.InetAddress.getLocalHost().getHostName() +
" (" + java.net.InetAddress.getLocalHost().getHostAddress() + ")<br>" +
"<b>PID :</b> " +
java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0] + "<br>" +
"<b>Date :</b> " + TalendDate.getDate("yyyy-MM-dd HH:mm") +
"</p>" +
"<p><b>Prochaine notification attendue :</b> SUCCESS ou ERROR.</p>" +
"<p><i>(Si aucun message ne suit, c’est qu’il mérite probablement notre attention.)</i></p>") ;
	java.util.Properties props_tSendMail_1 = System.getProperties();     
	props_tSendMail_1.put("mail.smtp.host", smtpHost_tSendMail_1);
	props_tSendMail_1.put("mail.smtp.port", smtpPort_tSendMail_1);
	
		props_tSendMail_1.put("mail.mime.encodefilename", "true");
		props_tSendMail_1.put("mail.smtp.starttls.enable","true");     
	try {
		
		
			props_tSendMail_1.put("mail.smtp.auth", "true");
			javax.mail.Session session_tSendMail_1 = javax.mail.Session.getInstance(props_tSendMail_1, new javax.mail.Authenticator(){         
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				
                 
	final String decryptedPassword_tSendMail_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:cIj5n2kL5y8MDSVec48t43AKjB7eFncqQuihUSNdzzwy/l8wXevLsz8xXPGhJ40q");
				
				
				return new javax.mail.PasswordAuthentication("tmabi@fms-ea.com", decryptedPassword_tSendMail_1); 
				}         
			});   
		
		
		javax.mail.Message msg_tSendMail_1 = new javax.mail.internet.MimeMessage(session_tSendMail_1);
		msg_tSendMail_1.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_1, "TMA BI INTERNE"));
		msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_1, false));
		if (cc_tSendMail_1 != null) msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_1, false));
		if (bcc_tSendMail_1 != null) msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_1, false));
		msg_tSendMail_1.setSubject(subject_tSendMail_1);

		for (int i_tSendMail_1 = 0; i_tSendMail_1 < headers_tSendMail_1.size(); i_tSendMail_1++) {
			java.util.Map<String, String> header_tSendMail_1 = headers_tSendMail_1.get(i_tSendMail_1);
			msg_tSendMail_1.setHeader(header_tSendMail_1.get("KEY"), header_tSendMail_1.get("VALUE"));    
		}  
		msg_tSendMail_1.setSentDate(new Date());
		msg_tSendMail_1.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_1 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_1.setText(message_tSendMail_1,"UTF-8", "html");
		mp_tSendMail_1.addBodyPart(mbpText_tSendMail_1);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_1 = null;

		for (int i_tSendMail_1 = 0; i_tSendMail_1 < attachments_tSendMail_1.size(); i_tSendMail_1++){
			String filename_tSendMail_1 = attachments_tSendMail_1.get(i_tSendMail_1);
			javax.activation.FileDataSource fds_tSendMail_1 = null;
			java.io.File file_tSendMail_1 = new java.io.File(filename_tSendMail_1);
			
    		if (file_tSendMail_1.isDirectory()){
				java.io.File[] subFiles_tSendMail_1 = file_tSendMail_1.listFiles();
				for(java.io.File subFile_tSendMail_1 : subFiles_tSendMail_1){
					if (subFile_tSendMail_1.isFile()){
						fds_tSendMail_1 = new javax.activation.FileDataSource(subFile_tSendMail_1.getAbsolutePath());
						mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
						mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
						if(contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
					}
				}
    		}else{
				mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_1 = new javax.activation.FileDataSource(filename_tSendMail_1);
				mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1)); 
				mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
				if(contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
			}
		}
		// -- set the content --
		msg_tSendMail_1.setContent(mp_tSendMail_1);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_1 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_1.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_1.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_1.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_1.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_1.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_1);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_1 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_1);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_1_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
		props_tSendMail_1.remove("mail.smtp.host");
		props_tSendMail_1.remove("mail.smtp.port");
		
		props_tSendMail_1.remove("mail.mime.encodefilename");
		
			props_tSendMail_1.remove("mail.smtp.starttls.enable");
		
		props_tSendMail_1.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_1++;

/**
 * [tSendMail_1 main ] stop
 */
	
	/**
	 * [tSendMail_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_1 end ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 

ok_Hash.put("tSendMail_1", true);
end_Hash.put("tSendMail_1", System.currentTimeMillis());




/**
 * [tSendMail_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tSendMail_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tRunJob_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSendMail_1 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_1_SUBPROCESS_STATE", 1);
	}
	


public void tRunJob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_1_SUBPROCESS_STATE", 0);

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
	 * [tRunJob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_1", false);
		start_Hash.put("tRunJob_1", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_1";
	
	
		int tos_count_tRunJob_1 = 0;
		


 



/**
 * [tRunJob_1 begin ] stop
 */
	
	/**
	 * [tRunJob_1 main ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	
	java.util.List<String> paraList_tRunJob_1 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_1.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_1.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_1.add("--father_node=tRunJob_1");
	      			
	        				paraList_tRunJob_1.add("--context=dev");
	      			
		if(enableLogStash){
			paraList_tRunJob_1.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_1.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_1.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_1 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_1 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_1".equals(tRunJobName_tRunJob_1) && childResumePath_tRunJob_1 != null){
		paraList_tRunJob_1.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_1.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_1");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_1 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_1 = null;

	
	
		bi_my_system.sa_003_projet_0_1.SA_003_projet childJob_tRunJob_1 = new bi_my_system.sa_003_projet_0_1.SA_003_projet();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_1 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_1) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_1 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_1 : talendDataSources_tRunJob_1
			        .entrySet()) {
	            dataSources_tRunJob_1.put(talendDataSourceEntry_tRunJob_1.getKey(),
	                    talendDataSourceEntry_tRunJob_1.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_1.setDataSources(dataSources_tRunJob_1);
	    }
		  
			childJob_tRunJob_1.parentContextMap = parentContextMap_tRunJob_1;
		  
		
		String[][] childReturn_tRunJob_1 = childJob_tRunJob_1.runJob((String[]) paraList_tRunJob_1.toArray(new String[paraList_tRunJob_1.size()]));
		
            if(childJob_tRunJob_1.getErrorCode() == null){
                globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getStatus() != null && ("failure").equals(childJob_tRunJob_1.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getErrorCode());
            }
            if (childJob_tRunJob_1.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_1_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_1.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_1.getErrorCode();
                if (childJob_tRunJob_1.getErrorCode() != null || ("failure").equals(childJob_tRunJob_1.getStatus())) {
                    java.lang.Exception ce_tRunJob_1 = childJob_tRunJob_1.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_1!=null) ? (ce_tRunJob_1.getClass().getName() + ": " + ce_tRunJob_1.getMessage()) : ""));
                }

 


	tos_count_tRunJob_1++;

/**
 * [tRunJob_1 main ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	

 



/**
 * [tRunJob_1 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	

 



/**
 * [tRunJob_1 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_1 end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	

 

ok_Hash.put("tRunJob_1", true);
end_Hash.put("tRunJob_1", System.currentTimeMillis());




/**
 * [tRunJob_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tRunJob_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_1 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	
	
 



/**
 * [tRunJob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 1);
	}
	


public void tSendMail_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_3_SUBPROCESS_STATE", 0);

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
	 * [tSendMail_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_3", false);
		start_Hash.put("tSendMail_3", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_3";
	
	
		int tos_count_tSendMail_3 = 0;
		

 



/**
 * [tSendMail_3 begin ] stop
 */
	
	/**
	 * [tSendMail_3 main ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 

	String smtpHost_tSendMail_3 = "smtp.office365.com";
        String smtpPort_tSendMail_3 = "587";
	String from_tSendMail_3 = ("tmabi@fms-ea.com");
    String to_tSendMail_3 = ("tmabi@fms-ea.com").replace(";",",");
    String cc_tSendMail_3 = (("support.decisionnel@fms-ea.com")==null || "".equals("support.decisionnel@fms-ea.com"))?null:("support.decisionnel@fms-ea.com").replace(";",",");
    String bcc_tSendMail_3 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_3 = ("[" + context.environnement + "]Talaxie notification - Erreur SA PROJET");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_3 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_3 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_3 = new java.util.ArrayList<String>();

	String message_tSendMail_3 = (("<h3>Erreur de traitement</h3>" +
"<p><b>Erreur :</b><br>" +
"<i>" + ((String)globalMap.get("tRunJob_1_ERROR_MESSAGE")) + "</i>" +
"</p>"
) == null || "".equals("<h3>Erreur de traitement</h3>" +
"<p><b>Erreur :</b><br>" +
"<i>" + ((String)globalMap.get("tRunJob_1_ERROR_MESSAGE")) + "</i>" +
"</p>"
)) ? "\"\"" : ("<h3>Erreur de traitement</h3>" +
"<p><b>Erreur :</b><br>" +
"<i>" + ((String)globalMap.get("tRunJob_1_ERROR_MESSAGE")) + "</i>" +
"</p>"
) ;
	java.util.Properties props_tSendMail_3 = System.getProperties();     
	props_tSendMail_3.put("mail.smtp.host", smtpHost_tSendMail_3);
	props_tSendMail_3.put("mail.smtp.port", smtpPort_tSendMail_3);
	
		props_tSendMail_3.put("mail.mime.encodefilename", "true");
		props_tSendMail_3.put("mail.smtp.starttls.enable","true");     
	try {
		
		
			props_tSendMail_3.put("mail.smtp.auth", "true");
			javax.mail.Session session_tSendMail_3 = javax.mail.Session.getInstance(props_tSendMail_3, new javax.mail.Authenticator(){         
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				
                 
	final String decryptedPassword_tSendMail_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Vw5PtyMOoz9aUrA9EAUamwmQrbwGs93CLdPSfFKkdVqGjY4k8M2u19IdN6xlYaXV");
				
				
				return new javax.mail.PasswordAuthentication("tmabi@fms-ea.com", decryptedPassword_tSendMail_3); 
				}         
			});   
		
		
		javax.mail.Message msg_tSendMail_3 = new javax.mail.internet.MimeMessage(session_tSendMail_3);
		msg_tSendMail_3.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_3, "TMA BI INTERNE"));
		msg_tSendMail_3.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_3, false));
		if (cc_tSendMail_3 != null) msg_tSendMail_3.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_3, false));
		if (bcc_tSendMail_3 != null) msg_tSendMail_3.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_3, false));
		msg_tSendMail_3.setSubject(subject_tSendMail_3);

		for (int i_tSendMail_3 = 0; i_tSendMail_3 < headers_tSendMail_3.size(); i_tSendMail_3++) {
			java.util.Map<String, String> header_tSendMail_3 = headers_tSendMail_3.get(i_tSendMail_3);
			msg_tSendMail_3.setHeader(header_tSendMail_3.get("KEY"), header_tSendMail_3.get("VALUE"));    
		}  
		msg_tSendMail_3.setSentDate(new Date());
		msg_tSendMail_3.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_3 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_3.setText(message_tSendMail_3,"UTF-8", "html");
		mp_tSendMail_3.addBodyPart(mbpText_tSendMail_3);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_3 = null;

		for (int i_tSendMail_3 = 0; i_tSendMail_3 < attachments_tSendMail_3.size(); i_tSendMail_3++){
			String filename_tSendMail_3 = attachments_tSendMail_3.get(i_tSendMail_3);
			javax.activation.FileDataSource fds_tSendMail_3 = null;
			java.io.File file_tSendMail_3 = new java.io.File(filename_tSendMail_3);
			
    		if (file_tSendMail_3.isDirectory()){
				java.io.File[] subFiles_tSendMail_3 = file_tSendMail_3.listFiles();
				for(java.io.File subFile_tSendMail_3 : subFiles_tSendMail_3){
					if (subFile_tSendMail_3.isFile()){
						fds_tSendMail_3 = new javax.activation.FileDataSource(subFile_tSendMail_3.getAbsolutePath());
						mbpFile_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_3.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_3));
						mbpFile_tSendMail_3.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_3.getName()));
						if(contentTransferEncoding_tSendMail_3.get(i_tSendMail_3).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_3.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_3.addBodyPart(mbpFile_tSendMail_3);
					}
				}
    		}else{
				mbpFile_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_3 = new javax.activation.FileDataSource(filename_tSendMail_3);
				mbpFile_tSendMail_3.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_3)); 
				mbpFile_tSendMail_3.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_3.getName()));
				if(contentTransferEncoding_tSendMail_3.get(i_tSendMail_3).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_3.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_3.addBodyPart(mbpFile_tSendMail_3);
			}
		}
		// -- set the content --
		msg_tSendMail_3.setContent(mp_tSendMail_3);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_3 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_3.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_3.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_3.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_3.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_3.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_3);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_3 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_3);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_3_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
		props_tSendMail_3.remove("mail.smtp.host");
		props_tSendMail_3.remove("mail.smtp.port");
		
		props_tSendMail_3.remove("mail.mime.encodefilename");
		
			props_tSendMail_3.remove("mail.smtp.starttls.enable");
		
		props_tSendMail_3.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_3++;

/**
 * [tSendMail_3 main ] stop
 */
	
	/**
	 * [tSendMail_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 



/**
 * [tSendMail_3 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 



/**
 * [tSendMail_3 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_3 end ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 

ok_Hash.put("tSendMail_3", true);
end_Hash.put("tSendMail_3", System.currentTimeMillis());




/**
 * [tSendMail_3 end ] stop
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
	 * [tSendMail_3 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 



/**
 * [tSendMail_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_3_SUBPROCESS_STATE", 1);
	}
	


public void tRunJob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

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
	 * [tRunJob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_2", false);
		start_Hash.put("tRunJob_2", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_2";
	
	
		int tos_count_tRunJob_2 = 0;
		


 



/**
 * [tRunJob_2 begin ] stop
 */
	
	/**
	 * [tRunJob_2 main ] start
	 */

	

	
	
	currentComponent="tRunJob_2";
	
	
	java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_2.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_2.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_2.add("--father_node=tRunJob_2");
	      			
	        				paraList_tRunJob_2.add("--context=dev");
	      			
		if(enableLogStash){
			paraList_tRunJob_2.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_2.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_2.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_2 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_2 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_2".equals(tRunJobName_tRunJob_2) && childResumePath_tRunJob_2 != null){
		paraList_tRunJob_2.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_2");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_2 = null;

	
	
		bi_my_system.ods_001_projet_0_1.ODS_001_projet childJob_tRunJob_2 = new bi_my_system.ods_001_projet_0_1.ODS_001_projet();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_2 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_2) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_2 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_2 : talendDataSources_tRunJob_2
			        .entrySet()) {
	            dataSources_tRunJob_2.put(talendDataSourceEntry_tRunJob_2.getKey(),
	                    talendDataSourceEntry_tRunJob_2.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_2.setDataSources(dataSources_tRunJob_2);
	    }
		  
			childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
		  
		
		String[][] childReturn_tRunJob_2 = childJob_tRunJob_2.runJob((String[]) paraList_tRunJob_2.toArray(new String[paraList_tRunJob_2.size()]));
		
            if(childJob_tRunJob_2.getErrorCode() == null){
                globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getStatus() != null && ("failure").equals(childJob_tRunJob_2.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getErrorCode());
            }
            if (childJob_tRunJob_2.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_2.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_2.getErrorCode();
                if (childJob_tRunJob_2.getErrorCode() != null || ("failure").equals(childJob_tRunJob_2.getStatus())) {
                    java.lang.Exception ce_tRunJob_2 = childJob_tRunJob_2.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_2!=null) ? (ce_tRunJob_2.getClass().getName() + ": " + ce_tRunJob_2.getMessage()) : ""));
                }

 


	tos_count_tRunJob_2++;

/**
 * [tRunJob_2 main ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_2";
	
	

 



/**
 * [tRunJob_2 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";
	
	

 



/**
 * [tRunJob_2 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_2 end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";
	
	

 

ok_Hash.put("tRunJob_2", true);
end_Hash.put("tRunJob_2", System.currentTimeMillis());




/**
 * [tRunJob_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
								} 
							
							tChronometerStop_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_2 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_2";
	
	
	
 



/**
 * [tRunJob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}
	


public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

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
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";
	
	
		int tos_count_tChronometerStop_1 = 0;
		
	
	long timetChronometerStop_1;
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("jobDuration" + "  " + timetChronometerStop_1 + " milliseconds");
	  	 
	
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	

 

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());




/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tChronometerStop_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tSendMail_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";
	
	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	


public void tSendMail_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_2_SUBPROCESS_STATE", 0);

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
	 * [tSendMail_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_2", false);
		start_Hash.put("tSendMail_2", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_2";
	
	
		int tos_count_tSendMail_2 = 0;
		

 



/**
 * [tSendMail_2 begin ] stop
 */
	
	/**
	 * [tSendMail_2 main ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 

	String smtpHost_tSendMail_2 = "smtp.office365.com";
        String smtpPort_tSendMail_2 = "587";
	String from_tSendMail_2 = ("tmabi@fms-ea.com");
    String to_tSendMail_2 = ("tmabi@fms-ea.com").replace(";",",");
    String cc_tSendMail_2 = (("support.decisionnel@fms-ea.com")==null || "".equals("support.decisionnel@fms-ea.com"))?null:("support.decisionnel@fms-ea.com").replace(";",",");
    String bcc_tSendMail_2 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_2 = ("[" + context.environnement + "]Talaxie notification - Séquenceur PROJET terminé avec succès");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

	String message_tSendMail_2 = (("<h3>Traitement terminé avec succès</h3>" +
"<p>Le job <b>" + jobName + "</b> s'est terminé avec succès.</p>" +
"<p>Les traitements ont été exécutés correctement et les données sont à jour.</p>" +
"<p>" +
"<b>PID :</b> " +
java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0] + "<br>" +
"<b>Durée :</b> " +
String.format("%02d:%02d:%02d",
    ((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)/3600,
    (((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)%3600)/60,
    ((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)%60
) + "<br>" +
"<b>Date :</b> " + TalendDate.getDate("yyyy-MM-dd HH:mm") +
"</p>" +
"<p>Tout fonctionne comme prévu.<br>Bonne journée</p>") == null || "".equals("<h3>Traitement terminé avec succès</h3>" +
"<p>Le job <b>" + jobName + "</b> s'est terminé avec succès.</p>" +
"<p>Les traitements ont été exécutés correctement et les données sont à jour.</p>" +
"<p>" +
"<b>PID :</b> " +
java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0] + "<br>" +
"<b>Durée :</b> " +
String.format("%02d:%02d:%02d",
    ((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)/3600,
    (((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)%3600)/60,
    ((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)%60
) + "<br>" +
"<b>Date :</b> " + TalendDate.getDate("yyyy-MM-dd HH:mm") +
"</p>" +
"<p>Tout fonctionne comme prévu.<br>Bonne journée</p>")) ? "\"\"" : ("<h3>Traitement terminé avec succès</h3>" +
"<p>Le job <b>" + jobName + "</b> s'est terminé avec succès.</p>" +
"<p>Les traitements ont été exécutés correctement et les données sont à jour.</p>" +
"<p>" +
"<b>PID :</b> " +
java.lang.management.ManagementFactory.getRuntimeMXBean().getName().split("@")[0] + "<br>" +
"<b>Durée :</b> " +
String.format("%02d:%02d:%02d",
    ((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)/3600,
    (((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)%3600)/60,
    ((Long)globalMap.get("tChronometerStop_1_DURATION")/1000)%60
) + "<br>" +
"<b>Date :</b> " + TalendDate.getDate("yyyy-MM-dd HH:mm") +
"</p>" +
"<p>Tout fonctionne comme prévu.<br>Bonne journée</p>") ;
	java.util.Properties props_tSendMail_2 = System.getProperties();     
	props_tSendMail_2.put("mail.smtp.host", smtpHost_tSendMail_2);
	props_tSendMail_2.put("mail.smtp.port", smtpPort_tSendMail_2);
	
		props_tSendMail_2.put("mail.mime.encodefilename", "true");
		props_tSendMail_2.put("mail.smtp.starttls.enable","true");     
	try {
		
		
			props_tSendMail_2.put("mail.smtp.auth", "true");
			javax.mail.Session session_tSendMail_2 = javax.mail.Session.getInstance(props_tSendMail_2, new javax.mail.Authenticator(){         
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				
                 
	final String decryptedPassword_tSendMail_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:qQnLEE2dJ6zBlt/1c2MHpm92hcV2WX8gbh3BudE0ey+i+4qlaNY9eqWfHW2O4Mvg");
				
				
				return new javax.mail.PasswordAuthentication("tmabi@fms-ea.com", decryptedPassword_tSendMail_2); 
				}         
			});   
		
		
		javax.mail.Message msg_tSendMail_2 = new javax.mail.internet.MimeMessage(session_tSendMail_2);
		msg_tSendMail_2.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_2, "TMA BI INTERNE"));
		msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_2, false));
		if (cc_tSendMail_2 != null) msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_2, false));
		if (bcc_tSendMail_2 != null) msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_2, false));
		msg_tSendMail_2.setSubject(subject_tSendMail_2);

		for (int i_tSendMail_2 = 0; i_tSendMail_2 < headers_tSendMail_2.size(); i_tSendMail_2++) {
			java.util.Map<String, String> header_tSendMail_2 = headers_tSendMail_2.get(i_tSendMail_2);
			msg_tSendMail_2.setHeader(header_tSendMail_2.get("KEY"), header_tSendMail_2.get("VALUE"));    
		}  
		msg_tSendMail_2.setSentDate(new Date());
		msg_tSendMail_2.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_2 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_2.setText(message_tSendMail_2,"UTF-8", "html");
		mp_tSendMail_2.addBodyPart(mbpText_tSendMail_2);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_2 = null;

		for (int i_tSendMail_2 = 0; i_tSendMail_2 < attachments_tSendMail_2.size(); i_tSendMail_2++){
			String filename_tSendMail_2 = attachments_tSendMail_2.get(i_tSendMail_2);
			javax.activation.FileDataSource fds_tSendMail_2 = null;
			java.io.File file_tSendMail_2 = new java.io.File(filename_tSendMail_2);
			
    		if (file_tSendMail_2.isDirectory()){
				java.io.File[] subFiles_tSendMail_2 = file_tSendMail_2.listFiles();
				for(java.io.File subFile_tSendMail_2 : subFiles_tSendMail_2){
					if (subFile_tSendMail_2.isFile()){
						fds_tSendMail_2 = new javax.activation.FileDataSource(subFile_tSendMail_2.getAbsolutePath());
						mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_2.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_2));
						mbpFile_tSendMail_2.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_2.getName()));
						if(contentTransferEncoding_tSendMail_2.get(i_tSendMail_2).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_2.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_2.addBodyPart(mbpFile_tSendMail_2);
					}
				}
    		}else{
				mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_2 = new javax.activation.FileDataSource(filename_tSendMail_2);
				mbpFile_tSendMail_2.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_2)); 
				mbpFile_tSendMail_2.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_2.getName()));
				if(contentTransferEncoding_tSendMail_2.get(i_tSendMail_2).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_2.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_2.addBodyPart(mbpFile_tSendMail_2);
			}
		}
		// -- set the content --
		msg_tSendMail_2.setContent(mp_tSendMail_2);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_2 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_2.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_2.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_2.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_2.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_2.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_2);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_2 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_2);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_2_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
		props_tSendMail_2.remove("mail.smtp.host");
		props_tSendMail_2.remove("mail.smtp.port");
		
		props_tSendMail_2.remove("mail.mime.encodefilename");
		
			props_tSendMail_2.remove("mail.smtp.starttls.enable");
		
		props_tSendMail_2.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_2++;

/**
 * [tSendMail_2 main ] stop
 */
	
	/**
	 * [tSendMail_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 



/**
 * [tSendMail_2 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 



/**
 * [tSendMail_2 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_2 end ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 

ok_Hash.put("tSendMail_2", true);
end_Hash.put("tSendMail_2", System.currentTimeMillis());




/**
 * [tSendMail_2 end ] stop
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
	 * [tSendMail_2 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 



/**
 * [tSendMail_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_2_SUBPROCESS_STATE", 1);
	}
	


public void tSendMail_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_4_SUBPROCESS_STATE", 0);

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
	 * [tSendMail_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_4", false);
		start_Hash.put("tSendMail_4", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_4";
	
	
		int tos_count_tSendMail_4 = 0;
		

 



/**
 * [tSendMail_4 begin ] stop
 */
	
	/**
	 * [tSendMail_4 main ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 

	String smtpHost_tSendMail_4 = "smtp.office365.com";
        String smtpPort_tSendMail_4 = "587";
	String from_tSendMail_4 = ("tmabi@fms-ea.com");
    String to_tSendMail_4 = ("tmabi@fms-ea.com").replace(";",",");
    String cc_tSendMail_4 = (("support.decisionnel@fms-ea.com")==null || "".equals("support.decisionnel@fms-ea.com"))?null:("support.decisionnel@fms-ea.com").replace(";",",");
    String bcc_tSendMail_4 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_4 = ("[" + context.environnement + "]Talaxie notification - Erreur ODS PROJET");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_4 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_4 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_4 = new java.util.ArrayList<String>();

	String message_tSendMail_4 = (("<h3>Erreur de traitement</h3>" +
"<p><b>Erreur :</b><br>" +
"<i>" + ((String)globalMap.get("tRunJob_2_ERROR_MESSAGE")) + "</i>" +
"</p>"
) == null || "".equals("<h3>Erreur de traitement</h3>" +
"<p><b>Erreur :</b><br>" +
"<i>" + ((String)globalMap.get("tRunJob_2_ERROR_MESSAGE")) + "</i>" +
"</p>"
)) ? "\"\"" : ("<h3>Erreur de traitement</h3>" +
"<p><b>Erreur :</b><br>" +
"<i>" + ((String)globalMap.get("tRunJob_2_ERROR_MESSAGE")) + "</i>" +
"</p>"
) ;
	java.util.Properties props_tSendMail_4 = System.getProperties();     
	props_tSendMail_4.put("mail.smtp.host", smtpHost_tSendMail_4);
	props_tSendMail_4.put("mail.smtp.port", smtpPort_tSendMail_4);
	
		props_tSendMail_4.put("mail.mime.encodefilename", "true");
		props_tSendMail_4.put("mail.smtp.starttls.enable","true");     
	try {
		
		
			props_tSendMail_4.put("mail.smtp.auth", "true");
			javax.mail.Session session_tSendMail_4 = javax.mail.Session.getInstance(props_tSendMail_4, new javax.mail.Authenticator(){         
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				
                 
	final String decryptedPassword_tSendMail_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:j08S6yE9KTLlF1wcVvm1zJIx10hCXUY8Fc0e/S+P+LFEedz9yYP2Bv7po3EbEklW");
				
				
				return new javax.mail.PasswordAuthentication("tmabi@fms-ea.com", decryptedPassword_tSendMail_4); 
				}         
			});   
		
		
		javax.mail.Message msg_tSendMail_4 = new javax.mail.internet.MimeMessage(session_tSendMail_4);
		msg_tSendMail_4.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_4, "TMA BI INTERNE"));
		msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_4, false));
		if (cc_tSendMail_4 != null) msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_4, false));
		if (bcc_tSendMail_4 != null) msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_4, false));
		msg_tSendMail_4.setSubject(subject_tSendMail_4);

		for (int i_tSendMail_4 = 0; i_tSendMail_4 < headers_tSendMail_4.size(); i_tSendMail_4++) {
			java.util.Map<String, String> header_tSendMail_4 = headers_tSendMail_4.get(i_tSendMail_4);
			msg_tSendMail_4.setHeader(header_tSendMail_4.get("KEY"), header_tSendMail_4.get("VALUE"));    
		}  
		msg_tSendMail_4.setSentDate(new Date());
		msg_tSendMail_4.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_4 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_4.setText(message_tSendMail_4,"UTF-8", "html");
		mp_tSendMail_4.addBodyPart(mbpText_tSendMail_4);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_4 = null;

		for (int i_tSendMail_4 = 0; i_tSendMail_4 < attachments_tSendMail_4.size(); i_tSendMail_4++){
			String filename_tSendMail_4 = attachments_tSendMail_4.get(i_tSendMail_4);
			javax.activation.FileDataSource fds_tSendMail_4 = null;
			java.io.File file_tSendMail_4 = new java.io.File(filename_tSendMail_4);
			
    		if (file_tSendMail_4.isDirectory()){
				java.io.File[] subFiles_tSendMail_4 = file_tSendMail_4.listFiles();
				for(java.io.File subFile_tSendMail_4 : subFiles_tSendMail_4){
					if (subFile_tSendMail_4.isFile()){
						fds_tSendMail_4 = new javax.activation.FileDataSource(subFile_tSendMail_4.getAbsolutePath());
						mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_4.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_4));
						mbpFile_tSendMail_4.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_4.getName()));
						if(contentTransferEncoding_tSendMail_4.get(i_tSendMail_4).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_4.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
					}
				}
    		}else{
				mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_4 = new javax.activation.FileDataSource(filename_tSendMail_4);
				mbpFile_tSendMail_4.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_4)); 
				mbpFile_tSendMail_4.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_4.getName()));
				if(contentTransferEncoding_tSendMail_4.get(i_tSendMail_4).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_4.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
			}
		}
		// -- set the content --
		msg_tSendMail_4.setContent(mp_tSendMail_4);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_4 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_4.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_4.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_4.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_4.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_4.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_4);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_4 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_4);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_4_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
		props_tSendMail_4.remove("mail.smtp.host");
		props_tSendMail_4.remove("mail.smtp.port");
		
		props_tSendMail_4.remove("mail.mime.encodefilename");
		
			props_tSendMail_4.remove("mail.smtp.starttls.enable");
		
		props_tSendMail_4.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_4++;

/**
 * [tSendMail_4 main ] stop
 */
	
	/**
	 * [tSendMail_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 



/**
 * [tSendMail_4 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 



/**
 * [tSendMail_4 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_4 end ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 

ok_Hash.put("tSendMail_4", true);
end_Hash.put("tSendMail_4", System.currentTimeMillis());




/**
 * [tSendMail_4 end ] stop
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
	 * [tSendMail_4 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 



/**
 * [tSendMail_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_4_SUBPROCESS_STATE", 1);
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
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[0];

	
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
			if(length > commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET) {

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

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET) {

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
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[0];

	
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
			if(length > commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET) {

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

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET) {

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
    final static byte[] commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET = new byte[0];
    static byte[] commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[0];

	
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
			if(length > commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length) {
				if(length < 1024 && commonByteArray_BI_MY_SYSTEM_SEQ_PROJET.length == 0) {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[1024];
				} else {
   					commonByteArray_BI_MY_SYSTEM_SEQ_PROJET = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length);
			strReturn = new String(commonByteArray_BI_MY_SYSTEM_SEQ_PROJET, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET) {

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

		synchronized(commonByteArrayLock_BI_MY_SYSTEM_SEQ_PROJET) {

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
    public String contextStr = "rec";
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
        final SEQ_PROJET SEQ_PROJETClass = new SEQ_PROJET();

        int exitCode = SEQ_PROJETClass.runJobInTOS(args);

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
            java.io.InputStream inContext = SEQ_PROJET.class.getClassLoader().getResourceAsStream("bi_my_system/seq_projet_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = SEQ_PROJET.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("DWH_V1_AdditionalParams", "id_String");
                        if(context.getStringValue("DWH_V1_AdditionalParams") == null) {
                            context.DWH_V1_AdditionalParams = null;
                        } else {
                            context.DWH_V1_AdditionalParams=(String) context.getProperty("DWH_V1_AdditionalParams");
                        }
                        context.setContextType("DWH_V1_Database", "id_String");
                        if(context.getStringValue("DWH_V1_Database") == null) {
                            context.DWH_V1_Database = null;
                        } else {
                            context.DWH_V1_Database=(String) context.getProperty("DWH_V1_Database");
                        }
                        context.setContextType("DWH_V1_Login", "id_String");
                        if(context.getStringValue("DWH_V1_Login") == null) {
                            context.DWH_V1_Login = null;
                        } else {
                            context.DWH_V1_Login=(String) context.getProperty("DWH_V1_Login");
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
                        context.setContextType("DWH_V1_Port", "id_String");
                        if(context.getStringValue("DWH_V1_Port") == null) {
                            context.DWH_V1_Port = null;
                        } else {
                            context.DWH_V1_Port=(String) context.getProperty("DWH_V1_Port");
                        }
                        context.setContextType("DWH_V1_Schema", "id_String");
                        if(context.getStringValue("DWH_V1_Schema") == null) {
                            context.DWH_V1_Schema = null;
                        } else {
                            context.DWH_V1_Schema=(String) context.getProperty("DWH_V1_Schema");
                        }
                        context.setContextType("DWH_V1_Server", "id_String");
                        if(context.getStringValue("DWH_V1_Server") == null) {
                            context.DWH_V1_Server = null;
                        } else {
                            context.DWH_V1_Server=(String) context.getProperty("DWH_V1_Server");
                        }
                        context.setContextType("JOURNAL_AdditionalParams", "id_String");
                        if(context.getStringValue("JOURNAL_AdditionalParams") == null) {
                            context.JOURNAL_AdditionalParams = null;
                        } else {
                            context.JOURNAL_AdditionalParams=(String) context.getProperty("JOURNAL_AdditionalParams");
                        }
                        context.setContextType("JOURNAL_Database", "id_String");
                        if(context.getStringValue("JOURNAL_Database") == null) {
                            context.JOURNAL_Database = null;
                        } else {
                            context.JOURNAL_Database=(String) context.getProperty("JOURNAL_Database");
                        }
                        context.setContextType("JOURNAL_Login", "id_String");
                        if(context.getStringValue("JOURNAL_Login") == null) {
                            context.JOURNAL_Login = null;
                        } else {
                            context.JOURNAL_Login=(String) context.getProperty("JOURNAL_Login");
                        }
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
                        context.setContextType("JOURNAL_Port", "id_String");
                        if(context.getStringValue("JOURNAL_Port") == null) {
                            context.JOURNAL_Port = null;
                        } else {
                            context.JOURNAL_Port=(String) context.getProperty("JOURNAL_Port");
                        }
                        context.setContextType("JOURNAL_Schema", "id_String");
                        if(context.getStringValue("JOURNAL_Schema") == null) {
                            context.JOURNAL_Schema = null;
                        } else {
                            context.JOURNAL_Schema=(String) context.getProperty("JOURNAL_Schema");
                        }
                        context.setContextType("JOURNAL_Server", "id_String");
                        if(context.getStringValue("JOURNAL_Server") == null) {
                            context.JOURNAL_Server = null;
                        } else {
                            context.JOURNAL_Server=(String) context.getProperty("JOURNAL_Server");
                        }
                        context.setContextType("ODS_V1_AdditionalParams", "id_String");
                        if(context.getStringValue("ODS_V1_AdditionalParams") == null) {
                            context.ODS_V1_AdditionalParams = null;
                        } else {
                            context.ODS_V1_AdditionalParams=(String) context.getProperty("ODS_V1_AdditionalParams");
                        }
                        context.setContextType("ODS_V1_Database", "id_String");
                        if(context.getStringValue("ODS_V1_Database") == null) {
                            context.ODS_V1_Database = null;
                        } else {
                            context.ODS_V1_Database=(String) context.getProperty("ODS_V1_Database");
                        }
                        context.setContextType("ODS_V1_Login", "id_String");
                        if(context.getStringValue("ODS_V1_Login") == null) {
                            context.ODS_V1_Login = null;
                        } else {
                            context.ODS_V1_Login=(String) context.getProperty("ODS_V1_Login");
                        }
                        context.setContextType("ODS_V1_Password", "id_Password");
                        if(context.getStringValue("ODS_V1_Password") == null) {
                            context.ODS_V1_Password = null;
                        } else {
                            String pwd_ODS_V1_Password_value = context.getProperty("ODS_V1_Password");
                            context.ODS_V1_Password = null;
                            if(pwd_ODS_V1_Password_value!=null) {
                                if(context_param.containsKey("ODS_V1_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.ODS_V1_Password = pwd_ODS_V1_Password_value;
                                } else if (!pwd_ODS_V1_Password_value.isEmpty()) {
                                    try {
                                        context.ODS_V1_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_ODS_V1_Password_value);
                                        context.put("ODS_V1_Password",context.ODS_V1_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("ODS_V1_Port", "id_String");
                        if(context.getStringValue("ODS_V1_Port") == null) {
                            context.ODS_V1_Port = null;
                        } else {
                            context.ODS_V1_Port=(String) context.getProperty("ODS_V1_Port");
                        }
                        context.setContextType("ODS_V1_Schema", "id_String");
                        if(context.getStringValue("ODS_V1_Schema") == null) {
                            context.ODS_V1_Schema = null;
                        } else {
                            context.ODS_V1_Schema=(String) context.getProperty("ODS_V1_Schema");
                        }
                        context.setContextType("ODS_V1_Server", "id_String");
                        if(context.getStringValue("ODS_V1_Server") == null) {
                            context.ODS_V1_Server = null;
                        } else {
                            context.ODS_V1_Server=(String) context.getProperty("ODS_V1_Server");
                        }
                        context.setContextType("SA_V1_AdditionalParams", "id_String");
                        if(context.getStringValue("SA_V1_AdditionalParams") == null) {
                            context.SA_V1_AdditionalParams = null;
                        } else {
                            context.SA_V1_AdditionalParams=(String) context.getProperty("SA_V1_AdditionalParams");
                        }
                        context.setContextType("SA_V1_Database", "id_String");
                        if(context.getStringValue("SA_V1_Database") == null) {
                            context.SA_V1_Database = null;
                        } else {
                            context.SA_V1_Database=(String) context.getProperty("SA_V1_Database");
                        }
                        context.setContextType("SA_V1_Login", "id_String");
                        if(context.getStringValue("SA_V1_Login") == null) {
                            context.SA_V1_Login = null;
                        } else {
                            context.SA_V1_Login=(String) context.getProperty("SA_V1_Login");
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
                        context.setContextType("SA_V1_Port", "id_String");
                        if(context.getStringValue("SA_V1_Port") == null) {
                            context.SA_V1_Port = null;
                        } else {
                            context.SA_V1_Port=(String) context.getProperty("SA_V1_Port");
                        }
                        context.setContextType("SA_V1_Schema", "id_String");
                        if(context.getStringValue("SA_V1_Schema") == null) {
                            context.SA_V1_Schema = null;
                        } else {
                            context.SA_V1_Schema=(String) context.getProperty("SA_V1_Schema");
                        }
                        context.setContextType("SA_V1_Server", "id_String");
                        if(context.getStringValue("SA_V1_Server") == null) {
                            context.SA_V1_Server = null;
                        } else {
                            context.SA_V1_Server=(String) context.getProperty("SA_V1_Server");
                        }
                        context.setContextType("environnement", "id_String");
                        if(context.getStringValue("environnement") == null) {
                            context.environnement = null;
                        } else {
                            context.environnement=(String) context.getProperty("environnement");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("DWH_V1_AdditionalParams")) {
                context.DWH_V1_AdditionalParams = (String) parentContextMap.get("DWH_V1_AdditionalParams");
            }if (parentContextMap.containsKey("DWH_V1_Database")) {
                context.DWH_V1_Database = (String) parentContextMap.get("DWH_V1_Database");
            }if (parentContextMap.containsKey("DWH_V1_Login")) {
                context.DWH_V1_Login = (String) parentContextMap.get("DWH_V1_Login");
            }if (parentContextMap.containsKey("DWH_V1_Password")) {
                context.DWH_V1_Password = (java.lang.String) parentContextMap.get("DWH_V1_Password");
            }if (parentContextMap.containsKey("DWH_V1_Port")) {
                context.DWH_V1_Port = (String) parentContextMap.get("DWH_V1_Port");
            }if (parentContextMap.containsKey("DWH_V1_Schema")) {
                context.DWH_V1_Schema = (String) parentContextMap.get("DWH_V1_Schema");
            }if (parentContextMap.containsKey("DWH_V1_Server")) {
                context.DWH_V1_Server = (String) parentContextMap.get("DWH_V1_Server");
            }if (parentContextMap.containsKey("JOURNAL_AdditionalParams")) {
                context.JOURNAL_AdditionalParams = (String) parentContextMap.get("JOURNAL_AdditionalParams");
            }if (parentContextMap.containsKey("JOURNAL_Database")) {
                context.JOURNAL_Database = (String) parentContextMap.get("JOURNAL_Database");
            }if (parentContextMap.containsKey("JOURNAL_Login")) {
                context.JOURNAL_Login = (String) parentContextMap.get("JOURNAL_Login");
            }if (parentContextMap.containsKey("JOURNAL_password")) {
                context.JOURNAL_password = (java.lang.String) parentContextMap.get("JOURNAL_password");
            }if (parentContextMap.containsKey("JOURNAL_Port")) {
                context.JOURNAL_Port = (String) parentContextMap.get("JOURNAL_Port");
            }if (parentContextMap.containsKey("JOURNAL_Schema")) {
                context.JOURNAL_Schema = (String) parentContextMap.get("JOURNAL_Schema");
            }if (parentContextMap.containsKey("JOURNAL_Server")) {
                context.JOURNAL_Server = (String) parentContextMap.get("JOURNAL_Server");
            }if (parentContextMap.containsKey("ODS_V1_AdditionalParams")) {
                context.ODS_V1_AdditionalParams = (String) parentContextMap.get("ODS_V1_AdditionalParams");
            }if (parentContextMap.containsKey("ODS_V1_Database")) {
                context.ODS_V1_Database = (String) parentContextMap.get("ODS_V1_Database");
            }if (parentContextMap.containsKey("ODS_V1_Login")) {
                context.ODS_V1_Login = (String) parentContextMap.get("ODS_V1_Login");
            }if (parentContextMap.containsKey("ODS_V1_Password")) {
                context.ODS_V1_Password = (java.lang.String) parentContextMap.get("ODS_V1_Password");
            }if (parentContextMap.containsKey("ODS_V1_Port")) {
                context.ODS_V1_Port = (String) parentContextMap.get("ODS_V1_Port");
            }if (parentContextMap.containsKey("ODS_V1_Schema")) {
                context.ODS_V1_Schema = (String) parentContextMap.get("ODS_V1_Schema");
            }if (parentContextMap.containsKey("ODS_V1_Server")) {
                context.ODS_V1_Server = (String) parentContextMap.get("ODS_V1_Server");
            }if (parentContextMap.containsKey("SA_V1_AdditionalParams")) {
                context.SA_V1_AdditionalParams = (String) parentContextMap.get("SA_V1_AdditionalParams");
            }if (parentContextMap.containsKey("SA_V1_Database")) {
                context.SA_V1_Database = (String) parentContextMap.get("SA_V1_Database");
            }if (parentContextMap.containsKey("SA_V1_Login")) {
                context.SA_V1_Login = (String) parentContextMap.get("SA_V1_Login");
            }if (parentContextMap.containsKey("SA_V1_Password")) {
                context.SA_V1_Password = (java.lang.String) parentContextMap.get("SA_V1_Password");
            }if (parentContextMap.containsKey("SA_V1_Port")) {
                context.SA_V1_Port = (String) parentContextMap.get("SA_V1_Port");
            }if (parentContextMap.containsKey("SA_V1_Schema")) {
                context.SA_V1_Schema = (String) parentContextMap.get("SA_V1_Schema");
            }if (parentContextMap.containsKey("SA_V1_Server")) {
                context.SA_V1_Server = (String) parentContextMap.get("SA_V1_Server");
            }if (parentContextMap.containsKey("environnement")) {
                context.environnement = (String) parentContextMap.get("environnement");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("DWH_V1_Password");
			parametersToEncrypt.add("JOURNAL_password");
			parametersToEncrypt.add("ODS_V1_Password");
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
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tChronometerStart_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tChronometerStart_1) {
globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", -1);

e_tChronometerStart_1.printStackTrace();

}
catch (Error error_tChronometerStart_1 ) {
end = System.currentTimeMillis();
talendStats_STATS.addMessage("failure", (end-startTime));
try {
 talendStats_STATSProcess(globalMap);
} catch (Exception e_talendStats_STATS) {
e_talendStats_STATS.printStackTrace();
}
throw error_tChronometerStart_1;
}


this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : SEQ_PROJET");
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
            obj_conn = globalMap.remove("conn_connectionStatsLogs");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
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
 *     261399 characters generated by Talaxie Open Studio for Data Integration 
 *     on the 3 mars 2026, 22:17:33 CET
 ************************************************************************************************/