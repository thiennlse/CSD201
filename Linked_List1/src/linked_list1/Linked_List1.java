/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Linked_List1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList list = new MyList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("Chọn chức năng : [1- 4]");
			int chon = input.nextInt();
			switch (chon) {
			case 1:
				System.out.println("1.AddFirst");
                                //list.addFirst(100);
                                list.traversal();
				break;
			case 2:
				System.out.println("2.AddLast");
                                list.addLast(90);
                                list.traversal();
				break;
			case 3:
				System.out.println("3.AddIndex");
                                list.update(10, 1);
                                list.update(20, 2);
                                list.update(123, 2);
                                list.traversal();
                                        
                                     
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
        
    }
    
}
