public class ErrorVisitor extends ExprBaseVisitor<Void>{
    // HONESTLY, I CAN JUST CATCH THE ERROR WHILE PRETTY PRINTING
    // I'LL DO IN PRETTY PRINT FIRST B4 DOING ERROR HANDLING HERE
    @Override
    public Void visitProg(ExprParser.ProgContext ctx) {
        String str = "";
        for (int i = 0; i < ctx.stat().size(); i++) {
            str += this.visit(ctx.stat().get(i)) + "\n";
        }

        return null;
    }

}
