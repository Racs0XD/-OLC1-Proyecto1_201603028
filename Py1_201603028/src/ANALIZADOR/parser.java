
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package ANALIZADOR;

import java_cup.runtime.*;
import py1_201603028.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
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
    "\000\025\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\004\004\000\002\004\003\000\002\004\004" +
    "\000\002\004\003\000\002\004\004\000\002\004\003\000" +
    "\002\005\011\000\002\006\006\000\002\011\002\000\002" +
    "\010\010\000\002\007\005\000\002\007\005\000\002\007" +
    "\004\000\002\007\004\000\002\007\004\000\002\007\003" +
    "\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\014\004\001\002\000\006\004\014\016" +
    "\015\001\002\000\004\002\000\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\010\004\ufff9\015" +
    "\ufff9\016\ufff9\001\002\000\010\004\ufffd\015\ufffd\016\ufffd" +
    "\001\002\000\010\004\014\015\055\016\015\001\002\000" +
    "\010\004\ufffb\015\ufffb\016\ufffb\001\002\000\004\005\045" +
    "\001\002\000\006\005\016\023\017\001\002\000\004\025" +
    "\043\001\002\000\004\024\020\001\002\000\022\006\025" +
    "\007\031\010\027\011\024\012\026\017\022\020\023\021" +
    "\021\001\002\000\024\006\uffee\007\uffee\010\uffee\011\uffee" +
    "\012\uffee\017\uffee\020\uffee\021\uffee\022\uffee\001\002\000" +
    "\024\006\uffef\007\uffef\010\uffef\011\uffef\012\uffef\017\uffef" +
    "\020\uffef\021\uffef\022\uffef\001\002\000\024\006\uffed\007" +
    "\uffed\010\uffed\011\uffed\012\uffed\017\uffed\020\uffed\021\uffed" +
    "\022\uffed\001\002\000\022\006\025\007\031\010\027\011" +
    "\024\012\026\017\022\020\023\021\021\001\002\000\022" +
    "\006\025\007\031\010\027\011\024\012\026\017\022\020" +
    "\023\021\021\001\002\000\022\006\025\007\031\010\027" +
    "\011\024\012\026\017\022\020\023\021\021\001\002\000" +
    "\022\006\025\007\031\010\027\011\024\012\026\017\022" +
    "\020\023\021\021\001\002\000\004\022\ufff6\001\002\000" +
    "\022\006\025\007\031\010\027\011\024\012\026\017\022" +
    "\020\023\021\021\001\002\000\024\006\ufff2\007\ufff2\010" +
    "\ufff2\011\ufff2\012\ufff2\017\ufff2\020\ufff2\021\ufff2\022\ufff2" +
    "\001\002\000\004\022\034\001\002\000\010\004\ufff5\015" +
    "\ufff5\016\ufff5\001\002\000\024\006\ufff1\007\ufff1\010\ufff1" +
    "\011\ufff1\012\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\001" +
    "\002\000\024\006\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0" +
    "\017\ufff0\020\ufff0\021\ufff0\022\ufff0\001\002\000\022\006" +
    "\025\007\031\010\027\011\024\012\026\017\022\020\023" +
    "\021\021\001\002\000\024\006\ufff3\007\ufff3\010\ufff3\011" +
    "\ufff3\012\ufff3\017\ufff3\020\ufff3\021\ufff3\022\ufff3\001\002" +
    "\000\022\006\025\007\031\010\027\011\024\012\026\017" +
    "\022\020\023\021\021\001\002\000\024\006\ufff4\007\ufff4" +
    "\010\ufff4\011\ufff4\012\ufff4\017\ufff4\020\ufff4\021\ufff4\022" +
    "\ufff4\001\002\000\004\022\044\001\002\000\010\004\ufff7" +
    "\015\ufff7\016\ufff7\001\002\000\004\016\046\001\002\000" +
    "\004\023\047\001\002\000\004\024\050\001\002\000\004" +
    "\013\051\001\002\000\004\022\052\001\002\000\010\004" +
    "\ufff8\015\ufff8\016\ufff8\001\002\000\010\004\ufffa\015\ufffa" +
    "\016\ufffa\001\002\000\010\004\ufffe\015\ufffe\016\ufffe\001" +
    "\002\000\004\002\uffff\001\002\000\010\004\ufffc\015\ufffc" +
    "\016\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\006\002\005\003\004\001\001\000\012\004" +
    "\011\005\010\006\007\010\012\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\005\053\006\052\010\055\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\027\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\040\001\001\000\004\007\036\001\001\000\004" +
    "\007\035\001\001\000\004\007\034\001\001\000\004\011" +
    "\032\001\001\000\004\007\031\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\037\001\001\000\002\001\001" +
    "\000\004\007\041\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

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
public static ArrayList<ArrayList<Object>> Tabla_Sig = new ArrayList<>();

public static void graficarArbol(Nodo act, String nombre){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/ARBOLES_201603028/" + nombre + ".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=box]");
            pw.println("concentrate=true");
            pw.println(act.getCodigoInterno());            
            pw.println("}");
            act.getCodigo();   

            String nombreLista = nombre;
            ArrayList<SIGUIENTES> nuevaLista = new ArrayList<>();
            for (SIGUIENTES hoja : act.getL()) {
                nuevaLista.add(hoja);
            }
            ArrayList<Object> listaConNombre = new ArrayList<>();
            listaConNombre.add(nombreLista);
            listaConNombre.add(nuevaLista);

            boolean listaExiste = false;
            for (ArrayList<Object> lista : Tabla_Sig) {
                if (lista.get(0).equals(nombreLista)) {
                    lista.set(1, nuevaLista); // Actualizar la lista existente con los nuevos datos
                    listaExiste = true;
                    break;
                }
            }

            if (!listaExiste) {
                Tabla_Sig.add(listaConNombre); // Agregar una nueva lista con nombre
            }

            act.clearL();

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
            String fileInputPath = "src/ARBOLES_201603028/" + nombre + ".dot";
            //dirección donde se creara la magen
            String fileOutputPath = "src/ARBOLES_201603028/" + nombre + ".jpg";
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
private Symbol SError;

public void syntax_error(Symbol SError){
this.SError = SError;
}
public Symbol getSErr(){
return this.SError;
}
public static ArrayList<String> crearListaConNombre(String nombreLista) {
    ArrayList<String> nuevaLista = new ArrayList<>();
    nuevaLista.add(nombreLista); // Agregamos el nombre de la lista como primer elemento
    return nuevaLista;
}

public static void Siguientes(){
Reportes rep = new Reportes();
   rep.Graficar_Tabla_Sig(Tabla_Sig);

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
          case 3: // PrimerB ::= PrimerB Conjunto 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // PrimerB ::= Conjunto 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // PrimerB ::= PrimerB ERegular 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // PrimerB ::= ERegular 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // PrimerB ::= PrimerB Prueba_E 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // PrimerB ::= Prueba_E 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PrimerB",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Conjunto ::= reservada dos_puntos id menos mayorq conj punto_coma 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Conjunto",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Prueba_E ::= id dos_puntos E_Prueba punto_coma 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Prueba_E",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$0 ::= 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo valor = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

        String primero = IDS+"";
        String ultimo = IDS+"";
        String prime;
        String ulti;
        Nodo nuevo_final = new Nodo(null,null,"#",parser.contID,parser.IDS,"N",primero,ultimo);
        parser.contID++;
        if(valor.getAnulable()=="A"){
            prime=valor.getPrimero()+ultimo;
        }else{
            prime=valor.getPrimero();
        }
        ulti=nuevo_final.getUltimo();
        Nodo nueva_raiz = new Nodo(valor,nuevo_final,".",parser.contID,0,"N",primero,ultimo);
        parser.Raiz=nueva_raiz;
        graficarArbol(nueva_raiz,a);
        IDS=1;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ERegular ::= id menos mayorq NOTACION_ERegular NT$0 punto_coma 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ERegular",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NOTACION_ERegular ::= pipe NOTACION_ERegular NOTACION_ERegular 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NOTACION_ERegular ::= punto NOTACION_ERegular NOTACION_ERegular 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NOTACION_ERegular ::= mas NOTACION_ERegular 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NOTACION_ERegular ::= asterisco NOTACION_ERegular 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NOTACION_ERegular ::= interrogante NOTACION_ERegular 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // NOTACION_ERegular ::= id_ERegular 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // NOTACION_ERegular ::= c_Especial 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // NOTACION_ERegular ::= c_ERegular 
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
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NOTACION_ERegular",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
