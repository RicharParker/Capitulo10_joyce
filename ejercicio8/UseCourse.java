/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class UseCourse {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String usuario;
		String department;
		Integer numberCourse;
		Integer credits;
            
                 
                
		usuario = sc.nextLine();
		department = usuario.toUpperCase().substring(0, 3);
		
		System.out.print("Ingrese el numero del curso: : ");
		usuario = sc.nextLine();
		numberCourse= Integer.parseInt(usuario);
		
		System.out.print("Ingrese el numero de horas de creditos: ");
                
		usuario= sc.nextLine();
		credits = Integer.parseInt(usuario);
		
		if(isLabCourse(department))
		{
			LabCourse userCourse = new LabCourse(department,numberCourse, credits);
			userCourse.display();
		}
		else
		{
			CollegeCourse userCourse = new CollegeCourse(department, numberCourse, credits);
			userCourse.display();
		}
		
		sc.close();
	}
        
        private enum labCourses {BIO, CHM, CIS, PHY};
	
	private static boolean isLabCourse(String a)
	{
		for(labCourses c : labCourses.values())
		{
			if(c.name().equals(a))
				return true;
		}
		
		return false;
	}
	
}
