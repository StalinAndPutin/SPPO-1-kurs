package org.example.Moves.Pichu.Pikachu.Raichu;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhip extends SpecialMove {
    public TailWhip(double pow, double acc) {
        super( Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        String[] pie = this.getClass().toString().split("\\.");
        return "Атакует с помощью  " + pie[pie.length - 1];
    }
}
