package com.fitness.nutrition.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="nutritionCollection")
public class Nutrition{

	@Id
	private String id;
	private String gtin_nm;
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
}