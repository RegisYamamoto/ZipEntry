package com.regis.zipentry;

import java.io.File;
import java.io.FileWriter;

import com.regis.zipentry.util.ZipUtil;

public class EcritorDeArquivo {

	public static void main(String[] args) {

		try {
			File file = new File("arquivo.csv");
			FileWriter fileWriter = new FileWriter(file, true);
			
			fileWriter.write("conteudo");
			fileWriter.flush();
			fileWriter.close();
			
			File zipFile = new ZipUtil().zipFile("arquivo.zip", file);

		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}

	}
	
}
