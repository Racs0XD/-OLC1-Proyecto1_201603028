
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package py1_201603028;

import java_cup.runtime.*;
import py1_201603028.Nodo.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\004\004\000\002\004\003\000\002\007\002" +
    "\000\002\006\010\000\002\005\005\000\002\005\005\000" +
    "\002\005\004\000\002\005\004\000\002\005\004\000\002" +
    "\005\003\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\011\004\001\002\000\004\013\011\001" +
    "\002\000\004\002\000\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\006\012\037\013\011\001" +
    "\002\000\004\020\013\001\002\000\006\012\ufffd\013\ufffd" +
    "\001\002\000\004\021\014\001\002\000\022\004\021\005" +
    "\025\006\023\007\020\010\022\014\016\015\017\016\015" +
    "\001\002\000\024\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010" +
    "\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\001\002\000\024" +
    "\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\014\ufff5\015" +
    "\ufff5\016\ufff5\017\ufff5\001\002\000\024\004\ufff3\005\ufff3" +
    "\006\ufff3\007\ufff3\010\ufff3\014\ufff3\015\ufff3\016\ufff3\017" +
    "\ufff3\001\002\000\022\004\021\005\025\006\023\007\020" +
    "\010\022\014\016\015\017\016\015\001\002\000\022\004" +
    "\021\005\025\006\023\007\020\010\022\014\016\015\017" +
    "\016\015\001\002\000\022\004\021\005\025\006\023\007" +
    "\020\010\022\014\016\015\017\016\015\001\002\000\022" +
    "\004\021\005\025\006\023\007\020\010\022\014\016\015" +
    "\017\016\015\001\002\000\004\017\ufffc\001\002\000\022" +
    "\004\021\005\025\006\023\007\020\010\022\014\016\015" +
    "\017\016\015\001\002\000\024\004\ufff8\005\ufff8\006\ufff8" +
    "\007\ufff8\010\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\001" +
    "\002\000\004\017\030\001\002\000\006\012\ufffb\013\ufffb" +
    "\001\002\000\024\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010" +
    "\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\001\002\000\024" +
    "\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\014\ufff6\015" +
    "\ufff6\016\ufff6\017\ufff6\001\002\000\022\004\021\005\025" +
    "\006\023\007\020\010\022\014\016\015\017\016\015\001" +
    "\002\000\024\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9" +
    "\014\ufff9\015\ufff9\016\ufff9\017\ufff9\001\002\000\022\004" +
    "\021\005\025\006\023\007\020\010\022\014\016\015\017" +
    "\016\015\001\002\000\024\004\ufffa\005\ufffa\006\ufffa\007" +
    "\ufffa\010\ufffa\014\ufffa\015\ufffa\016\ufffa\017\ufffa\001\002" +
    "\000\004\002\uffff\001\002\000\006\012\ufffe\013\ufffe\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\006\002\005\003\004\001\001\000\006\004" +
    "\007\006\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\037\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\023" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\034\001\001\000\004\005\032\001\001" +
    "\000\004\005\031\001\001\000\004\005\030\001\001\000" +
    "\004\007\026\001\001\000\004\005\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\033\001\001\000\002" +
    "\001\001\000\004\005\035\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public static int contID=1;
public static int IDS=1;
public static Nodo Raiz;
private Symbol SError;

public void syntax_error(Symbol SError){
this.SError = SError;
}
public Symbol getSErr(){
return this.SError;
}
public static void graficarArbol(Nodo act, String nombre){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/Arboles/" + nombre + ".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=box]");
            pw.println("concentrate=true");
            pw.println(act.getCodigoInterno());
            pw.println("}");
        } catch (Exception e) {
            System.out.println("error, no se realizo el archivo"+e);
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //para compilar el archivo dot y obtener la imagen
        try {
            //dirección doonde se ecnuentra el compilador de graphviz
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
            //dirección del archivo dot
            String fileInputPath = "src/Arboles/" + nombre + ".dot";
            //dirección donde se creara la magen
            String fileOutputPath = "src/Arboles/" + nombre + ".jpg";
            //tipo de conversón
            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }




/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Inicio ::= Sentencia 
            {
              String RESULT =null;
		
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Sentencia ::= llave_a PrimerB llave_c 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Sentencia",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PrimerB ::= PrimerB ERegular 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // PrimerB ::= ERegular 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$0 ::= 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo valor = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;


              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ERegular ::= id menos mayorq NOTACION_ERegular NT$0 punto_coma 
            {
              Nodo RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Nodo) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Nodo valor = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ERegular",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NOTACION_ERegular ::= pipe NOTACION_ERegular NOTACION_ERegular 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String anulable;
        if(a.getAnulable()=="A" || b.getAnulable()=="A"){
        anulable = "A";
        }else{
        anulable = "N";
        }
        String primero = a.getPrimero() + b.getPrimero();
        String ultimo = a.getUltimo() + b.getUltimo();

        Nodo nuevo_pipe = new Nodo(a,b,"|",parser.contID,0,anulable,primero,ultimo);
        parser.contID++;
        RESULT = nuevo_pipe;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // NOTACION_ERegular ::= punto NOTACION_ERegular NOTACION_ERegular 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String anulable;
        String primero;
        String ultimo;
        if(a.getAnulable()=="A" && b.getAnulable()=="A"){
        anulable="A";
        }else{
        anulable = "N";
        }
        if(a.getAnulable()=="A"){ 
        primero = a.getPrimero()+b.getPrimero();
        }else{
        primero = a.getPrimero();
        }
        if(b.getAnulable()=="A"){
        ultimo = a.getUltimo()+b.getUltimo();
        }else{
        ultimo = b.getUltimo();
        }
        Nodo nuevo_punto = new Nodo(a,b,".",parser.contID,0,anulable,primero,ultimo);
        parser.contID++;
        RESULT = nuevo_punto;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NOTACION_ERegular ::= mas NOTACION_ERegular 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String primero = a.getPrimero();
        String ultimo = a.getUltimo();
        Nodo nuevo_mas = new Nodo(null,a,"+",parser.contID,0,"N",primero,ultimo);
        parser.contID++;
        RESULT = nuevo_mas;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NOTACION_ERegular ::= asterisco NOTACION_ERegular 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String primero = a.getPrimero();
        String ultimo = a.getUltimo();
        Nodo nuevo_asterisco = new Nodo(null,a,"*",parser.contID,0,"A",primero,ultimo);
        parser.contID++;
        RESULT = nuevo_asterisco;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NOTACION_ERegular ::= interrogante NOTACION_ERegular 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String primero = a.getPrimero();
        String ultimo = a.getUltimo();
        Nodo nuevo_interrogante = new Nodo(null,a,"?",parser.contID,0,"A",primero,ultimo);
        parser.contID++;
        RESULT = nuevo_interrogante;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NOTACION_ERegular ::= id_ERegular 
            {
              Nodo RESULT =null;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String valor = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String primero = IDS+",";
        String ultimo = IDS+",";
        Nodo nuevo_id_ERegular = new Nodo(null,null,valor.replace("{","").replace("}",""),parser.contID,parser.IDS,"N",primero,ultimo);
        parser.IDS++;
        parser.contID++;
        RESULT = nuevo_id_ERegular;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NOTACION_ERegular ::= c_Especial 
            {
              Nodo RESULT =null;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String valor = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String primero = IDS+",";
        String ultimo = IDS+",";
        Nodo nuevo_c_Especial = new Nodo(null,null,valor,parser.contID,parser.IDS,"N",primero,ultimo);
        parser.IDS++;
        parser.contID++;
        RESULT = nuevo_c_Especial;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NOTACION_ERegular ::= c_ERegular 
            {
              Nodo RESULT =null;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String valor = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String primero = IDS+",";
        String ultimo = IDS+",";
        Nodo nuevo_c_ERegular = new Nodo(null,null,valor,parser.contID,parser.IDS,"N",primero,ultimo);
        parser.IDS++;
        parser.contID++;
        RESULT = nuevo_c_ERegular;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
