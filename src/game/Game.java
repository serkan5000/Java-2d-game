/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Game {
    public final static int WIDTH = 800, HEIGHT = 600;
    private String gameName = "FirstGame";
    private Canvas game = new Canvas();
    private Input input;
    
    //stores all updateable and renderable game objects
    private ArrayList<Updateable> updateables = new ArrayList<>();
    private ArrayList<Renderable> renderables = new ArrayList<>();
    
    public void start() {
        //init windows
        Dimension gameSize = new Dimension(Game.WIDTH,Game.HEIGHT);
        JFrame gameWindow = new JFrame(gameName);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(gameSize);
        gameWindow.setResizable(false);
        gameWindow.setVisible(true);
        
        //set all to make sure it doesnt change?
        game.setSize(gameSize);
        game.setMaximumSize(gameSize);
        game.setMinimumSize(gameSize);
        game.setPreferredSize(gameSize);
        
        gameWindow.add(game);
        gameWindow.setLocationRelativeTo(null);//center the window
        
        //init input
        input = new Input();
        
        //game loop
        boolean running = true;
        while(running){
            
        }
        //game end
    }
    
    private void update() {
        for(Updateable u : updateables) {
            u.update(input);
        }
    }
    
    private void render(float interpolation){
        for(Renderable r : renderables){
            r.render(g2d, interpolation);
        }
    }
}
