package com.sparta.model;
//
//public class BinarySearchTree {
//}


import com.sparta.controller.Main;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinaryTree{
    public static Logger logger = LogManager.getLogger(Main.class);


    public static class Node{
        Employee data;
        Node left;
        Node right;
        public Node(Employee data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void add(Node start, Employee data) {

        logger.log(Level.ERROR, "Binary Tree -> add() error!");
        logger.log(Level.WARN, "Binary Tree -> add() warn!");


        try {
            if (data.compareTo(start.data) < 0)
            //if ((data.getLast_name() + String.valueOf(data.getEmp_no())).compareTo((start.data.getLast_name() + String.valueOf(start.data.getEmp_no()))) > 0)

            {
                if (start.left == null)
                {
                    start.left = new Node(data);
                }
                else{
                    add(start.left, data);
                }
            }
            else if(data.compareTo(start.data) >= 0)
            {
                if (!(data.getEmp_no() == start.data.getEmp_no())) {
                    if (start.right == null) {
                        start.right = new Node(data);
                    } else {
                        add(start.right, data);
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

    }

    public Employee searchByLastName(String lastName, Node node){
        if(node != null){
            if(node.data.getLast_name().equals(lastName)){
                System.out.println("Employee has been found");
                return node.data;
            } else {
                Employee foundEmployee = searchByLastName(lastName, node.left);
                if(foundEmployee == null) {
                    foundEmployee = searchByLastName(lastName, node.right);
                }
                return foundEmployee;
            }
        } else {
//            System.out.println("Sorry, employee not found");
            return null;
        }
    }
}
