import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class LimpaDuplicidade {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		LimpaDuplicidade ld = new LimpaDuplicidade();

		// Build reader instance
		CSVReader reader = new CSVReader(new FileReader(
				"C:\\Users\\Mari\\Desktop\\Dados_teste\\limpeza_inicial.csv"),';');
		
		String csv = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\training_test.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv),';', CSVWriter.NO_QUOTE_CHARACTER);
		
		String csv2 = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\validator.csv";
		CSVWriter writer2 = new CSVWriter(new FileWriter(csv2),';', CSVWriter.NO_QUOTE_CHARACTER);
		
		String csv3 = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\cabecalho.csv";
		CSVWriter writer3 = new CSVWriter(new FileWriter(csv3),';', CSVWriter.NO_QUOTE_CHARACTER);

		// Read all rows at onces
		List<String[]> allRows = reader.readAll();

		//linha onde as colunas específicas serão gravadas
		String[] linha = null;
		
		// Read CSV line by line and use the string array as you want

		String[] coluna = allRows.get(0);
		
		//escreve as labels dos campos
		writer.writeNext(ld.escreveLinha(linha, coluna));
		writer2.writeNext(ld.escreveLinha(linha, coluna));
		writer3.writeNext(ld.escreveLinha(linha, coluna));
		
		
		for (int count = 1; count < allRows.size(); count++) {

			// allRows.get pega a linha e divide as colunas em um array de
			// string
			coluna = allRows.get(count);
			int count2 = ld.checaDuplicidade(count, allRows, allRows.size());
			
			boolean escreve = true;
			
			if(count2 > count){
				count = count2;
				escreve = false;
				//caso o if de cima não execute, o escreve será true e poderá ocorrer a limpeza por coluna
			}
			
			if (escreve == true){

				
				//turno
				//caso o turno seja ead, não escreve a linha
				if(coluna[2].equals("ead")){
					escreve = false;
				//cor
				//caso a cor não esteja preenchida, não escrever a linha
				}else if(coluna[4].equals("nao_informado")){
					escreve = false;
//				escola
				}else if (coluna[6].equals("nao_informado")){
					escreve = false;
//				escola pai
				}else if (coluna[7].equals("nao_informado")){
					escreve = false;
//				escola mae
				}else if (coluna[8].equals("nao_informado")){
					escreve = false;
//				renda familiar
				}else if (coluna[9].equals("nao_informado")){
					escreve = false;
				}
				
				int idade = Integer.parseInt(coluna[3]);
				
				if (idade < 23){
					coluna[3] = "0_a_22";
				}
				else if (idade < 30){
					coluna[3] = "23_a_29";
				}
				else if(idade <= 40){
					coluna[3] = "30_a_40";
				}
				else if(idade <= 50){
					coluna[3] = "41_a_50";
				}
				else if(idade <= 70){
					coluna[3] = "51_a_70";
				}
				else if(idade <= 120){
					coluna[3] = "71_a_120";
				}
				
				
				linha = ld.escreveLinha(linha, coluna);
			}
			
			
			if (escreve == true){
				if (coluna[10].substring(0, 4).equals("2006") || coluna[10].substring(0, 4).equals("2007") || coluna[10].substring(0, 4).equals("2008")
						|| coluna[10].substring(0, 4).equals("2009") || coluna[10].substring(0, 4).equals("2010") || coluna[10].substring(0, 4).equals("2011")
						|| coluna[10].substring(0, 4).equals("2012") || coluna[10].substring(0, 4).equals("2013") || coluna[10].substring(0, 4).equals("2014")){
					
					writer.writeNext(linha);					
				}if(coluna[10].substring(0, 4).equals("2015") || coluna[10].substring(0, 4).equals("2016")){
					writer2.writeNext(linha);	
					
				}
				
				writer3.writeNext(linha);
			}
			
			
		}
		
		writer.close();
		writer2.close();
		System.out.println("Done!");

	}

	public int checaDuplicidade(int count, List<String[]> allRows, int size) {

		int qtdRepetidos = 0;
		int countOld = count;
		// condicao para sair do while
		boolean out = false;

		String[] coluna = allRows.get(count);

		// while deve ser executado até encontrar uma linha que não se repita
		while ((out == false) && (count < size-1)) {
			
			String[] coluna2 = allRows.get(count + 1);

			if (coluna[0].equals(coluna2[0])) {
				count++;
				qtdRepetidos++;
			} else {
				out = true;
			}
		}

		if (qtdRepetidos > 0) {
			return (countOld + qtdRepetidos);
		} else {
			return count;
		}

	}
	
	
	public String[] escreveLinha(String[] linha, String[] coluna){
		
		linha = new String[8];
		//linha[0] = coluna[0];
		linha[0] = coluna[2];
		linha[1] = coluna[3];
		linha[2] = coluna[4];
		linha[3] = coluna[5];
		linha[4] = coluna[6];
		linha[5] = coluna[7];
		linha[6] = coluna[8];
		linha[7] = coluna[9];
		
		return linha;
	}
}
