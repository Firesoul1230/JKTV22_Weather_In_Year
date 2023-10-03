/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22_weather_in_year;

import java.util.Scanner;
import tasks.InitProject;
/**
 *
 * @author pupil
 */
public class App {

    
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("--- Weather in year ---");
        boolean repeat = true;
        InitProject initProject = new InitProject();
        initProject.init(); 
        do {
            System.out.println("Выберите номер задачи: ");
            System.out.println("0. Выход из программы.");
            System.out.println("1. Погода в указанную дату.");
            System.out.println("2. Дни, когда была самая теплая и самая холодная погода.");
            System.out.println("3. Средняя температура за указанный месяц.");
            System.out.println("4. Средняя температура по всем месяцам.");
            
            System.out.print("Выберите номер задачи: ");
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выходим из программы.");
                    repeat = false;
                    break;
                
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.print("Выберите номер задачи из списка: ");
            }
        }while(repeat);

    }
    
}
