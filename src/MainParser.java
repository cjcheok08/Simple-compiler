import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.python.util.PythonInterpreter;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MainParser {
    public static void main(String[] args) throws IOException {
        try {
            File inputFolder = new File("input");
            String[] fileList = inputFolder.list();
            for (int i = 0; i < fileList.length; i++) {
                CharStream in = CharStreams.fromFileName("input/" + fileList[i]);
                ExprLexer lexer = new ExprLexer((CharStream) in);
                lexer.removeErrorListeners();
                lexer.addErrorListener(new TokenErrorListener());   //Custom error handling during lexical analysis
                CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
                ExprParser parser = new ExprParser((TokenStream) tokens);
                parser.removeErrorListeners();  // Removes the default ConsoleErrorListener
                parser.addErrorListener(new SyntaxErrorListener()); //Custom error handling during parsing

                ParseTree parseTree = parser.prog();
                String str = new PythonPprintVisitor().visit(parseTree);
                String outputName = fileList[i].replace(".cc", ".py");
                FileWriter pythonWriter = new FileWriter("output/" + outputName);
                pythonWriter.write(str);
                pythonWriter.close();
                System.out.println("==========================================");
                System.out.println("Python PrettyPrint Result - " + outputName + ":");
                System.out.println("==========================================");
                System.out.println(str);
                PythonInterpreter pyInterp = new PythonInterpreter();
                pyInterp.exec(str);

                JFrame frame = new JFrame("AST - " + outputName );
                frame.setSize(300, 300);
                frame.setLocation(300 * i, 0);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                DefaultMutableTreeNode progNode = new DefaultMutableTreeNode("prog");
                JTree astTree = new JTree(new DisplayASTVisitor(progNode).visit(parseTree));
                JScrollPane scrollPane = new JScrollPane(astTree);
                frame.add(scrollPane);
                frame.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Program cancelled!");
        }
    }
}
