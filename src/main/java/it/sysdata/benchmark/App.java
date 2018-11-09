package it.sysdata.benchmark;

import static spark.Spark.*;


import it.sysdata.benchmark.core.Core;
import it.sysdata.benchmark.transformers.JsonTransformer;



/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		port(8080);
		
		// Hello World
		get("/hello", (req, res) -> Core.helloWorld(), new JsonTransformer());
		
		
		// Computation
		get("/compute", (req, res) -> Core.compute(), new JsonTransformer());
		
		
		// Simple rest client
		get("/proxy", (req, res) -> Core.proxy(), new JsonTransformer());
	}
	
	
}
