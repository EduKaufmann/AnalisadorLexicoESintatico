import java.util.*;
%%
%class variaveis
%standalone
%line
%column
St = (("int "|"char "|"float ")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((", "|",")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*))*)";"

%{
 List<String> st = new ArrayList();
%}

%eof{
  System.out.print("Variáveis: \n");
  for(int i=0;i<st.size();i++){
    if(i==st.size()-1)
     System.out.println(st.get(i));
    else
     System.out.print(st.get(i)+"\n");
  }
%eof}

%%
{St} {st.add(yytext());}
\n {}
. {}

