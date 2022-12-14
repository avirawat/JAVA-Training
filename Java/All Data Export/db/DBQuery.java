package com.monster.npd.submission.db;

public class DBQuery {

	public static final String GET_MPM_JOB_DETAILS = "SELECT  Id "
			+ "      ,S_ITEM_STATUS "
			+ "      ,DUE_DATE "
			+ "      ,STATE "
			+ "      ,APPLICATION_ID "
			+ "      ,REQUESTED_DATE "
			+ "      ,JOB_NAME "
			+ "      ,R_PO_COUNTRY_Id "
			+ "      ,R_PO_BRAND_Id "
			+ "      ,JOB_ORDER_ID_STRING "
			+ "      ,JOB_FOLDER_ID "
			+ "      ,ASSET_FOLDER_ID "
			+ "      ,FINAL_FOLDER_ID "
			+ "      ,PROOF_FOLDER_ID "
			+ "      ,IS_MIGRATED_JOB "
			+ "      ,R_PO_MIGRATED_REQUEST_Id "
			+ "      ,S_ITEM_BUSINESS_ID "
			+ "      ,JOB_ORDER_BUSINESS_ID "
			+ "      ,JOB_ORDER_BUSINESS_ID_NUMBER "
			+ "      ,TEMPLATE_TYPE "
			+ "      ,R_PO_PRODUCT_LINE_Id "
			+ "      FROM ";


        public static final String GET_EXCEL_SHEET="SELECT Project_Number "
                        +"           ,Lead_Market"
                        +"           ,Other_Linked_Market"
                        +"           ,Lead_Market_Region"
                        +"           ,Brand"
                        +"           ,Platform"
                        +"           ,Variant"
                        +"           ,SKU_Details"
                        +"           ,Consumer_Unit_Size"
                        +"           ,Case_Pack_Size"
                        +"           ,Primary_Packaging_Type"
                        +"           ,Bottler"
                        +"           ,Region"
                        +"           ,Active_Status"
                        +"           ,E2E_PM_Owner"
                        +"           ,Bottler_Communication_Status"
                        +"           ,NSV_Y1_Annualised"
                        +"           ,Volume_1stTo3_Months"
                        +"           ,Volume_Y1_Annualised"
                        +"           ,CP1_Revised_Date"
                        +"           ,Com_Tech_Ops_DP_Date"
                        +"           ,Timeline_Risk"
                        +"           ,Project_Health"
                        +"           ,Project_Name"
                        +"           ,Project_Type"
                        +"           ,Early_Manufacturing_Site"
                        +"           ,SVP_Aligned"
                        +"           ,Commercial_Categorisation"
                        +"           ,Post_Launch_Analysis"
                        +"           ,Secondary_Packaging_Type"
                        +"           ,Early_Project_Classification"
                        +"           ,Final_Corporate_Classification"
                        +"           ,Final_Corporate_Classification_Description"
                        +"           ,EAN_Target_Date"
                        +"           ,EAN_Actual_Date"
                        +"           ,No_Of_Can_Company_Required"
                        +"           ,LocalBOMInSAP"
                        +"           ,PalletLabelReceivedTargetDate"
                        +"           ,PalletLabelReceivedActualDate"
                        +"           ,PalletLabelSentTargetDate"
                        +"           ,PalletLabelSentActualDate"
                        +"           ,BottlerSpecificComments"
                        +"           ,PalletLabelFormat"
                        +"           ,TrayLabelFormat"
                        +"           ,FGMaterialCode"
                        +"           ,BOM_Sent_Actual_Date"
                        +"           ,Bottler_Specific_Item_Number"
                        +"           ,Current_CheckPoint"
                        +"           ,Start_Date"
                        +"           ,Trial_Date_Confirmed_With_Bottler"
                        +"           ,BottlerPushedoutProductionWithoutLaunchImpact"
                        +"           ,Ops_Aligned_DP_Date"
                        +"           ,PM_Slack_Time"
                        +"           ,PM_CP1_Phase_Delay"
                        +"           ,IsCP1Completed"
                        +"           ,MECCommercialBottlerRequestedDelayToLaunch"
                        +"           ,Final_Manufacturing_Country"
                        +"           ,Final_Manufacturing_Site"
                        +"           ,Early_Manufacturing_Location"
                        +"           ,Early_Project_Classification_Description"
                        +"           ,NewFGSAP"
                        +"           ,NewRDFormula"
                        +"           ,NewHBCFormula"
                        +"           ,NewPrimaryPackaging"
                        +"           ,IsSecondaryPackaging"
                        +"           ,RegistrationDossier"
                        +"           ,PreProductionRegistartion"
                        +"           ,PostProductionRegistartion"
                        +"           ,Request_Rational"
                        +"           ,Project_NewFG"
                        +"           ,Project_NewRDFormula"
                        +"           ,Project_NewHBCFormula"
                        +"           ,Project_NewPrimaryPackaging"
                        +"           ,Project_NewSecondaryPackaging"
                        +"           ,Registration_Dossier"
                        +"           ,Pre_Production_Registration"
                        +"           ,Post_Production_Registration"
                        +"           ,Classification_Rational_New"
                        +"           ,Technical_Description"
                        +"           ,Risk_Summary"
                        +"           ,Status_And_Critical_Items"
                        +"           ,Other_TBC"
                        +"           ,Other2_TBC"
                        +"           ,Has_The_Change_Been_Aligned_Via_CP_Mtg"
                        +"           ,Brief_Description_Of_Delay"
                        +"           ,Winshuttle_Project_Number"
                        +"           ,Formula_HBC_Number"
                        +"           ,HBC_Issuance_Type"
                        +"           ,Can_Sleeve_Primary_Bottler_Number"
                        +"           ,Is_FG_project"
                        +"           ,Corp_PM"
                        +"           ,OPS_PM"
                        +"           ,Commercial_Lead"
                        +"           ,Reg_lead"
                        +"           ,GFGName"
                        +"           ,ProjectSpecialistName"
                        +"           ,RegionalTechnicalManagerName"
                        +"           ,OPSPlannerName"
                        +"           ,ProdInfo_Target_Date"
                        +"           ,ProdInfo_Actual_Date"
                        +"           ,Label_Uploaded_Actual_Date"
                        +"           ,HowManyPieces"
                        +"           ,WhoWillAudit"
                        +"           ,AuditDate"
                        +"           ,Site_Audit_Required"
                        +"           ,PlantSpecificComments"
                        +"           ,Requestor"
                        +"           ,TrialAndorCommercialProductionIncluded"
                        +"           ,NPD_OnTrack_CP1_Date"
                        +"           ,BottlerAndCan_Target_Date"
                        +"           ,BottlerAndCan_Actual_Date"
                        +"           ,POReceived_Actual_Date"
                        +"           ,NoOfWeeksIncrease"
                        +"           ,DP_Delivery_Date"
                        +"           ,LeadTimeTarget"
                        +"           ,PMReportingOther1"
                        +"           ,PMReportingOther2"
                        +"           ,TrialMaterials_ConfirmedDelivery_Date"
                        +"           ,FinalAgreed1stProfConfirmed_WithBottler_Date"
                        +"           ,FirstProdMaterialsConfirmedDelivery_Date"
                        +"           ,EarliestTrialOr1stProdDate"
                        +"           ,AllowProductionScheduleLessThan8Weeks"
                        +"           ,PossibleNotificationRequirement"
                        +"           ,RequiresPrimaryCanAW"
                        +"           ,CanPrimaryAWStart"
                        +"           ,RequiresSecondaryAW"
                        +"           ,CanSecondaryAWStart"
                        +"           ,AllAWTasksCompleted"
                        +"           ,RegulatoryComments"
                        +"           ,NoOfPiecesRequired"
                        +"           ,SiteApproved"
                        +"           ,TrialSupervisionQuality"
                        +"           ,TrialSupervisionNPD"
                        +"           ,NewProjectType"
                        +"           ,TechOrQualSupervisionRequired"
                        +"           ,CanCompanies"
                        +"           ,PMReportingProjectType"
                        +"           ,PMReportingSubProjectType"
                        +"           ,PMReportingProjectDetail"
                        +"           ,PMReportingDeliveryQuarter"
                        +"           ,PMReportingComments"
                        +"           ,ArtWork_JobItems"
                        +"           ,TrialOrCommentsOrActionsRequired"
                        +"           ,IsPlantSpecificReapplicationOnly"
                        +"           ,TechQualWhoWillComplete"
                        +"           ,TechQualCompleted_Date"
                        +"           ,TechQualWeek_Due_Date"
                        +"           ,Project_ID"
                        +"           ,End_Date"
                        +"           ,NoOfLinkedMarkets"
                        +"           ,OnsiteRemoteNotRequired"
                        +"           ,TrialProtocolWrittenBy"
                        +"           ,ProtocolIssued"
                        +"           ,TastingRequirement"
                        +"           ,QAQCReleaseDate"
                        +"           ,HBCRPEMSEBCreated"
                        +"           ,Request_Type"
                        +"           ,MPPJobNo"
                        +"           ,MPMGroup"
                        +"           ,Division" 
                        +"           ,RequestID"
                        +"            FROM "
                        +"            dbo.Project_Final_Details"
                        +"            WHERE Project_Number is not null and Project_ID is not null "
                        +"            Order by RequestID ASC ";

            public static final String GET_TASK_DETAILS="SELECT DISTINCT Task_Id"
                         +"       , Task_Sequence"
                         +"       , Task_Name"
                         +"       , Project_ID"
                         +"       , Is_Complete"
                         +"       , Can_Start"
                         +"       , System_Time_Duration"
                         +"       , Target_Start_Date"
                         +"       , Target_Completion_Date"
                         +"       , Actual_Start_Date"
                         +"       , Actual_Completion_Date"
                         +"       , RequestID"
                         +"        FROM "
                         +"        dbo.Tasks";

            public static final String GET_GOVERNANCE_MILESTONE="SELECT DISTINCT Stage "
                         +"       , Decision"
                         +"       , Decision_Date"
                         +"       , Target_Start_Date"
                         +"       , Comments"
                         +"       , Project_Id" 
                         +"       , RequestID" 
                         +"         FROM "
                         +"        dbo.GovernanceMileStone";

            public static final String GET_ALL_PROJECT_COUNT="SELECT COUNT(*) as TOTAL_COUNT "
                      
                        +"            FROM "
                        +"            dbo.Project_Final_Details"
                        +"            WHERE Project_Number is not null and Project_ID is not null";
                        


}