import java.io.File;
import java.io.IOException;
import java.lang.String;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;



public class ConvertArff {
	
	  public static void main(String[] args) throws Exception{

		// load CSV
		CSVLoader loader = new CSVLoader();
		ArffSaver saver = new ArffSaver();
		Instances data = null;
		try {
			
			String csv = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\training_test_geral.csv";
			loader.setSource(new File(csv));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			String analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\training_test_geral.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String csv2 = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\validator_geral.csv";
			loader.setSource(new File(csv2));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\validator_geral.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String csv3 = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\cabecalho_geral.csv";
			loader.setSource(new File(csv3));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\geral\\cabecalho_geral.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String analise_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_training.csv";
			loader.setSource(new File(analise_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String analise_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_validator.csv";
			loader.setSource(new File(analise_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String analise_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_cabecalho.csv";
			loader.setSource(new File(analise_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\analise\\analise_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String automacao_e_manufatura_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_training.csv";
			loader.setSource(new File(automacao_e_manufatura_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String automacao_e_manufatura_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_validator.csv";
			loader.setSource(new File(automacao_e_manufatura_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String automacao_e_manufatura_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_cabecalho.csv";
			loader.setSource(new File(automacao_e_manufatura_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\automacao_e_manufatura\\automacao_e_manufatura_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String banco_de_dados_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_training.csv";
			loader.setSource(new File(banco_de_dados_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String banco_de_dados_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_validator.csv";
			loader.setSource(new File(banco_de_dados_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String banco_de_dados_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_cabecalho.csv";
			loader.setSource(new File(banco_de_dados_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\banco_de_dados\\banco_de_dados_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String gestao_da_producao_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_training.csv";
			loader.setSource(new File(gestao_da_producao_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String gestao_da_producao_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_validator.csv";
			loader.setSource(new File(gestao_da_producao_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String gestao_da_producao_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_cabecalho.csv";
			loader.setSource(new File(gestao_da_producao_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\gestao_da_producao\\gestao_da_producao_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String logistica_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_training.csv";
			loader.setSource(new File(logistica_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String logistica_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_validator.csv";
			loader.setSource(new File(logistica_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String logistica_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_cabecalho.csv";
			loader.setSource(new File(logistica_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\logistica\\logistica_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			
			String manutencao_de_aeronave_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_training.csv";
			loader.setSource(new File(manutencao_de_aeronave_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();		
			
			String manutencao_de_aeronave_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_validator.csv";
			loader.setSource(new File(manutencao_de_aeronave_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String manutencao_de_aeronave_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_cabecalho.csv";
			loader.setSource(new File(manutencao_de_aeronave_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\manutencao_de_aeronave\\manutencao_de_aeronave_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String projetos_de_estruturas_aeronauticas_t = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_training.csv";
			loader.setSource(new File(projetos_de_estruturas_aeronauticas_t));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_training.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String projetos_de_estruturas_aeronauticas_v = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_validator.csv";
			loader.setSource(new File(projetos_de_estruturas_aeronauticas_v));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_validator.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			String projetos_de_estruturas_aeronauticas_c = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_cabecalho.csv";
			loader.setSource(new File(projetos_de_estruturas_aeronauticas_c));
			data = loader.getDataSet();// get instances object
			saver = new ArffSaver();
			saver.setInstances(data);// set the dataset we want to convert
			analise_arff = "C:\\Users\\Mari\\Desktop\\Dados_teste\\dados\\por_curso\\projetos_de_estruturas_aeronauticas\\projetos_de_estruturas_aeronauticas_cabecalho.arff";
			saver.setFile(new File(analise_arff));
			saver.writeBatch();
			
			System.out.println("done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
