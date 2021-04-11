package beans;

public class categorie {
private int categorie_id;
private String categorie_name;
public categorie(int categorie_id, String categorie_name) {
	this.categorie_id = categorie_id;
	this.categorie_name = categorie_name;
}
public int getCategorie_id() {
	return categorie_id;
}
public void setCategorie_id(int categorie_id) {
	this.categorie_id = categorie_id;
}
public String getCategorie_name() {
	return categorie_name;
}
public void setCategorie_name(String categorie_name) {
	this.categorie_name = categorie_name;
}

}
