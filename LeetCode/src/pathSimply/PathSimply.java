package pathSimply;

import java.util.ArrayList;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example, path = "/home/", => "/home" path = "/a/./b/../../c/", => "/c"
 * click to show corner cases.
 * 
 * Corner Cases: Did you consider the case where path = "/../"? In this case,
 * you should return "/". Another corner case is the path might contain multiple
 * slashes '/' together, such as "/home//foo/". In this case, you should ignore
 * redundant slashes and return "/home/foo".
 * 
 * @author roy
 * 
 */
public class PathSimply {
	public static void main(String[] args) {
		String input = "/.";
		Solution s = new Solution();
		System.out.println(input);
		System.out.println(s.simplifyPath(input));
	}
}

class Solution {
	public String simplifyPath(String path) {
		StringBuilder simPath = new StringBuilder();
		ArrayList<String> list = new ArrayList<String>();
		simPath.append("/");
		
		String[] arr = path.split("/");
		if(arr.length==0){
			return simPath.toString();
		}else{
			for(int i=0; i<arr.length; i++){
				if(arr[i].equals("..")){
						if(list.size()>0){
							list.remove(list.size()-1);
						}				
				}else if(!arr[i].equals(".") && !arr[i].equals("")){
						list.add(arr[i]);
				}
			}
			
		}
		if(list.size()>0){
			for(String s: list){
				simPath.append(s).append("/");
			}
			return simPath.substring(0, simPath.lastIndexOf("/"));
		}else{
			return simPath.toString();
		}
		
		
		
	}
}
