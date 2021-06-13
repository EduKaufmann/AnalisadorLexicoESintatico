import java.util.*;
%%
%class condic
%standalone
%line
%column

if_condic = "if ("(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+)("<"|">"|"=="|"<="|">="|"!=")(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+)"){"(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((("="(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+)("+"|"-"|"*"|"\/")(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+))|("++"|"--"))";"))+"}"("else {"(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((("="(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+)("+"|"-"|"*"|"\/")(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+))|("++"|"--"))";"))+"}")?
switch_condic = "switch("("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)"){"(("case "([0-9]+)":")+"{"(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((("="(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+)("+"|"-"|"*"|"\/")(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+))|("++"|"--"))";"))+"break;}")+("default:{"(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((("="(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+)("+"|"-"|"*"|"\/")(("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)|([0-9])+))|("++"|"--"))";"))+"}")?

%{
 List<String> if_condic = new ArrayList();
 List<String> switch_condic = new ArrayList();
%}

%eof{
  System.out.print("If: \n");
  for(int i=0;i<if_condic.size();i++){
    if(i==if_condic.size()-1)
     System.out.println(if_condic.get(i));
    else
     System.out.print(if_condic.get(i)+"\n");
  }
  System.out.print("\n");
  System.out.print("Switch: \n");
  for(int i=0;i<switch_condic.size();i++){
    if(i==switch_condic.size()-1)
     System.out.println(switch_condic.get(i));
    else
     System.out.print(switch_condic.get(i)+"\n");
  }

%eof}

%%
{if_condic} {if_condic.add(yytext());}
{switch_condic} {switch_condic.add(yytext());}
\n {}
. {}

