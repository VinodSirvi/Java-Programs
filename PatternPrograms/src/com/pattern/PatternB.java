package com.pattern;

public class PatternB {
  public static void main(String[] args) {
	int height = 7;
	int width = 5;
	for(int i=0; i<height; i++) {
		for(int j=0; j<width; j++ ) {
			if( j == 0 || (i == 0 || i == height / 2 || i == height - 1) && j < width - 1 || // Top, middle, bottom horizontal lines
                   j == width - 1 && i != 0 && i != height / 2 && i != height - 1) { // Right curved edge) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
