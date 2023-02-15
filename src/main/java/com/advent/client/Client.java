package com.advent.client;

import com.advent.service.DayOne;

public class Client {

	public static void main(String[] args) {
		DayOne dayOne = new DayOne("https://adventofcode.com/2022/day/1", "/html/body/main/article/pre/code", "https://adventofcode.com/2022/day/1/input", "/html/body/pre");
		dayOne.solveProblem();
	}
}
