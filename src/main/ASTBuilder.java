package main;
import java.util.Iterator;
import java.util.List;
import ast.*;
import main.brgccf_lfp2Parser.ClassDeclarationContext;
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
	/*
	public MethodDecl visitMethodDeclaration(brgccf_lfp2Parser.MethodDeclarationContext ctx)
	{
		Formal f1 = (Formal) this.visit(ctx.formal(0));
		Type type = f1.t;
		Identifier id1 = f1.i;
		FormalList formalList = new FormalList();
		VarDeclList varDecList = new VarDeclList();
		StatementList statementList = new StatementList();
		Exp exp = (Exp) this.visit(ctx.expr());
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
			Exp e1 = (Exp) this.visit(ctx.expr(0));
			Statement s1 = (Statement) this.visit(ctx.statement(0));
			Statement s2 = (Statement) this.visit(ctx.statement(1));
			st = new If(e1, s1, s2);

		} else if (ctx.getChild(0).getText().equals("while")) {
			System.out.println("Rule 3");
			Exp e1 = (Exp) this.visit(ctx.expr(0));
			Statement s1 = (Statement) this.visit(ctx.statement(0));
			st = new While(e1, s1);

		} else if (ctx.getChild(0).getText().equals("System.out.println")) {
			System.out.println("Rule 4");
			st = new Print((Exp) this.visit(ctx.expr(0)));

		} else if (ctx.getChild(1).getText().equals("=")) {
			System.out.println("Rule 5");
			Identifier id1 = (Identifier) this.visit(ctx.Identifier());
			Exp e1 =  (Exp) this.visit(ctx.expr(0));
			st = new Assign(id1, e1);

		} else {
			System.out.println("Rule 6");
			Identifier id1 = (Identifier) this.visit(ctx.Identifier());
			Exp e1 =  (Exp) this.visit(ctx.expr(0));
			Exp e2 =  (Exp) this.visit(ctx.expr(1));
			st = new ArrayAssign(id1, e1, e2);
		}

		return st;
	}*/

	
	
	
	
}
