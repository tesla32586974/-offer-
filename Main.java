package algorithm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
	//位于奇数区间可以通过，偶数区间不可通过,可以通过返回0，不可通过返回需要等待周期数
	static int goThrough(int period, int time){
		double x = (double)time/period; 
		int x1 = (int) Math.floor(x);
		int flag = 0;
		if(x1%2 == 1){//前一个属于基数
			if(x1*period == time){
				flag = 0;
			}else{
				flag = period - (time - x1*period) + 1;
			}
		}else{//前一个数属于偶数
			if(x1*period == time){
				flag = 1;
			}else{
				flag = 0;
			}
		}
		return flag;
	}
    
	
	static int minTravelTime(int N, int[][] intersections, int M, int[][] roads, int s, int t) {
    	int time = 0;
    	int currentNode = s;
    	int [][] roadsDistance = new int[N][N];
    	int[] sDistanceWait = new int[N];
    	int timeTotal=0;
    	while(currentNode != t){
    		//首先计算到下一个点的距离及会在下一个点的等待时间
    		int nextNode = 0;
    		int minDis = 100000;
    		for(int k=0; k<N; k++){
    			if(nextNode == s)//跳过自己
    				continue;
    			if(minDis > roads[currentNode][k] + goThrough(intersections[k][currentNode],roads[currentNode][k])){
    				minDis = k;
    			} 
    			else{
    				continue;
    			}
    			timeTotal += minDis;
    		}
    		
    	}
		return timeTotal; 
    }

     public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
        int res;

        int _N;
        _N = Integer.parseInt(in.nextLine().trim());



        int _intersections_rows = 0;
        int _intersections_cols = 0;
        _intersections_rows = _N;
        _intersections_cols = 2;

        int[][] _intersections = new int[_intersections_rows][_intersections_cols];
        for(int _intersections_i=0; _intersections_i<_intersections_rows; _intersections_i++) {
            String tempLine = in.nextLine().trim();
            String[] _intersectionStrs = tempLine.split(",");
            for(int _intersections_j=0; _intersections_j<_intersections_cols; _intersections_j++) {
                _intersections[_intersections_i][_intersections_j] = Integer.parseInt(_intersectionStrs[_intersections_j]);

            }
        }


        int _M;
        _M = Integer.parseInt(in.nextLine().trim());

        int _roads_rows = 0;
        int _roads_cols = 0;
        _roads_rows = _M;
        _roads_cols = 3;

        int[][] _roads = new int[_roads_rows][_roads_cols];
        for(int _roads_i=0; _roads_i<_roads_rows; _roads_i++) {
            String tempLine = in.nextLine().trim();
            String[] _roadStrs = tempLine.split(",");
            for(int _roads_j=0; _roads_j<_roads_cols; _roads_j++) {
                _roads[_roads_i][_roads_j] = Integer.parseInt(_roadStrs[_roads_j].trim());

            }
        }

        String stLine = in.nextLine().trim();
        String[] s_t_str = stLine.split(",");
        int _s;
        _s = Integer.parseInt(s_t_str[0]);

        int _t;
        _t = Integer.parseInt(s_t_str[1]);
        
//       res = minTravelTime;
    }
}