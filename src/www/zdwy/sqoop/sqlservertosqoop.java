package www.zdwy.sqoop;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.sqoop.util.OptionsFileUtil;

public class sqlservertosqoop { 
	
	
	public static Configuration create() {
		
		
		
		Configuration conf=HBaseConfiguration.create();  
    	conf.set("hbase.zookeeper.quorum", "master,slave1,slave2");  
    	try {
			HBaseAdmin admin=new HBaseAdmin(conf);
		} catch (MasterNotRunningException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ZooKeeperConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conf;
	}
	

    private static boolean importDataFromMysql() throws MasterNotRunningException, ZooKeeperConnectionException, IOException  {
    	
        String[] args = new String[] {
                "--connect","jdbc:sqlserver://192.168.88.83:1433;username=sa;password=123456;database=BigData2",
                "--table","T_BusForeData2",
                "--hbase-table","BUSFOREDATA2",
                "--column-family","Bus",
                "--hbase-row-key","ID",
                "-m","1"
               // "--target-dir","java_import_user"           
        };
        
        
        
        String[] expandArguments=null;
        try {
			expandArguments = OptionsFileUtil.expandArguments(args);
			 
        SqoopTool tool = SqoopTool.getTool("import");
       // SqoopTool tool = SqoopTool.getTool("eval");
        
       // conf.set("fs.default.name ", "hdfs://master:9000");//设置HDFS服务地址
        
        
    	
        Configuration loadPlugins = SqoopTool.loadPlugins(create());

      
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
		int result= Sqoop.runSqoop(sqoop, expandArguments);
			
				return true;	

        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			 System.out.println(e.getMessage());
			 return false;
		}
        
    }

    public static void main(String[] args) throws Exception {
       if(importDataFromMysql()){
    	   System.out.println("导入成功！！");
       }else{
    	   System.out.println("导入失败！！");
       }
       
    }

}
