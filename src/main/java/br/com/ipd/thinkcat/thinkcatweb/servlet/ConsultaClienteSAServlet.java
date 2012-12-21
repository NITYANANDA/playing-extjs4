package br.com.ipd.thinkcat.thinkcatweb.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Felipe Pierin <flombardi@indracompany.com>
 * 
 */
public class ConsultaClienteSAServlet extends HttpServlet {

	private static final long serialVersionUID = 3945510369210862544L;

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		extracted(resp);
	}

	@Override
	protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		extracted(resp);
	}

	private void extracted(final HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		final InputStream resourceAsStream = ConsultaClienteSAServlet.class.getResourceAsStream("/tcjson.json");
		final BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream));
		final StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		resourceAsStream.close();
		final PrintWriter writer = resp.getWriter();
		writer.print(sb.toString());
		writer.flush();
	}

}
