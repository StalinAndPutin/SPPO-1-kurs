package org.example.Moves.Pichu;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Facade extends SpecialMove {
    public Facade(double pow, double acc) {
        super( Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        String[] pie = this.getClass().toString().split("\\.");
        return "Атакует с помощью  " + pie[pie.length - 1];
    }
}
