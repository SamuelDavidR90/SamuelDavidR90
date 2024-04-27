
package ejercicio.vectores_temperaturas_ciudades;

import java.util.Scanner;


public class Vectores_Temperaturas_Ciudades {

    public static void main(String[] args) {
        String cities[] = new String[2];
        double minTemp[] = new double[2];
        double maxTemp[] = new double[2];
        double highestRate = -1000.00;
        double lowestRate = 1000.00;
        String cityMin = "";
        String cityMax = "";
        
        
        int i;
        
        //Scan
        Scanner keycities = new Scanner(System.in);
        Scanner keytemps = new Scanner(System.in);
        
        //filling vector cities
        
        for(i=0; i<cities.length;i++){
            System.out.println("Enter a city name");
            cities[i] = keycities.nextLine();
            
            System.out.println("Enter the minimum temp of this city");
            minTemp[i] = keytemps.nextDouble();
            
            System.out.println("Enter the maximum temp of this city");
            maxTemp[i] = keytemps.nextDouble();
        }
        
        //showing cities and temps 
        
        for(i=0; i<cities.length;i++){
            System.out.println("City name: " + cities[i]);
            System.out.println("Minimum temp: " + minTemp[i]);
            System.out.println("Maximum temp: " + maxTemp[i]);
            System.out.println("-----------------------------");
            System.out.println("------------------------------");
            
        }
        
        for(i=0;i<minTemp.length;i++){
                if(minTemp[i]<lowestRate){
                    lowestRate = minTemp[i];
                    cityMin = cities[i];
                }
            }
        
        for(i=0;i<maxTemp.length;i++){
                if(maxTemp[i]>highestRate){
                    highestRate = maxTemp[i];
                    cityMax = cities[i];
                }
            }
        
        
        System.out.println("Lowest temp: " + lowestRate);
        System.out.println("City name: " + cityMin);
        
        System.out.println("Highest temp: " + highestRate);
        System.out.println("City name: " + cityMax);
        System.out.println("------------------------");
    }
}
