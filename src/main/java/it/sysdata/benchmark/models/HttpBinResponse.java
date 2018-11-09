package it.sysdata.benchmark.models;

import java.util.HashMap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HttpBinResponse {

	@SerializedName("args")
	@Expose
	private HashMap<String, Object> args;
	
	@SerializedName("headers")
	@Expose
	private Headers headers;
	
	@SerializedName("origin")
	@Expose
	private String origin;
	
	@SerializedName("url")
	@Expose
	private String url;

	

	public HashMap<String, Object> getArgs() {
		return args;
	}

	public void setArgs(HashMap<String, Object> args) {
		this.args = args;
	}

	public Headers getHeaders() {
		return headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}