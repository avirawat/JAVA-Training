package com.monster.npd.submission.util;

public enum ConstantVariablesEnum {
	requestId("RequestID"),
	stage("Stage"),
	taskName("Task_Name"),
	division("Division"), 
	task13("Task 13"), 
	task13A("Task 13A"),
	date("Date"),
	hbcrpemesdCreated("HBCRPEMSEB");

	ConstantVariablesEnum(final String value) {
		this.value=value;
	}
     private String value;
    
     public String getValue() {
        return value;
    }
}
