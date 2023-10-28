import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Aquí puedes realizar la lógica de autenticación
        // Por ejemplo, verificar el usuario y la contraseña en una base de datos

        if (username.equals("usuario" ) && password.equals("contrasena")) {
            response.sendRedirect("bienvenido.html"); // Redirige a una página de bienvenida
        } else {
            response.sendRedirect("error.html"); // Redirige a una página de error de inicio de sesión
        }
    }
}