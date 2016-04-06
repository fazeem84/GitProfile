package com.faz.gitprofile.restservice;


import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faz.gitprofile.restclient.RestClient;

@RestController
public class GitRestService {
	
	@RequestMapping(value = "/getAccountDetails/{userName}", method = RequestMethod.GET, produces = "application/json")
	public Object home(@PathVariable String userName) {
		GitRequestHandler gitRequestHandler=new GitRequestHandler();
		 try {
			return gitRequestHandler.createProfile(userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JSONObject object=new JSONObject();
			object.put("status", "success");
			object.put("error", e.getMessage());
			return null;
		}
	}

	

}
