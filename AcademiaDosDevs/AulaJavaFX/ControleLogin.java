package AulaJavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControleLogin {

    @FXML
    private Button BotaoEntrar;

    @FXML
    private TextField CampoSenha;

    @FXML
    private TextField CampoUsuario;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = CampoUsuario.getText();
        String senha = CampoSenha.getText();

        if(usuario.equals("Augusto") && senha.equals("123")) {
            System.out.println("Bem vindo Augusto");
        } else {
            System.out.println("Usuario ou senha errado");
        }
    }

}
