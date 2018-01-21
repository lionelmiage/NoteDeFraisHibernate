/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commentaires;

/**
 *
 * @author Lionel
 */
public class LogControllerCommentaires {
  //GestionNoteFraisDAO g = new GestionNoteFraisDAO();
        //g.Connection();
        /*Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();

        //creer une session
        Session session = sf.openSession();
        session.beginTransaction();
        try {

            //Requete hql
            //String email ="admin";
            //String password = "123";
            Query query = session.createQuery("Select sal from Salarie sal where sal.emailSalarie like :login and sal.mdpSalarie like :pass");
            //test
            //System.out.println(texteEmail.getText().toString());

            query.setParameter("login", texteEmail.getText().toString());

            query.setParameter("pass", texteMdp.getText().toString());

            //exucuter la query
            List<Salarie> resultat = query.list();
            if (resultat.size() == 1) {
                //traitement à faire
                GestionNoteFraisDAO g = new GestionNoteFraisDAO();
                g.ChargerScene("controller/ChoixPrestation.fxml", "SE CONNECTER A L'APPlICATION");
                messageConnection.setText("Vous êtes connecté");
            }
            else{
                //mauvais login
                messageConnection.setText("mdp ou email incorrect");
                System.out.println("mot de passe ou email incorrect");
            }
            //test afficher le contenu du textfield lorsque je valide
            //System.out.println(texteEmail.getText().toString());

            //je recupere le contenu de ma requete dans une liste
            /*for (Salarie s : resultat) {
                //test afficher l'email et le mot de passe par rapport a ma requete
                //System.out.println(s.getEmailSalarie() + ", " + s.getMdpSalarie());
                //System.out.println(resultat.size());
                if (texteEmail.getText().equals(s.getEmailSalarie()) && texteMdp.getText().equals(s.getMdpSalarie())) {
                    // utilisation de la DAO
                    GestionNoteFraisDAO g = new GestionNoteFraisDAO();
                    g.ChargerScene("controller/ChoixPrestation.fxml", "SE CONNECTER A L'APPlICATION");
                    // NouvelleScene n = new NouvelleScene();
                    //n.ChargerScene("controller/ChoixPrestation.fxml", "SE CONNECTER A L'APPlICATION");
                    /*Parent root;
                     //attention il ne faut pas mettre de  "/" devant dans ce cas sinon erreur
                     root = FXMLLoader.load(getClass().getClassLoader().getResource("controller/ChoixPrestation.fxml"));
                     Scene scene;
                     scene = new Scene(root);
                     Stage stage = new Stage();
                     stage.setTitle("SE CONNECTER A L'APPlICATION");
                     stage.setScene(scene);
                     stage.show();
                    System.out.println("ca marche");
                } else {
                    System.out.println("ca marche pas");

                }

            }*/

            //Iterator it = resultat.iterator();
            //if (it.hasNext()){
            //System.out.println(it.next());
            // }   
}
