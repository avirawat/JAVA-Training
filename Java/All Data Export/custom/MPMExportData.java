package com.monster.npd.submission.custom;

import com.cordys.cpc.bsf.busobject.BSF;
import com.cordys.cpc.bsf.busobject.exception.BsfRuntimeException;
import com.cordys.cpc.bsf.soap.SOAPRequestObject;
import com.eibus.util.logger.CordysLogger;

public class MPMExportData {
	private static CordysLogger logger = CordysLogger.getCordysLogger(MPMExportData.class);

	private static final String UPDATE_MPM_EXPORT_DATA = "UpdateMPM_Export_Data";

	private static final String UPDATE_MPM_EXPORT_DATA_NS = "http://schemas/AcheronMPMCore/MPM_Export_Data/operations";

	/**
	 * @author AvinashRavat
	 * @param filePath
	 * @param fileName
	 * @return This Service is for calling MPM_Export_Data BPM inside Java class .
	 */
	@SuppressWarnings("deprecation")
	public static int triggerMPMExportData(String excelFilePath, String fileName, int id) {
		
	
		try {
			// Fire Soap Service to get All Application Definition
			SOAPRequestObject soapRequestObj = new SOAPRequestObject(UPDATE_MPM_EXPORT_DATA_NS, UPDATE_MPM_EXPORT_DATA,
					null, null);
			
			if (soapRequestObj.getXMLParameters() != null) {
				
				soapRequestObj.getXMLParameters().removeAll(soapRequestObj.getXMLParameters());
			}
			
			String requestStringId = "<ns0:MPM_Export_Data-id xmlns:ns0='http://schemas/AcheronMPMCore/MPM_Export_Data'>"
							+ "        <ns0:Id>"+ id + "</ns0:Id>" 
							+ "     </ns0:MPM_Export_Data-id>";
			
			String requestStringUpdate = "<ns0:MPM_Export_Data-update xmlns:ns0='http://schemas/AcheronMPMCore/MPM_Export_Data'>"
							+ "        <ns0:FILE_NAME>" + fileName + "</ns0:FILE_NAME>"
							+ "        <ns0:EXPORT_TYPE>EXCEL</ns0:EXPORT_TYPE>" 
							+ "        <ns0:FILE_PATH>" + excelFilePath+ "</ns0:FILE_PATH>" 
							+ "        <ns0:STATUS>Completed</ns0:STATUS>"
							+ "      </ns0:MPM_Export_Data-update>";

			
		
			soapRequestObj.addParameterAsXml(BSF.getXMLDocument().parseString(requestStringId));
			soapRequestObj.addParameterAsXml(BSF.getXMLDocument().parseString(requestStringUpdate));
			 logger.debug("Excel Status updated ");
			
			return soapRequestObj.execute();
		} catch (Exception e) {
			throw new BsfRuntimeException("Unable to execute the MPM Update MPM Export Data. " + e);
		}
	}

}
