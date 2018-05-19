/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.model;

import java.awt.Point;


/**
 *
 * @author MMG
 */
public enum Actor {
    
    JohnSmith("John Smith", "He is the best friend of the main character", new Point(1, 1)),
    MaryJones("Mary Jones", "She is the sister of the main character", new Point(0, 1)),
    AlyssaAllen("Alyssa Allen", "Mary Jones best friend", new Point(1, 2)),
    BillCooper("Bill Cooper", "He is the brother of the main character", new Point(2, 3)),
    EarlEbony("Earl Ebony", "He is cousin of the main character", new Point(1, 2)),
    GaryRoberts("Gary Roberts", "He is a neighbor of the main character", new Point(1, 1)),
    IvyFoster("Ivy Foster", "She is Gary Roberts wife", new Point (1, 1));
    
    private String name; 
    private String description;
    private Point coordinates;
    
    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description="
                + description + ", coordinates=" + coordinates + '}';
    }
    
    
    
}
