import java.io.FileReader;
import java.io.FileWriter;
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
		
		String csv = "C:\\Users\\Mari\\Desktop\\Dados_teste\\duplicidade_limpa.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv),';', CSVWriter.NO_QUOTE_CHARACTER);

		String line = "";
		// Read all rows at once
		List<String[]> allRows = reader.readAll();

		// Read CSV line by line and use the string array as you want

		for (int count = 0; count < allRows.size(); count++) {

			// allRows.get pega a linha e divide as colunas em um array de
			// string
			String[] coluna = allRows.get(count);

			int count2 = ld.checaDuplicidade(count, allRows, allRows.size());
			
			if(count2 > count){
				count = count2;
			}else{
				//line = allRows
			}

		}

	}

	public int checaDuplicidade(int count, List<String[]> allRows, int size) {

		int qtdRepetidos = 0;
		// condicao para sair do while
		boolean out = false;

		String[] coluna = allRows.get(count);

		// while deve ser executado até encontrar uma linha que não se repita
		while (out == false || count < size) {
			
			String[] coluna2 = allRows.get(count + 1);

			if (coluna[0].equals(coluna2[0])) {
				count++;
				qtdRepetidos++;
			} else {
				out = true;
			}

		}

		if (qtdRepetidos > 0) {
			return (count + qtdRepetidos + 1);
		} else {
			return count;
		}

	}
}
