package tn.esprit.asi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class Restaurant implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idRestaurant;
	private String nom;
	private String adresse;
	private CategorieResto categorieResto;
	@ManyToMany 
	private Set<Client> clients;
	public Long getIdRestaurant() {
		return idRestaurant;
	}
	public void setIdRestaurant(Long idRestaurant) {
		this.idRestaurant = idRestaurant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public CategorieResto getCategorieResto() {
		return categorieResto;
	}
	public void setCategorieResto(CategorieResto categorieResto) {
		this.categorieResto = categorieResto;
	}
	public Set<Client> getClients() {
		return clients;
	}
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	public Restaurant(Long idRestaurant, String nom, String adresse, CategorieResto categorieResto,
			Set<Client> clients) {
		super();
		this.idRestaurant = idRestaurant;
		this.nom = nom;
		this.adresse = adresse;
		this.categorieResto = categorieResto;
		this.clients = clients;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
