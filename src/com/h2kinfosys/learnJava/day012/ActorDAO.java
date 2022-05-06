package com.h2kinfosys.learnJava.day012;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ActorDAO {

    public ArrayList<Actor> getActors(){
        Connection conn = null;
        ArrayList<Actor> actors = new ArrayList<>();
        try {
            conn = ConnectionUtil.getConnection();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("Select * from Actor");
            Actor actor = null;
            if(rs != null) {
                while (rs.next()) {
                    actor = new Actor();
                    actor.setActorId(rs.getInt("actor_id"));
                    actor.setFirstName(rs.getString("first_name"));
                    actor.setLastName(rs.getString("last_name"));
                    actor.setLastUpdate(rs.getTimestamp("last_update"));
                    actors.add(actor);
                    System.out.println(actor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeConnection(conn);
        }
        return actors;
    }


    public Actor getActor(int actorId){
        Connection conn = null;
        Actor actor = null;
        String query = "Select * from Actor where actor_id = ?";
        try {
            conn = ConnectionUtil.getConnection();
            PreparedStatement pStat = conn.prepareStatement(query);
            pStat.setInt(1,actorId);
            ResultSet rs = pStat.executeQuery();
            if(rs != null) {
                while (rs.next()) {
                    actor = new Actor();
                    actor.setActorId(rs.getInt("actor_id"));
                    actor.setFirstName(rs.getString("first_name"));
                    actor.setLastName(rs.getString("last_name"));
                    actor.setLastUpdate(rs.getTimestamp("last_update"));
                    System.out.println(actor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeConnection(conn);
        }
        return actor;
    }

    public int createActor(Actor actor){
        Connection conn = null;
        int rowsAffected = 0;
        String query = "INSERT INTO actor (first_name, last_name, last_update) VALUES ( ?, ? , CURRENT_TIMESTAMP)";
        try {
            conn = ConnectionUtil.getConnection();
            PreparedStatement pStat = conn.prepareStatement(query);
            pStat.setString(1,actor.getFirstName());
            pStat.setString(2,actor.getLastName());
           // inserts / updates
            rowsAffected = pStat.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionUtil.closeConnection(conn);
        }
        return rowsAffected;
    }

}
