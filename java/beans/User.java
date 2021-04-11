package beans;

public class User {
private int id;
private String nom,prenom,tel,email,motdepass,recup;
private int admin;
public User(int id, String nom, String prenom, String tel, String email, String motdepass, String recup,int admin) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.tel = tel;
	this.email = email;
	this.motdepass = motdepass;
	this.recup = recup;
	this.admin = admin;
}
public User(String nom, String prenom, String email, String motdepass) {
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.motdepass = motdepass;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMotdepass() {
	return motdepass;
}
public void setMotdepass(String motdepass) {
	this.motdepass = motdepass;
}
public String getRecup() {
	return recup;
}
public void setRecup(String recup) {
	this.recup = recup;
}
public int isAdmin() {
	return admin;
}
public void setAdmin(int admin) {
	this.admin = admin;
}
}
