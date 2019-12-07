package edu.neu.coe.info6205.life.GA;

import edu.neu.coe.info6205.life.base.Game;
import edu.neu.coe.info6205.life.base.Point;
import io.jenetics.*;
import io.jenetics.engine.Codecs;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionStatistics;
import io.jenetics.engine.Limits;
import io.jenetics.util.IntRange;

import java.util.ArrayList;
import java.util.List;

import static io.jenetics.engine.EvolutionResult.toBestPhenotype;




public class GA {



    public static Long eval(int[][] gt){

        Game game = new Game();
        List<Point> points = new ArrayList<>();
        for(int i=0; i < gt.length; i++)
            for(int j=0; j < gt[i].length; j++){
//                System.out.println(gt[i][j]);
                if (gt[i][j] == 1){
                    points.add(new Point(i,j));
                }
            }
        return Game.run(0L, points, 10).generation;

    }

    public void runGA(){
//        final Engine<IntegerGene, Long> engine = Engine.builder(GA::eval, Codecs.ofMatrix(IntRange.of(0, 1), 3, 3)).optimize(Optimize.MAXIMUM).populationSize(500).alterers(
//                new Mutator<>(0.2),
//                new MeanAlterer<>(0.35)).build();
//
//        final EvolutionStatistics<Integer, ?> statistics = EvolutionStatistics.ofNumber();
//
//        final Phenotype<IntegerGene, Long> result = engine.stream().limit(Limits.bySteadyFitness(7)).limit(10).collect(toBestPhenotype());
//
//        System.out.println(result);
    }
    public static void main(String[] args) {
        final Engine<IntegerGene, Long> engine = Engine.builder(GA::eval, Codecs.ofMatrix(IntRange.of(0, 1), 3, 3)).optimize(Optimize.MAXIMUM).populationSize(500).alterers(
                new Mutator<>(0.2),
                new MeanAlterer<>(0.35)).build();

        final EvolutionStatistics<Integer, ?> statistics = EvolutionStatistics.ofNumber();

        final Phenotype<IntegerGene, Long> result = engine.stream().limit(Limits.bySteadyFitness(7)).limit(10).collect(toBestPhenotype());

        System.out.println(result);
    }
}