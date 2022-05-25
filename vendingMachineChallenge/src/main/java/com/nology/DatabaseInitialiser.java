package com.nology;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DatabaseInitialiser {

    public void initialiseDatabase() {

            createItem("1", "Snickers", Categories.CHOCOLATE_BARS, 0.58);
            createItem("2", "Cream egg", Categories.CHOCOLATE_BARS, 0.40 );
            createItem("3", "Paprika crisps", Categories.CRISPS, 0.66 );
            createItem("4", "Cheese and onion crisps", Categories.CRISPS, 0.55 );
            createItem("5", "Monster Ultra Black", Categories.DRINK, 1.70);
            createItem("6", "PepsiMax", Categories.DRINK, 0.89);
            createItem("7", "Brunch Bar", Categories.CEREAL_BARS, 0.40);
            createItem("8", "Frosties Bar", Categories.CEREAL_BARS, 0.39);


    }

    public abstract void createItem(String id, String name, Categories category, double price);

    PreparedStatementSetup setup = new PreparedStatementSetup() {
        @Override
        public void beforeExecution(PreparedStatement statement) throws SQLException {
            statement.setInt(1, id);
            statement.setString(2, name );
            statement.setString(3, category );
            statement.setDouble(5, price.toString() );
        }
    };


}
