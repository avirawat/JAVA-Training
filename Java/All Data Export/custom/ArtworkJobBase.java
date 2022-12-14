/*
  This class has been generated by the Code Generator
*/

package com.monster.npd.submission.custom;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;


public abstract class ArtworkJobBase extends com.cordys.cpc.bsf.busobject.CustomBusObject
{
    // tags used in the XML document
    public final static String ATTR_jobId = "jobId";
    public final static String ATTR_jobName = "jobName";
    public final static String ATTR_jobStatus = "jobStatus";
    public final static String ATTR_jobFolderId = "jobFolderId";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(ArtworkJob.class);
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_jobId);
                ai.setJavaName(ATTR_jobId);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_jobName);
                ai.setJavaName(ATTR_jobName);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_jobStatus);
                ai.setJavaName(ATTR_jobStatus);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_jobFolderId);
                ai.setJavaName(ATTR_jobFolderId);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public ArtworkJobBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getJobId()
    {
        return getStringProperty(ATTR_jobId);
    }

    public void setJobId(String value)
    {
        setProperty(ATTR_jobId, value, 0);
    }

    public String getJobName()
    {
        return getStringProperty(ATTR_jobName);
    }

    public void setJobName(String value)
    {
        setProperty(ATTR_jobName, value, 0);
    }

    public String getJobStatus()
    {
        return getStringProperty(ATTR_jobStatus);
    }

    public void setJobStatus(String value)
    {
        setProperty(ATTR_jobStatus, value, 0);
    }

    public String getJobFolderId()
    {
        return getStringProperty(ATTR_jobFolderId);
    }

    public void setJobFolderId(String value)
    {
        setProperty(ATTR_jobFolderId, value, 0);
    }



}
