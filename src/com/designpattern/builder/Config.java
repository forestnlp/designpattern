package com.designpattern.builder;

public class Config {

	private int max_conn;
	private int min_conn;
	private int max_idle;
	private int max_timeout;
	private int max_retries;
	
	public Config(Builder builder) {
		max_conn = builder.max_conn;
		min_conn = builder.min_conn;
		max_idle = builder.max_idle ;
		max_timeout= builder.max_timeout;
		max_retries= builder.max_retries;
	}

	@Override
	public String toString() {
		return "Config{" +
				"max_conn=" + max_conn +
				", min_conn=" + min_conn +
				", max_idle=" + max_idle +
				", max_timeout=" + max_timeout +
				", max_retries=" + max_retries +
				'}';
	}

	public static class Builder{
	
		private int max_conn;
		private int min_conn;
		private int max_idle;
		private int max_timeout;
		private int max_retries;	
		
		public Config build() {
			if(max_conn<min_conn) throw new IllegalArgumentException("参数错误");
			return new Config(this);
		}
		
		public Builder setConn(int max_conn,int min_conn,int max_idle){
			this.max_conn = max_conn;
			this.min_conn = min_conn;
			this.max_idle = max_idle;
			return this;
		}
		
		public Builder setTimeOut(int max_timeout,int max_retries) {
			this.max_timeout= max_timeout;
			this.max_retries= max_retries;
			return this;
		}
	}
}