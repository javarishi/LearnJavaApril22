package com.h2kinfosys.learnJava.day012;

public class TestJDBCConnection {

    public static void main(String[] args) {
        ActorDAO actorDAO = new ActorDAO();
        //actorDAO.getActors();
        Actor actor = actorDAO.getActor(101);
        actor.setLastName("DAVID");
        int num = actorDAO.createActor(actor);
        System.out.println("Inserted ?? :" + num);
    }
}
