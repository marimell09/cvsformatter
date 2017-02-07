import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVWriter;

public class Input {

	public Input() {

	}

	public static void main(String[] args) {

		FileInputStream fisPlanilha = null;
		
		try {
			File file = new File(
					"C:\\Users\\Mari\\Desktop\\SECRETARIA\\Dados\\Levantamento_para_TG1.xlsx");
			
			String csv = "C:\\Users\\Mari\\Desktop\\SECRETARIA\\Dados\\Levantamento_para_TG2.csv";
			CSVWriter writer = new CSVWriter(new FileWriter(csv));
			
			fisPlanilha = new FileInputStream(file);
			
			

			// cria um workbook = planilha toda com todas as abas
			XSSFWorkbook workbook = new XSSFWorkbook(fisPlanilha);

			// recuperamos apenas a primeira aba ou primeira planilha
			XSSFSheet sheet = workbook.getSheetAt(0);


			
			// retorna todas as linhas da planilha 0 (aba 1)
			Iterator<Row> rowIterator = sheet.iterator();

			// varre todas as linhas da planilha 0
			while (rowIterator.hasNext()) {

				// recebe cada linha da planilha
				Row row = rowIterator.next();

				// pegamos todas as celulas desta linha
				Iterator<Cell> cellIterator = row.iterator();

				//String[] line = new String[31];
				String line = "";
				// varremos todas as celulas da linha atual
				while (cellIterator.hasNext()) {

					// criamos uma celula
					Cell cell = cellIterator.next();
					
					// cada coluna terá seu número e assim sabemos o que fazer
					// com cada um deles
					int columnNumber = cell.getColumnIndex();

					//nome
					if (columnNumber == 0) {
						if (cell.getStringCellValue().equals("NOME")){
							line = line + "nome;";
						}else{
							line = line + String.valueOf(cell.getStringCellValue()) + ";";
						}
					//curso	
					} else if (columnNumber == 1) {
						/*if (cell.getStringCellValue().equals("Curso")){
							line = line + "curso;";
						}*/
						
					//turno
					} else if (columnNumber == 2) {
			
						if (cell.getStringCellValue().equals("Turno")){
							line = line + String.valueOf("turno;");
						} else if (cell.getStringCellValue().equals("Manhã")){
							line = line + "manha;";
						} else if (cell.getStringCellValue().equals("Tarde")){
							line = line + "tarde;";
						} else if (cell.getStringCellValue().equals("Noite")){
							line = line + "noite;";
						} else if (cell.getStringCellValue().equals("EAD")){
							line = line + "ead;";
						}
					//idade
					} else if (columnNumber == 3) {
						
					//cor
					} else if (columnNumber == 4) {
						if(cell.getStringCellValue().equals("Cor")){
							line = line + "cor;";
						} else if (cell.getStringCellValue().equals("Não Declarado")){
							line = line + "nao_declarado;";
						} else if (cell.getStringCellValue().equals("Branca")){
							line = line + "branca;";
						} else if (cell.getStringCellValue().equals("Parda")){
							line = line + "parda;";
						} else if (cell.getStringCellValue().equals("Negra")){
							line = line + "negra;";
						} else if (cell.getStringCellValue().equals("Não Informado")){
							line = line + "nao_declarado;";
						} else if (cell.getStringCellValue().equals("Indígena")){
							line = line + "indigena;";
						}else if(cell.getStringCellValue().equals("Amarela")){
							line = line + "amarela;";
						}
					//situacao do curso
					} else if (columnNumber == 5) {
						if(cell.getStringCellValue().equals("Situação Curso")){
							line = line + "situacao_do_curso;";
						}else if (cell.getStringCellValue().equals("Graduado")){
							line = line + "graduado;";
						}else if (cell.getStringCellValue().equals("Concluído")){
							line = line + "graduado;";
						} else if (cell.getStringCellValue().equals("Em Curso")){
							line = line + "em_curso;";
						} else if (cell.getStringCellValue().equals("Ciência sem Fronteiras")){
							line = line + "em_curso;";
						} else if (cell.getStringCellValue().equals("Cancel.Ingr.")){
							line = line + "cancelado;";
						} else if (cell.getStringCellValue().equals("Cancelado")){
							line = line + "cancelado;";
						} else if (cell.getStringCellValue().equals("Trancado2")){
							line = line + "cancelado;";
						} else if (cell.getStringCellValue().equals("Trancado1")){
							line = line + "cancelado;";
						} else if (cell.getStringCellValue().equals("Transferido")){
							line = line + "cancelado;";
						}

					//pp
					} else if (columnNumber == 6) {
					//pr
					} else if (columnNumber == 7) {
					//semestre
					} else if (columnNumber == 8) {
					//endereco
					} else if (columnNumber == 9) {
					//numero
					} else if (columnNumber == 10) {
					//complemento
					} else if (columnNumber == 11) {
					//bairro
					} else if (columnNumber == 12) {
					//municipio
					} else if (columnNumber == 13) {
					//estado
					} else if (columnNumber == 14) {
					//cep
					} else if (columnNumber == 15) {
					//classificacao
					} else if (columnNumber == 16) {
					//nota
					} else if (columnNumber == 17) {
					//escola publica
					} else if (columnNumber == 18) {
						if(cell.getStringCellValue().equals("ESCOLA")){
							line = line + "escola;";
						}else if (cell.getStringCellValue().equals("NÃO")){
							line = line + "nao;";
						}else if (cell.getStringCellValue().equals("SIM")){
							line = line + "sim;";
						}else if (cell.getStringCellValue().equals("-")){
							line = line + "nao_informado;";
						}
					//sexo
					} else if (columnNumber == 19) {
					//enem
					} else if (columnNumber == 20) {
					//escola pai
					} else if (columnNumber == 21) {
						if (cell.getStringCellValue().equals("ESCOLA PAI")){
							line = line + "escola_pai;";
						}else if (cell.getStringCellValue().equals("Analfabeto")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Lê e escreve, mas nunca esteve na escola")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Iniciou o ensino fundamental, mas abandonou entre a 1ª e a 4ª série")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Iniciou o ensino fundamental, mas abandonou entre a 5ª e a 8ª série")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Ensino médio (antigo 2º grau) incompleto")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Ensino médio (antigo 2º grau) completo")){
							line = line + "medio;";
						}else if (cell.getStringCellValue().equals("Superior incompleto")){
							line = line + "medio;";
						}else if (cell.getStringCellValue().equals("Superior completo")){
							line = line + "alto;";
						}else if (cell.getStringCellValue().equals("-")){
							line = line + "nao_informado;";
						}
						
					//escola mae
					} else if (columnNumber == 22) {
						if (cell.getStringCellValue().equals("ESCOLA MÃE")){
							line = line + "escola_mae;";
						}else if (cell.getStringCellValue().equals("Analfabeta")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Lê e escreve, mas nunca esteve na escola")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Iniciou o ensino fundamental, mas abandonou entre a 1ª e a 4ª série")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Iniciou o ensino fundamental, mas abandonou entre a 5ª e a 8ª série")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Ensino médio (antigo 2º grau) incompleto")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("Ensino médio (antigo 2º grau) completo")){
							line = line + "medio;";
						}else if (cell.getStringCellValue().equals("Superior incompleto")){
							line = line + "medio;";
						}else if (cell.getStringCellValue().equals("Superior completo")){
							line = line + "alto;";
						}else if (cell.getStringCellValue().equals("-")){
							line = line + "nao_informado;";
						}
					//renda familiar
					} else if (columnNumber == 23) {
						if (cell.getStringCellValue().equals("RENDA FAMILIAR")){
							line = line + "renda_familiar;";
						}else if (cell.getStringCellValue().equals("De 1 a 2 s.m.")){
							line = line + "baixa;";
						}else if (cell.getStringCellValue().equals("De 3 a 5 s.m.")){
							line = line + "medio;";
						}else if (cell.getStringCellValue().equals("De 6 a 10 s.m. ")){
							line = line + "medio;";
						}else if (cell.getStringCellValue().equals("De 11 a 20 s.m.")){
							line = line + "alto;";
						}else if (cell.getStringCellValue().equals("De 21 a 30 s.m.")){
							line = line + "alto;";
						}else if (cell.getStringCellValue().equals("Mais de 30 s.m.")){
							line = line + "alto;";
						}else if (cell.getStringCellValue().equals("Zero")){
							line = line + "nao_informado;";
						}else if (cell.getStringCellValue().equals("-")){
							line = line + "nao_informado;";
						}
					//previsao
					} else if (columnNumber == 24) {
					//data do vestibular
					} else if (columnNumber == 25) {
					//data estimada de ingresso
					} else if (columnNumber == 26) {
					//periodo de ingresso
					} else if (columnNumber == 27) {
					//conclusao
					} else if (columnNumber == 28) {
					//colacao
					} else if (columnNumber == 29) {
					//tempo de conclusao
					} else if (columnNumber == 30) {
					//horario
					} else if (columnNumber == 31) {

					}

					// switch (cell.getCellType()) {

					/*
					 * case Cell.CELL_TYPE_FORMULA:
					 * System.out.println("TIPO FORMULA: " +
					 * cell.getCellFormula());
					 */// }
				}
				String[] array = line.split(";");
				writer.writeNext(array);
				
				
			}
			writer.close();

			System.out.println("Done!");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				fisPlanilha.close();
			} catch (IOException ex) {
				Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null,
						ex);
			}
		}

	}

	public void output() {

	/*	if (number.equals("1")) {
			FileWriter outFile;

			try {
				outFile = new FileWriter(
						new File(
								"C:\\workspace_eclipse\\SDM_LAB4\\src\\cus1156\\lab4\\report.txt"));
				outFile.write(roster.toString());
				outFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
*/
	}

}
