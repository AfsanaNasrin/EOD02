package com.nanosoft.EOD.Utils;

public class XpathUtils {

	public static class loginTest {
		
		public static final String LoginClickX="/html/body/app-root/login-component/div/div[2]/mat-card/mat-card-content/form";
		public static final String UserNameX="/html/body/app-root/login-component/div/div[2]/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div[1]/input";
		public static final String PasswordX="/html/body/app-root/login-component/div/div[2]/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div[1]/input";
		public static final String Submit="/html/body/app-root/login-component/div/div[2]/mat-card/mat-card-actions/div[1]/button/span[1]";
	}
	
	public static class FloodForm{
		
		public static final String FindFloodForm="/html/body/app-root/admin-comp/div/div/nav/app-navmainmenu/app-navmenuitem[15]/div/a/span";
		

		 public static final String disasternameSelect="/html/body/app-root/admin-comp/div/main/div/app-fformentry/mat-card/mat-card-content/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";
         public static final String disasternameClick="//*[@id=\"mat-option-1\"]/span";
         public static final String WaterloggedlastIncreased="/html/body/app-root/admin-comp/div/main/div/app-fformentry/mat-card/mat-card-content/div[3]/table/tbody/tr[2]/td[4]/input";
         public static final String WaterloggedLastDecrised="/html/body/app-root/admin-comp/div/main/div/app-fformentry/mat-card/mat-card-content/div[3]/table/tbody/tr[2]/td[5]/input";
         public static final String AffectedPopulationIncreased="/html/body/app-root/admin-comp/div/main/div/app-fformentry/mat-card/mat-card-content/div[3]/table/tbody/tr[2]/td[9]/input";
         public static final String LastDeath="/html/body/app-root/admin-comp/div/main/div/app-fformentry/mat-card/mat-card-content/div[3]/table/tbody/tr[2]/td[12]/input";
         public static final String Submit="/html/body/app-root/admin-comp/div/main/div/app-fformentry/mat-card/div/button[2]/span[1]";
	}
}
