/*package com.compasso.alura.escola.academico.infra.indicacao;

import com.compasso.alura.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import com.compasso.alura.escola.academico.dominio.aluno.Aluno;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("seuemail@gmail.com",
                                "suasenha123");
                    }
                });

        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("seuemail@gmail.com"));
            //Remetente

            Address[] toUser = InternetAddress.parse(indicado.getEmail());

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("Enviando para aluno indicado");//Assunto
            message.setText("Enviando mensagem para novo " + indicado + " que foi indicado");
            Transport.send(message);

            System.out.println("Feito!!!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}*/