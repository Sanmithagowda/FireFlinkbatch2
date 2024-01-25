package GenericLibrary;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import zmq.ZError.IOException;
import java.io.File;
public class ListenersImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts=(TakesScreenshot)BaseTest.listernersDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./ScreenShot/"+result.getName()+".png");
		try {
			FileHandler.copy(src, trg);
		}catch (java.io.IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		
	}


