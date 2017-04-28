package main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ast.*;
import main.brgccf_lfp2Parser.ClassDeclarationContext;
import main.brgccf_lfp2Parser.ExpressionContext;
import main.brgccf_lfp2Parser.GoalContext;
import main.brgccf_lfp2BaseVisitor;
import main.brgccf_lfp2BaseListener;
import main.brgccf_lfp2Lexer;
import main.brgccf_lfp2Listener;
import main.brgccf_lfp2Visitor;

public class ASTBuilder extends brgccf_lfp2BaseVisitor<Object>{
	public ASTBuilder(){}
	
	public Program visitGoal(brgccf_lfp2Parser.GoalContext ctx)
	{
		System.out.println("visited Goal");
		MainClass main = (MainClass) this.visit(ctx.getChild(0));
		ClassDeclList classDecs = new ClassDeclList();
		for(brgccf_lfp2Parser.ClassDeclarationContext classDec1 : ctx.classDeclaration())
		{
			classDecs.addElement((ClassDecl) this.visit(classDec1));
		}
		Program program = new Program(main, classDecs);
		return program;
	}
	
	public MainClass visitMainClass(brgccf_lfp2Parser.MainClassContext ctx)
	{
		System.out.println("Visited main class");
		Identifier id1 = new Identifier(ctx.Identifier(0).getText());
		Identifier id2 = new Identifier(ctx.Identifier(1).getText());
		Statement st = (Statement) this.visit(ctx.statement());
		MainClass main = new MainClass(id1, id2, st);
		return main;
	}
	
	public MethodDecl visitMethodDeclaration(brgccf_lfp2Parser.MethodDeclarationContext ctx)
	{
		Formal f1 = (Formal) this.visit(ctx.formal(0));
		Type type = f1.t;
		Identifier id1 = f1.i;
		FormalList formalList = new FormalList();
		VarDeclList varDecList = new VarDeclList();
		StatementList statementList = new StatementList();
		Exp exp = (Exp) this.visit(ctx.getChild(0));
		for (brgccf_lfp2Parser.FormalContext formal : ctx.formal()) {
			formalList.addElement((Formal) this.visit(formal));
		}
		for (brgccf_lfp2Parser.VarDeclarationContext varDec : ctx.varDeclaration()) {
			varDecList.addElement((VarDecl) this.visit(varDec));
		}
		for (brgccf_lfp2Parser.StatementContext st : ctx.statement()) {
			statementList.addElement((Statement) this.visit(st));
		}
		MethodDecl methoDecl = new MethodDecl(type, id1, formalList, varDecList, statementList, exp);
		return methoDecl;
	}
	
	
	public Statement visitStatement(brgccf_lfp2Parser.StatementContext ctx) {
		System.out.println("Visited Statement");
		Statement st = null;
		if (ctx.getChild(0).getText().equals("{")) {
			System.out.println("{ **Statement** }");
			StatementList sts = new StatementList();
			for (brgccf_lfp2Parser.StatementContext statment : ctx.statement()) {
				sts.addElement((Statement) this.visit(statment));
			}
			st = new Block(sts);

		} else if (ctx.getChild(0).getText().equals("if")) {
			System.out.println("if");
			Exp e1 = (Exp) this.visit(ctx.getChild(0));
			Statement s1 = (Statement) this.visit(ctx.statement(0));
			Statement s2 = (Statement) this.visit(ctx.statement(1));
			st = new If(e1, s1, s2);

		} else if (ctx.getChild(0).getText().equals("while")) {
			System.out.println("Rule 3");
			Exp e1 = (Exp) this.visit(ctx.getChild(0));
			Statement s1 = (Statement) this.visit(ctx.statement(0));
			st = new While(e1, s1);

		} else if (ctx.getChild(0).getText().equals("System.out.println")) {
			System.out.println("Rule 4");
			st = new Print((Exp) this.visit(ctx.getChild(0)));

		} else if (ctx.getChild(1).getText().equals("=")) {
			System.out.println("Rule 5");
			Identifier id1 = (Identifier) this.visit(ctx.Identifier());
			Exp e1 =  (Exp) this.visit(ctx.getChild(0));
			st = new Assign(id1, e1);

		} else {
			System.out.println("Rule 6");
			Identifier id1 = (Identifier) this.visit(ctx.Identifier());
			Exp e1 =  (Exp) this.visit(ctx.getChild(0));
			Exp e2 =  (Exp) this.visit(ctx.getChild(1));
			st = new ArrayAssign(id1, e1, e2);
		}

		return st;
	}
	
	public Type visitType(brgccf_lfp2Parser.TypeContext ctx) {
		Type type = null;
		if (ctx.getChild(0).getText().equals("int")) {
			if(ctx.getChildCount() > 1){
				type = new IntArrayType();
			}else{
				type = new IntegerType();
			}
		} else if (ctx.getChild(0).getText().equals("boolean")) {
			type = new BooleanType();
		} else {
			type = new IdentifierType(ctx.getText());
		}
		return type;
	}
	
	public VarDecl visitVarDeclaration(brgccf_lfp2Parser.VarDeclarationContext ctx) {
		Formal formal = (Formal) this.visit(ctx.formal());
		Type type = formal.t;
		Identifier id = formal.i;
		VarDecl varDecl = new VarDecl(type, id);
		return varDecl;
	}
	
	public Identifier visitIdentifier(brgccf_lfp2Parser.FormalContext ctx) {
		System.out.println("Identificador" + ctx.getText());
		Identifier identifier = new Identifier(ctx.getText());
		return identifier;
	}
	
	public Object visitExpr(brgccf_lfp2Parser.ExpressionContext ctx) {
		System.out.println("Expr");
		Exp exp = null;
		if (ctx.getChild(0).getClass().equals(brgccf_lfp2Parser.ExpressionContext.class)) {
			if (ctx.getChild(1).getText().equals(".")) {
				if (ctx.getChild(2).getText().equals("length")) {
					System.out.println("expr '.' 'length'");
					exp = new ArrayLength((Exp) this.visit(ctx.getChild(0)));
				} else {
					System.out.println("expr . identifier()");

					List<brgccf_lfp2Parser.ExpressionContext> expsContext = (List<ExpressionContext>) ctx.getChild(0);
					List<Exp> exps = new ArrayList<Exp>();
					for (brgccf_lfp2Parser.ExpressionContext exprContext : expsContext) {
						exps.add((Exp) this.visit(exprContext));
					}
					Exp first = exps.get(0);
					exps.remove(0);
					ExpList explist = new ExpList();
					for (Exp exp2 : exps) {
						explist.addElement(exp2);
					}
					exp = new Call(first, new Identifier(ctx.Identifier().getText()), explist);
				}
			} else if (ctx.getChild(1).getText().equals("[")) {
				Exp e1 = (Exp) this.visit(ctx.getChild(0));
				Exp e2 = (Exp) this.visit(ctx.getChild(1));
				exp = new ArrayLookup(e1, e2);
			} else {
				Exp e1 = (Exp) this.visit(ctx.getChild(0));
				Exp e2 = (Exp) this.visit(ctx.getChild(1));

				switch (ctx.getText()) {
				case "&&":
					System.out.println("expr " + ctx.getText());
					exp = new And(e1, e2);
					break;
				case "<":
					System.out.println("expr " + ctx.getText());
					exp = new LessThan(e1, e2);
					break;
				case "+":
					System.out.println("expr " + ctx.getText());
					exp = new Plus(e1, e2);
					break;
				case "-":
					System.out.println("expr " + ctx.getText());
					exp = new Minus(e1, e2);
					break;
				case "*":
					System.out.println("expr " + ctx.getText());
					;
					exp = new Times(e1, e2);
					break;
				}
			}
		} else if (ctx.INTEGER_LITERAL() != null) {
			exp = new IntegerLiteral(Integer.parseInt(ctx.INTEGER_LITERAL().getText()));
		} else if (ctx.Identifier() != null) {
			System.out.println("identifier");
			exp = new IdentifierExp(ctx.Identifier().getText());
		} else if (ctx.getChild(0).getText().equals("new")) {
			if (ctx.getChild(1).getText().equals("int")) {
				System.out.println("'new''int''['expr']'");
				exp = new NewArray((Exp) this.visit(ctx.getChild(0)));
			} else {
				System.out.println("'new' identifier '('')'");
				exp = new NewObject(new Identifier(ctx.Identifier().getText()));
			}
		} else if (ctx.getChild(0).getText().equals("!")) {
			System.out.println("'!' expr");
			exp = new Not((Exp) this.visit(ctx.getChild(0)));
		} else if (ctx.getChild(0).getText().equals("(")) {
			System.out.println("'(' expr ')'");
			exp = (Exp) this.visit(ctx.getChild(0));
		} else if (ctx.getText().equals("true")) {
			System.out.println("true");
			exp = new True();
		} else if (ctx.getText().equals("false")) {
			System.out.println("false");
			exp = new False();
		} else if (ctx.getText().equals("this")) {
			System.out.println("this");
			exp = new This();
		}
		return exp;
	}
	
	public ClassDecl visitClassDeclaration(brgccf_lfp2Parser.ClassDeclarationContext ctx) {
			
			Identifier id1 = (Identifier) this.visit(ctx.Identifier(0));
			Identifier id2 = null;
			if (ctx.Identifier().size() > 1) {
				id2 = (Identifier) this.visit(ctx.Identifier(1));
			}
			VarDeclList varDecs = new VarDeclList();
			MethodDeclList metDecs = new MethodDeclList();
			for (brgccf_lfp2Parser.VarDeclarationContext varDec : ctx.varDeclaration()) {
				varDecs.addElement((VarDecl) this.visit(varDec));
			}
			for (brgccf_lfp2Parser.MethodDeclarationContext metDec : ctx.methodDeclaration()) {
				metDecs.addElement((MethodDecl) this.visit(metDec));
			}
			ClassDecl classDecl = null;
			if(id2 != null){
				classDecl = new ClassDeclExtends(id1, id2, varDecs, metDecs);
			}else{
				classDecl = new ClassDeclSimple(id1, varDecs, metDecs);
			}
			
			return classDecl;
		}
	
	public Formal visitFormal(brgccf_lfp2Parser.FormalContext ctx) {
		Type type = (Type) this.visit(ctx.type());
		Identifier id1 = (Identifier) this.visit(ctx.Identifier());
		Formal formal = new Formal(type, id1);
		return formal;
	}
	




	
	
	
	
}
