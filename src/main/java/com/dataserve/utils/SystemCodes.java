package com.dataserve.utils;

public class SystemCodes {

	public static enum StatusMessages {
		
		//200s status messages
		OK("INFO_200_001", "Success Operation"),
		CREATED("INFO_200_002", "Data added successfully"),
		UPDATED("INFO_200_003", "Data updated successfully"),
		DELETED("INFO_200_004", "Data deleted successfully"),
		RECEIVED("INFO_200_005", "Data received successfully"),
		
		//400s status messages
		REQUIRED_DATA_MISSING("ERROR_400_001", "is Required"),
		DATA_NOT_EXISTING("ERROR_400_002", "does not exist"),
		DATA_VALUE_INVALID("ERROR_400_003", "is not valid for type"),
		UNAUTHORIZED("ERROR_400_004", "You are not authorized"),
		
		//500s status messages
		GENERAL_ERROR("ERROR_500_001", "General Error"),
		INTERNAL_SERVER_ERROR("ERROR_500_002", "Error while processing an API call: ");
		
		
		private String code, description;
		
		StatusMessages(String code, String description) {
			this.code = code;
			this.description = description;
		}

		public String getCode() {
			return code;
		}

		public String getDescription() {
			return description;
		}
		
		
	}
}
