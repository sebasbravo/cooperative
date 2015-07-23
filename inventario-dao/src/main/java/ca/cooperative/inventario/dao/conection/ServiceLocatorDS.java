package ca.cooperative.inventario.dao.conection;

import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ServiceLocatorDS {
	
	private static ServiceLocatorDS locator;
	private HashMap<String, Object> map;
	
	public ServiceLocatorDS() {
		map = new HashMap<String, Object>();
	}
	
	public static ServiceLocatorDS getInstance(){
		if(locator == null){
			locator = new ServiceLocatorDS();
		}
		return locator;
	}
	
	public DataSource getDataSource() throws Exception{
		
		DataSource dataSource = null;
		Context context = null;
		
		try{
			dataSource = (DataSource)map.get("KEY_DATA_SOURCE");
			if(dataSource == null){
				context = new InitialContext();
				dataSource = (DataSource)context.lookup("jdbc/nombreDS");
			}
		}catch(NamingException e){
			throw new Exception(e);
		}catch (Exception e) {
			throw new Exception(e);
		}
		
		return dataSource;
	}
	

}
