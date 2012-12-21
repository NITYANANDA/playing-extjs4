package br.com.ipd.thinkcat.thinkcatweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Felipe Pierin <flombardi@indracompany.com>
 * 
 */
public class AuthenticationController extends HttpServlet {

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
		resp.setStatus(HttpServletResponse.SC_ACCEPTED);
	}

}
