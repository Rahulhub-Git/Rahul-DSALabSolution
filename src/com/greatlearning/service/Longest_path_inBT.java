package com.greatlearning.service;
//Java program to print Longest Path
//from root to leaf in a Binary tree

import java.util.ArrayList;

public class Longest_path_inBT {
	

 public static class Node
{
	public Node left;
	public Node right;
	int data;
};

//Function to create a new
//Binary Tree node
public  Node newNode(int data)
{
	Node temp = new Node();

	temp.data = data;
	temp.left = null;
	temp.right = null;

	return temp;
}

public static ArrayList<Integer> longestPathFinder(Node root)
{
	
	
	if(root == null)
	{
		ArrayList<Integer> output = new ArrayList<>();
		return output;
	}
	
	
	ArrayList<Integer> right = longestPathFinder(root.right);
	
	ArrayList<Integer> left = longestPathFinder(root.left);
	
	if(right.size() < left.size())
	{
		left.add(root.data);
	}
	else
	{
		right.add(root.data);
	}
	
	
	return (left.size() >
			right.size() ? left :right);
}



}


