package Util;
import com.jsp.CatDAO;
import model.cat;

import java.sql.Date;

public class MainApp {
    public static void main(String[] args) {
        CatDAO catDAO = new CatDAO();

        // Create a cat object
        cat myCat = new cat();
        myCat.setName("Fluffy");
        myCat.setDob(new Date(System.currentTimeMillis()));
        myCat.setSex(true);

        // Save the cat
        catDAO.saveCat(myCat);

        // Retrieve the cat by ID
        cat retrievedCat = catDAO.getCatById(myCat.getId());

        // Print retrieved cat details
        System.out.println("Retrieved Cat: ID=" + retrievedCat.getId() +
                ", Name=" + retrievedCat.getName() +
                ", DOB=" + retrievedCat.getDob() +
                ", Sex=" + retrievedCat.getSex());
    }
}
