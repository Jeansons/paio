package www.zdwy.sqoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.sqoop.util.OptionsFileUtil;
 
/**
 * Created by kay on 2017/12/12.
 */
 

public class SqoopTest 
{
  //测试代码
  public static void main(String[] args)
  {
	  importDataFromOracle();
	  
  }

 
  public static  int importDataFromOracle() {
	String[] args = new String[]{
		"--connect", "jdbc:sqlserver://192.168.88.83:1433;username=sa;password=123456;database=BigDateTest",
		  "--table=T_BusRevenue",
          "--hbase-table=zhaojinyan",
          "--column-family=Bus",
        //  "--target-dir=//home//hadoop//hbase",
          "-m","1"
		
		
	};

	String[] expandedArgs = null;
	try {
        expandedArgs = OptionsFileUtil.expandArguments(args);
    } catch (Exception e){
       System.err.println(e.getMessage());
	   System.err.println("Try 'sqoop help' for usage.");
    }

	com.cloudera.sqoop.tool.SqoopTool tool = (com.cloudera.sqoop.tool.SqoopTool) SqoopTool.getTool("import");
	//com.cloudera.sqoop.tool.SqoopTool tool = new ImportTool();

    Configuration conf = new Configuration();
    conf.set("fs.default.name", "hdfs://192.168.88.87:9000");//设置hadoop服务地址
	Configuration pluginConf = SqoopTool.loadPlugins(conf);

	Sqoop sqoop = new Sqoop(tool, pluginConf);
	return Sqoop.runSqoop(sqoop, expandedArgs);
  }

}