package beans;

public class Produit {
private int id_produit,id_categorie;
private String nom,description,img1,img2,img3,img4;
public Produit(int id_produit, int id_categorie, String nom, String description, String img1, String img2, String img3,
		String img4) {
	this.id_produit = id_produit;
	this.id_categorie = id_categorie;
	this.nom = nom;
	this.description = description;
	this.img1 = img1;
	this.img2 = img2;
	this.img3 = img3;
	this.img4 = img4;
}
public int getId_produit() {
	return id_produit;
}
public void setId_produit(int id_produit) {
	this.id_produit = id_produit;
}
public int getId_categorie() {
	return id_categorie;
}
public void setId_categorie(int id_categorie) {
	this.id_categorie = id_categorie;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImg1() {
	return img1;
}
public void setImg1(String img1) {
	this.img1 = img1;
}
public String getImg2() {
	return img2;
}
public void setImg2(String img2) {
	this.img2 = img2;
}
public String getImg3() {
	return img3;
}
public void setImg3(String img3) {
	this.img3 = img3;
}
public String getImg4() {
	return img4;
}
public void setImg4(String img4) {
	this.img4 = img4;
}
}
