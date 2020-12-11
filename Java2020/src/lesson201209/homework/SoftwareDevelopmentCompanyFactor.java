package lesson201209.homework;

import java.util.Arrays;

import lesson201209.homework.company.SoftwareDevelopment;
import lesson201209.homework.employee.ProjectManager;
import lesson201209.homework.employee.administration.AdministrativeCoordinator;
import lesson201209.homework.employee.administration.AdministrativeManager;
import lesson201209.homework.employee.engineer.Intern;
import lesson201209.homework.employee.engineer.developers.BackEndDeveloper;
import lesson201209.homework.employee.engineer.developers.FrontEndDeveloper;
import lesson201209.homework.employee.engineer.testers.AutomationTester;
import lesson201209.homework.employee.engineer.testers.ManualQASpecialist;

public class SoftwareDevelopmentCompanyFactor {

	
	public static void main(String[] args) {
		
		
		SoftwareDevelopment company = new SoftwareDevelopment("Jorjia", "God", "Gods' land");
		
		BackEndDeveloper backDev1 = new BackEndDeveloper(
				"Irakli", "Kobakhidze", 41, "Junior");
		
		BackEndDeveloper backDev2 = new BackEndDeveloper(
				"Gia", "Volski", 41, "Senior");
		
		FrontEndDeveloper frontDev1 = new FrontEndDeveloper(
				"Mamuka", "Mdinaradze", 41, "Middle");
		
		Intern intern1 = new Intern(
				"Aleko", "Elisashvili", 27, "Cexavik");
		
		ProjectManager prjMan1 = new ProjectManager(
				"Zurab Girchi", "Jafaridze", 36, "Lead");
		
		AutomationTester AT1 = new AutomationTester(
				"Georgias", "Citizen", 8, "Lead");
		
		ManualQASpecialist MQAS = new ManualQASpecialist(
				"Georgias", "Citizen", 8, "Junior");

		ManualQASpecialist QA1 = new ManualQASpecialist(
				"Tamar", "Zhvania", Integer.MAX_VALUE, "Lead Cexavik");
		
		AdministrativeManager AM1 = new AdministrativeManager(
				"Archil", "Talakvadze", 41, "Head Cexavik");
		
		AdministrativeCoordinator AC1 = new AdministrativeCoordinator(
				"Lasha", "Natsvlishvili", Integer.MAX_VALUE, "Junior Cexavik");
		
		System.out.println("Hiring employees...\n");
		company.hireEmployees(Arrays.asList(
				backDev1, backDev2, frontDev1, 
				intern1, prjMan1, QA1,
				AM1, AC1, AT1, MQAS
				));

		
		System.out.println("Our employees: \n");
		company.getEmployees().forEach(employee -> {
			System.out.println(employee);
			employee.mainJob();
			System.out.println();
		});
		
		
		System.out.println("Engineers Workshop day");
		System.out.println("--------------------------- \n");
		
		company.getEngineers().forEach(engineer -> {
			System.out.println(engineer);
			engineer.holdsWorkshop();
			System.out.println();
		});
		
		System.out.println("------------------------------------");
		
		backDev1.doJob("Election fraud");
		frontDev1.doJob("Election fraud");
		QA1.doJob("Votes");
		prjMan1.doJob("Orginize Girchi");
		intern1.doJob("How to enter Parliament without calling traitor");
		AM1.doJob("How to make Jorjia better");
		AC1.doJob("How to get more customers");
		
		
	}
}
