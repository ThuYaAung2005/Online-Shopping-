package coder.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coder.models.Product;

public class ProductDAO {
	
	public List<Product> getAllProductByCat(Connection con,int catId){
		List<Product> products= new ArrayList<Product>();
		Product product= new Product();
		PreparedStatement ps=null;
		String query="SELECT * FROM products WHERE cat_id=?";
		ResultSet resultSet=null;
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, catId);
			resultSet=ps.executeQuery();
			while(resultSet.next()) {
				product.setId(resultSet.getInt("id"));
				product.setCat_id(resultSet.getInt("cat_id"));
				product.setPrice(resultSet.getInt("price"));
				product.setName(resultSet.getString("name"));
				product.setImage(resultSet.getString("image"));
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return products;
	}
	
}
