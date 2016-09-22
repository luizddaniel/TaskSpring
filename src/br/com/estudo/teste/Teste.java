package br.com.estudo.teste;

import javax.faces.event.ActionEvent;

import org.hibernate.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.estudo.control.HibernateUtil;
import br.com.estudo.control.TaskBean;
import br.com.estudo.control.UserBean;
import br.com.estudo.model.TaskImp;
import br.com.estudo.model.UserImp;

public class Teste {

	private static ActionEvent actionEvent;
	
	public static void main(String[] args) {
		
		Session session =  HibernateUtil.getSessionFactory().openSession();
	
		
		UserImp taskImp = new UserImp();
		//UserBean taskBean = new UserBean();
		
		taskImp.setLogin("luizddaniel");
		taskImp.setEmail("luizddaniel@hotmail.com");
		taskImp.setNome("Luiz");
		taskImp.setPassword("luiz2850");
 
		//taskBean.salvar();		
		//realizando operação para salvar no banco
		session.beginTransaction();
		
		
		
		session.save(taskImp);
		session.getTransaction().commit();
		session.close();
	}

}
