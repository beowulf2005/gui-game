package org.gui.game.engine;

public class Game {
    
    private Context context;
    
    public Game(Context context) {
        this.context = context;
    }
    
    public Context play() {
        Event e = new Event();
        while (e != null) {
            for (Player p : context.getPlayers()) {
                e = p.act(context, e);
            }
        }
        return context;
    }
    
}
