package br.cesed.si.arqsoft.Usuario;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity @Data @AllArgsConstructor
public class Usuario {

	@Id
	private String login;
	
	private String password;
	
	
	
}
