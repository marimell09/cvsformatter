import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class LimpaDuplicidade {

	@SuppressWarnings("resource")
	
	/**
	 * Método main utilizado para gravar dividindo por curso e ano, branch LimpezaPorCurso
	 * Este método contém a limpeza geral caso seja necessário realizar testes para todos os cursos
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		LimpaDuplicidade ld = new LimpaDuplicidade();
	
		// Criando a instancia de leitura
		CSVReader reader = new CSVReader(new FileReader(
				"C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\limpeza_inicial.csv"),
				',');
	
		//Criando todas as instancias de escrita
		
		
		String csv = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\training_test_geral.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
	
		String csv2 = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\validator_geral.csv";
		CSVWriter writer2 = new CSVWriter(new FileWriter(csv2), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
	
		String csv3 = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\cabecalho_geral.csv";
		CSVWriter writer3 = new CSVWriter(new FileWriter(csv3), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
	
		String analise_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_training.csv";
		String analise_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_validator.csv";
		String analise_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_cabecalho.csv";
		CSVWriter analise_w1_t = new CSVWriter(new FileWriter(analise_t), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter analise_w2_v = new CSVWriter(new FileWriter(analise_v), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter analise_w3_c = new CSVWriter(new FileWriter(analise_c), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
	
		String automacao_e_manufatura_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_training.csv";
		String automacao_e_manufatura_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_validator.csv";
		String automacao_e_manufatura_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_cabecalho.csv";
		CSVWriter automacao_e_manufatura_w1_t = new CSVWriter(new FileWriter(
				automacao_e_manufatura_t), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter automacao_e_manufatura_w2_v = new CSVWriter(new FileWriter(
				automacao_e_manufatura_v), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter automacao_e_manufatura_w3_c = new CSVWriter(new FileWriter(
				automacao_e_manufatura_c), ',', CSVWriter.NO_QUOTE_CHARACTER);
	
		String banco_de_dados_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_training.csv";
		String banco_de_dados_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_validator.csv";
		String banco_de_dados_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_cabecalho.csv";
		CSVWriter banco_de_dados_w1_t = new CSVWriter(new FileWriter(
				banco_de_dados_t), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter banco_de_dados_w2_v = new CSVWriter(new FileWriter(
				banco_de_dados_v), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter banco_de_dados_w3_c = new CSVWriter(new FileWriter(
				banco_de_dados_c), ',', CSVWriter.NO_QUOTE_CHARACTER);
	
		String gestao_da_producao_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_training.csv";
		String gestao_da_producao_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_validator.csv";
		String gestao_da_producao_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_cabecalho.csv";
		CSVWriter gestao_da_producao_w1_t = new CSVWriter(new FileWriter(
				gestao_da_producao_t), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter gestao_da_producao_w2_v = new CSVWriter(new FileWriter(
				gestao_da_producao_v), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter gestao_da_producao_w3_c = new CSVWriter(new FileWriter(
				gestao_da_producao_c), ',', CSVWriter.NO_QUOTE_CHARACTER);
	
		String logistica_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_training.csv";
		String logistica_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_validator.csv";
		String logistica_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_cabecalho.csv";
		CSVWriter logistica_w1_t = new CSVWriter(new FileWriter(logistica_t),
				',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter logistica_w2_v = new CSVWriter(new FileWriter(logistica_v),
				',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter logistica_w3_c = new CSVWriter(new FileWriter(logistica_c),
				',', CSVWriter.NO_QUOTE_CHARACTER);
	
		String manutencao_de_aeronave_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_training.csv";
		String manutencao_de_aeronave_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_validator.csv";
		String manutencao_de_aeronave_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_cabecalho.csv";
		CSVWriter manutencao_de_aeronave_w1_t = new CSVWriter(new FileWriter(
				manutencao_de_aeronave_t), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter manutencao_de_aeronave_w2_v = new CSVWriter(new FileWriter(
				manutencao_de_aeronave_v), ',', CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter manutencao_de_aeronave_w3_c = new CSVWriter(new FileWriter(
				manutencao_de_aeronave_c), ',', CSVWriter.NO_QUOTE_CHARACTER);
	
		String projetos_de_estruturas_aeronauticas_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_training.csv";
		String projetos_de_estruturas_aeronauticas_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_validator.csv";
		String projetos_de_estruturas_aeronauticas_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_cabecalho.csv";
		CSVWriter projetos_de_estruturas_aeronauticas_w1_t = new CSVWriter(
				new FileWriter(projetos_de_estruturas_aeronauticas_t), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter projetos_de_estruturas_aeronauticas_w2_v = new CSVWriter(
				new FileWriter(projetos_de_estruturas_aeronauticas_v), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter projetos_de_estruturas_aeronauticas_w3_c = new CSVWriter(
				new FileWriter(projetos_de_estruturas_aeronauticas_c), ',',
				CSVWriter.NO_QUOTE_CHARACTER);
	
		// Lê todas as linhas de uma vez
		List<String[]> allRows = reader.readAll();
	
		//linha onde as colunas específicas serão gravadas
		String[] linha = null;
	
		/* Retiro as labels do arquivo principal, para serem escritas
		 *  abaixo em cada um dos documentos
		 */
		String[] coluna = allRows.get(0);
	
		/* escreve as labels dos campos */
		writer.writeNext(ld.escreveLinha(linha, coluna));
		writer2.writeNext(ld.escreveLinha(linha, coluna));
		writer3.writeNext(ld.escreveLinha(linha, coluna));
		
		analise_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		analise_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		analise_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		automacao_e_manufatura_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		automacao_e_manufatura_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		automacao_e_manufatura_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		banco_de_dados_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		banco_de_dados_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		banco_de_dados_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		gestao_da_producao_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		gestao_da_producao_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		gestao_da_producao_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		logistica_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		logistica_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		logistica_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		manutencao_de_aeronave_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		manutencao_de_aeronave_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		manutencao_de_aeronave_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		projetos_de_estruturas_aeronauticas_w1_t.writeNext(ld.escreveLinha(linha, coluna));
		projetos_de_estruturas_aeronauticas_w2_v.writeNext(ld.escreveLinha(linha, coluna));
		projetos_de_estruturas_aeronauticas_w3_c.writeNext(ld.escreveLinha(linha, coluna));
		
		//Entra no for passando em todas as linhas de registros do arquivo
		for (int count = 1; count < allRows.size(); count++) {
	
			/* allRows.get pega a linha e divide as colunas em um array de string */
			coluna = allRows.get(count);
			
			/* método que checa a duplicidade de cada linha */
			int count2 = ld.checaDuplicidade(count, allRows, allRows.size());
	
			/* booleano que é usado para saber se linha é escrita ou não */
			boolean escreve = true;
	
			/* Se o retorno do método de count2 for maior, significando que achou 1 ou mais linhas repetidas
			 * não escreve é setado para faldo indicando que linha não será escrita e o contador do for será 
			 * setado a pulando todas as linhas repetidas, não importando quantas se repetem */
			if (count2 > count) {
				count = count2;
				escreve = false;
			}
	
			/*caso escreve não tenha sido setado para falso anteriormente 
			 * ocorrerá uma limpeza por colunas
			 */
			if (escreve == true) {
	
				/* turno
				 * caso o turno seja ead, não escreve a linha (não queremos ead por ser ensino a distancia)
				 */
				int col = 2;
				if (coluna[col].equals("ead")) {
					escreve = false;
					
				/*A partir daqui minha limpeza retira todos os campos vazios da planilha, 
				* escrevendo apenas quem possui todos os campos abaixo preenchidos*/
					
				/* cor
				 * caso a cor não esteja preenchida, não escrever a linha */
				} else if (coluna[4].equals("nao_informado")) {
					escreve = false;
				//cep
				} else if (coluna[6].equals("nao_informado")) {
					escreve = false;
				//classificacao
				}else if (coluna[7].equals("nao_informado")) {
					escreve = false;
				//nota
				}else if (coluna[8].equals("nao_informado")) {
					escreve = false;
				// escola publica
				}else if (coluna[9].equals("nao_informado")) {
					escreve = false;
				// escola pai
				}else if (coluna[12].equals("nao_informado")) {
					escreve = false;
				// escola mae
				} else if (coluna[13].equals("nao_informado")) {
					escreve = false;
				// renda familiar
				} else if (coluna[14].equals("nao_informado")) {
					escreve = false;
				}
	
				int col2 = 3;
				/* Separo as idades em agrupamentos para não confundir o algoritmo */
				int idade = Integer.parseInt(coluna[col2]);
	
				if (idade < 23) {
					coluna[col2] = "0_a_22";
				} else if (idade < 30) {
					coluna[col2] = "23_a_29";
				} else if (idade <= 40) {
					coluna[col2] = "30_a_40";
				} else if (idade <= 50) {
					coluna[col2] = "41_a_50";
				} else if (idade <= 70) {
					coluna[col2] = "51_a_70";
				} else if (idade <= 120) {
					coluna[col2] = "71_a_120";
				}
				
							
				int col3 = 11;
				/* Novo teste com ENEM para, separando as notas em ranges de alto, medio, baixo*/
				float enem = Float.parseFloat(coluna[col3]);
				
				if (enem > 0 && enem < 31) {
					coluna[col3] = "baixo";
				} else if (enem < 61) {
					coluna[col3] = "medio";
				} else if (enem <= 100) {
					coluna[col3] = "alto";
				}
				
				/*Meu método escreveLinha decide qual das colunas 
				 * desejo escrever em caso de querer mudar uma delas futuramente
				 */
				linha = ld.escreveLinha(linha, coluna);
			}
	
			// Se escreve é true, significa que posso escrever na planilha
			if (escreve == true) {
				int col4 = 15;
				String training = "2014 / 1";
				String validator = "2015 / 1";
				
				/* Separo por ano para conseguir fazer um training set*/
				if (	/*coluna[10].substring(0, 4).equals("2006")
						|| coluna[10].substring(0, 4).equals("2007")
						|| coluna[10].substring(0, 4).equals("2008")
						|| coluna[10].substring(0, 4).equals("2009")
						|| coluna[10].substring(0, 4).equals("2010")
						|| coluna[10].substring(0, 4).equals("2011")
						|| coluna[10].substring(0, 4).equals("2012")
						|| coluna[10].substring(0, 4).equals("2013")
						||*/ coluna[col4].equals(training)) {
	
					/*Separo por curso o training set
					 */
					if (coluna[1]
							.equals("analise_e_deselvolvimento_de_sistemas")) {
						analise_w1_t.writeNext(linha);
						writer.writeNext(linha);
					}
					if (coluna[1].equals("automacao_e_manufatura_digital")) {
						automacao_e_manufatura_w1_t.writeNext(linha);
						writer.writeNext(linha);
					}
					if (coluna[1].equals("banco_de_dados")) {
						banco_de_dados_w1_t.writeNext(linha);
						writer.writeNext(linha);
					}
					if (coluna[1].equals("gestao_da_producao")) {
						gestao_da_producao_w1_t.writeNext(linha);
						writer.writeNext(linha);
					}
					if (coluna[1].equals("logistica")) {
						logistica_w1_t.writeNext(linha);
						writer.writeNext(linha);
					}
					if (coluna[1].equals("manutencao_de_aeronave")) {
						manutencao_de_aeronave_w1_t.writeNext(linha);
						writer.writeNext(linha);
					}
					if (coluna[1].equals("projetos_de_estruturas_aeronauticas")) {
						projetos_de_estruturas_aeronauticas_w1_t
								.writeNext(linha);
						writer.writeNext(linha);
					}
				}
				
				/*Separo por ano para conseguir fazer um validator
				 */
				if (coluna[col4].equals(validator)){
						/*|| coluna[10].substring(0, 4).equals("2016"))*/
	
					/*Separo por curso o validator
					 */
					if (coluna[1]
							.equals("analise_e_deselvolvimento_de_sistemas")) {
						analise_w2_v.writeNext(linha);
						writer2.writeNext(linha);
					}
					if (coluna[1].equals("automacao_e_manufatura_digital")) {
						automacao_e_manufatura_w2_v.writeNext(linha);
						writer2.writeNext(linha);
					}
					if (coluna[1].equals("banco_de_dados")) {
						banco_de_dados_w2_v.writeNext(linha);
						writer2.writeNext(linha);
					}
					if (coluna[1].equals("gestao_da_producao")) {
						gestao_da_producao_w2_v.writeNext(linha);
						writer2.writeNext(linha);
					}
					if (coluna[1].equals("logistica")) {
						logistica_w2_v.writeNext(linha);
						writer2.writeNext(linha);
					}
					if (coluna[1].equals("manutencao_de_aeronave")) {
						manutencao_de_aeronave_w2_v.writeNext(linha);
						writer2.writeNext(linha);
					}
					if (coluna[1].equals("projetos_de_estruturas_aeronauticas")) {
						projetos_de_estruturas_aeronauticas_w2_v
								.writeNext(linha);
						writer2.writeNext(linha);
					}
				}
				
				/* separa por curso o cabecalho
				 * Esse cabeçalho serve para conter todos os 
				 * exemplos possíveis na hora da criação do arf
				 */
				if (coluna[col4].equals(training)
					|| coluna[col4].equals(validator)){
					
					if (coluna[1].equals("analise_e_deselvolvimento_de_sistemas")) {
						analise_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
					if (coluna[1].equals("automacao_e_manufatura_digital")) {
						automacao_e_manufatura_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
					if (coluna[1].equals("banco_de_dados")) {
						banco_de_dados_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
					if (coluna[1].equals("gestao_da_producao")) {
						gestao_da_producao_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
					if (coluna[1].equals("logistica")) {
						logistica_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
					if (coluna[1].equals("manutencao_de_aeronave")) {
						manutencao_de_aeronave_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
					if (coluna[1].equals("projetos_de_estruturas_aeronauticas")) {
						projetos_de_estruturas_aeronauticas_w3_c.writeNext(linha);
						writer3.writeNext(linha);
					}
				}
			}
		}
	
		/*Fecho toda as minhas instancias de escrita
		 */
		writer.close();
		writer2.close();
		writer3.close();
		
		analise_w1_t.close();
		analise_w2_v.close();
		analise_w3_c.close();
		
		automacao_e_manufatura_w1_t.close();
		automacao_e_manufatura_w2_v.close();
		automacao_e_manufatura_w3_c.close();
		
		banco_de_dados_w1_t.close();
		banco_de_dados_w2_v.close();
		banco_de_dados_w3_c.close();
		
		gestao_da_producao_w1_t.close();
		gestao_da_producao_w2_v.close();
		gestao_da_producao_w3_c.close();
		
		logistica_w1_t.close();
		logistica_w2_v.close();
		logistica_w3_c.close();
		
		manutencao_de_aeronave_w1_t.close();
		manutencao_de_aeronave_w2_v.close();
		manutencao_de_aeronave_w3_c.close();
		
		projetos_de_estruturas_aeronauticas_w1_t.close();
		projetos_de_estruturas_aeronauticas_w2_v.close();
		projetos_de_estruturas_aeronauticas_w3_c.close();
		
		System.out.println("Done!");
	
	}
	
	
	
	
	/** Método checaDuplicidade consegue retirar a duplicidade de linhas uma 
	 * embaixo da outra, não importando sua quantidade de linhas repetidas
	 * @param count (contador do for externo) do método main
	 * @Param allRows, lista de todas as linhas do arquivo cvs de limpezaInicial
	 * @Param Número de linhas total da planilha
	 * @return cont, contador com a última linha da repetição, 
	 * para que o for externo de ++ e comece a partir do nome não repetido
	 */
	public int checaDuplicidade(int count, List<String[]> allRows, int size) {

		int qtdRepetidos = 0;
		int countOld = count;
		// condicao para sair do while
		boolean out = false;

		String[] coluna = allRows.get(count);

		/* while deve ser executado até encontrar uma linha que não 
		 * se repita ou o tamanho de linhas da planilha acabe
		 */
		while ((out == false) && (count < size - 1)) {

			String[] coluna2 = allRows.get(count + 1);

			if (coluna[0].equals(coluna2[0])) {
				count++;
				qtdRepetidos++;
			} else {
				out = true;
			}
		}

		/* Se a quantidade repetida for maior que zero o count externo é somado com a 
		 * quantidade repetida e retornado para comparação externa
		 */
		if (qtdRepetidos > 0) {
			return (countOld + qtdRepetidos);
		} 
		/* Caso não repita, retorna o count inicial */
		else {
			return count;
		}

	}

	/**
	 * Método escreveLinha serve para decidir qual coluna da tabela deverá ser escrita, facilitando 
	 * modificações futuras caso seja necessário modificar os campos que devem ser gravados
	 * @param linha
	 * @param coluna
	 * @return linha que deverá ser gravada externamente
	 */
	public String[] escreveLinha(String[] linha, String[] coluna) {

		/*
		//escrita da linha contém o nome
		linha = new String[12];
		linha[0] = coluna[0]; //nome
		linha[1] = coluna[3]; //idade
		linha[2] = coluna[4]; //cor
		linha[3] = coluna[5]; //situacao curso
		linha[4] = coluna[6]; //cep
		linha[5] = coluna[7]; //classificacao
		linha[6] = coluna[8]; //nota
		linha[7] = coluna[9]; //escola
		linha[8] = coluna[10]; //sexo
		linha[9] = coluna[12]; //escola pai
		linha[10] = coluna[13]; //escola mae
		linha[11] = coluna[14]; //renda familiar
		 */

		// escrita da linha sem o nome
		linha = new String[11];
		linha[0] = coluna[3]; //idade
		linha[1] = coluna[4]; //cor
		linha[2] = coluna[5]; //situacao curso
		linha[3] = coluna[6]; //cep
		linha[4] = coluna[7]; //classificacao
		linha[5] = coluna[8]; //nota
		linha[6] = coluna[9]; //escola
		linha[7] = coluna[10]; //sexo
		linha[8] = coluna[12]; //escola pai
		linha[9] = coluna[13]; //escola mae
		linha[10] = coluna[14]; //renda familiar
		
		return linha;
	}
}
