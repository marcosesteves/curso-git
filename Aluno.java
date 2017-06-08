package br.com.uva.academico;

import br.com.uva.gerencial.Curso;

public class Aluno extends Curso{
	private static int mat_aux = 0;
	private int mat = 0;
	private String nome;
	private Curso curso;
	
	
	
	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Aluno(){
		mat = mat_aux++;
	}
	try{
		public void inscreverAluno(Curso curso)   {
			
				if(this.curso == null){
					
				}
			}catch{
				System.out.println(this.nome + "já está cursando " + this.curso);
			}
			

	public void listarCurso(){
		this.toString();
	}
}
