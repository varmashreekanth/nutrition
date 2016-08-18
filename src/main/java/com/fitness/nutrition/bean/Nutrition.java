package com.fitness.nutrition.bean;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="nutritionCollection")
public class Nutrition implements Serializable{

	@Id
	private String id;
	@Field(value="gtin_nm")
	private String foodItem;
	private String owner_cd;
	private String gcp_cd;
	private int pot_mg;
	private int sat_fat_dv;
	private int tot_fat_dv;
	private String gln_nm;
	private String sat_fat_g;
	private String serv_ct;
	private String trans_fat_g;
	private String ingredients;
	private int chol_mg;
	private String gtin_cd;
	private int vitamin_a;
	private int tot_fat_g;
	private int pkg_unit;
	private String prefix_nm;
	private String gln_addr_city;
	private int protein_g;
	private int cal_from_fat;
	private int sod_mg;
	private String gln_country_iso_cd;
	private String gln_addr_04;
	private int tot_carb_g;
	private String gln_addr_02;
	private String owner_nm;
	private String brand_bsin;
	private int cal;
	private String country_iso_cd;
	private String brand_nm;
	private int return_code;
	private String brand_link;
	private String owner_img;//Not necessary just kept for matching the collections in db
	private int serv_size_ml;
	private int tot_carb_dv;
	private String owner_wiki_en;//Wiki link of the owner
	private String brand_img;//Not necessary just kept for matching the collections in db
	private int pot_dv;
	private int diet_fiber_g;
	private int serv_size_g;
	private int m_floz;
	private String gtin_img;//Not necessary just kept for matching the collections in db
	private String gln_addr_postalcode;
	private int calcium;
	private String owner_link;
	private String gpc_s_cd;
	private int iron;
	private int vitamin_c;
	private int sod_dv;
	private int sugars_g;
	private String gln_cd;
	private int diet_fiber_dv;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}
	public String getOwner_cd() {
		return owner_cd;
	}
	public void setOwner_cd(String ownerCd) {
		this.owner_cd = ownerCd;
	}
	public String getGcp_cd() {
		return gcp_cd;
	}
	public void setGcp_cd(String gcpCd) {
		this.gcp_cd = gcpCd;
	}
	public int getPot_mg() {
		return pot_mg;
	}
	public void setPot_mg(int potMg) {
		this.pot_mg = potMg;
	}
	public int getSat_fat_dv() {
		return sat_fat_dv;
	}
	public void setSat_fat_dv(int satFatDv) {
		this.sat_fat_dv = satFatDv;
	}
	public int getTot_fat_dv() {
		return tot_fat_dv;
	}
	public void setTot_fat_dv(int totFatDv) {
		this.tot_fat_dv = totFatDv;
	}
	public String getGln_nm() {
		return gln_nm;
	}
	public void setGln_nm(String glnNm) {
		this.gln_nm = glnNm;
	}
	public String getSat_fat_g() {
		return sat_fat_g;
	}
	public void setSat_fat_g(String satFatG) {
		this.sat_fat_g = satFatG;
	}
	public String getServ_ct() {
		return serv_ct;
	}
	public void setServ_ct(String servCt) {
		this.serv_ct = servCt;
	}
	public String getTrans_fat_g() {
		return trans_fat_g;
	}
	public void setTrans_fat_g(String transFatG) {
		this.trans_fat_g = transFatG;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public int getChol_mg() {
		return chol_mg;
	}
	public void setChol_mg(int cholMg) {
		this.chol_mg = cholMg;
	}
	public String getGtin_cd() {
		return gtin_cd;
	}
	public void setGtin_cd(String gtinCd) {
		this.gtin_cd = gtinCd;
	}
	public int getVitamin_a() {
		return vitamin_a;
	}
	public void setVitamin_a(int vitaminA) {
		this.vitamin_a = vitaminA;
	}
	public int getTot_fat_g() {
		return tot_fat_g;
	}
	public void setTot_fat_g(int totFatG) {
		this.tot_fat_g = totFatG;
	}
	public int getPkg_unit() {
		return pkg_unit;
	}
	public void setPkg_unit(int pkgUnit) {
		this.pkg_unit = pkgUnit;
	}
	public String getPrefix_nm() {
		return prefix_nm;
	}
	public void setPrefix_nm(String prefixNm) {
		this.prefix_nm = prefixNm;
	}
	public String getGln_addr_city() {
		return gln_addr_city;
	}
	public void setGln_addr_city(String glnAddrCity) {
		this.gln_addr_city = glnAddrCity;
	}
	public int getProtein_g() {
		return protein_g;
	}
	public void setProtein_g(int proteinG) {
		this.protein_g = proteinG;
	}
	public int getCal_from_fat() {
		return cal_from_fat;
	}
	public void setCal_from_fat(int calFromFat) {
		this.cal_from_fat = calFromFat;
	}
	public int getSod_mg() {
		return sod_mg;
	}
	public void setSod_mg(int sodMg) {
		this.sod_mg = sodMg;
	}
	public String getGln_country_iso_cd() {
		return gln_country_iso_cd;
	}
	public void setGln_country_iso_cd(String glnCountryIsoCd) {
		this.gln_country_iso_cd = glnCountryIsoCd;
	}
	public String getGln_addr_04() {
		return gln_addr_04;
	}
	public void setGln_addr_04(String glnAddr_04) {
		this.gln_addr_04 = glnAddr_04;
	}
	public int getTot_carb_g() {
		return tot_carb_g;
	}
	public void setTot_carb_g(int totCarbG) {
		this.tot_carb_g = totCarbG;
	}
	public String getGln_addr_02() {
		return gln_addr_02;
	}
	public void setGln_addr_02(String glnAddr_02) {
		this.gln_addr_02 = glnAddr_02;
	}
	public String getOwner_nm() {
		return owner_nm;
	}
	public void setOwner_nm(String ownerNm) {
		this.owner_nm = ownerNm;
	}
	public String getBrand_bsin() {
		return brand_bsin;
	}
	public void setBrand_bsin(String brandBsin) {
		this.brand_bsin = brandBsin;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public String getCountry_iso_cd() {
		return country_iso_cd;
	}
	public void setCountry_iso_cd(String countryIsoCd) {
		this.country_iso_cd = countryIsoCd;
	}
	public String getBrand_nm() {
		return brand_nm;
	}
	public void setBrand_nm(String brandNm) {
		this.brand_nm = brandNm;
	}
	public int getReturn_code() {
		return return_code;
	}
	public void setReturn_code(int returnCode) {
		this.return_code = returnCode;
	}
	public String getBrand_link() {
		return brand_link;
	}
	public void setBrand_link(String brandLink) {
		this.brand_link = brandLink;
	}
	public String getOwner_img() {
		return owner_img;
	}
	public void setOwner_img(String ownerImg) {
		this.owner_img = ownerImg;
	}
	public int getServ_size_ml() {
		return serv_size_ml;
	}
	public void setServ_size_ml(int servSizeMl) {
		this.serv_size_ml = servSizeMl;
	}
	public int getTot_carb_dv() {
		return tot_carb_dv;
	}
	public void setTot_carb_dv(int totCarbDv) {
		this.tot_carb_dv = totCarbDv;
	}
	public String getOwner_wiki_en() {
		return owner_wiki_en;
	}
	public void setOwner_wiki_en(String ownerWikiEn) {
		this.owner_wiki_en = ownerWikiEn;
	}
	public String getBrand_img() {
		return brand_img;
	}
	public void setBrand_img(String brandImg) {
		this.brand_img = brandImg;
	}
	public int getPot_dv() {
		return pot_dv;
	}
	public void setPot_dv(int potDv) {
		this.pot_dv = potDv;
	}
	public int getDiet_fiber_g() {
		return diet_fiber_g;
	}
	public void setDiet_fiber_g(int dietFiberG) {
		this.diet_fiber_g = dietFiberG;
	}
	public int getServ_size_g() {
		return serv_size_g;
	}
	public void setServ_size_g(int servSizeG) {
		this.serv_size_g = servSizeG;
	}
	public int getM_floz() {
		return m_floz;
	}
	public void setM_floz(int mFloz) {
		this.m_floz = mFloz;
	}
	public String getGtin_img() {
		return gtin_img;
	}
	public void setGtin_img(String gtinImg) {
		this.gtin_img = gtinImg;
	}
	public String getGln_addr_postalcode() {
		return gln_addr_postalcode;
	}
	public void setGln_addr_postalcode(String glnAddrPostalcode) {
		this.gln_addr_postalcode = glnAddrPostalcode;
	}
	public int getCalcium() {
		return calcium;
	}
	public void setCalcium(int calcium) {
		this.calcium = calcium;
	}
	public String getOwner_link() {
		return owner_link;
	}
	public void setOwner_link(String ownerLink) {
		this.owner_link = ownerLink;
	}
	public String getGpc_s_cd() {
		return gpc_s_cd;
	}
	public void setGpc_s_cd(String gpcSCd) {
		this.gpc_s_cd = gpcSCd;
	}
	public int getIron() {
		return iron;
	}
	public void setIron(int iron) {
		this.iron = iron;
	}
	public int getVitamin_c() {
		return vitamin_c;
	}
	public void setVitamin_c(int vitaminC) {
		this.vitamin_c = vitaminC;
	}
	public int getSod_dv() {
		return sod_dv;
	}
	public void setSod_dv(int sodDv) {
		this.sod_dv = sodDv;
	}
	public int getSugars_g() {
		return sugars_g;
	}
	public void setSugars_g(int sugarsG) {
		this.sugars_g = sugarsG;
	}
	public String getGln_cd() {
		return gln_cd;
	}
	public void setGln_cd(String glnCd) {
		this.gln_cd = glnCd;
	}
	public int getDiet_fiber_dv() {
		return diet_fiber_dv;
	}
	public void setDiet_fiber_dv(int dietFiberDv) {
		this.diet_fiber_dv = dietFiberDv;
	}

}