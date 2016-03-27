package com.indrali.gcj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class GCJ {

	private static BufferedReader input;
	private static BufferedWriter output;
	protected static String inputLine;
	protected static String[] brokenUpInputLine;
	private static final String FOLDER = "/tmp/";

	protected static void run() throws NumberFormatException, IOException {
		String subclasses[] = Thread.currentThread().getStackTrace()[2]
				.getClassName().split("\\.");
		String subclass = subclasses[subclasses.length-1];
		if (subclass.length() > 0) {
			try {
				input = new BufferedReader(new FileReader(new File(FOLDER,
						subclass + ".in")));
				output = new BufferedWriter(new FileWriter(new File(FOLDER,
						subclass + ".out")));
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		int loop = Integer.valueOf(input.readLine());
		for (int i = 0; i < loop; i++)
			answering(i + 1);
		output.flush();
	}

	protected static void write(String s) throws IOException {
		System.out.print(s);
		output.write(s);
	}

	protected static void writeln(String s) throws IOException {
		System.out.println(s);
		output.write(s + "\n");
	}

	protected static void writeln() throws IOException {
		System.out.println();
		output.write("\n");
	}

	protected static void write(double s) throws IOException {
		System.out.print(String.valueOf(s));
		output.write(String.valueOf(s));
	}

	protected static void writeln(double s) throws IOException {
		System.out.println(String.valueOf(s));
		output.write(String.valueOf(s) + "\n");
	}

	protected static void write(int s) throws IOException {
		System.out.print(String.valueOf(s));
		output.write(String.valueOf(s));
	}

	protected static void writeln(int s) throws IOException {
		System.out.println(String.valueOf(s));
		output.write(String.valueOf(s) + "\n");
	}

	protected static void readLine() throws IOException {
		inputLine = input.readLine();
		brokenUpInputLine = inputLine.split(" ");
	}

	protected static String getStringInput(int i) {
		return brokenUpInputLine[i];
	}

	protected static int getIntInput(int i) {
		return Integer.parseInt(brokenUpInputLine[i]);
	}

	protected static long getLongInput(int i) {
		return Long.parseLong(brokenUpInputLine[i]);
	}

	protected static double getDoubleInput(int i) {
		return Double.parseDouble(brokenUpInputLine[i]);
	}

	private static void answering(int ordinalityOfProblem) throws IOException {
		writeOrdinalityOfAnswer(ordinalityOfProblem);
		code(ordinalityOfProblem);
	}

	private static void writeOrdinalityOfAnswer(int ordinalityOfProblem)
			throws IOException {
		write("Case #" + ordinalityOfProblem + ": ");
	}

	protected static void code(int ordinalityOfProblem) throws IOException {
	}

}