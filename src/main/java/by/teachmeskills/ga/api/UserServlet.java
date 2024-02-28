package by.teachmeskills.ga.api;

import by.teachmeskills.ga.entity.User;
import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends javax.servlet.http.HttpServlet {
   // @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получение JSON данных из тела запроса
        BufferedReader reader = request.getReader();
        StringBuilder jsonBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBody.append(line);
        }

        // Преобразование JSON в объект User
     //   ObjectMapper objectMapper = new ObjectMapper();
     //   User user = objectMapper.readValue(jsonBody.toString(), User.class);

        // Теперь у вас есть объект User, который вы можете использовать
     //   System.out.println("Received user: " + user);

        // Дальнейшая обработка, например, сохранение в базу данных или выполнение других действий
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        super.doGet(req, resp);
    }
}
