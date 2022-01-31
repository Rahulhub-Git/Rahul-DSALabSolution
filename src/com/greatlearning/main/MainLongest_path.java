package com.greatlearning.main;

import java.util.ArrayList;		

import com.greatlearning.service.Longest_path_inBT;
import com.greatlearning.service.Longest_path_inBT.Node;

public class MainLongest_path {

	public static void main(String[] args)
	{
		Longest_path_inBT L1=new Longest_path_inBT();
		
		Node root = new Node();
		root = L1.newNode(100);
		root.left = L1.newNode(20);
		root.right = L1.newNode(130);
		root.left.left = L1.newNode(10);
		root.left.right =L1.newNode(50);
		root.right.left = L1.newNode(110);
		root.right.right = L1.newNode(140);
		root.left.left.left = L1.newNode(5);

		ArrayList<Integer> output = Longest_path_inBT.longestPathFinder(root);
		int n = output.size();

		System.out.print(output.get(n - 1));
		for(int i = n - 2; i >= 0; i--)
		{
			System.out.print(" -> " + output.get(i));
		}
	}

}
