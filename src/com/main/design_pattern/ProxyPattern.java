/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */
public class ProxyPattern {

	public static void main(String[] args) throws Exception {

		//DatabaseExecuter non_admin = new DatabaseExecutoryProxy("Non_Admin", "Admin@123");
		//non_admin.executerDatabse("DELETE");

		DatabaseExecuter admin = new DatabaseExecutoryProxy("Admin", "Admin@123");
		admin.executerDatabse("DELETE");

	}

}

class DatabaseExecutoryProxy implements DatabaseExecuter {

	boolean if_admin;
	DatabseExecuterImpl databseExecuterImpl;

	public DatabaseExecutoryProxy(String name, String password) {
		if (name == "Admin" && password == "Admin@1231") {
			if_admin = true;
			databseExecuterImpl = new DatabseExecuterImpl();
		}
	}

	@Override
	public void executerDatabse(String query) throws Exception {
		if (if_admin)
			databseExecuterImpl.executerDatabse(query);
		else {
			if (query.equals("DELETE"))
				throw new Exception("DELETE not allow to no-admin user");
			else
				databseExecuterImpl.executerDatabse(query);
		}

	}

}

class DatabseExecuterImpl implements DatabaseExecuter {

	@Override
	public void executerDatabse(String query) throws Exception {
		System.out.println("Going to execute query : " + query);
	}

}

interface DatabaseExecuter {
	public void executerDatabse(String query) throws Exception;
}
