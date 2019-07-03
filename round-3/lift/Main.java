/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lift;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Lift l[]=new Lift[5];
        for(int i=0;i<5;i++)
        {
        l[i]=new Lift(i+1,0,0,10);

        }
        String cont="yes";
        while(cont.equals("yes"))
        {
            System.out.println("Enter start and end Floor");
            String ip[]=br.readLine().split(" ");
            int ind=0,minend,minstart=l[0].end-Integer.parseInt(ip[0]);
            for(int i=1;i<5;i++)
            {
            if( minstart >(l[i].end-Integer.parseInt(ip[0])))
            {
            ind=i;
            minstart=l[i].end-Integer.parseInt(ip[0]);
            if(minstart==0)
                break;
            //minend=(l[i].end-Integer.parseInt(ip[1]));
            }
            }
            //if(l[ind].start>Integer.parseInt(ip[0]))
            l[ind].start=Integer.parseInt(ip[0]);
            System.out.println("Lift "+(ind+1)+" is assigned");
            l[ind].end=Integer.parseInt(ip[1]);
            System.out.println("Do you want to continue");
            cont=br.readLine();
        }




        System.out.print("Lifts : L1 L2 L3 L4 L5\nFloor : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(l[i].end+" ");
        }
    }
}
