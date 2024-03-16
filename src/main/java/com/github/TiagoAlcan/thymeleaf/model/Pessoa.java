package com.github.TiagoAlcan.thymeleaf.model;

public class Pessoa {
		private Long id;
		private String nome;
		private String sexo;
		
		public Pessoa(Long i, String nome, String sexo) {
			this.id = i;
			this.nome = nome;
			this.sexo = sexo;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		
}
