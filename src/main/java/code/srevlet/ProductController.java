package code.srevlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import coder.daos.CategoryDAO;
import coder.daos.ProductDAO;
import coder.models.Product;
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource ds;
	public ProductController() {
		super();
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			InitialContext intiContext = new InitialContext();
			Context env = (Context) intiContext.lookup("java:comp/env");
			ds = (DataSource) env.lookup("jdbc/TestDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// List<Category> categories =new ArrayList<>();
		CategoryDAO catdao = new CategoryDAO();
		ProductDAO productDao = new ProductDAO();
		Connection con = null;
		PrintWriter pw = response.getWriter();
		try {
			con = ds.getConnection();

		} catch (SQLException e) {
			pw.write("DB Connection Error");
			pw.write(e.getMessage());
		}
		String cat_id = request.getParameter("cat_id");

		if (cat_id == null) {
			cat_id = "1";
		}
		List<Product> products = productDao.getAllProductByCat(con, Integer.parseInt(cat_id));
		request.setAttribute("products", products);
		request.getRequestDispatcher("/product.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
