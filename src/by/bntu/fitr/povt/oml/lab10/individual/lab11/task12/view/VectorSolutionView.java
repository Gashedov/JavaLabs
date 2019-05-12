package by.bntu.fitr.OML.javalabs.lab11.view;

import by.bntu.fitr.OML.javalabs.lab11.model.logic.VectorSolution;
import by.bntu.fitr.OML.javalabs.lab11.util.Randomizer;

import static by.bntu.fitr.OML.javalabs.lab11.util.Printer.print;

public class VectorSolutionView {
    public static void show (){
        print("*****ADDITING AND MULTIPLICATION OF ELEMENTS IN ARRAY******\n");
        print(VectorSolution.calculation(Randomizer.array()));
    }
}
