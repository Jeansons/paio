package www.zdwy.sqoop;



import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.sqoop.util.OptionsFileUtil;



public class Test2 {
	
	
	public static void main(String[] args) throws Exception {

		 String[] args2 = new String[] {
	                "--connect","jdbc:sqlserver://192.168.88.83:1433;username=sa;password=123456;database=BigDate",
	              // "--driver","com.sqlserver.jdbc.Driver",
	                /*"username=sa;",
	                "password=123456;",
	                "database=BigDate'",*/
	                "--table=T_BusRevenue",
	                "--hbase-table=BUSREVENUE",
	                "--column-family=Bus",
	                "-m","1"
	               // "--target-dir","java_import_user"         
	        };

		

				String[] expandArguments = OptionsFileUtil.expandArguments(args2);
	            SqoopTool tool = SqoopTool.getTool("import");
	            Configuration conf = new Configuration();
	            //conf.set("fs.default.name ", "hdfs://nameservice1");//设置HDFS服务地址
	            Configuration loadPlugins = SqoopTool.loadPlugins(conf);
	            
	            Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
	            int res = Sqoop.runSqoop(sqoop, expandArguments);
	            if (res == 0){
	            	
	            	
	            	System.out.println("ok!");
	            }
	              
	}
}