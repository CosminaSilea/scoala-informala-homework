package jdbc.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Booking {


    public static void main(String[] args) {
        //insertAccomodation(5, "apartment", "Double", 4, "description for room with id 5");

       // insertRoomFair(114, 20.70, "winter");

        //insertAccomodationFairRelation(224, 5, 114 );

        selectRoomPrice();

    }

    public static void insertAccomodation(Integer id, String type, String bedType, Integer maxGuests, String description) {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "Root");
             PreparedStatement ps = conn.prepareStatement("insert into accomodation (id, type, bed_type, max_guests, description) values (?,?,?,?,?)")) {

            ps.setInt(1, id);
            ps.setString(2, type);
            ps.setString(3, bedType);
            ps.setInt(4, maxGuests);
            ps.setString(5, description);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void insertRoomFair(Integer id, Double value, String season) {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "Root");
             PreparedStatement ps = conn.prepareStatement("insert into room_fair (id, value, season) values (?,?,?)")) {

            ps.setInt(1, id);
            ps.setDouble(2, value);
            ps.setString(3, season);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    public static void insertAccomodationFairRelation(Integer id, Integer idAccomodation, Integer idRoomFair) {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "Root");
             PreparedStatement ps = conn.prepareStatement("insert into accomodation_fair_relation (id, id_accomodation, id_room_fair) values (?,?,?)")) {

            ps.setInt(1, id);
            ps.setInt(2, idAccomodation);
            ps.setInt(3, idRoomFair);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    // using join, in MySql I created another table name result, i created the table like this:
//    create table result as
//            (select accomodation.id, accomodation.type, accomodation.bed_type, accomodation.max_guests, accomodation_fair_relation.id_room_fair
//                    from accomodation
//                     inner join accomodation_fair_relation
//                     on accomodation.id = accomodation_fair_relation.id_accomodation);

    /**
     * in the method selectRoomPrice i create an inner join of the table result and the table room_fair
     */
    public static void selectRoomPrice(){
        final String format = "%20s%30s%30s%20s%20s\n";
        try (Connection conn = Connector.connect("mysql", "localhost", "3306","booking", "root", "Root");
             PreparedStatement ps= conn.prepareStatement("select result.id, result.type, result.bed_type, result.max_guests, room_fair.value from result " +
                     "inner join room_fair on result.id_room_fair = room_fair.id");
             ResultSet result= ps.executeQuery())
        {
            boolean hasNext = result.next();
            if(hasNext) {
                System.out.format(format, "RoomID", "RoomType", "BedType", "MaxGuest", "Price");
                do {
                    System.out.format(format, result.getString("id"), result.getString("type"), result.getString("bed_type"), result.getString("max_guests"),result.getString("value" ));
                } while (result.next());
            }else{
                System.out.println("No result");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());

        }
    }
}

