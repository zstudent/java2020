package lesson201209.homework;

import java.util.Arrays;

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

		QualityAssuranceSpecialist QA1 = new QualityAssuranceSpecialist(
				"Tamar", "Zhvania", Integer.MAX_VALUE, "Lead Cexavik");
		
		company.hireEmployees(Arrays.asList(
				backDev1, backDev2, frontDev1, intern1, prjMan1, QA1
				));

		
		company.employees.forEach(employee -> {
			System.out.println(employee);
			employee.mainJob();
			System.out.println();
		});
		
		System.out.println("------------------------------------");
		
		backDev1.doJob("Election fraud");
		frontDev1.doJob("Election fraud");
		QA1.doJob("Votes");
		prjMan1.doJob("Orginize Girchi");
		intern1.doJob("How to enter Parliament without calling traitor");
		
		
	}
}
