package data_structures_in_Java.TriesAndHuffman;
import java.util.ArrayList;

import data_structures_in_Java.TriesAndHuffman.PalindromePair.TrieNode;
public class PatternMatching {
	

	public class TrieNode {
		char data;
		boolean isTerminating;
		TrieNode children[];
		int childCount;

		public TrieNode(char data) {
			this.data = data;
			isTerminating = false;
			children = new TrieNode[26];
			childCount = 0;
		}
	}
	public class Trie {

	
		private TrieNode root;
		public int count;
		public Trie() {
			root = new TrieNode('\0');
		}

		public boolean search(String word){
			return search(root, word);
		}
		private void add(TrieNode root, String word){
	        if(word.length() == 0){
	            root.isTerminating= true;
	            return;
	        }		
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode child = root.children[childIndex];
	        if(child == null){
	            child = new TrieNode(word.charAt(0));
	            root.children[childIndex] = child;
	            root.childCount++;
	        }
	        add(child, word.substring(1));
	    }

	    public void add(String word){
	        add(root, word);
	    }

		private boolean search(TrieNode root, String word) {
			if(word.length() == 0){
				return true;
			}
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				return false;
			}
			return search(child, word.substring(1));
		}


		public boolean patternMatching(ArrayList<String> input, String pattern) {
			String word ="";
		
			for(int i = 0;i<input.size();i++) {
				word = input.get(i);
			}
			for(int j =0;j<word.length();j++) {
				add(pattern.substring(j));
			}
			return search(root,pattern);
		}

}
}
