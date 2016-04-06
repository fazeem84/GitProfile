package com.faz.gitprofile.restservice;

import org.json.JSONArray;
import org.json.JSONObject;

import com.faz.gitprofile.restclient.RestClient;

public class GitRequestHandler {
	static String BASEURL="https://api.github.com/users/";
	public String createProfile(String userName) throws Exception{
		JSONObject userDetails=this.getUserDetails(userName);
		userDetails.put("projectDetails",this.getRepoDetails(userName));
		userDetails.put("status", "success");
		return userDetails.toString();
	}
	
	public JSONObject getUserDetails(String userName) throws Exception{
		String response = "";
		String url =  BASEURL+ userName;
			response = new RestClient().sendGetRequest(url);
			JSONObject jsonObject=new JSONObject(response);
			JSONObject outJson=new JSONObject();
			outJson.put("name", jsonObject.get("name"));
			outJson.put("company", jsonObject.get("company"));

		return outJson;
		
	}
	public JSONArray getRepoDetails(String userName) throws Exception{
			String response = "";
			String url =  BASEURL+ userName+"/repos";
			response = new RestClient().sendGetRequest(url);
			JSONArray outArray=new JSONArray();
			JSONArray jsonArr=new JSONArray(response);
			
			for(int index=0;index<jsonArr.length();index++){
						JSONObject jsonObjec=new JSONObject();
						jsonObjec.put("language",jsonArr.getJSONObject(index).get("language"));
						jsonObjec.put("projectName",jsonArr.getJSONObject(index).get("name"));
						outArray.put(jsonObjec);
				
			}
			return outArray;
	}
}
